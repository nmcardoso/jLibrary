package jlibrary.persistencia;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jlibrary.entidades.Controle;
import jlibrary.entidades.Item;
import jlibrary.entidades.Leitor;

/**
 *
 * @author Natanael
 */
public class ControleDao extends Dao {

    public void insert(Controle controle) throws SQLException, ParseException {
        abrirBanco();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        java.util.Date data = new java.util.Date();
        String strData = dateFormat.format(data);

        pstmt = con.prepareStatement("INSERT INTO controle(dataEmp, dataDev, idLeitor, idItem) values(?,?,?,?)");
        pstmt.setDate(1, new Date(dateFormat.parse(strData).getTime()));
        pstmt.setDate(2, new Date(dateFormat.parse(controle.getDataDev()).getTime()));
        pstmt.setInt(3, controle.getLeitor().getIdLeitor());
        pstmt.setInt(4, controle.getItem().getIdItem());
        pstmt.execute();


        pstmt = con.prepareStatement("UPDATE item SET status = 'Emprestado' WHERE idItem = ?");
        pstmt.setInt(1, controle.getItem().getIdItem());
        pstmt.execute();

        fecharBanco();
    }

    /**
     *
     * @param busca
     * @param campo 1- Nome do Leitor 2- Titulo do item
     * @return List<Controle>
     * @throws SQLException
     */
    public List<Controle> select(String busca, int campo) throws SQLException {
        abrirBanco();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String query;

        switch (campo) {
            case 1:
                query = "SELECT c.*, i.titulo, l.nome "
                        + "FROM controle c, item i, leitor l "
                        + "WHERE c.idItem = i.idItem "
                        + "AND c.idLeitor = l.idLeitor "
                        + "AND l.nome like ? "
                        + "ORDER BY c.dataEmp DESC";
                break;
            case 2:
                query = "SELECT c.*, i.titulo, l.nome "
                        + "FROM controle c, item i, leitor l "
                        + "WHERE c.idItem = i.idItem "
                        + "AND c.idLeitor = l.idLeitor "
                        + "AND i.titulo like ? "
                        + "ORDER BY c.dataEmp DESC";
                break;
            default:
                throw new AssertionError();
        }

        pstmt = con.prepareStatement(query);
        pstmt.setString(1, "%" + busca + "%");

        rs = pstmt.executeQuery();

        Controle controle;
        Item item;
        Leitor leitor;
        List<Controle> listaControle = new ArrayList<Controle>();

        while (rs.next()) {
            controle = new Controle();
            item = new Item();
            leitor = new Leitor();
            controle.setIdControle(rs.getInt("idControle"));
            controle.setDataDev(sdf.format(rs.getDate("dataDev")));
            controle.setDataEmp(sdf.format(rs.getDate("dataEmp")));
            if (rs.getDate("dataEnt") != null) {
                controle.setDataEnt(sdf.format(rs.getDate("dataEnt")));
            }
            item.setIdItem(rs.getInt("c.idItem"));
            item.setTitulo(rs.getString("i.titulo"));
            leitor.setIdLeitor(rs.getInt("c.idLeitor"));
            leitor.setNome(rs.getString("l.nome"));
            controle.setItem(item);
            controle.setLeitor(leitor);
            listaControle.add(controle);
        }

        fecharBanco();
        return listaControle;
    }

    /**
     *
     * @param data1
     * @param data2
     * @param campo 1- dataEmp 2- dataDev
     * @return
     * @throws SQLException
     */
    public List<Controle> select(String data1, String data2, int campo) throws SQLException {
        abrirBanco();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String query;

        switch (campo) {
            case 1:
                query = "SELECT c.*, i.titulo, l.nome "
                        + "FROM controle c, item i, leitor l "
                        + "WHERE c.idItem = i.idItem "
                        + "AND c.idLeitor = l.idLeitor "
                        + "AND c.dataEmp >= ? "
                        + "AND c.dataEmp <= ?"
                        + "ORDER BY c.dataEmp DESC";
                break;
            case 2:
                query = "SELECT c.*, i.titulo, l.nome "
                        + "FROM controle c, item i, leitor l "
                        + "WHERE c.idItem = i.idItem "
                        + "AND c.idLeitor = l.idLeitor "
                        + "AND c.dataDev >= ? "
                        + "AND c.dataDev <= ?"
                        + "ORDER BY c.dataEmp DESC";
                break;
            default:
                throw new AssertionError();
        }

        pstmt = con.prepareStatement(query);
        pstmt.setString(1, data1);
        pstmt.setString(2, data2);

        rs = pstmt.executeQuery();

        Controle controle;
        Item item;
        Leitor leitor;
        List<Controle> listaControle = new ArrayList<Controle>();

        while (rs.next()) {
            controle = new Controle();
            item = new Item();
            leitor = new Leitor();
            controle.setIdControle(rs.getInt("idControle"));
            controle.setDataDev(sdf.format(rs.getDate("dataDev")));
            controle.setDataEmp(sdf.format(rs.getDate("dataEmp")));
            if (rs.getDate("dataEnt") != null) {
                controle.setDataEnt(sdf.format(rs.getDate("dataEnt")));
            }
            item.setIdItem(rs.getInt("c.idItem"));
            item.setTitulo(rs.getString("i.titulo"));
            leitor.setIdLeitor(rs.getInt("c.idLeitor"));
            leitor.setNome(rs.getString("l.nome"));
            controle.setItem(item);
            controle.setLeitor(leitor);
            listaControle.add(controle);
        }

        fecharBanco();
        return listaControle;
    }

    public List<Controle> selectAtrasado(String busca) throws SQLException {
        abrirBanco();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String query = "SELECT c.*, l.nome, i.titulo "
                + "FROM controle c, leitor l, item i "
                + "WHERE l.nome like ? "
                + "AND CURDATE() > c.dataDev "
                + "AND c.dataEnt IS NULL "
                + "AND c.idItem = i.idItem "
                + "AND c.idLeitor = l.idLeitor";

        pstmt = con.prepareStatement(query);
        pstmt.setString(1, "%" + busca + "%");
        rs = pstmt.executeQuery();

        List<Controle> listaControle = new ArrayList<Controle>();
        Controle controle;
        Item item;
        Leitor leitor;
        while (rs.next()) {
            controle = new Controle();
            item = new Item();
            leitor = new Leitor();
            controle.setDataDev(sdf.format(rs.getDate("c.dataDev")));
            controle.setIdControle(rs.getInt("c.idControle"));
            item.setIdItem(rs.getInt("c.idItem"));
            item.setTitulo(rs.getString("i.titulo"));
            controle.setItem(item);
            leitor.setIdLeitor(rs.getInt("c.idLeitor"));
            leitor.setNome(rs.getString("l.nome"));
            controle.setLeitor(leitor);
            listaControle.add(controle);
        }
        fecharBanco();
        return listaControle;
    }
    
    public List<Controle> selectEmp(String busca) throws SQLException {
        abrirBanco();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String query = "SELECT c.*, l.nome, i.titulo "
                + "FROM controle c, leitor l, item i "
                + "WHERE l.nome like ? "
                + "AND c.dataEnt IS NULL "
                + "AND c.idItem = i.idItem "
                + "AND c.idLeitor = l.idLeitor";

        pstmt = con.prepareStatement(query);
        pstmt.setString(1, "%" + busca + "%");
        rs = pstmt.executeQuery();

        List<Controle> listaControle = new ArrayList<Controle>();
        Controle controle;
        Item item;
        Leitor leitor;
        while (rs.next()) {
            controle = new Controle();
            item = new Item();
            leitor = new Leitor();
            controle.setDataEmp(sdf.format(rs.getDate("c.dataEmp")));
            controle.setIdControle(rs.getInt("c.idControle"));
            controle.setDataDev(sdf.format(rs.getDate("c.dataDev")));
            item.setIdItem(rs.getInt("c.idItem"));
            item.setTitulo(rs.getString("i.titulo"));
            controle.setItem(item);
            leitor.setIdLeitor(rs.getInt("c.idLeitor"));
            leitor.setNome(rs.getString("l.nome"));
            controle.setLeitor(leitor);
            listaControle.add(controle);
        }
        fecharBanco();
        return listaControle;
    }

    public void update(String data, int id) throws SQLException, ParseException {
        abrirBanco();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        String query = "UPDATE controle SET dataDev = ? WHERE idControle = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setDate(1, new Date(sdf.parse(data).getTime()));
        pstmt.setInt(2, id);
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM controle WHERE idControle = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM controle";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String busca) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM controle WHERE nome like ?"; //ORDER BY ASC ou ORDER BY DESC
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

    public boolean isReservado(Controle controle) throws SQLException {
        abrirBanco();
        boolean r;
        String query;
        query = "SELECT idLeitor, idReserva "
                + "FROM reserva WHERE idItem = ?";

        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, controle.getItem().getIdItem());
        rs = pstmt.executeQuery();

        if (!rs.next()) {
            return false;
        }

        int idLeitor = rs.getInt("idLeitor");
        int idReserva = rs.getInt("idReserva");

        fecharBanco();
        abrirBanco();

        if (controle.getLeitor().getIdLeitor() == idLeitor) {
            query = "DELETE FROM reserva WHERE idReserva = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, idReserva);
            pstmt.execute();
            return false;
        } else {
            query = "SELECT l.nome "
                    + "FROM leitor l, reserva r "
                    + "WHERE r.idReserva = ? "
                    + "AND r.idLeitor = l.idLeitor";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, idReserva);
            rs = pstmt.executeQuery();
            String nome = "";
            if (rs.next()) {
                nome = rs.getString("l.nome");
            }

            int resposta = JOptionPane.showConfirmDialog(null, "<html><b>" + nome + "</b></html> já reservou este item."
                    + "<br />Deseja emprestá-lo para outra pessoa?", "Item reservado", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                r = false;
            } else {
                r = true;
            }
        }
        fecharBanco();
        return r;
    }

    public int countEmp() throws SQLException {
        abrirBanco();
        String query = "SELECT COUNT(*) AS count FROM controle WHERE dataEnt IS null";
        pstmt = con.prepareStatement(query);
        rs = pstmt.executeQuery();

        int count = -1;
        if (rs.next()) {
            count = rs.getInt("count");
        }
        fecharBanco();
        return count;
    }

    public int countTotalEmp() throws SQLException {
        abrirBanco();
        String query = "SELECT COUNT(*) AS count FROM controle";
        pstmt = con.prepareStatement(query);
        rs = pstmt.executeQuery();

        int count = -1;
        if (rs.next()) {
            count = rs.getInt("count");
        }
        fecharBanco();
        return count;
    }

    public int countDev() throws SQLException {
        abrirBanco();
        String query = "SELECT COUNT(*) AS count FROM controle WHERE dataEnt IS NOT null";
        pstmt = con.prepareStatement(query);
        rs = pstmt.executeQuery();

        int count = -1;
        if (rs.next()) {
            count = rs.getInt("count");
        }
        fecharBanco();
        return count;
    }

    public int empAtrasado() throws SQLException {
        abrirBanco();
        String query = "SELECT COUNT(*) AS count FROM controle WHERE CURDATE() > dataDev AND dataEnt IS NULL";
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
