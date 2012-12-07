package jlibrary.persistencia;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import jlibrary.entidades.Turno;

/**
 *
 * @author Natanael
 */
public class TurnoDao extends Dao {

    public void insert(Turno turno) throws SQLException {
        abrirBanco();

        pstmt = con.prepareStatement("INSERT INTO turno(nome) values(?)");

        pstmt.setString(1, turno.getNome());
        pstmt.execute();

        fecharBanco();
    }

    public List<Turno> select() throws SQLException {
        abrirBanco();

        //String query = "SELECT * FROM turno WHERE nome like ? ORDER BY nome DESC";
        String query = "SELECT t.* "
                + "FROM turno t "
                + "ORDER BY t.nome ASC";
        pstmt = con.prepareStatement(query);
        rs = pstmt.executeQuery();

        Turno turno;
        List<Turno> listaTurno = new ArrayList<Turno>();

        while (rs.next()) {
            turno = new Turno();
            turno.setIdTurno(rs.getInt("idTurno"));
            turno.setNome(rs.getString("nome"));
            listaTurno.add(turno);
        }

        fecharBanco();
        return listaTurno;
    }
    
     public String select(int idTurno) throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM turno WHERE idTurno = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, idTurno);
        rs = pstmt.executeQuery();

        String turno = "";
        if (rs.next()) {
            turno = rs.getString("nome");
        }

        fecharBanco();
        return turno;
    }

    public void update(Turno turno) throws SQLException, ParseException {
        abrirBanco();

        String query = "UPDATE turno SET nome = ? WHERE idTurno = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setString(1, turno.getNome());
        pstmt.setInt(2, turno.getIdTurno());
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM turno WHERE idTurno = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM turno";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String busca) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM turno WHERE nome like ?"; //ORDER BY ASC ou ORDER BY DESC
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
        String query = "SELECT COUNT(*) AS count FROM turno";
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
