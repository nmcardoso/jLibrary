package jlibrary.view;

import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jlibrary.entidades.Controle;
import jlibrary.persistencia.ControleDao;

/**
 *
 * @author Natanael
 */
public class JDHistMov extends javax.swing.JDialog {

    List<Controle> listaControle = new ArrayList<Controle>();
    
    public JDHistMov(java.awt.Window parent) {
        super(parent, DEFAULT_MODALITY_TYPE);
        initComponents();
        new jlibrary.logica.Centralizar(this, this.getSize());
        jPOpcoes.setVisible(false);
        jRBLeitor.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(java.awt.Graphics g){
                //super.paintComponent(g);
                //g.drawImage(new javax.swing.ImageIcon(new jlibrary.logica.Global().getHeaderBg()).getImage(), 0,0, null);
            }
        };
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTBusca = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTBOpcoes = new javax.swing.JToggleButton();
        jPOpcoes = new javax.swing.JPanel();
        jRBLeitor = new javax.swing.JRadioButton();
        jRBTitulo = new javax.swing.JRadioButton();
        jRBDataEmp = new javax.swing.JRadioButton();
        jRBDataDev = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbHist = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Histórico das movimentações");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HISTÓRICO DAS MOVIMENTAÇÕES");

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
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Pesquisar");

        jTBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, "card2");

        jLabel2.setText("Pesquisar de");

        jLabel4.setText("até");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(224, 224, 224)
                .addComponent(jLabel4)
                .addContainerGap(327, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, "card3");

        jTBOpcoes.setText("Opções");
        jTBOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBOpcoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTBOpcoes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTBOpcoes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        buttonGroup1.add(jRBLeitor);
        jRBLeitor.setText("Nome do leitor");
        jRBLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBLeitorActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBTitulo);
        jRBTitulo.setText("Título da obra");
        jRBTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTituloActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBDataEmp);
        jRBDataEmp.setText("Data de empréstimo");
        jRBDataEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBDataEmpActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBDataDev);
        jRBDataDev.setText("Data de devolução");
        jRBDataDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBDataDevActionPerformed(evt);
            }
        });

        jLabel5.setText("Pesquisar por:");

        javax.swing.GroupLayout jPOpcoesLayout = new javax.swing.GroupLayout(jPOpcoes);
        jPOpcoes.setLayout(jPOpcoesLayout);
        jPOpcoesLayout.setHorizontalGroup(
            jPOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOpcoesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBLeitor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBDataEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBDataDev)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPOpcoesLayout.setVerticalGroup(
            jPOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOpcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBLeitor)
                    .addComponent(jRBTitulo)
                    .addComponent(jRBDataEmp)
                    .addComponent(jRBDataDev)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTbHist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data Emp.", "Data Dev.", "Título", "Leitor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbHist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBOpcoesActionPerformed
        jPOpcoes.setVisible(jTBOpcoes.isSelected());
        jTBOpcoes.setFocusPainted(false);
    }//GEN-LAST:event_jTBOpcoesActionPerformed

    private void jRBDataEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBDataEmpActionPerformed
        CardLayout cl = (CardLayout) jPanel2.getLayout();
        cl.show(jPanel2, "card3");
    }//GEN-LAST:event_jRBDataEmpActionPerformed

    private void jRBDataDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBDataDevActionPerformed
        CardLayout cl = (CardLayout) jPanel2.getLayout();
        cl.show(jPanel2, "card3");
    }//GEN-LAST:event_jRBDataDevActionPerformed

    private void jRBTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTituloActionPerformed
        CardLayout cl = (CardLayout) jPanel2.getLayout();
        cl.show(jPanel2, "card2");
        jTBusca.setText("");
    }//GEN-LAST:event_jRBTituloActionPerformed

    private void jRBLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBLeitorActionPerformed
        CardLayout cl = (CardLayout) jPanel2.getLayout();
        cl.show(jPanel2, "card2");
        jTBusca.setText("");
    }//GEN-LAST:event_jRBLeitorActionPerformed

    private void jTBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscaKeyReleased
        if (jRBLeitor.isSelected()) {
            preenchePorLeitor();
        }else if(jRBTitulo.isSelected()){
            preenchePorTitulo();
        }else if(jRBDataDev.isSelected()){
            preenchePorDataDev();
        }else if(jRBDataEmp.isSelected()){
            preenchePorDataEmp();
        }
    }//GEN-LAST:event_jTBuscaKeyReleased
    
    private void preenchePorLeitor() {
        ControleDao controleDao = new ControleDao();

        try {
            listaControle = controleDao.select(jTBusca.getText(), 1);
            DefaultTableModel modelo = (DefaultTableModel) jTbHist.getModel();
            modelo.setRowCount(0);

            for (Controle controle : listaControle) {
                modelo.addRow(new Object[]{controle.getDataEmp(), controle.getDataDev(), controle.getItem().getTitulo(), controle.getLeitor().getNome()});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void preenchePorTitulo() {
        ControleDao controleDao = new ControleDao();

        try {
            listaControle = controleDao.select(jTBusca.getText(), 2);
            DefaultTableModel modelo = (DefaultTableModel) jTbHist.getModel();
            modelo.setRowCount(0);

            for (Controle controle : listaControle) {
                modelo.addRow(new Object[]{controle.getDataEmp(), controle.getDataDev(), controle.getItem().getTitulo(), controle.getLeitor().getNome()});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void preenchePorDataDev(){
        ControleDao controleDao = new ControleDao();

        try {
            listaControle = controleDao.select(jTBusca.getText(), 1);
            DefaultTableModel modelo = (DefaultTableModel) jTbHist.getModel();
            modelo.setRowCount(0);

            for (Controle controle : listaControle) {
                modelo.addRow(new Object[]{controle.getDataEmp(), controle.getDataDev(), controle.getItem().getTitulo(), controle.getLeitor().getNome()});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void preenchePorDataEmp(){
        ControleDao controleDao = new ControleDao();

        try {
            listaControle = controleDao.select(jTBusca.getText(), 1);
            DefaultTableModel modelo = (DefaultTableModel) jTbHist.getModel();
            modelo.setRowCount(0);

            for (Controle controle : listaControle) {
                modelo.addRow(new Object[]{controle.getDataEmp(), controle.getDataDev(), controle.getItem().getTitulo(), controle.getLeitor().getNome()});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JDHistMov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDHistMov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDHistMov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDHistMov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDHistMov dialog = new JDHistMov(new javax.swing.JFrame());
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPOpcoes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRBDataDev;
    private javax.swing.JRadioButton jRBDataEmp;
    private javax.swing.JRadioButton jRBLeitor;
    private javax.swing.JRadioButton jRBTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBOpcoes;
    private javax.swing.JTextField jTBusca;
    private javax.swing.JTable jTbHist;
    // End of variables declaration//GEN-END:variables
}
