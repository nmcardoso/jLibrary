package jlibrary.view;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jlibrary.entidades.Login;
import jlibrary.entidades.Preferencia;
import jlibrary.logica.FormatarTexto;
import jlibrary.logica.Validar;
import jlibrary.persistencia.LoginDao;
import jlibrary.persistencia.PreferenciaDao;

/**
 *
 * @author Natanael
 */
public class JDCadUsuario extends javax.swing.JDialog {

    String imagem = "default.png";

    public JDCadUsuario(java.awt.Window parent) {
        super(parent, DEFAULT_MODALITY_TYPE);
        initComponents();
        new jlibrary.logica.Centralizar(this, this.getSize());
        jLImagem.setText("");
        jLImagem.setIcon(new ImageIcon(getClass().getResource("/jlibrary/images/user/default.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(java.awt.Graphics g){
                super.paintComponent(g);
                g.drawImage(new javax.swing.ImageIcon(new jlibrary.logica.Global().getHeaderBg()).getImage(), 0,0, null);
            }
        };
        jLabel3 = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPFRepSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPFSenha = new javax.swing.JPasswordField();
        jTUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLImagem = new javax.swing.JLabel();
        jBEscolher = new javax.swing.JButton();
        jBRemover = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar usuário");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CADASTRAR USUÁRIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jPFRepSenha.setEchoChar('\u25cf');
        jPFRepSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setText("Repetir Senha");

        jLabel4.setText("Senha");

        jPFSenha.setEchoChar('\u25cf');
        jPFSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setText("Usuário");

        jTNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNomeFocusLost(evt);
            }
        });

        jLabel1.setText("Nome Completo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTNome)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPFRepSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(jPFSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTUsuario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(100, 100, 100)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPFRepSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPFRepSenha, jPFSenha, jTUsuario});

        jTabbedPane1.addTab("Principal", jPanel2);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setMaximumSize(new java.awt.Dimension(120, 122));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(120, 122));

        jLImagem.setText("Imagem");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLImagem)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLImagem)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jBEscolher.setText("Galeria");
        jBEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEscolherActionPerformed(evt);
            }
        });

        jBRemover.setText("Remover");
        jBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBEscolher)
                    .addComponent(jBRemover))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jBEscolher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBRemover)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Foto", jPanel4);

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBCadastrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        Validar validar = new Validar();
        LoginDao loginDao = new LoginDao();
        Login login = new Login();
        String msg = "";
        int erro = 0;

        char[] vetSenha = jPFSenha.getPassword();
        char[] vetRepSenha = jPFRepSenha.getPassword();
        String strSenha = "", strRepSenha = "";

        for (int i = 0; i < vetSenha.length; i++) {
            strSenha += vetSenha[i];
        }

        for (int i = 0; i < vetRepSenha.length; i++) {
            strRepSenha += vetRepSenha[i];
        }

        if (!validar.isValid(jTNome)) {
            msg += "\n- Nome inválido";
            erro++;
        }

        if (!validar.isValid(jTUsuario)) {
            msg += "\n- Usuário inválido";
            erro++;
        }

        try {
            if (loginDao.existe(jTUsuario.getText())) {
                msg += "\n- Usuário existente";
                jTUsuario.setText("");
                erro++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDCadUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!strSenha.equals(strRepSenha) || strSenha.equals("") || strRepSenha.equals("")) {
            msg += "\n- Senha inválida";
            jPFRepSenha.setText("");
            jPFSenha.setText("");
            erro++;
        }

        if (imagem == null || imagem.equals("") || imagem.isEmpty()) {
            imagem = "default.png";
        }

        if (erro > 0) {
            JOptionPane.showMessageDialog(this, "<html><b>" + erro + " erro(s) encontrado(s) no preenchimento do formulário</b></html>" + msg,
                    "Erro no preenchimento do formulário", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            login.setNome(jTNome.getText());
            login.setUsuario(jTUsuario.getText());
            login.setSenha(strSenha);
            login.setImg(imagem);
            loginDao.insert(login);
            int id = loginDao.getLastId();

            Preferencia pref = new Preferencia();
            pref.setIdLogin(id);
            pref.setTipoItem("");
            pref.setIdioma("Português");
            pref.setSkin("skin1.jpg");

            PreferenciaDao prefDao = new PreferenciaDao();
            prefDao.insert(pref);
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!", "Êxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | ParseException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro no cadastro do usuário\n" + ex, "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomeFocusLost
        jTNome.setText(new FormatarTexto().formatar(jTNome));
    }//GEN-LAST:event_jTNomeFocusLost

    private void jBEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEscolherActionPerformed
        JDGaleria galeria = new JDGaleria(this);
        String img = galeria.showDialog();
        if (img != null) {
            jLImagem.setIcon(new ImageIcon(getClass().getResource("/jlibrary/images/user/" + img)));
            imagem = img;
        }
    }//GEN-LAST:event_jBEscolherActionPerformed

    private void jBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoverActionPerformed
        jLImagem.setIcon(new ImageIcon(getClass().getResource("/jlibrary/images/user/default.png")));
        imagem = "default.png";
    }//GEN-LAST:event_jBRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(JDCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDCadUsuario dialog = new JDCadUsuario(new javax.swing.JFrame());
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEscolher;
    private javax.swing.JButton jBRemover;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPFRepSenha;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTUsuario;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
