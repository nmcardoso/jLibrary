package jlibrary.view;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jlibrary.entidades.Login;
import jlibrary.logica.Global;
import jlibrary.persistencia.LoginDao;
import jlibrary.persistencia.PreferenciaDao;

/**
 *
 * @author Natanael
 */
public class JFLogin extends javax.swing.JFrame {

    List<Login> listaLogin;

    public JFLogin() {
        initComponents();
        //jPImagem.setAlignmentX((this.getWidth() / 2) - (jPImagem.getWidth() / 2));
        //jPanel1.setAlignmentX((this.getWidth() / 2) - (jPImagem.getWidth() / 2));
        jLImagem.setText("<html><img src='" + getClass().getResource("/jlibrary/images/user/default.png") + "' width='100' height='100' /></html>");
        new jlibrary.logica.Centralizar(this, this.getSize());
        populaCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(java.awt.Graphics g){
                super.paintComponent(g);
                g.drawImage(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/bgLogin.jpg")).getImage(), 0,0, null);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jBEntrar = new javax.swing.JButton();
        jPFSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCBUsuario = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jPImagem = new javax.swing.JPanel();
        jLImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticação");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/Books-2-icon64.png")).getImage());
        setMaximumSize(new java.awt.Dimension(880, 573));
        setResizable(false);

        jPanel1.setOpaque(false);

        jBEntrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBEntrar.setText("Entrar");
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        jPFSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPFSenhaKeyPressed(evt);
            }
        });
        jPFSenha.setEchoChar('\u25cf');

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Senha");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Usuário");

        jCBUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<html><i>Selecione um usuário</i></html>" }));
        jCBUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBEntrar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jBEntrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setOpaque(false);

        jPImagem.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPImagem.setMaximumSize(new java.awt.Dimension(120, 120));
        jPImagem.setOpaque(false);
        jPImagem.setPreferredSize(new java.awt.Dimension(120, 120));

        jLImagem.setText("Imagem");

        javax.swing.GroupLayout jPImagemLayout = new javax.swing.GroupLayout(jPImagem);
        jPImagem.setLayout(jPImagemLayout);
        jPImagemLayout.setHorizontalGroup(
            jPImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPImagemLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLImagem)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPImagemLayout.setVerticalGroup(
            jPImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPImagemLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLImagem)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        if (jCBUsuario.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(this, "Selecione um usuário", "Usuário inválido", JOptionPane.ERROR_MESSAGE);
            jCBUsuario.grabFocus();
            return;
        }

        int index = jCBUsuario.getSelectedIndex() - 1;
        
        char[] senhaDig = jPFSenha.getPassword();
        
        if (senhaDig.length == 0) {
            jPFSenha.grabFocus();
            return;
        }
        
        String strSenha = "";
        for (int i = 0; i < senhaDig.length; i++) {
            strSenha += senhaDig[i];
        }

        String senha = listaLogin.get(index).getSenha();
        
        if (strSenha.equals(senha)) {
            LoginDao loginDao = new LoginDao();
            Login login = new Login();
            try {
                login = loginDao.select(listaLogin.get(index).getIdLogin());
                Global.login = login;
                Global.preferencia = new PreferenciaDao().select(Global.login.getIdLogin());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, senha);
            }
            JFMain_Testes principal = new JFMain_Testes();
            principal.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Senha inválida", "Senha invádila", JOptionPane.ERROR_MESSAGE);
            jPFSenha.setText("");
            jPFSenha.grabFocus();
        }
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jCBUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBUsuarioActionPerformed
        if (jCBUsuario.getSelectedIndex() > 0) {
            jLImagem.setText("<html><img src='" + getClass().getResource("/jlibrary/images/user/" + listaLogin.get(jCBUsuario.getSelectedIndex() - 1).getImg()) + "'/></html>");
        }
    }//GEN-LAST:event_jCBUsuarioActionPerformed

    private void jPFSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFSenhaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jBEntrarActionPerformed(null);
        }
    }//GEN-LAST:event_jPFSenhaKeyPressed

    private void populaCombo() {
        LoginDao loginDao = new LoginDao();
        try {
            listaLogin = loginDao.select();
            for (Login login : listaLogin) {
                jCBUsuario.addItem(login.getUsuario());
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFLogin.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEntrar;
    private javax.swing.JComboBox jCBUsuario;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPImagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
