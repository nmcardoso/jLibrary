package jlibrary.persistencia;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import jlibrary.entidades.Login;

/**
 *
 * @author Natanael
 */
public class LoginDao extends Dao {

    public void insert(Login login) throws SQLException, ParseException {
        abrirBanco();

        pstmt = con.prepareStatement("INSERT INTO login(usuario,senha,nome,img) values(?,?,?,?)");
        pstmt.setString(1, login.getUsuario());
        pstmt.setString(2, login.getSenha());
        pstmt.setString(3, login.getNome());
        pstmt.setString(4, login.getImg());
        pstmt.execute();

        fecharBanco();
    }

    public List<Login> select(String nome) throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM login WHERE nome like ? ORDER BY nome ASC";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, "%" + nome + "%");
        rs = pstmt.executeQuery();

        Login login;
        List<Login> listaLogin = new ArrayList<Login>();

        while (rs.next()) {
            login = new Login();
            login.setIdLogin(rs.getInt("idLogin"));
            login.setNome(rs.getString("nome"));
            listaLogin.add(login);
        }

        fecharBanco();
        return listaLogin;
    }

    public Login select(int id) throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM login WHERE idLogin = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, id);
        rs = pstmt.executeQuery();

        Login login = new Login();

        if (rs.next()) {
            login.setIdLogin(rs.getInt("idLogin"));
            login.setNome(rs.getString("nome"));
            login.setImg(rs.getString("img"));
            login.setSenha(rs.getString("senha"));
            login.setUsuario(rs.getString("usuario"));
        }

        fecharBanco();
        return login;
    }

    public List<Login> select() throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM login ORDER BY nome ASC";
        pstmt = con.prepareStatement(query);
        rs = pstmt.executeQuery();

        Login login;
        List<Login> listaLogin = new ArrayList<Login>();

        while (rs.next()) {
            login = new Login();
            login.setIdLogin(rs.getInt("idLogin"));
            login.setNome(rs.getString("nome"));
            login.setUsuario(rs.getString("usuario"));
            login.setSenha(rs.getString("senha"));
            login.setImg(rs.getString("img"));
            listaLogin.add(login);
        }

        fecharBanco();
        return listaLogin;
    }

    public void update(Login login) throws SQLException, ParseException {
        abrirBanco();

        String query = "UPDATE login SET usuario = ?, senha = ?, nome = ?, img = ? WHERE idLogin = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, login.getUsuario());
        pstmt.setString(2, login.getSenha());
        pstmt.setString(3, login.getNome());
        pstmt.setString(4, login.getImg());
        pstmt.setInt(5, login.getIdLogin());
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM login WHERE idLogin = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM login";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String usuario) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT usuario FROM login WHERE usuario like ?"; //ORDER BY ASC ou ORDER BY DESC
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, usuario);
        rs = pstmt.executeQuery();

        retorno = rs.next();

        fecharBanco();
        return retorno;
    }

    public boolean existe(String usuario, String excessao) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT usuario FROM login WHERE usuario like ?"; //ORDER BY ASC ou ORDER BY DESC
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, usuario);
        rs = pstmt.executeQuery();

        retorno = rs.next();
        if (retorno) {
            if (rs.getString("usuario").equals(excessao)) {
                retorno = false;
            } else {
                retorno = true;
            }
        } else {
            retorno = false;
        }

        fecharBanco();
        return retorno;
    }

    public int getLastId() throws SQLException {
        abrirBanco();
        String query = "SELECT MAX(idLogin) AS maxId FROM login";
        pstmt = con.prepareStatement(query);
        rs = pstmt.executeQuery();

        int id;
        if (rs.next()) {
            id = rs.getInt("maxId");
        } else {
            id = -1;
        }
        fecharBanco();
        return id;
    }
}
