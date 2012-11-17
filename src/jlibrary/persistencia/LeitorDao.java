package jlibrary.persistencia;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import jlibrary.entidades.Cidade;
import jlibrary.entidades.Estado;
import jlibrary.entidades.Leitor;
import jlibrary.entidades.LeitorVO;
import jlibrary.entidades.Serie;
import jlibrary.entidades.Turno;
import jlibrary.logica.FormatarTexto;

/**
 *
 * @author Natanael
 */
public class LeitorDao extends Dao {

    public void insert(Leitor leitor) throws SQLException, ParseException {
        abrirBanco();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        pstmt = con.prepareStatement("INSERT INTO leitor "
                + "(nome,nomePai,nomeMae,sexo,rg,cpf,cep,endereco,numEnd,bairro,"
                + "email,dataNasc,dataCad,idCidade,idEstado,"
                + "telefone1,telefone2,celular1,celular2,idSerie,idTurno) "
                + "VALUE (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

        pstmt.setString(1, leitor.getNome());
        pstmt.setString(2, leitor.getNomePai());
        pstmt.setString(3, leitor.getNomeMae());
        pstmt.setString(4, leitor.getSexo());
        pstmt.setString(5, leitor.getRg());
        pstmt.setString(6, leitor.getCpf());
        pstmt.setString(7, leitor.getCep());
        pstmt.setString(8, leitor.getEndereco());
        pstmt.setString(9, leitor.getNumEnd());
        pstmt.setString(10, leitor.getBairro());
        pstmt.setString(11, leitor.getEmail());
        pstmt.setDate(12, new Date(sdf.parse(leitor.getDataNasc()).getTime()));
        pstmt.setDate(13, new Date(new java.util.Date().getTime()));
        pstmt.setInt(14, leitor.getCidade().getIdCidade());
        pstmt.setInt(15, leitor.getEstado().getIdEstado());
        pstmt.setString(16, leitor.getTelefone1());
        pstmt.setString(17, leitor.getTelefone2());
        pstmt.setString(18, leitor.getCelular1());
        pstmt.setString(19, leitor.getCelular2());
        pstmt.setInt(20, leitor.getSerie().getIdSerie());
        pstmt.setInt(21, leitor.getTurno().getIdTurno());
        pstmt.execute();

        fecharBanco();
    }

    public List<LeitorVO> select(String nome) throws SQLException {
        abrirBanco();

        String query = "SELECT l.idLeitor, l.nome, s.nome, t.nome "
                + "FROM leitor l, serie s, turno t "
                + "WHERE l.nome like ? AND l.idSerie = s.idSerie AND l.idTurno = t.idTurno "
                + "ORDER BY l.nome ASC";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, new FormatarTexto().formatarQuery(nome));

        rs = pstmt.executeQuery();

        LeitorVO leitorVO;
        List<LeitorVO> listaLeitor = new ArrayList<LeitorVO>();

        while (rs.next()) {
            leitorVO = new LeitorVO();
            leitorVO.setIdLeitor(rs.getInt("l.idLeitor"));
            leitorVO.setLeitor(rs.getString("l.nome"));
            leitorVO.setSerie(rs.getString("s.nome"));
            leitorVO.setTurno(rs.getString("t.nome"));

            listaLeitor.add(leitorVO);
        }

        fecharBanco();
        return listaLeitor;
    }
    
    public List<Leitor> selectAll(String nome) throws SQLException {
        abrirBanco();

        String query = "SELECT l.*, s.*, t.*, c.*, e.* "
                + "FROM leitor l, serie s, turno t, cidade c, estado e "
                + "WHERE l.nome like ? AND l.idSerie = s.idSerie AND l.idTurno = t.idTurno AND l.idCidade = c.idCidade AND l.idEstado = e.idEstado "
                + "ORDER BY l.nome ASC";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, new FormatarTexto().formatarQuery(nome));

        rs = pstmt.executeQuery();

        Leitor leitor;
        Cidade cidade;
        Estado estado;
        Serie serie;
        Turno turno;
        List<Leitor> listaLeitor = new ArrayList<Leitor>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (rs.next()) {
            leitor = new Leitor();
            cidade = new Cidade();
            turno = new Turno();
            serie = new Serie();
            estado = new Estado();
            leitor.setIdLeitor(rs.getInt("l.idLeitor"));
            leitor.setBairro(rs.getString("l.bairro"));
            leitor.setCelular1(rs.getString("l.celular1"));
            leitor.setCelular2(rs.getString("l.celular2"));
            leitor.setCep(rs.getString("l.cep"));
            cidade.setIdCidade(rs.getInt("c.idCidade"));
            cidade.setNome(rs.getString("c.nome"));
            cidade.setIdEstado(rs.getInt("c.idEstado"));
            leitor.setCidade(cidade);
            leitor.setCpf(rs.getString("l.cpf"));
            leitor.setDataNasc(sdf.format(rs.getDate("dataNasc")));
            leitor.setEmail(rs.getString("l.email"));
            leitor.setEndereco(rs.getString("endereco"));
            leitor.setIdLeitor(rs.getInt("l.idLeitor"));
            leitor.setNome(rs.getString("l.nome"));
            leitor.setNomeMae(rs.getString("l.nomeMae"));
            leitor.setNomePai(rs.getString("l.nomePai"));
            leitor.setNumEnd(rs.getString("l.numEnd"));
            leitor.setRg(rs.getString("l.rg"));
            serie.setIdSerie(rs.getInt("s.idSerie"));
            serie.setIdTurno(rs.getInt("s.idTurno"));
            serie.setNome(rs.getString("s.nome"));
            turno.setIdTurno(rs.getInt("t.idTurno"));
            turno.setNome(rs.getString("t.nome"));
            serie.setTurno(turno);
            leitor.setSerie(serie);
            leitor.setSexo(rs.getString("l.sexo"));
            leitor.setTelefone1(rs.getString("l.telefone1"));
            leitor.setTelefone2(rs.getString("l.telefone2"));
            estado.setIdEstado(rs.getInt("e.idEstado"));
            estado.setNome(rs.getString("e.nome"));
            estado.setUf(rs.getString("e.uf"));
            listaLeitor.add(leitor);
        }

        fecharBanco();
        return listaLeitor;
    }

    public void update(Leitor leitor) throws SQLException, ParseException {
        abrirBanco();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        String query = "UPDATE leitor SET "
                + "nome = ?, nomePai = ?, nomeMae = ?, rg = ?, cpf = ?, sexo = ?, cep = ?, endereco = ?,"
                + "numEnd = ?, bairro = ?, email = ?, cidade_id = ?, cidade_estado_id = ?, dataNasc = ?"
                + " WHERE idLeitor = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setString(1, leitor.getNome());
        pstmt.setString(2, leitor.getNomePai());
        pstmt.setString(3, leitor.getNomeMae());
        pstmt.setString(4, leitor.getRg());
        pstmt.setString(5, leitor.getCpf());
        pstmt.setString(6, leitor.getSexo());
        pstmt.setDate(7, new java.sql.Date(df.parse(leitor.getDataNasc()).getTime()));
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM leitor WHERE idLeitor = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM leitor";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String busca) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM leitor WHERE cpf like ?"; //ORDER BY ASC ou ORDER BY DESC
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, busca);

        rs = pstmt.executeQuery();

        if (!rs.next()) {
            retorno = false;
        } else {
            String cpf = rs.getString("cpf");
            if (cpf == null || cpf.equals("")) {
                retorno = false;
            }else{
                retorno = true;
            }
        }

        fecharBanco();
        return retorno;
    }
    
    public int cont() throws SQLException{
        abrirBanco();
        String query = "SELECT COUNT(*) AS count FROM leitor";
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
