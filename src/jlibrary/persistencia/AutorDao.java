package jlibrary.persistencia;

import jlibrary.entidades.Autor;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Natanael
 */
public class AutorDao extends Dao {

    
    /**
     * Insere no banco de dados
     * @param autor Nome do autor a ser pesquisado
     * @exception SQLException, ParseException
     */
    public void insert(Autor autor) throws SQLException, ParseException {
        abrirBanco();

        pstmt = con.prepareStatement("INSERT INTO autor(nome) values(?)");

        pstmt.setString(1, autor.getNome());
        pstmt.execute();

        fecharBanco();
    }

    public List<Autor> select(String nome) throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM autor WHERE nome like ? ORDER BY nome ASC";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, "%" + nome + "%");

        rs = pstmt.executeQuery();

        Autor autor;
        List<Autor> listaAutor = new ArrayList<Autor>();

        while (rs.next()) {
            autor = new Autor();
            autor.setIdAutor(rs.getInt("idAutor"));
            autor.setNome(rs.getString("nome"));

            listaAutor.add(autor);
        }

        fecharBanco();
        return listaAutor;
    }

    public void update(Autor autor) throws SQLException, ParseException {
        abrirBanco();

        String query = "UPDATE autor SET nome = ? WHERE idAutor = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setString(1, autor.getNome());
        pstmt.setInt(2, autor.getIdAutor());
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM autor WHERE idAutor = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM autor";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String busca) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM autor WHERE nome like ?"; //ORDER BY ASC ou ORDER BY DESC
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
        String query = "SELECT COUNT(*) AS count FROM autor";
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
