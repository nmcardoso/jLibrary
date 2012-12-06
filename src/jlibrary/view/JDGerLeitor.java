package jlibrary.view;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jlibrary.entidades.Leitor;
import jlibrary.entidades.SerieVO;
import jlibrary.entidades.Turno;
import jlibrary.persistencia.LeitorDao;
import jlibrary.persistencia.SerieDao;
import jlibrary.persistencia.TurnoDao;

/**
 *
 * @author Natanael
 */
public class JDGerLeitor extends javax.swing.JDialog {

    private List<Leitor> listaLeitor;
    private List<SerieVO> listaSerie;
    private List<Turno> listaTurno;

    public JDGerLeitor(java.awt.Window parent) {
        super(parent, DEFAULT_MODALITY_TYPE);
        initComponents();
        new jlibrary.logica.Centralizar(this, this.getSize());
        preencheTb(jTabbedPane1.getSelectedIndex());
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTLeitor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbLeitor = new javax.swing.JTable();
        jBDelLeitor = new javax.swing.JButton();
        jBAltLeitor = new javax.swing.JButton();
        jBCadLeitor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTSerie = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbSerie = new javax.swing.JTable();
        jBDelSerie = new javax.swing.JButton();
        jBAltSerie = new javax.swing.JButton();
        jCadSerie = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTbTurno = new javax.swing.JTable();
        jBDelTurno = new javax.swing.JButton();
        jBAltTurno = new javax.swing.JButton();
        jBCadTurno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar leitor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GERENCIAR LEITOR");

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

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseReleased(evt);
            }
        });

        jTLeitor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTLeitorKeyReleased(evt);
            }
        });

        jLabel1.setText("Nome");

        jTbLeitor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Série", "Turno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbLeitor);

        jBDelLeitor.setText("Deletar");
        jBDelLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelLeitorActionPerformed(evt);
            }
        });

        jBAltLeitor.setText("Alterar");
        jBAltLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltLeitorActionPerformed(evt);
            }
        });

        jBCadLeitor.setText("Cadastrar");
        jBCadLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadLeitorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTLeitor))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCadLeitor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAltLeitor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBDelLeitor)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDelLeitor)
                    .addComponent(jBAltLeitor)
                    .addComponent(jBCadLeitor))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Leitores", jPanel2);

        jLabel2.setText("Série");

        jTSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTSerieKeyReleased(evt);
            }
        });

        jTbSerie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Série", "Turno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTbSerie);

        jBDelSerie.setText("Deletar");
        jBDelSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelSerieActionPerformed(evt);
            }
        });

        jBAltSerie.setText("Alterar");
        jBAltSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltSerieActionPerformed(evt);
            }
        });

        jCadSerie.setText("Cadastrar");
        jCadSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTSerie))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCadSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAltSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBDelSerie)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDelSerie)
                    .addComponent(jBAltSerie)
                    .addComponent(jCadSerie))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Séries", jPanel3);

        jTbTurno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Turnos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTbTurno);

        jBDelTurno.setText("Deletar");
        jBDelTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelTurnoActionPerformed(evt);
            }
        });

        jBAltTurno.setText("Alterar");
        jBAltTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltTurnoActionPerformed(evt);
            }
        });

        jBCadTurno.setText("Cadastrar");
        jBCadTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadTurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCadTurno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAltTurno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBDelTurno)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDelTurno)
                    .addComponent(jBAltTurno)
                    .addComponent(jBCadTurno))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Turnos", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadLeitorActionPerformed
        new JDCadLeitor(this).setVisible(true);
        preencheTb(0);
    }//GEN-LAST:event_jBCadLeitorActionPerformed

    private void jTLeitorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLeitorKeyReleased
        preencheTb(0);
    }//GEN-LAST:event_jTLeitorKeyReleased

    private void jBAltTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltTurnoActionPerformed
        new JDEditTurno(this).setVisible(true);
        preencheTb(2);
    }//GEN-LAST:event_jBAltTurnoActionPerformed

    private void jBAltLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltLeitorActionPerformed
        if (jTbLeitor.getSelectedRow() != -1) {
            Leitor leitor = listaLeitor.get(jTbLeitor.getSelectedRow());
            new JDEditLeitor(this, leitor).setVisible(true);
            preencheTb(0);
        }
    }//GEN-LAST:event_jBAltLeitorActionPerformed

    private void jBDelTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelTurnoActionPerformed
        preencheTb(2);
    }//GEN-LAST:event_jBDelTurnoActionPerformed

    private void jBCadTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadTurnoActionPerformed
        new JDCadTurno(this).setVisible(true);
        preencheTb(2);
    }//GEN-LAST:event_jBCadTurnoActionPerformed

    private void jCadSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadSerieActionPerformed
        new JDCadSerie(this).setVisible(true);
        preencheTb(1);
    }//GEN-LAST:event_jCadSerieActionPerformed

    private void jBAltSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltSerieActionPerformed
        new JDEditSerie(this).setVisible(true);
        preencheTb(1);
    }//GEN-LAST:event_jBAltSerieActionPerformed

    private void jTSerieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSerieKeyReleased
        preencheTb(1);
    }//GEN-LAST:event_jTSerieKeyReleased

    private void jTabbedPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseReleased
        preencheTb(jTabbedPane1.getSelectedIndex());
    }//GEN-LAST:event_jTabbedPane1MouseReleased

    private void jBDelLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelLeitorActionPerformed
        preencheTb(0);
    }//GEN-LAST:event_jBDelLeitorActionPerformed

    private void jBDelSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelSerieActionPerformed
        preencheTb(1);
    }//GEN-LAST:event_jBDelSerieActionPerformed

    private void preencheTb(int index) {
        switch (index) {
            case 0:
                LeitorDao leitorDao = new LeitorDao();

                try {
                    listaLeitor = leitorDao.selectAll(jTLeitor.getText());
                    DefaultTableModel modelo = (DefaultTableModel) jTbLeitor.getModel();
                    modelo.setRowCount(0);

                    for (Leitor leitor : listaLeitor) {
                        modelo.addRow(new Object[]{leitor.getNome(), leitor.getSerie().getNome(), leitor.getSerie().getTurno().getNome()});
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
                break;
            
            case 1:
                SerieDao serieDao = new SerieDao();

                try {
                    listaSerie = serieDao.select(jTSerie.getText());
                    DefaultTableModel modelo = (DefaultTableModel) jTbSerie.getModel();
                    modelo.setRowCount(0);
                    for (SerieVO serieVO : listaSerie) {
                        modelo.addRow(new Object[]{serieVO.getNome(), serieVO.getTurno().getNome()});
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }

                break;
            
            case 2:
                TurnoDao turnoDao = new TurnoDao();

                try {
                    listaTurno = turnoDao.select();
                    DefaultTableModel modelo = (DefaultTableModel) jTbTurno.getModel();
                    modelo.setRowCount(0);

                    for (Turno turno : listaTurno) {
                        modelo.addRow(new Object[]{turno.getNome()});
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
                break;
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
            java.util.logging.Logger.getLogger(JDGerLeitor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDGerLeitor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDGerLeitor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDGerLeitor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDGerLeitor dialog = new JDGerLeitor(new javax.swing.JFrame());
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
    private javax.swing.JButton jBAltLeitor;
    private javax.swing.JButton jBAltSerie;
    private javax.swing.JButton jBAltTurno;
    private javax.swing.JButton jBCadLeitor;
    private javax.swing.JButton jBCadTurno;
    private javax.swing.JButton jBDelLeitor;
    private javax.swing.JButton jBDelSerie;
    private javax.swing.JButton jBDelTurno;
    private javax.swing.JButton jCadSerie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTLeitor;
    private javax.swing.JTextField jTSerie;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTbLeitor;
    private javax.swing.JTable jTbSerie;
    private javax.swing.JTable jTbTurno;
    // End of variables declaration//GEN-END:variables
}
