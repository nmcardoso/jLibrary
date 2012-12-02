package jlibrary.persistencia;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Natanael
 */
public class Dao {

    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;

    /**
     * Método para abrir o banco de dados
     *
     * @exception SQLException, ClassNotFoundException
     * @return JOptionPane (ERROR_MESSAGE) com a mensagem do erro
     */
    public void abrirBanco() {
        try {
            Properties p = new Properties();
            //p.load(getClass().getResourceAsStream("/jlibrary/properties/bdconfig.properties"));
            p.load(new URL("file:/" + System.getProperty("user.dir") + "\\config\\bdconfig.properties").openStream());
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + p.getProperty("ip") + ":" + p.getProperty("port") + "/jlibrary";
            String user = p.getProperty("user");
            String password = p.getProperty("password");

            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no driver."
                    + "\n" + "Mensagem: " + ex.getMessage(),
                    "Erro no driver", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na conexão."
                    + "\n" + "Menssagem: " + ex.getMessage()
                    + "\n" + "Código do erro: " + ex.getErrorCode(),
                    "Erro na conexão", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura dos arquivos de propriedade."
                    + "\n" + "Menssagem: " + ex.getMessage(),
                    "Erro na conexão", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Fecha a conexão com o banco de dados.
     *
     */
    public void fecharBanco() throws SQLException {
        if (con != null) {
            con.close();
        }

        if (pstmt != null) {
            pstmt.close();
        }

        if (rs != null) {
            rs.close();
        }
    }
}
