package jlibrary.persistencia;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import jlibrary.entidades.Serie;
import jlibrary.entidades.SerieVO;
import jlibrary.entidades.Turno;

/**
 *
 * @author Natanael
 */
public class SerieDao extends Dao {

    public void insert(Serie serie) throws SQLException, ParseException {
        abrirBanco();

        pstmt = con.prepareStatement("INSERT INTO serie(nome,idTurno) values(?,?)");

        pstmt.setString(1, serie.getNome());
        pstmt.setInt(2, serie.getIdTurno());
        pstmt.execute();

        fecharBanco();
    }

    public List<SerieVO> select(String busca) throws SQLException {
        abrirBanco();

        //String query = "SELECT * FROM serie WHERE nome like ? ORDER BY nome ASC";
        String query = "SELECT s.*, t.*, (SELECT COUNT(*) FROM serie s, leitor l WHERE l.idSerie = s.idSerie) AS count "
                + "FROM serie s, turno t "
                + "WHERE s.nome like ? AND s.idTurno = t.idTurno";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, "%" + busca + "%");
        rs = pstmt.executeQuery();

        SerieVO serieVO;
        Turno turno;
        List<SerieVO> listaSerie = new ArrayList<SerieVO>();
        
        while (rs.next()) {
            serieVO = new SerieVO();
            turno = new Turno();
            serieVO.setIdSerie(rs.getInt("s.idSerie"));
            serieVO.setNome(rs.getString("s.nome"));
            serieVO.setQtdLeitor(rs.getInt("count"));
            turno.setIdTurno(rs.getInt("t.idTurno"));
            turno.setNome(rs.getString("t.nome"));
            serieVO.setTurno(turno);
            listaSerie.add(serieVO);
        }

        fecharBanco();
        return listaSerie;
    }

    public List<Serie> select() throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM serie";
        pstmt = con.prepareStatement(query);
        rs = pstmt.executeQuery();

        Serie serie;
        List<Serie> listaSerie = new ArrayList<Serie>();

        while (rs.next()) {
            serie = new Serie();
            serie.setIdSerie(rs.getInt("idSerie"));
            serie.setNome(rs.getString("nome"));
            serie.setIdTurno(rs.getInt("idTurno"));
            listaSerie.add(serie);
        }

        fecharBanco();
        return listaSerie;
    }
    
    public List<Serie> selectPorTurno(int idTurno) throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM serie WHERE idTurno = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, idTurno);
        rs = pstmt.executeQuery();

        Serie serie;
        List<Serie> listaSerie = new ArrayList<Serie>();

        while (rs.next()) {
            serie = new Serie();
            serie.setIdSerie(rs.getInt("idSerie"));
            serie.setNome(rs.getString("nome"));
            serie.setIdTurno(rs.getInt("idTurno"));
            listaSerie.add(serie);
        }

        fecharBanco();
        return listaSerie;
    }
    
    public String select(int idSerie) throws SQLException {
        abrirBanco();

        //String query = "SELECT * FROM serie WHERE nome = ?";
        String query = "SELECT l.idLeitor, l.nome, s.nome, t.nome, "
                + "(SELECT COUNT(*) FROM leitor l, serie s WHERE l.idSerie = s.idSerie AND l.idTurno = t.idTurno) AS count "
                + "FROM leitor l, serie s, turno t "
                + "WHERE l.idSerie = s.idSerie AND l.idTurno = t.idTurno";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, idSerie);
        rs = pstmt.executeQuery();

        String serie = "";
        if (rs.next()) {
            serie = rs.getString("nome");
        }

        fecharBanco();
        return serie;
    }

    public void update(Serie serie) throws SQLException, ParseException {
        abrirBanco();

        String query = "UPDATE serie SET nome = ? idTurno = ? WHERE idSerie = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setString(1, serie.getNome());
        pstmt.setInt(2, serie.getIdTurno());
        pstmt.setInt(3, serie.getIdSerie());
        pstmt.executeUpdate();
        
        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM serie WHERE idSerie = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM serie";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(Serie serie) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM serie WHERE nome like ? AND idTurno = ?"; //ORDER BY ASC ou ORDER BY DESC
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, serie.getNome());
        pstmt.setInt(2, serie.getIdTurno());
        rs = pstmt.executeQuery();
        
        retorno = rs.next();
        
        fecharBanco();
        return retorno;
    }
    
    public int cont() throws SQLException{
        abrirBanco();
        String query = "SELECT COUNT(*) AS count FROM serie";
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
