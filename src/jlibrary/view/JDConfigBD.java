package jlibrary.view;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Natanael
 */
public class JDConfigBD extends javax.swing.JDialog {

    public JDConfigBD(java.awt.Window parent) {
        super(parent, DEFAULT_MODALITY_TYPE);
        initComponents();
        new jlibrary.logica.Centralizar(this, this.getSize());
        readProperties();
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
        jTIp = new javax.swing.JTextField();
        jTUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTPorta = new javax.swing.JTextField();
        jBCancelar = new javax.swing.JButton();
        jBConfirmar = new javax.swing.JButton();
        jTSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurar acesso ao banco de dados");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONFIGURAR ACESSO AO BANCO DE DADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setText("IP");

        jLabel2.setText("Usuário");

        jLabel4.setText("Senha");

        jLabel5.setText("Porta");

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBConfirmar.setText("Confirmar");
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTIp)
                    .addComponent(jTUsuario)
                    .addComponent(jTSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jTPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBConfirmar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed
        String msg = "";
        int erro = 0;

        if (!isIp(jTIp.getText())) {
            erro++;
            msg += "\n- IP inválido";
        }

        if (jTPorta.getText() == null || jTPorta.getText().equals("")) {
            erro++;
            msg += "\n- Porta inválida";
        }

        if (jTUsuario.getText() == null || jTUsuario.getText().equals("")) {
            erro++;
            msg += "\n- Usuário inválido";
        }

        if (erro > 0) {
            JOptionPane.showMessageDialog(this, "Foi encontrado " + erro + " erro(s): " + msg, "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean ok = createProperties();
        if (ok) {
            JOptionPane.showMessageDialog(this, "Configurações registradas com sucesso", "Operação finalizada", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_jBConfirmarActionPerformed

    private boolean createProperties() {
        Properties properties = new Properties();

        properties.setProperty("ip", jTIp.getText());
        properties.setProperty("port", jTPorta.getText());
        properties.setProperty("user", jTUsuario.getText());
        properties.setProperty("password", jTSenha.getText());

        try {
            File file = new File(System.getProperty("user.dir") + "\\config\\bdconfig.properties");
            FileOutputStream fos = new FileOutputStream(file);
            properties.store(fos, "DADOS DE ACESSO AO BANCO DE DADOS");
            fos.close();
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar as configurações", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void readProperties() {
        Properties properties = new Properties();

        try {
            URL url = new URL("file:/" + System.getProperty("user.dir") + "\\config\\bdconfig.properties");
            InputStream is = url.openStream();
            //properties.load(getClass().getResourceAsStream("/jlibrary/properties/bdconfig.properties"));
            properties.load(is);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        jTIp.setText(properties.getProperty("ip"));
        jTPorta.setText(properties.getProperty("port"));
        jTUsuario.setText(properties.getProperty("user"));
        jTSenha.setText(properties.getProperty("password"));
    }

    private boolean isIp(String ip) {
        if (ip == null || ip.equals("")) {
            return false;
        }

        if (ip.equalsIgnoreCase("localhost")) {
            return true;
        }

        String[] vetIp = ip.split("\\.");

        if (vetIp.length != 4) {
            return false;
        }

        for (int i = 0; i < 4; i++) {
            if (vetIp[i].length() > 3) {
                return false;
            }
        }

        return true;
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
            java.util.logging.Logger.getLogger(JDConfigBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDConfigBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDConfigBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDConfigBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDConfigBD dialog = new JDConfigBD(new javax.swing.JFrame());
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
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTIp;
    private javax.swing.JTextField jTPorta;
    private javax.swing.JTextField jTSenha;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}
