/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jlibrary.logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author Natanael
 */
public class RestoreSQL {

    Connection con;

    public void runSQL(File file) throws SQLException {
        String s;
        StringBuffer sb = new StringBuffer();

        try {
            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);

            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
            br.close();


            String[] inst = sb.toString().split(";");

            Connection c = getConnection();

            Statement st = c.createStatement();

            for (int i = 0; i < inst.length; i++) {
                if (!inst[i].trim().equals("")) {
                    st.executeUpdate(inst[i]);
                    System.out.println(">>" + inst[i]);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws Exception {
        Properties properties = new Properties();
        properties.load(new URL("file:/" + System.getProperty("user.dir") + "\\config\\bdconfig.properties").openStream());

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://" + properties.getProperty("ip") + ":" + properties.getProperty("port");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        return con = DriverManager.getConnection(url, user, password);
    }

    private void fecharBanco() throws SQLException {
        if (con != null) {
            con.close();
        }
    }
}
