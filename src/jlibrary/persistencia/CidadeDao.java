package jlibrary.persistencia;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import jlibrary.entidades.Cidade;

/**
 *
 * @author Natanael
 */
public class CidadeDao extends Dao {

    /**
     * Insere no banco de dados
     *
     * @param editora Nome da editora a ser pesquisada
     * @exception SQLException, ParseException
     */
    public void insert(Cidade cidade) throws SQLException, ParseException {
        abrirBanco();

        pstmt = con.prepareStatement("INSERT INTO cidade(nome,uf) values(?,?)");

        pstmt.setString(1, cidade.getNome());
        pstmt.execute();

        fecharBanco();
    }

    public List<Cidade> select(int idEstado) throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM cidade WHERE idEstado = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, idEstado);
        rs = pstmt.executeQuery();

        Cidade cidade;
        List<Cidade> listaCidade = new ArrayList<Cidade>();

        while (rs.next()) {
            cidade = new Cidade();
            cidade.setIdCidade(rs.getInt("idCidade"));
            cidade.setNome(rs.getString("nome"));
            
            listaCidade.add(cidade);
        }

        fecharBanco();
        return listaCidade;
    }

    public List<Cidade> select() throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM cidade ORDER BY nome ASC";
        pstmt = con.prepareStatement(query);
        rs = pstmt.executeQuery();

        Cidade cidade;
        List<Cidade> listaCidade = new ArrayList<Cidade>();

        while (rs.next()) {
            cidade = new Cidade();
            cidade.setIdCidade(rs.getInt("idCidade"));
            cidade.setNome(rs.getString("nome"));

            listaCidade.add(cidade);
        }

        fecharBanco();
        return listaCidade;
    }
    
    public String getNome(int idEstado) throws SQLException {
        abrirBanco();
        String query = "SELECT * FROM cidade WHERE idEstado = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, idEstado);
        rs = pstmt.executeQuery();

        String cidade = "";
        if (rs.next()) {
            cidade = rs.getString("nome");
        }

        fecharBanco();
        return cidade;
    }

    public void update(Cidade cidade) throws SQLException, ParseException {
        abrirBanco();

        String query = "UPDATE cidade SET nome = ? WHERE idCidade = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setString(1, cidade.getNome());
        pstmt.setInt(2, cidade.getIdCidade());
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM editora WHERE idCidade = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM cidade";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String busca) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM cidade WHERE nome like ?"; //ORDER BY ASC ou ORDER BY DESC
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
}
