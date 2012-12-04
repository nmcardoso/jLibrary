package jlibrary.view;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jlibrary.entidades.ClassifLit;
import jlibrary.entidades.Editora;
import jlibrary.entidades.Item;
import jlibrary.entidades.TipoItem;
import jlibrary.logica.FormatarTexto;
import jlibrary.logica.Global;
import jlibrary.persistencia.ClassifLitDao;
import jlibrary.persistencia.EditoraDao;
import jlibrary.persistencia.ItemDao;
import jlibrary.persistencia.TipoItemDao;

/**
 *
 * @author Natanael
 */
public class JDCadItem extends javax.swing.JDialog {

    private List<ClassifLit> listaClassif;
    private List<Editora> listaEditora;
    private List<TipoItem> listaTipoItem;
    private List<Integer> listaIdAutor = new ArrayList<Integer>();

    public JDCadItem(java.awt.Window parent) {
        super(parent, DEFAULT_MODALITY_TYPE);
        initComponents();
        
        populaCombo(1);
        populaCombo(2);
        populaCombo(3);
       
        new jlibrary.logica.Centralizar(this, this.getSize());
        
        if (Global.preferencia.getIdioma() != null || !Global.preferencia.equals("")) {
            jCBIdioma.setSelectedItem(Global.preferencia.getIdioma());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabMain = new javax.swing.JTabbedPane();
        jPPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTTitulo = new javax.swing.JTextField();
        jTSubTitulo = new javax.swing.JTextField();
        jCBClassificacao = new javax.swing.JComboBox();
        jCBIdioma = new javax.swing.JComboBox();
        jCBEditora = new javax.swing.JComboBox();
        jCBTipoItem = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPAutores = new javax.swing.JPanel();
        jBAddAutor = new javax.swing.JButton();
        jTRemAutor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbAutores = new javax.swing.JTable();
        jPDetalhes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTISBN = new javax.swing.JTextField();
        jTLocal = new javax.swing.JTextField();
        jTCodigo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTExemplar = new javax.swing.JTextField();
        jTVolume = new javax.swing.JTextField();
        jTEdicao = new javax.swing.JTextField();
        jTNumPags = new javax.swing.JTextField();
        jTAno = new javax.swing.JTextField();
        jCkIndisponivel = new javax.swing.JCheckBox();
        jBNextTab = new javax.swing.JButton();
        jBInserir = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBPrevTab = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(java.awt.Graphics g){
                super.paintComponent(g);
                g.drawImage(new javax.swing.ImageIcon(new jlibrary.logica.Global().getHeaderBg()).getImage(), 0,0, null);
            }
        };
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar novo item");

        jTabMain.setMinimumSize(new java.awt.Dimension(431, 233));
        jTabMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTabMainMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabMainMouseClicked(evt);
            }
        });

        jLabel2.setText("Título");

        jLabel3.setText("Subtítulo");

        jLabel4.setText("Editora");

        jLabel5.setText("Classificação");

        jLabel6.setText("Idioma");

        jTTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTituloFocusLost(evt);
            }
        });

        jTSubTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSubTituloFocusLost(evt);
            }
        });

        jCBIdioma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<html><i>Selecione um idioma</i></html>", "Africânder", "Albanês", "Alemão", "Árabe", "Armênio", "Azerbaijano", "Basco", "Bengali", "Bielo-russo", "Búlgaro", "Catalão", "Chinês", "Coreano", "Crioulo", "Croata", "Dinamarquês", "Eslovaco", "Esloveno", "Espanhol", "Esperanto", "Estoniano", "Finlandês", "Francês", "Inglês", "Irlandês", "Islandês", "Italiano", "Japonês", "Kannada", "Latim", "Letão", "Lituano", "Macedônico", "Malaio", "Maltês", "Norueguês", "Persa", "Polonês", "Português", "Romeno", "Russo", "Sérvio", "Suaíle", "Sueco", "Tagalo", "Tailandês", "Tâmil", "Tcheco", "Telugo", "Turco", "Ucraniano", "Urdu", "Vietnamita", "Yiddish" }));

        jLabel1.setText("Tipo");

        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setText("<html><u>Novo tipo</u></html>");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(0, 51, 204));
        jLabel14.setText("<html><u>Nova classificação<u></html>");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(0, 51, 204));
        jLabel15.setText("<html><u>Nova editora</u></html>");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTTitulo)
                            .addComponent(jTSubTitulo)))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCBClassificacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBEditora, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBIdioma, 0, 200, Short.MAX_VALUE)
                            .addComponent(jCBTipoItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTSubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBTipoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabMain.addTab("Principal", jPPrincipal);

        jBAddAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/icons/pack1/103.png"))); // NOI18N
        jBAddAutor.setText("Adicionar");
        jBAddAutor.setToolTipText("Adicionar autor");
        jBAddAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddAutorActionPerformed(evt);
            }
        });

        jTRemAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/icons/pack1/104.png"))); // NOI18N
        jTRemAutor.setText("Remover");
        jTRemAutor.setToolTipText("Remover autor selecionado");
        jTRemAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTRemAutorActionPerformed(evt);
            }
        });

        jTbAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Autores adicionados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbAutores);

        javax.swing.GroupLayout jPAutoresLayout = new javax.swing.GroupLayout(jPAutores);
        jPAutores.setLayout(jPAutoresLayout);
        jPAutoresLayout.setHorizontalGroup(
            jPAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAddAutor)
                    .addComponent(jTRemAutor))
                .addContainerGap())
        );
        jPAutoresLayout.setVerticalGroup(
            jPAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPAutoresLayout.createSequentialGroup()
                        .addComponent(jBAddAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTRemAutor)
                        .addGap(0, 127, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabMain.addTab("Autores", jPAutores);

        jLabel7.setText("ISBN");

        jLabel8.setText("Código");

        jLabel10.setText("Local");

        jLabel17.setText("Num. págs.");

        jLabel18.setText("Ano");

        jLabel19.setText("Edição");

        jLabel20.setText("Volume");

        jLabel21.setText("Exemplar");

        jCkIndisponivel.setText("Item indisponível");

        javax.swing.GroupLayout jPDetalhesLayout = new javax.swing.GroupLayout(jPDetalhes);
        jPDetalhes.setLayout(jPDetalhesLayout);
        jPDetalhesLayout.setHorizontalGroup(
            jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDetalhesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPDetalhesLayout.createSequentialGroup()
                            .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPDetalhesLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCkIndisponivel))
                .addGap(50, 50, 50)
                .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTAno, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTEdicao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTVolume, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTExemplar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTNumPags, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPDetalhesLayout.setVerticalGroup(
            jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDetalhesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPDetalhesLayout.createSequentialGroup()
                        .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addComponent(jCkIndisponivel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPDetalhesLayout.createSequentialGroup()
                        .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jTExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTNumPags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabMain.addTab("Detalhes", jPDetalhes);

        jBNextTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/icons/pack1/105.png"))); // NOI18N
        jBNextTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextTabActionPerformed(evt);
            }
        });

        jBInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/icons/pack1/102.png"))); // NOI18N
        jBInserir.setText("Inserir");
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/icons/pack1/150.png"))); // NOI18N
        jBCancelar.setText("Canelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBPrevTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/icons/pack1/106.png"))); // NOI18N
        jBPrevTab.setEnabled(false);
        jBPrevTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrevTabActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/add-item48.png"))); // NOI18N
        jLabel9.setText(" CADASTRAR ITEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBPrevTab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBNextTab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCancelar)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabMain, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBNextTab)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBInserir)
                        .addComponent(jBCancelar))
                    .addComponent(jBPrevTab))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new JDCadTipoItem(this).setVisible(true);
        populaCombo(3);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new JDCadClassif(this).setVisible(true);
        populaCombo(1);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new JDCadEditora(this).setVisible(true);
        populaCombo(2);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jBAddAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddAutorActionPerformed
        JDSelAutor input = new JDSelAutor(this, true);
        String[] autor = input.showDialog();

        if ((autor[1] == null) || (autor[1].equals(""))) {
            return;
        }

        for (int i = 0; i < jTbAutores.getRowCount(); i++) {
            if (autor[1].equals(jTbAutores.getModel().getValueAt(i, 0))) {
                return;
            }
        }

        DefaultTableModel modelo = (DefaultTableModel) jTbAutores.getModel();
        modelo.addRow(new Object[]{autor[1]});
        listaIdAutor.add(Integer.parseInt(autor[0]));
    }//GEN-LAST:event_jBAddAutorActionPerformed

    private void jTRemAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTRemAutorActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTbAutores.getModel();

        if (jTbAutores.getSelectedRow() > -1) {
            modelo.removeRow(jTbAutores.getSelectedRow());
            listaIdAutor.remove(jTbAutores.getSelectedRow() + 1);
        } else {
            if (jTbAutores.getRowCount() > 0) {
                JOptionPane.showMessageDialog(null, "Selecione um autor na tabela para remove-lo",
                        "Nenhum item selecionado", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "A tabela está vazia",
                        "Nenhum item selecionado", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTRemAutorActionPerformed

    private void jTabMainMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabMainMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabMainMouseReleased

    private void jTabMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabMainMouseClicked
        switch (jTabMain.getSelectedIndex()) {
            case 0:
                jBPrevTab.setEnabled(false);
                jBNextTab.setEnabled(true);
                break;
            case 1:
                jBPrevTab.setEnabled(true);
                jBNextTab.setEnabled(true);
                break;
            case 2:
                jBPrevTab.setEnabled(true);
                jBNextTab.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_jTabMainMouseClicked

    private void jBNextTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNextTabActionPerformed
        switch (jTabMain.getSelectedIndex()) {
            case 0:
                jTabMain.setSelectedIndex(1);
                jBNextTab.setEnabled(true);
                jBPrevTab.setEnabled(true);
                break;
            case 1:
                jTabMain.setSelectedIndex(2);
                jBNextTab.setEnabled(false);
                jBPrevTab.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_jBNextTabActionPerformed

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
        Item item = new Item();
        item.setAno(jTAno.getText());
        item.setIdClassLit(listaClassif.get(jCBClassificacao.getSelectedIndex() - 1).getIdClassLit());
        item.setEdicao(jTEdicao.getText());
        item.setIdEditora(listaEditora.get(jCBEditora.getSelectedIndex() - 1).getIdEditora());
        item.setExemplar(jTExemplar.getText());
        item.setIdioma(jCBIdioma.getSelectedItem().toString());
        item.setIsbn(jTISBN.getText());
        item.setCodigo(jTCodigo.getText());
        item.setLocal(jTLocal.getText());
        item.setNumPags(jTNumPags.getText());
        item.setSubtitulo(jTSubTitulo.getText());
        item.setIdTipo(listaTipoItem.get(jCBTipoItem.getSelectedIndex() - 1).getIdTipo());
        item.setTitulo(jTTitulo.getText());
        item.setVolume(jTVolume.getText());
        item.setIdAutor(listaIdAutor);
        if (jCkIndisponivel.isSelected()) {
            item.setStatus("Indisponivel");
        } else {
            item.setStatus("Disponivel");
        }

        ItemDao itemDao = new ItemDao();
        try {
            itemDao.insert(item);
            int op = JOptionPane.showConfirmDialog(this, "Obra cadastrada com sucesso!\nDeseja cadastrar outro item?",
                    "Exito", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (op == JOptionPane.YES_OPTION) {
                
            } else {
                this.dispose();
            }
        } catch (SQLException | ParseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir este item no sistema\nErro:" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBPrevTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrevTabActionPerformed
        switch (jTabMain.getSelectedIndex()) {
            case 1:
                jTabMain.setSelectedIndex(0);
                jBPrevTab.setEnabled(false);
                jBNextTab.setEnabled(true);
                break;
            case 2:
                jTabMain.setSelectedIndex(1);
                jBPrevTab.setEnabled(true);
                jBNextTab.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_jBPrevTabActionPerformed

    private void jTTituloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTituloFocusLost
        jTTitulo.setText(new FormatarTexto().formatar(jTTitulo));
    }//GEN-LAST:event_jTTituloFocusLost

    private void jTSubTituloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSubTituloFocusLost
        jTSubTitulo.setText(new FormatarTexto().formatar(jTSubTitulo));
    }//GEN-LAST:event_jTSubTituloFocusLost

    /**
     * Popula os comboboxes com dados do banco
     *
     * @param combo Escolha 1 ou 2 <br /><b>1:</b> Classificação Literária<br
     * /><b>2:</b> Editora<br /><b>3:</b> Tipo de Item
     */
    private void populaCombo(int combo) {
        switch (combo) {
            case 1:
                ClassifLitDao classifLitDao = new ClassifLitDao();

                try {
                    listaClassif = classifLitDao.select();

                    jCBClassificacao.removeAllItems();
                    jCBClassificacao.addItem("<html><i>Selecione uma classificação</i></html>");
                    
                    for (ClassifLit classiflit : listaClassif) {
                        jCBClassificacao.addItem(classiflit.getClassificacao());
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }

                break;
            case 2:
                EditoraDao editoraDao = new EditoraDao();

                try {
                    listaEditora = editoraDao.select();

                    jCBEditora.removeAllItems();
                    jCBEditora.addItem("<html><i>Selecione uma editora</i></html>");
                    
                    for (Editora editora : listaEditora) {
                        jCBEditora.addItem(editora.getEditora());
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }

                break;
            case 3:
                TipoItemDao tipoItemDao = new TipoItemDao();
                try {
                    listaTipoItem = tipoItemDao.select();

                    jCBTipoItem.removeAllItems();
                    jCBTipoItem.addItem("<html><i>Selecione um tipo de item</i></html>");
                    
                    for (TipoItem tipoItem : listaTipoItem) {
                        jCBTipoItem.addItem(tipoItem.getTipo());
                    }
                    
                    if (Global.preferencia.getTipoItem() != null || !Global.preferencia.getTipoItem().equals("")) {
                        jCBTipoItem.setSelectedItem(Global.preferencia.getTipoItem());
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: \n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(JDCadItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDCadItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDCadItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDCadItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDCadItem dialog = new JDCadItem(new javax.swing.JDialog());
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
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBNextTab;
    private javax.swing.JButton jBPrevTab;
    private javax.swing.JComboBox jCBClassificacao;
    private javax.swing.JComboBox jCBEditora;
    private javax.swing.JComboBox jCBIdioma;
    private javax.swing.JComboBox jCBTipoItem;
    private javax.swing.JCheckBox jCkIndisponivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPAutores;
    private javax.swing.JPanel jPDetalhes;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAno;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTEdicao;
    private javax.swing.JTextField jTExemplar;
    private javax.swing.JTextField jTISBN;
    private javax.swing.JTextField jTLocal;
    private javax.swing.JTextField jTNumPags;
    private javax.swing.JButton jTRemAutor;
    private javax.swing.JTextField jTSubTitulo;
    private javax.swing.JTextField jTTitulo;
    private javax.swing.JTextField jTVolume;
    private javax.swing.JTabbedPane jTabMain;
    private javax.swing.JTable jTbAutores;
    // End of variables declaration//GEN-END:variables
}
