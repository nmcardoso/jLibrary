package jlibrary.persistencia;

import jlibrary.entidades.Cep;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import jlibrary.entidades.Cidade;
import jlibrary.entidades.Estado;

/**
 *
 * @author Natanael
 */
public class CepDao extends Dao {

    
    /**
     * Insere no banco de dados
     * @param cep Nome do cep a ser pesquisado
     * @exception SQLException, ParseException
     */
    public void insert(Cep cep) throws SQLException, ParseException {
        abrirBanco();

        pstmt = con.prepareStatement("INSERT INTO cep(cep, idCidade, idEstado) values(?,?,?)");

        pstmt.setString(1, cep.getCep());
        pstmt.setInt(2, cep.getCidade().getIdCidade());
        pstmt.setInt(3, cep.getEstado().getIdEstado());
        pstmt.execute();

        fecharBanco();
    }

    public Cep select(String busca) throws SQLException {
        abrirBanco();

        String query = "SELECT cep.*, c.*, e.* "
                + "FROM cep cep, cidade c, estado e "
                + "WHERE cep.cep like ? AND cep.idCidade = c.idCidade AND cep.idEstado = e.idEstado";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, busca);

        rs = pstmt.executeQuery();

        Cep cep = new Cep();
        Cidade cidade;
        Estado estado;

        if (rs.next()) {
            cep.setIdCep(rs.getInt("cep.idCep"));
            cep.setCep(rs.getString("cep.cep"));
            cidade = new Cidade();
            cidade.setIdCidade(rs.getInt("c.idCidade"));
            cidade.setNome(rs.getString("c.nome"));
            cep.setCidade(cidade);
            estado = new Estado();
            estado.setIdEstado(rs.getInt("e.idEstado"));
            estado.setNome(rs.getString("e.nome"));
            estado.setUf(rs.getString("e.uf"));
            cep.setEstado(estado);
        }

        fecharBanco();
        return cep;
    }
    
    public List<Cep> select() throws SQLException {
        abrirBanco();

        String query = "SELECT cep.*, c.*, e.* "
                + "FROM cep cep, cidade c, estado e "
                + "WHERE cep.idCidade = c.idCidade AND cep.idEstado = e.idEstado";
        pstmt = con.prepareStatement(query);
        rs = pstmt.executeQuery();

        Cep cep;
        Cidade cidade;
        Estado estado;
        List<Cep> listaCep = new ArrayList<Cep>();

        while (rs.next()) {
            cep = new Cep();
            cep.setIdCep(rs.getInt("cep.idCep"));
            cep.setCep(rs.getString("cep.cep"));
            cidade = new Cidade();
            cidade.setIdCidade(rs.getInt("c.idCidade"));
            cidade.setNome(rs.getString("c.nome"));
            cep.setCidade(cidade);
            estado = new Estado();
            estado.setIdEstado(rs.getInt("e.IdEstado"));
            estado.setNome(rs.getString("e.nome"));
            estado.setUf(rs.getString("e.uf"));
            cep.setEstado(estado);
            listaCep.add(cep);
        }

        fecharBanco();
        return listaCep;
    }

    public void update(Cep cep) throws SQLException, ParseException {
        abrirBanco();

        String query = "UPDATE cep SET cep = ?, idCidade = ?, idEstado = ? WHERE idCep = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setString(1, cep.getCep());
        pstmt.setInt(2, cep.getCidade().getIdCidade());
        pstmt.setInt(3, cep.getEstado().getIdEstado());
        pstmt.setInt(4, cep.getIdCep());
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM cep WHERE idCep = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM cep";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String busca) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM cep WHERE cep like ?"; //ORDER BY ASC ou ORDER BY DESC
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
    
    public boolean existe(String busca, String excessao) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM cep WHERE cep like ?"; //ORDER BY ASC ou ORDER BY DESC
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, busca);

        rs = pstmt.executeQuery();

        retorno = rs.next();
        if (retorno) {
            if (rs.getString("usuario").equals(excessao)) {
                retorno = false;
            }else{
                retorno = true;
            }
        }else{
            retorno = false;
        }

        fecharBanco();
        return retorno;
    }
}
