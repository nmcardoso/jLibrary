package jlibrary.reports;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Natanael
 */
public class ConnectionFactory {

    /*
     * Este bloco estático será executado assim que esta classe for carregada,
     * sendo assim, será executado apenas uma vez.
     */
    static {
        try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException exc) {

            exc.printStackTrace();

        }
    }

    /**
     * O método getConnection retorna uma conexão com o banco de dados baseado
     * nos parâmetros fornecidos.
     *
     * @param url O endereço da base de dados.
     * @param usuario O usuário que tem permissão na base de dados especificada.
     * @param senha A senha do usuário especificado
     * @return Uma conexão com o banco de dados especificado na url.
     * @throws SQLException Caso ocorra algum problema durante a conexão.
     */
    public static Connection getConnection(String url, String usuario, String senha) throws SQLException {

        // retorna a conexão a partir do método getConnection de DriverManager
        return DriverManager.getConnection(url, usuario, senha);

    }

    /**
     * Obtém uma conexão para a base de dados.
     *
     * @return Uma conexão para a base de dados.
     * @throws SQLException Caso ocorra algum problema durante a conexão.
     */
    public static Connection getConnection() throws SQLException {

        Properties p = new Properties();

        try {
            URL url = new URL("file:/" + System.getProperty("user.dir") + "\\config\\bdconfig.properties");
            InputStream is = url.openStream();
            //properties.load(getClass().getResourceAsStream("/jlibrary/properties/bdconfig.properties"));
            p.load(is);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return getConnection(
                "jdbc:mysql://" + p.getProperty("ip") + ":" + p.getProperty("port") + "/jlibrary",
                p.getProperty("user"),
                p.getProperty("password"));

    }
}