package jlibrary.view;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jlibrary.entidades.Preferencia;
import jlibrary.logica.Global;
import jlibrary.logica.RestoreSQL;

/**
 *
 * @author Natanael
 */
public class JFSplash extends javax.swing.JFrame {

    private Connection con;

    public JFSplash() {
        initComponents();
        new jlibrary.logica.Centralizar(this, this.getSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/Books-2-icon64.png")).getImage());
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/logo3.png"))); // NOI18N

        jLabel1.setText("Iniciando verificação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Preferencia p = new Preferencia();
        p.setSkin("skin1.jpg");
        Global.preferencia = p;

        jLabel1.setText("Verificando conexão com o banco de dados");
        
        try {
            Thread.sleep(200);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        int i = 0;
        int op;
        while (!testaConexao()) {
            i++;
            if (i == 1) {
                op = JOptionPane.showConfirmDialog(this, "O banco de dados não está configurado.\nDeseja configurá-lo?",
                        "Erro na conexão", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                if (op == JOptionPane.YES_OPTION) {
                    new JDConfigBD(this).setVisible(true);
                } else {
                    System.exit(0);
                    break;
                }
            } else {
                op = JOptionPane.showConfirmDialog(this, "A conexão ainda não foi configurada corretamente.\nDeseja configurá-la?",
                        "O erro ainda persiste", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                if (op == JOptionPane.YES_OPTION) {
                    new JDConfigBD(this).setVisible(true);
                } else {
                    System.exit(0);
                    break;
                }
            }
        }

        jLabel1.setText("Verificando banco de dados do sistema");

        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        if (testaBanco()) {
            new JFLogin().setVisible(true);
            this.dispose();
        } else {
            int r = JOptionPane.showConfirmDialog(this, "O banco de dados nao foi encontrado, deseja instalá-lo?",
                    "Instalar banco de dados", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (r == JOptionPane.YES_OPTION) {
                
                jLabel1.setText("Instalando banco de dados, por favor, aguarde");
                
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                
                try {
                    //new File(System.getProperty("user.dir").replace("\\", "/") + "/config/install.sql")
                    new RestoreSQL().runSQL(new File(System.getProperty("user.dir").replace("\\", "/") + "/config/install.sql"));
                    new RestoreSQL().runSQL(new File(System.getProperty("user.dir").replace("\\", "/") + "/config/cidades.sql"));
                } catch (SQLException ex) {
                    Logger.getLogger(JFSplash.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.exit(0);
            }

            if (testaBanco()) {
                JOptionPane.showMessageDialog(this, "O banco de dados foi instalado com sucesso\nUtilize o usuário Administrador com a senha 123",
                        "Banco de dados instalado com sucesso", JOptionPane.INFORMATION_MESSAGE);
                new JFLogin().setVisible(true);
                this.dispose();
            }
        }

    }//GEN-LAST:event_formWindowOpened

    private boolean testaConexao() {
        try {
            abrirBanco("");
            fecharBanco();
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }

    private boolean testaBanco() {
        try {
            abrirBanco("/jlibrary");
            fecharBanco();
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }

    private void abrirBanco(String banco) throws Exception {
        Properties properties = new Properties();
        //this.getClass().getClassLoader().getResource("/properties/bdconfig.properties");
        //properties.load(getClass().getResourceAsStream("/jlibrary/properties/bdconfig.properties"));
        properties.load(new URL("file:/" + System.getProperty("user.dir") + "/config/bdconfig.properties").openStream());

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://" + properties.getProperty("ip") + ":" + properties.getProperty("port") + banco;
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        con = DriverManager.getConnection(url, user, password);
    }

    private void fecharBanco() throws SQLException {
        if (con != null) {
            con.close();
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFSplash().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
