package jlibrary.persistencia;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import jlibrary.entidades.ReservaVO;

/**
 *
 * @author Natanael
 */
public class ReservaDao extends Dao {

    public void insert(ReservaVO reserva) throws SQLException, ParseException {
        abrirBanco();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        java.util.Date data = new java.util.Date();
        String strData = dateFormat.format(data);

        pstmt = con.prepareStatement("INSERT INTO reserva(data, idLeitor, idItem) values(?,?,?)");
        pstmt.setDate(1, new Date(dateFormat.parse(strData).getTime()));
        pstmt.setInt(2, reserva.getIdLeitor());
        pstmt.setInt(3, reserva.getIdItem());
        pstmt.execute();

        fecharBanco();
    }

    /**
     *
     * @param busca String capturada do jTextField
     * @param campo 0 - busca por título<br />1 - busca por nome
     * @throws SQLException
     */
    public List<ReservaVO> select(String busca, int campo) throws SQLException {
        abrirBanco();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String query = "";
        switch (campo) {
            case 0:
                query = "SELECT i.titulo, l.nome, r.* "
                        + "FROM item i, leitor l, reserva r "
                        + "WHERE r.idLeitor = l.idLeitor "
                        + "AND r.idItem = i.idItem "
                        + "AND i.nome like ? "
                        + "ORDER BY r.data DESC";
                break;
            case 1:
                query = "SELECT i.titulo, l.nome, r.* "
                        + "FROM item i, leitor l, reserva r "
                        + "WHERE r.idLeitor = l.idLeitor "
                        + "AND r.idItem = i.idItem "
                        + "AND l.titulo like ? "
                        + "ORDER BY r.data DESC";
                break;
            default:
                return null;
        }

        pstmt = con.prepareStatement(query);
        pstmt.setString(1, busca);

        rs = pstmt.executeQuery();

        ReservaVO reserva;
        List<ReservaVO> listaReserva = new ArrayList<ReservaVO>();

        while (rs.next()) {
            reserva = new ReservaVO();
            reserva.setIdReserva(rs.getInt("idReserva"));
            reserva.setData(sdf.format(rs.getDate("data")));
            reserva.setIdItem(rs.getInt("idItem"));
            reserva.setIdLeitor(rs.getInt("idLeitor"));
            reserva.setNome(rs.getString("nome"));
            reserva.setTitulo(rs.getString("titulo"));
            listaReserva.add(reserva);
        }

        fecharBanco();
        return listaReserva;
    }

    public void update(ReservaVO reserva) throws SQLException, ParseException {
        abrirBanco();

        String query = "UPDATE reserva SET idLeitor = ? idItem = ? WHERE idReserva = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, reserva.getIdLeitor());
        pstmt.setInt(2, reserva.getIdItem());
        pstmt.setInt(3, reserva.getIdReserva());
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM reserva WHERE idReserva = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM reserva";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(ReservaVO reserva) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM reserva WHERE idLeitor = ? AND idItem = ?"; //ORDER BY ASC ou ORDER BY DESC
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, reserva.getIdLeitor());
        pstmt.setInt(2, reserva.getIdItem());
        rs = pstmt.executeQuery();

        /*if (!rs.next()) {
         retorno = false;
         } else {
         retorno = true;
         }*/

        //retorno = !rs.next() ? false : true;

        //return rs.next();

        retorno = rs.next();

        fecharBanco();
        return retorno;
    }
    
    public int cont() throws SQLException{
        abrirBanco();
        String query = "SELECT COUNT(*) AS count FROM reserva";
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
