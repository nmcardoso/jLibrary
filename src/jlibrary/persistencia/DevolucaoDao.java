package jlibrary.persistencia;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import jlibrary.entidades.DevolucaoVO;

/**
 *
 * @author Natanael
 */
public class DevolucaoDao extends Dao {

    /**
     * 
     * @param busca valor a ser pesquisado
     * @param campoBusca 0 - leitor.nome <br />1 - item.titulo 
     * @return List<DevolucaoVO>
     * @throws SQLException 
     */
    public List<DevolucaoVO> select(String busca, int campoBusca) throws SQLException {
        abrirBanco();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String query = "";
        switch (campoBusca) {
            case 0:
                query = "SELECT c.*, l.nome, i.titulo "
                + "FROM leitor l, controle c, item i "
                + "WHERE c.idLeitor = l.idLeitor "
                + "AND c.idItem = i.idItem "
                + "AND i.status = 'Emprestado' "
                + "AND c.dataEnt IS NULL "
                + "AND l.nome like ? "
                + "ORDER BY c.dataEmp DESC";
                break;
            case 1:
                query = "SELECT c.*, l.nome, i.titulo "
                + "FROM leitor l, controle c, item i "
                + "WHERE c.idLeitor = l.idLeitor "
                + "AND c.idItem = i.idItem "
                + "AND i.status = 'Emprestado' "
                + "AND c.dataEnt IS NULL "
                + "AND i.titulo like ? "
                + "ORDER BY c.dataEmp DESC";
                break;
        }
        
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, "%" + busca + "%");
        rs = pstmt.executeQuery();

        DevolucaoVO devolucaoVO;
        List<DevolucaoVO> listaDevolucao = new ArrayList<DevolucaoVO>();
       
        while (rs.next()) {
            devolucaoVO = new DevolucaoVO();
            devolucaoVO.setDataEmp(sdf.format(rs.getDate("dataEmp")));
            devolucaoVO.setDataDev(sdf.format(rs.getDate("dataDev")));
            devolucaoVO.setNome(rs.getString("nome"));
            devolucaoVO.setTitulo(rs.getString("titulo"));
            devolucaoVO.setIdItem(rs.getInt("idItem"));
            devolucaoVO.setIdControle(rs.getInt("idControle"));
            devolucaoVO.setIdLeitor(rs.getInt("idLeitor"));
            listaDevolucao.add(devolucaoVO);
        }

        fecharBanco();
        return listaDevolucao;
    }

    public void update(DevolucaoVO devolucaoVO) throws SQLException, ParseException {
        abrirBanco();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        java.util.Date dateTime = new java.util.Date();
        String strDateTime = dateFormat.format(dateTime);

        pstmt = con.prepareStatement("UPDATE controle SET dataEnt = ? WHERE idControle = ?");
        pstmt.setDate(1, new Date(dateFormat.parse(strDateTime).getTime()));
        pstmt.setInt(2, devolucaoVO.getIdControle());
        pstmt.executeUpdate();
        
        
        pstmt = con.prepareStatement("UPDATE item SET status = 'Disponivel' WHERE idItem = ?");
        pstmt.setInt(1, devolucaoVO.getIdItem());
        pstmt.executeUpdate();

        fecharBanco();
    }

    public void delete(int id) throws SQLException {
        abrirBanco();

        String query = "DELETE FROM editora WHERE idEditora = ?";
        pstmt = con.prepareStatement(query);

        pstmt.setInt(1, id);
        pstmt.execute();

        fecharBanco();
    }

    public void delete() throws SQLException {
        abrirBanco();

        String query = "DELETE FROM editora";
        pstmt = con.prepareStatement(query);
        pstmt.execute();

        fecharBanco();
    }

    public boolean existe(String busca) throws SQLException {
        abrirBanco();
        boolean retorno;

        String query = "SELECT * FROM editora WHERE editora like ?"; //ORDER BY ASC ou ORDER BY DESC
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
