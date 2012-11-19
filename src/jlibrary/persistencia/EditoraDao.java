package jlibrary.persistencia;

import jlibrary.entidades.Editora;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Natanael
 */
public class EditoraDao extends Dao {

    
    /**
     * Insere no banco de dados
     * @param editora Nome da editora a ser pesquisada
     * @exception SQLException, ParseException
     */
    public void insert(Editora editora) throws SQLException, ParseException {
        abrirBanco();

        pstmt = con.prepareStatement("INSERT INTO editora(editora) values(?)");

        pstmt.setString(1, editora.getEditora());
        pstmt.execute();

        fecharBanco();
    }

    public List<Editora> select(String nome) throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM editora WHERE editora like ? ORDER BY editora ASC";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, "%" + nome + "%");

        rs = pstmt.executeQuery();

        Editora editora;
        List<Editora> listaEditora = new ArrayList<Editora>();

        while (rs.next()) {
            editora = new Editora();
            editora.setIdEditora(rs.getInt("idEditora"));
            editora.setEditora(rs.getString("editora"));

            listaEditora.add(editora);
        }

        fecharBanco();
        return listaEditora;
    }
    
    public List<Editora> select() throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM editora ORDER BY editora ASC";
        pstmt = con.prepareStatement(query);

        rs = pstmt.executeQuery();

        Editora editora;
        List<Editora> listaEditora = new ArrayList<Editora>();

        while (rs.next()) {
            editora = new Editora();
            editora.setIdEditora(rs.getInt("idEditora"));
            editora.setEditora(rs.getString("editora"));

            listaEditora.add(editora);
        }

        fecharBanco();
        return listaEditora;
    }

    public void update(Editora editora) throws SQLException, ParseException {
        abrirBanco();

        String query = "UPDATE editora SET editora = ? WHERE idEditora = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setString(1, editora.getEditora());
        pstmt.setInt(2, editora.getIdEditora());
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM editora WHERE idEditora = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM editora";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String busca) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM editora WHERE editora like ?"; //ORDER BY ASC ou ORDER BY DESC
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, busca);

        rs = pstmt.executeQuery();

        if (rs.next() == false) {
            retorno = false;
        } else {
            retorno = true;
        }

        fecharBanco();
        return retorno;
    }
    
    public int cont() throws SQLException{
        abrirBanco();
        String query = "SELECT COUNT(*) AS count FROM editora";
        pstmt = con.prepareStatement(query);
        rs = pstmt.executeQuery();
        
        int count = -1;
        if (rs.next()) {
            count = rs.getInt("count");
        }
        fecharBanco();
        return count;
    }
}
