package jlibrary.persistencia;

import jlibrary.entidades.ClassifLit;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Natanael
 */
public class ClassifLitDao extends Dao {

    
    /**
     * Insere no banco de dados
     * @param classifLit Nome da classificação a ser pesquisada
     * @exception SQLException, ParseException
     */
    public void insert(ClassifLit classifLit) throws SQLException, ParseException {
        abrirBanco();

        pstmt = con.prepareStatement("INSERT INTO classifLit(classificacao) values(?)");

        pstmt.setString(1, classifLit.getClassificacao());
        pstmt.execute();

        fecharBanco();
    }

    public List<ClassifLit> select(String classif) throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM classifLit WHERE classificacao like ? ORDER BY classificacao ASC";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, "%" + classif + "%");

        rs = pstmt.executeQuery();

        ClassifLit classifLit;
        List<ClassifLit> listaClassifLit = new ArrayList<ClassifLit>();

        while (rs.next()) {
            classifLit = new ClassifLit();
            classifLit.setIdClassLit(rs.getInt("idClassLit"));
            classifLit.setClassificacao(rs.getString("classificacao"));

            listaClassifLit.add(classifLit);
        }

        fecharBanco();
        return listaClassifLit;
    }

        public List<ClassifLit> select() throws SQLException {
        abrirBanco();

        String query = "SELECT * FROM classifLit ORDER BY classificacao ASC";
        pstmt = con.prepareStatement(query);

        rs = pstmt.executeQuery();

        ClassifLit classifLit;
        List<ClassifLit> listaClassifLit = new ArrayList<ClassifLit>();

        while (rs.next()) {
            classifLit = new ClassifLit();
            classifLit.setIdClassLit(rs.getInt("idClassLit"));
            classifLit.setClassificacao(rs.getString("classificacao"));

            listaClassifLit.add(classifLit);
        }

        fecharBanco();
        return listaClassifLit;
    }
    
    public void update(ClassifLit classifLit) throws SQLException, ParseException {
        abrirBanco();

        String query = "UPDATE classifLit SET classificacao = ? WHERE idClassLit = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setString(1, classifLit.getClassificacao());
        pstmt.setInt(2, classifLit.getIdClassLit());
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM classifLit WHERE idClassLit = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM classifLit";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String busca) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM classifLit WHERE classificacao like ?"; //ORDER BY ASC ou ORDER BY DESC
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
        String query = "SELECT COUNT(*) AS count FROM classiflit";
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
