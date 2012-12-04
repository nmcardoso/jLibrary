package jlibrary.view;

import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import jlibrary.entidades.Preferencia;
import jlibrary.logica.Global;
import jlibrary.persistencia.PreferenciaDao;

/**
 *
 * @author Natanael
 */
public class JDSelSkin extends javax.swing.JDialog {

    JComponent comp;
    String skin;

    public JDSelSkin(java.awt.Window parent) {
        super(parent, DEFAULT_MODALITY_TYPE);
        initComponents();
        carregaImagens();
        new jlibrary.logica.Centralizar(this, this.getSize());
        comp = jLSkin1;
        skin = "skin1.jpg";
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jLSkin1 = new javax.swing.JLabel();
        jLSkin2 = new javax.swing.JLabel();
        jLSkin3 = new javax.swing.JLabel();
        jLSkin4 = new javax.swing.JLabel();
        jLSkin5 = new javax.swing.JLabel();
        jLSkin6 = new javax.swing.JLabel();
        jLSkin7 = new javax.swing.JLabel();
        jLSkin8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aparência do Sistema");
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/appearance48.png"))); // NOI18N
        jLabel3.setText(" APARÊNCIA DO SISTEMA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Aplicar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBar(null);

        jLSkin1.setText("Skin1");
        jLSkin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSkin1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSkin1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSkin1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLSkin1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLSkin1MouseReleased(evt);
            }
        });

        jLSkin2.setText("Skin2");
        jLSkin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSkin2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSkin2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSkin2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLSkin2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLSkin2MouseReleased(evt);
            }
        });

        jLSkin3.setText("Skin3");
        jLSkin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSkin3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSkin3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSkin3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLSkin3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLSkin3MouseReleased(evt);
            }
        });

        jLSkin4.setText("Skin4");
        jLSkin4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSkin4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSkin4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSkin4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLSkin4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLSkin4MouseReleased(evt);
            }
        });

        jLSkin5.setText("Skin5");
        jLSkin5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSkin5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSkin5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSkin5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLSkin5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLSkin5MouseReleased(evt);
            }
        });

        jLSkin6.setText("Skin6");
        jLSkin6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSkin6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSkin6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSkin6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLSkin6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLSkin6MouseReleased(evt);
            }
        });

        jLSkin7.setText("Skin7");
        jLSkin7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSkin7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSkin7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSkin7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLSkin7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLSkin7MouseReleased(evt);
            }
        });

        jLSkin8.setText("Skin8");
        jLSkin8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSkin8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSkin8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSkin8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLSkin8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLSkin8MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLSkin1)
            .addComponent(jLSkin2)
            .addComponent(jLSkin3)
            .addComponent(jLSkin4)
            .addComponent(jLSkin5)
            .addComponent(jLSkin6)
            .addComponent(jLSkin7)
            .addComponent(jLSkin8)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLSkin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLSkin2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLSkin3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLSkin4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLSkin5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLSkin6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLSkin7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLSkin8))
        );

        jScrollPane1.setViewportView(jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLSkin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin1MouseEntered
        jLSkin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin1MouseEntered

    private void jLSkin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin1MouseExited
        if (comp != jLSkin1) {
            jLSkin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
    }//GEN-LAST:event_jLSkin1MouseExited

    private void jLSkin1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin1MousePressed
        jLSkin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 0, 90), 3));
    }//GEN-LAST:event_jLSkin1MousePressed

    private void jLSkin1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin1MouseReleased
        jLSkin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin1MouseReleased

    private void jLSkin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin1MouseClicked
        if (comp != jLSkin1) {
            comp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
        comp = jLSkin1;
        skin = "skin1.jpg";
    }//GEN-LAST:event_jLSkin1MouseClicked

    private void jLSkin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin2MouseClicked
        if (comp != jLSkin2) {
            comp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
        comp = jLSkin2;
        skin = "skin2.jpg";
    }//GEN-LAST:event_jLSkin2MouseClicked

    private void jLSkin2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin2MouseEntered
        jLSkin2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin2MouseEntered

    private void jLSkin2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin2MouseExited
        if (comp != jLSkin2) {
            jLSkin2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
    }//GEN-LAST:event_jLSkin2MouseExited

    private void jLSkin2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin2MousePressed
        jLSkin2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 0, 90), 3));
    }//GEN-LAST:event_jLSkin2MousePressed

    private void jLSkin2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin2MouseReleased
        jLSkin2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin2MouseReleased

    private void jLSkin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin3MouseClicked
        if (comp != jLSkin3) {
            comp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
        comp = jLSkin3;
        skin = "skin3.jpg";
    }//GEN-LAST:event_jLSkin3MouseClicked

    private void jLSkin3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin3MouseEntered
        jLSkin3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin3MouseEntered

    private void jLSkin3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin3MouseExited
        if (comp != jLSkin3) {
            jLSkin3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
    }//GEN-LAST:event_jLSkin3MouseExited

    private void jLSkin3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin3MousePressed
        jLSkin3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 0, 90), 3));
    }//GEN-LAST:event_jLSkin3MousePressed

    private void jLSkin3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin3MouseReleased
        jLSkin3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin3MouseReleased

    private void jLSkin4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin4MouseClicked
        if (comp != jLSkin4) {
            comp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
        comp = jLSkin4;
        skin = "skin4.jpg";
    }//GEN-LAST:event_jLSkin4MouseClicked

    private void jLSkin4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin4MouseEntered
        jLSkin4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin4MouseEntered

    private void jLSkin4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin4MouseExited
        if (comp != jLSkin4) {
            jLSkin4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
    }//GEN-LAST:event_jLSkin4MouseExited

    private void jLSkin4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin4MousePressed
        jLSkin4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 0, 90), 3));
    }//GEN-LAST:event_jLSkin4MousePressed

    private void jLSkin4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin4MouseReleased
        jLSkin4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin4MouseReleased

    private void jLSkin5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin5MouseClicked
        if (comp != jLSkin5) {
            comp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
        comp = jLSkin5;
        skin = "skin5.jpg";
    }//GEN-LAST:event_jLSkin5MouseClicked

    private void jLSkin5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin5MouseEntered
        jLSkin5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin5MouseEntered

    private void jLSkin5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin5MouseExited
        if (comp != jLSkin5) {
            jLSkin5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
    }//GEN-LAST:event_jLSkin5MouseExited

    private void jLSkin5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin5MousePressed
        jLSkin5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 0, 90), 3));
    }//GEN-LAST:event_jLSkin5MousePressed

    private void jLSkin5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin5MouseReleased
        jLSkin5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin5MouseReleased

    private void jLSkin6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin6MouseClicked
        if (comp != jLSkin6) {
            comp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
        comp = jLSkin6;
        skin = "skin6.jpg";
    }//GEN-LAST:event_jLSkin6MouseClicked

    private void jLSkin6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin6MouseEntered
        jLSkin6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin6MouseEntered

    private void jLSkin6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin6MouseExited
        if (comp != jLSkin6) {
            jLSkin6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
    }//GEN-LAST:event_jLSkin6MouseExited

    private void jLSkin6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin6MousePressed
        jLSkin6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 0, 90), 3));
    }//GEN-LAST:event_jLSkin6MousePressed

    private void jLSkin6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin6MouseReleased
        jLSkin6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin6MouseReleased

    private void jLSkin7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin7MouseClicked
        if (comp != jLSkin7) {
            comp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
        comp = jLSkin7;
        skin = "skin7.jpg";
    }//GEN-LAST:event_jLSkin7MouseClicked

    private void jLSkin7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin7MouseEntered
        jLSkin7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin7MouseEntered

    private void jLSkin7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin7MouseExited
        if (comp != jLSkin7) {
            jLSkin7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
    }//GEN-LAST:event_jLSkin7MouseExited

    private void jLSkin7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin7MousePressed
        jLSkin7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 0, 90), 3));
    }//GEN-LAST:event_jLSkin7MousePressed

    private void jLSkin7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin7MouseReleased
        jLSkin7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin7MouseReleased

    private void jLSkin8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin8MouseClicked
        if (comp != jLSkin8) {
            comp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
        comp = jLSkin8;
        skin = "skin8.jpg";
    }//GEN-LAST:event_jLSkin8MouseClicked

    private void jLSkin8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin8MouseEntered
        jLSkin8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin8MouseEntered

    private void jLSkin8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin8MouseExited
        if (comp != jLSkin8) {
            jLSkin8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        }
    }//GEN-LAST:event_jLSkin8MouseExited

    private void jLSkin8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin8MousePressed
        jLSkin8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 0, 90), 3));
    }//GEN-LAST:event_jLSkin8MousePressed

    private void jLSkin8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSkin8MouseReleased
        jLSkin8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
    }//GEN-LAST:event_jLSkin8MouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            PreferenciaDao prefDao = new PreferenciaDao();
            Preferencia p = Global.preferencia;
            p.setSkin(skin);
            prefDao.updateSkin(p);
            Global.preferencia.setSkin(skin);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro:\n" + ex.getMessage(), "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void carregaImagens() {
        ImageIcon imagem;
        jLSkin1.setText("");
        jLSkin2.setText("");
        jLSkin3.setText("");
        jLSkin4.setText("");
        jLSkin5.setText("");
        jLSkin6.setText("");
        jLSkin7.setText("");
        jLSkin8.setText("");
        imagem = new ImageIcon(getClass().getResource("/jlibrary/images/skin1.jpg"));
        jLSkin1.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(450, 50, 100)));
        imagem = new ImageIcon(getClass().getResource("/jlibrary/images/skin2.jpg"));
        jLSkin2.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(450, 50, 100)));
        imagem = new ImageIcon(getClass().getResource("/jlibrary/images/skin3.jpg"));
        jLSkin3.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(450, 50, 100)));
        imagem = new ImageIcon(getClass().getResource("/jlibrary/images/skin4.jpg"));
        jLSkin4.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(450, 50, 100)));
        imagem = new ImageIcon(getClass().getResource("/jlibrary/images/skin5.jpg"));
        jLSkin5.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(450, 50, 100)));
        imagem = new ImageIcon(getClass().getResource("/jlibrary/images/skin6.jpg"));
        jLSkin6.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(450, 50, 100)));
        imagem = new ImageIcon(getClass().getResource("/jlibrary/images/skin7.jpg"));
        jLSkin7.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(450, 50, 100)));
        imagem = new ImageIcon(getClass().getResource("/jlibrary/images/skin8.jpg"));
        jLSkin8.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(450, 50, 100)));
        jLSkin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        jLSkin2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        jLSkin3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        jLSkin4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        jLSkin5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        jLSkin6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        jLSkin7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
        jLSkin8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223), 3));
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
            java.util.logging.Logger.getLogger(JDSelSkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDSelSkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDSelSkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDSelSkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDSelSkin dialog = new JDSelSkin(new javax.swing.JFrame());
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLSkin1;
    private javax.swing.JLabel jLSkin2;
    private javax.swing.JLabel jLSkin3;
    private javax.swing.JLabel jLSkin4;
    private javax.swing.JLabel jLSkin5;
    private javax.swing.JLabel jLSkin6;
    private javax.swing.JLabel jLSkin7;
    private javax.swing.JLabel jLSkin8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
