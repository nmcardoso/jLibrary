package jlibrary.persistencia;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import jlibrary.entidades.TipoItem;

/**
 *
 * @author Natanael
 */
public class TipoItemDao extends Dao {

    public void insert(TipoItem tipoItem) throws SQLException, ParseException {
        abrirBanco();

        pstmt = con.prepareStatement("INSERT INTO tipoItem(tipo) values(?)");
        pstmt.setString(1, tipoItem.getTipo());
        pstmt.execute();

        fecharBanco();
    }

    public List<TipoItem> select() throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM tipoItem ORDER BY tipo ASC";
        pstmt = con.prepareStatement(query);
        //pstmt.setString(1, "%" + tipo + "%");

        rs = pstmt.executeQuery();

        TipoItem tipoItem;
        List<TipoItem> listaTipo = new ArrayList<TipoItem>();

        while (rs.next()) {
            tipoItem = new TipoItem();
            tipoItem.setIdTipo(rs.getInt("idTipo"));
            tipoItem.setTipo(rs.getString("tipo"));

            listaTipo.add(tipoItem);
        }

        fecharBanco();
        return listaTipo;
    }

    public void update(TipoItem tipoItem) throws SQLException, ParseException {
        abrirBanco();

        String query = "UPDATE tipoItem set tipo = ? WHERE idTipo = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setString(1, tipoItem.getTipo());
        pstmt.setInt(2, tipoItem.getIdTipo());
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM tipoItem WHERE idTipo = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM tipoItem";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String busca) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM tipoItem WHERE tipo like ?"; //ORDER BY ASC ou ORDER BY DESC
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
