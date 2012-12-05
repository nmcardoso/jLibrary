package jlibrary.view;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jlibrary.entidades.Autor;
import jlibrary.entidades.ClassifLit;
import jlibrary.entidades.Editora;
import jlibrary.entidades.Item;
import jlibrary.entidades.TipoItem;
import jlibrary.persistencia.AutorDao;
import jlibrary.persistencia.ClassifLitDao;
import jlibrary.persistencia.EditoraDao;
import jlibrary.persistencia.ItemDao;
import jlibrary.persistencia.TipoItemDao;

/**
 *
 * @author Natanael
 */
public class JDGerAcervo extends javax.swing.JDialog {

    private List<Item> listaItem;
    private List<Autor> listaAutor;
    private List<Editora> listaEditora;
    private List<ClassifLit> listaClassif;
    private List<TipoItem> listaTipo;

    public JDGerAcervo(java.awt.Window parent, int tabIndex) {
        super(parent, DEFAULT_MODALITY_TYPE);
        initComponents();
        jTbAcervo.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTbAcervo.getColumnModel().getColumn(0).setMaxWidth(25);
        jTbAcervo.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTbAcervo.getColumnModel().getColumn(2).setPreferredWidth(200);
        new jlibrary.logica.Centralizar(this, this.getSize());
        jTabbedPane1.setSelectedIndex(tabIndex);
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
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbAcervo = new javax.swing.JTable();
        jBDelItem = new javax.swing.JButton();
        jBEditItem = new javax.swing.JButton();
        jBAddItem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTBuscaAcervo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jBAddAutor = new javax.swing.JButton();
        jBEditAutor = new javax.swing.JButton();
        jBDelAutor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbAutor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTBuscaAutor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jBAddEditora = new javax.swing.JButton();
        jBEditEditora = new javax.swing.JButton();
        jBDelEditora = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTbEditora = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTBuscaEditora = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jBAddClass = new javax.swing.JButton();
        jBEditClass = new javax.swing.JButton();
        jBDelClass = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTbClass = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTBuscaClass = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jBAddTipo = new javax.swing.JButton();
        jBEditTipo = new javax.swing.JButton();
        jBDelTipo = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTbTipo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciador de Acervo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/library48.png"))); // NOI18N
        jLabel1.setText("GERENCIADOR DE ACERVO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jTbAcervo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Título", "Classificação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbAcervo);

        jBDelItem.setText("Deletar");
        jBDelItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelItemActionPerformed(evt);
            }
        });

        jBEditItem.setText("Editar");
        jBEditItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditItemActionPerformed(evt);
            }
        });

        jBAddItem.setText("Adicionar");
        jBAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddItemActionPerformed(evt);
            }
        });

        jLabel5.setText("Título da obra");

        jTBuscaAcervo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscaAcervoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 359, Short.MAX_VALUE)
                        .addComponent(jBAddItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEditItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBDelItem))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTBuscaAcervo)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTBuscaAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDelItem)
                    .addComponent(jBEditItem)
                    .addComponent(jBAddItem))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Acervo", jPanel2);

        jBAddAutor.setText("Adicionar");
        jBAddAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddAutorActionPerformed(evt);
            }
        });

        jBEditAutor.setText("Editar");
        jBEditAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditAutorActionPerformed(evt);
            }
        });

        jBDelAutor.setText("Deletar");
        jBDelAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelAutorActionPerformed(evt);
            }
        });

        jTbAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do autor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTbAutor);

        jLabel2.setText("Nome do autor");

        jTBuscaAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscaAutorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 359, Short.MAX_VALUE)
                        .addComponent(jBAddAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEditAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBDelAutor))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTBuscaAutor))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTBuscaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDelAutor)
                    .addComponent(jBEditAutor)
                    .addComponent(jBAddAutor))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Autores", jPanel3);

        jBAddEditora.setText("Adicionar");
        jBAddEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddEditoraActionPerformed(evt);
            }
        });

        jBEditEditora.setText("Editar");
        jBEditEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditEditoraActionPerformed(evt);
            }
        });

        jBDelEditora.setText("Deletar");
        jBDelEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelEditoraActionPerformed(evt);
            }
        });

        jTbEditora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome da Editora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTbEditora);

        jLabel3.setText("Nome da editora");

        jTBuscaEditora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscaEditoraKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 359, Short.MAX_VALUE)
                        .addComponent(jBAddEditora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEditEditora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBDelEditora))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTBuscaEditora))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTBuscaEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDelEditora)
                    .addComponent(jBEditEditora)
                    .addComponent(jBAddEditora))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Editoras", jPanel4);

        jBAddClass.setText("Adicionar");
        jBAddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddClassActionPerformed(evt);
            }
        });

        jBEditClass.setText("Editar");
        jBEditClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditClassActionPerformed(evt);
            }
        });

        jBDelClass.setText("Deletar");
        jBDelClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelClassActionPerformed(evt);
            }
        });

        jTbClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Classificação literária"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTbClass);

        jLabel4.setText("Classificação literária");

        jTBuscaClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscaClassActionPerformed(evt);
            }
        });
        jTBuscaClass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscaClassKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 359, Short.MAX_VALUE)
                        .addComponent(jBAddClass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEditClass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBDelClass))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTBuscaClass))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTBuscaClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDelClass)
                    .addComponent(jBEditClass)
                    .addComponent(jBAddClass))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Classificações", jPanel5);

        jBAddTipo.setText("Adicionar");
        jBAddTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddTipoActionPerformed(evt);
            }
        });

        jBEditTipo.setText("Editar");
        jBEditTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditTipoActionPerformed(evt);
            }
        });

        jBDelTipo.setText("Deletar");
        jBDelTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelTipoActionPerformed(evt);
            }
        });

        jTbTipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de item"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTbTipo);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 359, Short.MAX_VALUE)
                        .addComponent(jBAddTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEditTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBDelTipo))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDelTipo)
                    .addComponent(jBEditTipo)
                    .addComponent(jBAddTipo))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tipos de item", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
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

    private void jTBuscaAcervoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscaAcervoKeyReleased
        preencheTbAcervo();
    }//GEN-LAST:event_jTBuscaAcervoKeyReleased

    private void jBAddAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddAutorActionPerformed
        new JDCadAutor(this).setVisible(true);
        preencheTbAutor();
    }//GEN-LAST:event_jBAddAutorActionPerformed

    private void jBEditAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditAutorActionPerformed
        if (jTbAutor.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um autor na lista",
                    "Nenhuma editora selecionada", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int linha = jTbAutor.getSelectedRow();
        
        Autor autor = new Autor();
        autor.setIdAutor(listaAutor.get(linha).getIdAutor());
        autor.setNome(listaAutor.get(linha).getNome());
        
        new JDEditAutor(this).show(autor);
        
        preencheTbAutor();
    }//GEN-LAST:event_jBEditAutorActionPerformed

    private void jBDelAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelAutorActionPerformed
        if (jTbAutor.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um autor na lista",
                    "Nenhuma editora selecionada", JOptionPane.ERROR_MESSAGE);
            return;
        }
        AutorDao autorDao = new AutorDao();

        try {
            autorDao.delete(listaAutor.get(jTbAutor.getSelectedRow()).getIdAutor());
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
        preencheTbAutor();
    }//GEN-LAST:event_jBDelAutorActionPerformed

    private void jTBuscaAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscaAutorKeyReleased
        preencheTbAutor();
    }//GEN-LAST:event_jTBuscaAutorKeyReleased

    private void jBAddEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddEditoraActionPerformed
        new JDCadEditora(this).setVisible(true);
        preencheTbEditora();
    }//GEN-LAST:event_jBAddEditoraActionPerformed

    private void jBEditEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditEditoraActionPerformed
        if (jTbEditora.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma editora na lista",
                    "Nenhuma editora selecionada", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int linha = jTbEditora.getSelectedRow();
        
        Editora editora = new Editora();
        editora.setIdEditora(listaEditora.get(linha).getIdEditora());
        editora.setEditora(listaEditora.get(linha).getEditora());
        
        new JDEditEditora(this).show(editora);
        
        preencheTbEditora();
    }//GEN-LAST:event_jBEditEditoraActionPerformed

    private void jBDelEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelEditoraActionPerformed
        if (jTbEditora.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma editora na lista",
                    "Nenhuma editora selecionada", JOptionPane.ERROR_MESSAGE);
            return;
        }
        EditoraDao editoraDao = new EditoraDao();

        try {
            editoraDao.delete(listaEditora.get(jTbEditora.getSelectedRow()).getIdEditora());
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
        preencheTbEditora();
    }//GEN-LAST:event_jBDelEditoraActionPerformed

    private void jTBuscaEditoraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscaEditoraKeyReleased
        preencheTbEditora();
    }//GEN-LAST:event_jTBuscaEditoraKeyReleased

    private void jBAddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddClassActionPerformed
        new JDCadClassif(this).setVisible(true);
        preencheTbClass();
    }//GEN-LAST:event_jBAddClassActionPerformed

    private void jBEditClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditClassActionPerformed
        if (jTbClass.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma classificação na lista",
                    "Nenhuma editora selecionada", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int linha = jTbClass.getSelectedRow();
        
        ClassifLit classif = new ClassifLit();
        classif.setIdClassLit(listaClassif.get(linha).getIdClassLit());
        classif.setClassificacao(listaClassif.get(linha).getClassificacao());
        
        new JDEditClassif(this).show(classif);
        preencheTbClass();
    }//GEN-LAST:event_jBEditClassActionPerformed

    private void jBDelClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelClassActionPerformed
        if (jTbClass.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma classificação na lista",
                    "Nenhuma editora selecionada", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ClassifLitDao classifLitDao = new ClassifLitDao();

        try {
            classifLitDao.delete(listaClassif.get(jTbClass.getSelectedRow()).getIdClassLit());
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
        preencheTbClass();
    }//GEN-LAST:event_jBDelClassActionPerformed

    private void jTBuscaClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscaClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscaClassActionPerformed

    private void jTBuscaClassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscaClassKeyReleased
        preencheTbClass();
    }//GEN-LAST:event_jTBuscaClassKeyReleased

    private void jBAddTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddTipoActionPerformed
        new JDCadTipoItem(this).setVisible(true);
        preencheTbTipo();
    }//GEN-LAST:event_jBAddTipoActionPerformed

    private void jBEditTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditTipoActionPerformed
        if (jTbTipo.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma editora na lista",
                    "Nenhuma editora selecionada", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int linha = jTbTipo.getSelectedRow();
        
        TipoItem tipoItem = new TipoItem();
        tipoItem.setIdTipo(listaTipo.get(linha).getIdTipo());
        tipoItem.setTipo(listaTipo.get(linha).getTipo());
        
        new JDEditTipoItem(this).show(tipoItem);
        preencheTbTipo();
    }//GEN-LAST:event_jBEditTipoActionPerformed

    private void jBDelTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelTipoActionPerformed
        if (jTbTipo.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma editora na lista",
                    "Nenhuma editora selecionada", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        TipoItemDao tipoItemDao = new TipoItemDao();

        try {
            tipoItemDao.delete(listaTipo.get(jTbTipo.getSelectedRow()).getIdTipo());
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
        
        preencheTbTipo();
    }//GEN-LAST:event_jBDelTipoActionPerformed

    private void jBDelItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelItemActionPerformed
        if (jTbAcervo.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um item na lista",
                    "Nenhum item selecionado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        ItemDao itemDao = new ItemDao();
        try {
            itemDao.delete(listaItem.get(jTbAcervo.getSelectedRow()).getIdItem());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + ex.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
        preencheTbAcervo();
    }//GEN-LAST:event_jBDelItemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregaResults();
    }//GEN-LAST:event_formWindowOpened

    private void jBAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddItemActionPerformed
        new JDCadItem(this).setVisible(true);
        preencheTbAcervo();
    }//GEN-LAST:event_jBAddItemActionPerformed

    private void jBEditItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditItemActionPerformed
        if (jTbAcervo.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um item na lista",
                    "Nenhum item selecionado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        ItemDao itemDao = new ItemDao();
        Item item;
        
        try {
            item = itemDao.select(listaItem.get(jTbAcervo.getSelectedRow()).getIdItem());
            new JDEditItem(this, item).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + ex.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
        preencheTbAcervo();
    }//GEN-LAST:event_jBEditItemActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        carregaResults();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void carregaResults(){
        switch (jTabbedPane1.getSelectedIndex()) {
            case 0:
                preencheTbAcervo();
                break;
            case 1:
                preencheTbAutor();
                break;
            case 2:
                preencheTbEditora();
                break;
            case 3:
                preencheTbClass();
                break;
            case 4:
                preencheTbTipo();
                break;
        }
    }
    
    private void preencheTbAcervo() {
        ItemDao itemDao = new ItemDao();

        try {
            listaItem = itemDao.select(jTBuscaAcervo.getText());
            DefaultTableModel modelo = (DefaultTableModel) jTbAcervo.getModel();
            modelo.setRowCount(0);

            String iconHtml = "";

            for (Item item : listaItem) {
                if (item.getStatus().equalsIgnoreCase("disponivel")) {
                    iconHtml = "<html><img src='" + getClass().getResource("/jlibrary/icons/pack1/152.png") + "' /></html>";
                } else if (item.getStatus().equalsIgnoreCase("emprestado")) {
                    iconHtml = "<html><img src='" + getClass().getResource("/jlibrary/icons/pack1/155.png") + "' /></html>";
                } else if (item.getStatus().equalsIgnoreCase("indisponivel")) {
                    iconHtml = "<html><img src='" + getClass().getResource("/jlibrary/icons/pack1/159.png") + "' /></html>";
                }
                modelo.addRow(new Object[]{iconHtml, item.getTitulo(), item.getStatus()});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void preencheTbAutor() {
        AutorDao autorDao = new AutorDao();

        try {
            listaAutor = autorDao.select(jTBuscaAutor.getText());
            DefaultTableModel modelo = (DefaultTableModel) jTbAutor.getModel();
            modelo.setRowCount(0);

            for (Autor autor : listaAutor) {
                modelo.addRow(new Object[]{autor.getNome()});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void preencheTbEditora() {
        EditoraDao editoraDao = new EditoraDao();

        try {
            listaEditora = editoraDao.select(jTBuscaEditora.getText());
            DefaultTableModel modelo = (DefaultTableModel) jTbEditora.getModel();
            modelo.setRowCount(0);

            for (Editora editora : listaEditora) {
                modelo.addRow(new Object[]{editora.getEditora()});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void preencheTbClass() {
        ClassifLitDao classifLitDao = new ClassifLitDao();

        try {
            listaClassif = classifLitDao.select(jTBuscaClass.getText());
            DefaultTableModel modelo = (DefaultTableModel) jTbClass.getModel();
            modelo.setRowCount(0);

            for (ClassifLit classifLit : listaClassif) {
                modelo.addRow(new Object[]{classifLit.getClassificacao()});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void preencheTbTipo() {
        TipoItemDao tipoItemDao = new TipoItemDao();

        try {
            listaTipo = tipoItemDao.select();
            DefaultTableModel modelo = (DefaultTableModel) jTbTipo.getModel();
            modelo.setRowCount(0);

            for (TipoItem tipoItem : listaTipo) {
                modelo.addRow(new Object[]{tipoItem.getTipo()});
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
            java.util.logging.Logger.getLogger(JDGerAcervo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDGerAcervo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDGerAcervo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDGerAcervo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDGerAcervo dialog = new JDGerAcervo(new javax.swing.JFrame(), 0);
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
    private javax.swing.JButton jBAddAutor;
    private javax.swing.JButton jBAddClass;
    private javax.swing.JButton jBAddEditora;
    private javax.swing.JButton jBAddItem;
    private javax.swing.JButton jBAddTipo;
    private javax.swing.JButton jBDelAutor;
    private javax.swing.JButton jBDelClass;
    private javax.swing.JButton jBDelEditora;
    private javax.swing.JButton jBDelItem;
    private javax.swing.JButton jBDelTipo;
    private javax.swing.JButton jBEditAutor;
    private javax.swing.JButton jBEditClass;
    private javax.swing.JButton jBEditEditora;
    private javax.swing.JButton jBEditItem;
    private javax.swing.JButton jBEditTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTBuscaAcervo;
    private javax.swing.JTextField jTBuscaAutor;
    private javax.swing.JTextField jTBuscaClass;
    private javax.swing.JTextField jTBuscaEditora;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTbAcervo;
    private javax.swing.JTable jTbAutor;
    private javax.swing.JTable jTbClass;
    private javax.swing.JTable jTbEditora;
    private javax.swing.JTable jTbTipo;
    // End of variables declaration//GEN-END:variables
}
