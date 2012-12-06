package jlibrary.view;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jlibrary.entidades.Cep;
import jlibrary.entidades.Cidade;
import jlibrary.entidades.Estado;
import jlibrary.entidades.Leitor;
import jlibrary.entidades.Serie;
import jlibrary.entidades.Turno;
import jlibrary.logica.FormatarTexto;
import jlibrary.logica.Validar;
import jlibrary.persistencia.CepDao;
import jlibrary.persistencia.CidadeDao;
import jlibrary.persistencia.EstadoDao;
import jlibrary.persistencia.LeitorDao;
import jlibrary.persistencia.SerieDao;
import jlibrary.persistencia.TurnoDao;

/**
 *
 * @author Natanael
 */
public class JDCadLeitor extends javax.swing.JDialog {

    private List<Cidade> listaCidade;
    private List<Estado> listaEstado;
    private List<Serie> listaSerie;
    private List<Turno> listaTurno;

    public JDCadLeitor(java.awt.Window parent) {
        super(parent, ModalityType.DOCUMENT_MODAL);
        initComponents();
        new jlibrary.logica.Centralizar(this, this.getSize());
        populaCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabMain = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTRg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTNomeMae = new javax.swing.JTextField();
        jTNomePai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDCDataNasc = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jCBSexo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFTCpf = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jFTCep = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCBUf = new javax.swing.JComboBox();
        jCBCidade = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jTEndereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTNumCasa = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTTel1 = new javax.swing.JTextField();
        jTTel2 = new javax.swing.JTextField();
        jTCel1 = new javax.swing.JTextField();
        jTCel2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jCBSerie = new javax.swing.JComboBox();
        jCBTurno = new javax.swing.JComboBox();
        jBPrevTab = new javax.swing.JButton();
        jBNextTab = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBInserir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(java.awt.Graphics g){
                super.paintComponent(g);
                g.drawImage(new javax.swing.ImageIcon(new jlibrary.logica.Global().getHeaderBg()).getImage(), 0,0, null);
            }
        };
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar novo leitor");

        jTabMain.setToolTipText("");
        jTabMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTabMainMouseReleased(evt);
            }
        });

        jLabel8.setText("Número do CPF");

        jLabel7.setText("Número do RG");

        jLabel6.setText("Nome da mae");

        jTNomeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomeMaeActionPerformed(evt);
            }
        });
        jTNomeMae.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNomeMaeFocusLost(evt);
            }
        });

        jTNomePai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomePaiActionPerformed(evt);
            }
        });
        jTNomePai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNomePaiFocusLost(evt);
            }
        });

        jLabel5.setText("Nome do pai");

        jLabel3.setText("Data de nasc.");

        jCBSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<html><i>Selecione</i></html>", "Masculino", "Feminino" }));

        jLabel9.setText("Sexo");

        jTNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNomeFocusLost(evt);
            }
        });

        jLabel2.setText("Nome");

        try {
            jFTCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jDCDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTNome)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTRg, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                            .addComponent(jTNomePai)
                            .addComponent(jTNomeMae))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jDCDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFTCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabMain.addTab("Principal", jPanel2);

        try {
            jFTCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFTCepKeyReleased(evt);
            }
        });

        jLabel1.setText("CEP");

        jLabel4.setText("UF");

        jCBUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBUfActionPerformed(evt);
            }
        });

        jCBCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<html><i>Selecione um estado</i></html>" }));

        jLabel10.setText("Cidade");

        jTEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTEnderecoFocusLost(evt);
            }
        });

        jLabel11.setText("Endereço");

        jTBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTBairroFocusLost(evt);
            }
        });

        jLabel12.setText("Bairro");

        jLabel13.setText("Número");

        jLabel14.setText("Email");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jFTCep, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 42, Short.MAX_VALUE))
                            .addComponent(jTEmail)
                            .addComponent(jTBairro)
                            .addComponent(jTEndereco, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jCBUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jTNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabMain.addTab("Endereço", jPanel3);

        jLabel19.setText("Telefone 1");

        jLabel20.setText("Telefone 2");

        jLabel21.setText("Celular 1");

        jLabel22.setText("Celular 2");

        jLabel23.setText("Série");

        jLabel24.setText("Turno");

        jCBSerie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<html><i>Selecione uma série</i></html>" }));

        jCBTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<html><i>Selecione um turno</i></html>" }));
        jCBTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTCel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jTTel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTTel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTCel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBSerie, 0, 161, Short.MAX_VALUE)
                    .addComponent(jCBTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(jCBTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(jCBSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabMain.addTab("Detalhes", jPanel4);

        jBPrevTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/icons/pack1/106.png"))); // NOI18N
        jBPrevTab.setEnabled(false);
        jBPrevTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrevTabActionPerformed(evt);
            }
        });

        jBNextTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/icons/pack1/105.png"))); // NOI18N
        jBNextTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextTabActionPerformed(evt);
            }
        });

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/icons/pack1/150.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/icons/pack1/102.png"))); // NOI18N
        jBInserir.setText("Inserir");
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/Add-User48.png"))); // NOI18N
        jLabel15.setText("CADASTRAR LEITOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
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
                .addComponent(jBCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBInserir)
                .addContainerGap())
            .addComponent(jTabMain)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBNextTab)
                        .addComponent(jBPrevTab))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBCancelar)
                        .addComponent(jBInserir)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomeMaeActionPerformed

    private void jTNomeMaeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomeMaeFocusLost
        jTNomeMae.setText(new FormatarTexto().formatar(jTNomeMae));
    }//GEN-LAST:event_jTNomeMaeFocusLost

    private void jTNomePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomePaiActionPerformed
        jTNomePai.setText(new FormatarTexto().formatar(jTNomePai));
    }//GEN-LAST:event_jTNomePaiActionPerformed

    private void jTNomePaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomePaiFocusLost
        jTNomePai.setText(new FormatarTexto().formatar(jTNomePai));
    }//GEN-LAST:event_jTNomePaiFocusLost

    private void jTNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomeFocusLost
        jTNome.setText(new FormatarTexto().formatar(jTNome));
    }//GEN-LAST:event_jTNomeFocusLost

    private void jCBUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBUfActionPerformed
        if (jCBUf.getModel().getSelectedItem().toString().equals("")) {
            jCBCidade.removeAllItems();
            jCBCidade.addItem("<html><i>Selecione um estado</i></html>");
            return;
        }

        CidadeDao cidadeDao = new CidadeDao();
        try {
            listaCidade = cidadeDao.select(listaEstado.get(jCBUf.getSelectedIndex() - 1).getIdEstado());

            jCBCidade.removeAllItems();
            jCBCidade.addItem("<html><i>Selecione uma cidade</i></hmtl>");
            for (Cidade cidade : listaCidade) {
                jCBCidade.addItem(cidade.getNome());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jCBUfActionPerformed

    private void jTEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEnderecoFocusLost
        jTEndereco.setText(new FormatarTexto().formatar(jTEndereco));
    }//GEN-LAST:event_jTEnderecoFocusLost

    private void jTBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBairroFocusLost
        jTBairro.setText(new FormatarTexto().formatar(jTBairro));
    }//GEN-LAST:event_jTBairroFocusLost

    private void jTabMainMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabMainMouseReleased
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
    }//GEN-LAST:event_jTabMainMouseReleased

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

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
        String mensagem = "";
        int erro = 0;

        Validar validar = new Validar();

        if (!validar.isValid(jTNome)) {
            mensagem += "\nNome do leitor inválio";
            erro++;
        }
        if (!validar.isValid(jTNomePai)) {
            mensagem += "\nNome do pai inválido";
            erro++;
        }
        if (!validar.isValid(jTNomeMae)) {
            mensagem += "\nNome da mãe inválido";
            erro++;
        }
        if (jCBSexo.getSelectedIndex() == 0) {
            mensagem += "\nSelecione um sexo";
            erro++;
        }
        if (!validar.isCpf(jFTCpf)) {
            mensagem += "\nCPF inválido";
            erro++;
        }
        if (!jDCDataNasc.isValid()) {
            mensagem += "\nData de nascimento inválida";
            erro++;
        }
        if (!validar.isValid(jTEndereco)) {
            mensagem += "\nEndereço inválido";
            erro++;
        }
        if (!validar.isValid(jTBairro)) {
            mensagem += "\nBairro inválido";
            erro++;
        }
        if (!validar.isValid(jTNumCasa)) {
            mensagem += "\nNúmero da casa inválido";
            erro++;
        }
        if (jCBUf.getSelectedIndex() == 0) {
            mensagem += "\nSelecione um estado";
            erro++;
        }
        if (jCBUf.getItemCount() <= 1) {
            mensagem += "\nSelecione uma cidade";
            erro++;
        }
        if (erro > 0) {
            JOptionPane.showMessageDialog(null, "<html><b>" + erro + " erros encontrado(s) no preenchimento do formulário</b></html>" + mensagem,
                    "Preenchimento incorreto", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Leitor leitor = new Leitor();
        FormatarTexto formatarTexto = new FormatarTexto();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        leitor.setBairro(jTBairro.getText());
        leitor.setCelular1(jTCel1.getText());
        leitor.setCelular2(jTCel2.getText());
        leitor.setCep(jFTCep.getText());
        leitor.setDataNasc(sdf.format(jDCDataNasc.getDate()));
        leitor.setEmail(jTEmail.getText());
        leitor.setEndereco(jTEndereco.getText());
        leitor.setNome(formatarTexto.formatar(jTNome.getText()));
        leitor.setNomeMae(formatarTexto.formatar(jTNomeMae.getText()));
        leitor.setNomePai(formatarTexto.formatar(jTNomePai.getText()));
        leitor.setNumEnd(jTNumCasa.getText());
        leitor.setRg(jTRg.getText());
        leitor.setSexo(jCBSexo.getModel().getSelectedItem().toString());
        leitor.setTelefone1(jTTel1.getText());
        leitor.setTelefone2(jTTel2.getText());
        if (jFTCpf.getText().equals("   .   .   -  ")) {
            leitor.setCpf("");
        } else {
            leitor.setCpf(jFTCpf.getText());
        }

        Estado estado = new Estado();
        estado.setIdEstado(listaEstado.get(jCBUf.getSelectedIndex() - 1).getIdEstado());
        Cidade cidade = new Cidade();
        cidade.setIdCidade(listaCidade.get(jCBCidade.getSelectedIndex()).getIdCidade());
        Serie serie = new Serie();
        serie.setIdSerie(listaSerie.get(jCBSerie.getSelectedIndex() - 1).getIdSerie());
        Turno turno = new Turno();
        turno.setIdTurno(listaTurno.get(jCBTurno.getSelectedIndex() - 1).getIdTurno());

        leitor.setCidade(cidade);
        leitor.setEstado(estado);
        leitor.setSerie(serie);
        leitor.setTurno(turno);

        try {
            LeitorDao leitorDao = new LeitorDao();

            if (!leitorDao.existe(leitor.getCpf())) {
                leitorDao.insert(leitor);
                int r = JOptionPane.showConfirmDialog(this, "Leitor cadastrado com sucesso.\nDeseja cadastrar outro leitor?",
                        "Cadastro realizado com sucesso", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (r == JOptionPane.YES_OPTION) {
                    jTBairro.setText("");
                    jTCel1.setText("");
                    jTCel2.setText("");
                    jTEmail.setText("");
                    jTEndereco.setText("");
                    jTNome.setText("");
                    jTNomeMae.setText("");
                    jTNomePai.setText("");
                    jTNumCasa.setText("");
                    jTRg.setText("");
                    jTTel1.setText("");
                    jTTel2.setText("");
                    jCBCidade.setSelectedIndex(0);
                    jCBSerie.setSelectedIndex(0);
                    jCBSexo.setSelectedIndex(0);
                    jCBTurno.setSelectedIndex(0);
                    jCBUf.setSelectedIndex(0);
                    jDCDataNasc.setDate(null);
                    jFTCep.setText("");
                    jFTCpf.setText("");
                    jTabMain.setSelectedIndex(0);
                } else {
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Esta pessoa já está cadastrada no sistema"
                        + "\n" + "Nome: " + jTNome.getText(), "Erro: Pessoa já cadastrada", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException | ParseException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jFTCepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTCepKeyReleased
        if (jFTCep.getText().trim().length() < 6) {
            return;
        }

        CepDao cepDao = new CepDao();
        Cep cep;
        try {
            cep = cepDao.select(jFTCep.getText());
            if (jFTCep.getText().equals(cep.getCep())) {
                jCBUf.setSelectedItem(cep.getEstado().getUf());
                jCBCidade.setSelectedItem(cep.getCidade().getNome());
                jTEndereco.grabFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDCadLeitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jFTCepKeyReleased

    private void jCBTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTurnoActionPerformed
        populaSerie();
    }//GEN-LAST:event_jCBTurnoActionPerformed

    private void populaCombo() {
        EstadoDao estadoDao = new EstadoDao();
        TurnoDao turnoDao = new TurnoDao();

        try {
            listaEstado = estadoDao.select();
            jCBUf.removeAllItems();
            jCBUf.addItem("");
            for (Estado estado : listaEstado) {
                jCBUf.addItem(estado.getUf());
            }

            listaTurno = turnoDao.select();
            jCBTurno.removeAllItems();
            jCBTurno.addItem("<html><i>Selecione um turno</i></html>");
            for (Turno turno : listaTurno) {
                jCBTurno.addItem(turno.getNome());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void populaSerie() {
        if (jCBTurno.getSelectedIndex() == -1) {
            jCBSerie.removeAllItems();
            jCBSerie.addItem("<html><i>Selecione uma série</i></html>");
            return;
        }

        SerieDao serieDao = new SerieDao();

        try {
            listaSerie = serieDao.selectPorTurno(listaTurno.get(jCBTurno.getSelectedIndex()).getIdTurno());
            jCBSerie.removeAllItems();
            jCBSerie.addItem("<html><i>Selecione uma série</i></html>");
            for (Serie serie : listaSerie) {
                jCBSerie.addItem(serie.getNome());
            }
        } catch (SQLException ex) {
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
            java.util.logging.Logger.getLogger(JDCadLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDCadLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDCadLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDCadLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDCadLeitor dialog = new JDCadLeitor(new javax.swing.JDialog());
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
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBNextTab;
    private javax.swing.JButton jBPrevTab;
    private javax.swing.JComboBox jCBCidade;
    private javax.swing.JComboBox jCBSerie;
    private javax.swing.JComboBox jCBSexo;
    private javax.swing.JComboBox jCBTurno;
    private javax.swing.JComboBox jCBUf;
    private com.toedter.calendar.JDateChooser jDCDataNasc;
    private javax.swing.JFormattedTextField jFTCep;
    private javax.swing.JFormattedTextField jFTCpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCel1;
    private javax.swing.JTextField jTCel2;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNomeMae;
    private javax.swing.JTextField jTNomePai;
    private javax.swing.JTextField jTNumCasa;
    private javax.swing.JTextField jTRg;
    private javax.swing.JTextField jTTel1;
    private javax.swing.JTextField jTTel2;
    private javax.swing.JTabbedPane jTabMain;
    // End of variables declaration//GEN-END:variables
}
