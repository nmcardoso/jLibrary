/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jlibrary.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jlibrary.entidades.Autor;

/**
 *
 * @author Natanael
 */
public class AutorItemDao extends Dao{
    public List<Autor> select(int idItem) throws SQLException {
        abrirBanco();

        String query = "SELECT a.* "
                + "FROM autor a, autorItem ai "
                + "WHERE a.idAutor = ai.idAutor AND ai.idItem = ? ";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, idItem);

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
}
