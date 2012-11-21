package jlibrary.view;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jlibrary.entidades.DevolucaoVO;
import jlibrary.persistencia.DevolucaoDao;

/**
 *
 * @author Natanael
 */
public class JDCadDevolucao extends javax.swing.JDialog {
    
    private List<DevolucaoVO> listaDevolucao;
    int campo = 0;

    public JDCadDevolucao(java.awt.Frame parent) {
        super(parent, DEFAULT_MODALITY_TYPE);
        initComponents();
        new jlibrary.logica.Centralizar(this, this.getSize());
        jTbResultado.getColumnModel().getColumn(0).setPreferredWidth(85);
        jTbResultado.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTbResultado.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTbResultado.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTbResultado.getColumnModel().getColumn(0).setMaxWidth(85);
        jTbResultado.getColumnModel().getColumn(1).setMaxWidth(80);
        preencheTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMConfig = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(java.awt.Graphics g){
                super.paintComponent(g);
                g.drawImage(new javax.swing.ImageIcon(new jlibrary.logica.Global().getHeaderBg()).getImage(), 0,0, null);
            }
        }
        ;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbResultado = new javax.swing.JTable();
        jBDevolucao = new javax.swing.JButton();
        jBConfig = new javax.swing.JButton();

        jMenuItem1.setText("Pesquisar por leitor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPMConfig.add(jMenuItem1);

        jMenuItem2.setText("Pesquisar por obra");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPMConfig.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Efetuar devolução");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/devolucao48.png"))); // NOI18N
        jLabel1.setText(" EFETUAR DEVOLUÇÃO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Nome do leitor");

        jTBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscaKeyReleased(evt);
            }
        });

        jTbResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emprestimo", "Devolução", "Leitor", "Título"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbResultado);

        jBDevolucao.setText("Efetuar devolução");
        jBDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDevolucaoActionPerformed(evt);
            }
        });

        jBConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/icons/pack1/41.png"))); // NOI18N
        jBConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBConfigMousePressed(evt);
            }
        });
        jBConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBConfig))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBDevolucao)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBConfig)
                    .addComponent(jTBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBDevolucao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscaKeyReleased
        preencheTabela();
    }//GEN-LAST:event_jTBuscaKeyReleased

    private void jBDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDevolucaoActionPerformed
        if (jTbResultado.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um item para fazer devolução", "Nenhum elemento selecionado", JOptionPane.INFORMATION_MESSAGE);
        }

        DevolucaoVO devolucaoVO = new DevolucaoVO();
        devolucaoVO.setNome(jTbResultado.getModel().getValueAt(jTbResultado.getSelectedRow(), 2).toString());
        devolucaoVO.setTitulo(jTbResultado.getModel().getValueAt(jTbResultado.getSelectedRow(), 3).toString());
        devolucaoVO.setIdControle(listaDevolucao.get(jTbResultado.getSelectedRow()).getIdControle());
        devolucaoVO.setIdItem(listaDevolucao.get(jTbResultado.getSelectedRow()).getIdItem());
        devolucaoVO.setIdLeitor(listaDevolucao.get(jTbResultado.getSelectedRow()).getIdLeitor());

        DevolucaoDao devolucaoDao = new DevolucaoDao();
        try {
            devolucaoDao.update(devolucaoVO);
            JOptionPane.showMessageDialog(this, "Devolução efetuada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | ParseException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu o seguinte erro:\n" + ex.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(JDCadDevolucao.class.getName()).log(Level.SEVERE, null, ex);
        }
        preencheTabela();
    }//GEN-LAST:event_jBDevolucaoActionPerformed

    private void jBConfigMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConfigMousePressed
        //jPopupMenu1.show(jButton1, -100, 25);
    }//GEN-LAST:event_jBConfigMousePressed

    private void jBConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfigActionPerformed
        jPMConfig.show(jBConfig, -95, jBConfig.getHeight());
    }//GEN-LAST:event_jBConfigActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jLabel2.setText("Nome do leitor");
        jTBusca.setText("");
        campo = 0;
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jLabel2.setText("Título da obra");
        jTBusca.setText("");
        campo = 1;
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void preencheTabela() {
        DevolucaoDao devolucaoDao = new DevolucaoDao();

        try {
            listaDevolucao = devolucaoDao.select(jTBusca.getText(), campo);
            DefaultTableModel modelo = (DefaultTableModel) jTbResultado.getModel();
            modelo.setRowCount(0);

            for (DevolucaoVO devolucaoVO : listaDevolucao) {
                modelo.addRow(new Object[]{devolucaoVO.getDataEmp(), devolucaoVO.getDataDev(), devolucaoVO.getNome(), devolucaoVO.getTitulo()});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(JDCadDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDCadDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDCadDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDCadDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDCadDevolucao dialog = new JDCadDevolucao(new javax.swing.JFrame());
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
    private javax.swing.JButton jBConfig;
    private javax.swing.JButton jBDevolucao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPMConfig;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBusca;
    private javax.swing.JTable jTbResultado;
    // End of variables declaration//GEN-END:variables
}
