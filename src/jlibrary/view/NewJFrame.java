/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jlibrary.view;

import jlibrary.entidades.Leitor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Natanael
 */
public class NewJFrame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Servidor 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Servidor 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Servidor 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        abrirBanco();

        try {
            String query = "select * from teste";
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                JOptionPane.showMessageDialog(null,
                        "ID: "+ rs.getString("id")
                        +"\nNome: "+ rs.getString("nome")
                        +"\nSexo: "+ rs.getString("sexo"));
            }
            pstmt.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        abrirBanco2();

        try {
            //pstmt = con.prepareStatement("CREATE DATABASE natanaelmagalhaes");
            //pstmt.execute();
            //pstmt = con.prepareStatement("USE natanaelmagalhaes");
            //pstmt.execute();
            //pstmt = con.prepareStatement("CREATE TABLE minha_tabela(id int key auto_increment, nome varchar(45), sexo varchar(10))");
            //pstmt.execute();
            //pstmt = con.prepareStatement("INSERT INTO minha_tabela VALUES(null,'Natanael','Masc')");
            //pstmt.execute();
            String query = "select * from minha_tabela";
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                JOptionPane.showMessageDialog(null,
                        "ID: "+rs.getString("id")
                        +"\nNome: "+ rs.getString("nome")
                        +"\nSexo: "+ rs.getString("sexo"));
            }
            pstmt.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        abrirBanco3();
        try {
            //pstmt = con.prepareStatement("USE jlibraryonline");
            //pstmt.execute();
            //pstmt = con.prepareStatement("CREATE TABLE minha_tabela(id int key auto_increment, nome varchar(45), sexo varchar(10))");
            //pstmt.execute();
            //pstmt = con.prepareStatement("INSERT INTO minha_tabela VALUES(null,'Dricreia','Fem')");
            //pstmt.execute();
            String query = "select * from minha_tabela";
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                JOptionPane.showMessageDialog(null,
                        "Id: "+rs.getString("id")
                        +"\nNome: "+ rs.getString("nome")
                        +"\nSexo: "+ rs.getString("sexo"));
            }
            pstmt.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        abrirBanco4();
        try {
            String query = "select * from item";
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                JOptionPane.showMessageDialog(null,
                        "Titulo: "+ rs.getString("titulo"));
            }
            pstmt.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    /*
     * Método para abrir o banco de dados
     * @exception SQLException, ClassNotFoundException
     * @return JOptionPane (ERROR_MESSAGE) com a mensagem do erro
     */
    public void abrirBanco() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://208.11.220.249:3306/h1n1bib";//sql09.freemysql.net ou 208.11.220.249
            String user = "magalhaes";
            String password = "01001110";

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
        }
    }

    public void abrirBanco2() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://mysqlforfree.com/natanaelmagalhaes";
            String user = "natanael";
            String password = "senha";

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
        }
    }
    
    public void abrirBanco3() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://www.freesql.org/jlibraryonline";
            String user = "magalhaes";
            String password = "natanael";

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
        }
    }
    
    public void abrirBanco4() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://noads-freewebhostingarea-com.noads.biz/262103";
            String user = "262103";
            String password = "retafinal2012";

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
