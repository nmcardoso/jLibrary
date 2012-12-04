package jlibrary.persistencia;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import jlibrary.entidades.Item;
import jlibrary.logica.FormatarTexto;

/**
 *
 * @author Natanael
 */
public class ItemDao extends Dao {

    public void insert(Item item) throws SQLException, ParseException {
        abrirBanco();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        pstmt = con.prepareStatement("INSERT INTO item "
                + "(titulo, subtitulo, idioma, isbn, codigo, local, "
                + "exemplar, volume, edicao, ano, numPags, idTipo, "
                + "idClassLit, idEditora, dataCad, status) "
                + "VALUE (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

        pstmt.setString(1, item.getTitulo());
        pstmt.setString(2, item.getSubtitulo());
        pstmt.setString(3, item.getIdioma());
        pstmt.setString(4, item.getIsbn());
        pstmt.setString(5, item.getCodigo());
        pstmt.setString(6, item.getLocal());
        pstmt.setString(7, item.getExemplar());
        pstmt.setString(8, item.getVolume());
        pstmt.setString(9, item.getEdicao());
        pstmt.setString(10, item.getAno());
        pstmt.setString(11, item.getNumPags());
        pstmt.setInt(12, item.getIdTipo());
        pstmt.setInt(13, item.getIdClassLit());
        pstmt.setInt(14, item.getIdEditora());
        pstmt.setDate(15, new Date(new java.util.Date().getTime()));
        pstmt.setString(16, item.getStatus());
        pstmt.execute();

        pstmt = con.prepareStatement("SELECT idItem FROM item ORDER BY idItem DESC LIMIT 1");
        rs = pstmt.executeQuery();

        int idItem = 0;
        while (rs.next()) {
            idItem = rs.getInt("idItem");
        }

        Object[] idAutor = item.getIdAutor().toArray();

        for (int i = 0; i < idAutor.length; i++) {
            pstmt = con.prepareStatement("INSERT INTO autorItem(idAutor, idItem) VALUES(?,?)");
            pstmt.setInt(1, Integer.parseInt(idAutor[i].toString()));
            pstmt.setInt(2, idItem);
            pstmt.execute();
        }

        fecharBanco();
    }

    public List<Item> select(String titulo) throws SQLException {
        abrirBanco();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String query = "SELECT * FROM item WHERE titulo like ? ORDER BY titulo ASC";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, new FormatarTexto().formatarQuery(titulo));
        rs = pstmt.executeQuery();

        Item item;
        List<Item> listaItem = new ArrayList<Item>();
        while (rs.next()) {
            item = new Item();
            item.setIdItem(rs.getInt("idItem"));
            item.setTitulo(rs.getString("titulo"));
            item.setSubtitulo(rs.getString("subtitulo"));
            item.setIdioma(rs.getString("idioma"));
            item.setIsbn(rs.getString("isbn"));
            item.setCodigo(rs.getString("codigo"));
            item.setLocal(rs.getString("local"));
            item.setExemplar(rs.getString("exemplar"));
            item.setVolume(rs.getString("volume"));
            item.setEdicao(rs.getString("edicao"));
            item.setAno(rs.getString("ano"));
            item.setNumPags(rs.getString("numPags"));
            item.setIdTipo(rs.getInt("idTipo"));
            item.setIdClassLit(rs.getInt("idClassLit"));
            item.setIdEditora(rs.getInt("idEditora"));
            item.setDataCad(rs.getString("dataCad"));
            item.setStatus(rs.getString("status"));
            listaItem.add(item);
        }

        fecharBanco();
        return listaItem;
    }

    public Item select(int id) throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM item WHERE idItem = ? ORDER BY titulo ASC";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, id);
        rs = pstmt.executeQuery();

        Item item = null;
        if (rs.next()) {
            item = new Item();
            item.setIdItem(rs.getInt("idItem"));
            item.setTitulo(rs.getString("titulo"));
            item.setSubtitulo(rs.getString("subtitulo"));
            item.setIdioma(rs.getString("idioma"));
            item.setIsbn(rs.getString("isbn"));
            item.setCodigo(rs.getString("codigo"));
            item.setLocal(rs.getString("local"));
            item.setExemplar(rs.getString("exemplar"));
            item.setVolume(rs.getString("volume"));
            item.setEdicao(rs.getString("edicao"));
            item.setAno(rs.getString("ano"));
            item.setNumPags(rs.getString("numPags"));
            item.setIdTipo(rs.getInt("idTipo"));
            item.setIdClassLit(rs.getInt("idClassLit"));
            item.setIdEditora(rs.getInt("idEditora"));
            item.setDataCad(rs.getString("dataCad"));
            item.setStatus(rs.getString("status"));
        }

        fecharBanco();
        return item;
    }

    public List<Item> selectDisponivel(String titulo) throws SQLException {
        abrirBanco();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String query = "SELECT * FROM item WHERE titulo like ? AND status = 'disponivel' ORDER BY titulo ASC";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, "%" + titulo + "%");
        rs = pstmt.executeQuery();

        Item item;
        List<Item> listaItem = new ArrayList<Item>();

        while (rs.next()) {
            item = new Item();
            item.setIdItem(rs.getInt("idItem"));
            item.setTitulo(rs.getString("titulo"));
            item.setExemplar(rs.getString("exemplar"));
            item.setIdTipo(rs.getInt("idTipo"));
            item.setIdClassLit(rs.getInt("idClassLit"));
            item.setIdEditora(rs.getInt("idEditora"));
            item.setStatus(rs.getString("status"));
            listaItem.add(item);
        }

        fecharBanco();
        return listaItem;
    }

    public void update(Item item) throws SQLException, ParseException {
        abrirBanco();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        String query;
        query = "UPDATE item SET "
         + "titulo = ?, subtitulo = ?, idioma = ?, isbn = ?, codigo = ?, local = ?, "
         + "exemplar = ?, volume = ?, edicao = ?, status = ?, ano = ?, numPags = ?, "
         + "idTipo = ?, idClassLit = ?, idEditora = ? "
         + "WHERE idItem = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setString(1, item.getTitulo());
        pstmt.setString(2, item.getSubtitulo());
        pstmt.setString(3, item.getIdioma());
        pstmt.setString(4, item.getIsbn());
        pstmt.setString(5, item.getCodigo());
        pstmt.setString(6, item.getLocal());
        pstmt.setString(7, item.getExemplar());
        pstmt.setString(8, item.getVolume());
        pstmt.setString(9, item.getEdicao());
        pstmt.setString(10, item.getStatus());
        pstmt.setString(11, item.getAno());
        pstmt.setString(12, item.getNumPags());
        pstmt.setInt(13, item.getIdTipo());
        pstmt.setInt(14, item.getIdClassLit());
        pstmt.setInt(15, item.getIdEditora());
        pstmt.setInt(16, item.getIdItem());
        pstmt.executeUpdate();
        
        pstmt = con.prepareStatement("DELETE FROM autorItem WHERE idItem = ?");
        pstmt.setInt(1, item.getIdItem());
        pstmt.execute();
        
        for (Integer i : item.getIdAutor()) {
            pstmt = con.prepareStatement("INSERT INTO autorItem(idAutor, idItem) VALUES(?,?)");
            pstmt.setInt(1, i);
            pstmt.setInt(2, item.getIdItem());
            pstmt.execute(); 
        }

        fecharBanco();
    }

    public void update(int id, int status) throws SQLException, ParseException {
        abrirBanco();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        String query = "UPDATE item SET status = ? WHERE idItem = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, status);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM item WHERE idItem = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM item";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String busca) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM titulo WHERE titulo like ?"; //ORDER BY ASC ou ORDER BY DESC
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, busca);

        rs = pstmt.executeQuery();

        /*if (rs.next() == false) {
         retorno = false;
         } else {
         retorno = true;
         }*/

        retorno = !rs.next();

        fecharBanco();
        return retorno;
    }
    
    public int cont() throws SQLException{
        abrirBanco();
        String query = "SELECT COUNT(*) AS count FROM item";
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
