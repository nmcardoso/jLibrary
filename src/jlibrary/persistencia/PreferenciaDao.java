package jlibrary.persistencia;

import java.sql.SQLException;
import jlibrary.entidades.Preferencia;

/**
 *
 * @author Natanael
 */
public class PreferenciaDao extends Dao {

    /**
     * Insere no banco de dados
     *
     * @param preferencia Nome do preferencia a ser pesquisado
     * @exception SQLException, ParseException
     */
    public void insert(Preferencia preferencia) throws SQLException {
        abrirBanco();

        pstmt = con.prepareStatement("INSERT INTO preferencia(skin, idioma, idLogin, tipoItem) values(?,?,?,?)");

        pstmt.setString(1, preferencia.getSkin());
        pstmt.setString(2, preferencia.getIdioma());
        pstmt.setInt(3, preferencia.getIdLogin());
        pstmt.setString(4, preferencia.getTipoItem());
        pstmt.execute();

        fecharBanco();
    }

    public Preferencia select(int idLogin) throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM preferencia WHERE idLogin = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, idLogin);

        rs = pstmt.executeQuery();

        Preferencia preferencia = new Preferencia();
        if (rs.next()) {
            preferencia.setIdPref(rs.getInt("idPref"));
            preferencia.setSkin(rs.getString("skin"));
            preferencia.setIdioma(rs.getString("idioma"));
            preferencia.setTipoItem(rs.getString("tipoItem"));
            preferencia.setIdLogin(rs.getInt("idLogin"));
        }

        fecharBanco();
        return preferencia;
    }

    public void update(Preferencia p) throws SQLException {
        abrirBanco();
        String query = "UPDATE preferencia SET idioma = ?, tipoItem = ? WHERE idPref = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, p.getIdioma());
        pstmt.setString(2, p.getTipoItem());
        pstmt.setInt(3, p.getIdPref());
        pstmt.executeUpdate();
        fecharBanco();
    }
    
    public void updateSkin(Preferencia p) throws SQLException{
        abrirBanco();
        String query = "UPDATE preferencia SET skin = ? WHERE idPref = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, p.getSkin());
        pstmt.setInt(2, p.getIdPref());
        pstmt.executeUpdate();
        fecharBanco();
    }

    public void setSkin(Preferencia p) throws SQLException {
        abrirBanco();
        String query = "UPDATE preferencia SET skin = ? WHERE idPref = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, p.getSkin());
        pstmt.setInt(2, p.getIdPref());
        pstmt.executeUpdate();
        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM preferencia WHERE idPref = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM preferencia";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String busca) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM preferencia WHERE nome like ?"; //ORDER BY ASC ou ORDER BY DESC
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
