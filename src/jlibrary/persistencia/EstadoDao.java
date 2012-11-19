package jlibrary.persistencia;

import jlibrary.entidades.Estado;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Natanael
 */
public class EstadoDao extends Dao {

    /**
     * Insere no banco de dados
     *
     * @param editora Nome da editora a ser pesquisada
     * @exception SQLException, ParseException
     */
    public void insert(Estado estado) throws SQLException, ParseException {
        abrirBanco();

        pstmt = con.prepareStatement("INSERT INTO estado(nome,uf) values(?,?)");

        pstmt.setString(1, estado.getNome());
        pstmt.setString(2, estado.getUf());
        pstmt.execute();

        fecharBanco();
    }

    public List<Estado> select(String nome) throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM estado WHERE nome like ? ORDER BY nome ASC";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, "%" + nome + "%");

        rs = pstmt.executeQuery();

        Estado estado;
        List<Estado> listaEstado = new ArrayList<Estado>();

        while (rs.next()) {
            estado = new Estado();
            estado.setIdEstado(rs.getInt("idEstado"));
            estado.setNome(rs.getString("nome"));
            estado.setUf(rs.getString("uf"));

            listaEstado.add(estado);
        }

        fecharBanco();
        return listaEstado;
    }

    public List<Estado> select() throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM estado ORDER BY nome ASC";
        pstmt = con.prepareStatement(query);

        rs = pstmt.executeQuery();

        Estado estado;
        List<Estado> listaEstado = new ArrayList<Estado>();

        while (rs.next()) {
            estado = new Estado();
            estado.setIdEstado(rs.getInt("idEstado"));
            estado.setNome(rs.getString("nome"));
            estado.setUf(rs.getString("uf"));

            listaEstado.add(estado);
        }

        fecharBanco();
        return listaEstado;
    }

    public Estado select(int id) throws SQLException{
            abrirBanco();

            String query = "SELECT * FROM estado WHERE idEstado = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);

            rs = pstmt.executeQuery();

            Estado estado = new Estado();

            if (rs.next()) {
                estado.setIdEstado(rs.getInt("idEstado"));
                estado.setNome(rs.getString("nome"));
                estado.setUf(rs.getString("uf"));
            }

            fecharBanco();
            return estado;
    }

    public void update(Estado estado) throws SQLException, ParseException {
        abrirBanco();

        String query = "UPDATE estado SET nome = ? WHERE idEstado = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setString(1, estado.getNome());
        pstmt.setInt(2, estado.getIdEstado());
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM editora WHERE idEstado = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM estado";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String busca) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM estado WHERE nome like ?"; //ORDER BY ASC ou ORDER BY DESC
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
        String query = "SELECT COUNT(*) AS count FROM estado";
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
