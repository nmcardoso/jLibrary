package jlibrary.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import jlibrary.entidades.Login;
import jlibrary.logica.Fontes;
import jlibrary.logica.Global;
import jlibrary.persistencia.AutorDao;
import jlibrary.persistencia.ClassifLitDao;
import jlibrary.persistencia.ControleDao;
import jlibrary.persistencia.DevolucaoDao;
import jlibrary.persistencia.EditoraDao;
import jlibrary.persistencia.ItemDao;
import jlibrary.persistencia.LeitorDao;
import jlibrary.persistencia.LoginDao;
import jlibrary.persistencia.ReservaDao;
import jlibrary.persistencia.SerieDao;
import jlibrary.persistencia.TurnoDao;

/**
 *
 * @author Natanael
 */
public class JFMain_Testes extends javax.swing.JFrame {

    private JComponent menuClicked;
    private final Color COLOR_ENTERED = new Color(65, 149, 238);
    private final Color COLOR_DEFAULT = new Color(147, 195, 245);

    public JFMain_Testes() {
        initComponents();
        setfont();
        this.setExtendedState(MAXIMIZED_BOTH);
        jLUsuario.setText(Global.login.getNome());
        ImageIcon imagem = new ImageIcon(getClass().getResource("/jlibrary/images/user/" + Global.login.getImg()));
        jLUsuario.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(50, 50, 100)));
        menuClicked = jPMenuInicio;
        jPMenuInicio.setBackground(COLOR_ENTERED);
        jPMenuAcervo.setBackground(COLOR_DEFAULT);
        jPMenuConfiguracoes.setBackground(COLOR_DEFAULT);
        jPMenuLeitor.setBackground(COLOR_DEFAULT);
        jPMenuMovimentacoes.setBackground(COLOR_DEFAULT);
        jPMenuPreferencias.setBackground(COLOR_DEFAULT);
        jPMenuRelatorios.setBackground(COLOR_DEFAULT);
        atualizaEstatisticas();
        getEmpAtrasado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu6 = new javax.swing.JMenu();
        jPMOpcoes = new javax.swing.JPopupMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jPMain = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(java.awt.Graphics g){
                super.paintComponent(g);
                g.drawImage(new javax.swing.ImageIcon(new jlibrary.logica.Global().getMainBg()).getImage(), 0,0, null);
            }
        };
        jPMainPanels = new javax.swing.JPanel();
        jPInicio = new javax.swing.JPanel();
        jLTituloInicio = new javax.swing.JLabel();
        jPIniEstAcervo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLIniEstItens = new javax.swing.JLabel();
        jLIniEstAutores = new javax.swing.JLabel();
        jLIniEstEditoras = new javax.swing.JLabel();
        jLIniEstClassif = new javax.swing.JLabel();
        jPIniEstLeitor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLIniEstLeitores = new javax.swing.JLabel();
        jLIniEstSeries = new javax.swing.JLabel();
        jLIniEstTurnos = new javax.swing.JLabel();
        jPIniEstMov = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLIniEstEmp = new javax.swing.JLabel();
        jLIniEstReserva = new javax.swing.JLabel();
        jLIniTotalEmp = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLEmpAtrasado = new javax.swing.JLabel();
        jPCadItem1 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPCadLeiror1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPMovNovoEmp1 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPAcervo = new javax.swing.JPanel();
        jLTituloAcervo = new javax.swing.JLabel();
        jPAcervoEst = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLEstItens = new javax.swing.JLabel();
        jLEstAutores = new javax.swing.JLabel();
        jLEstEditoras = new javax.swing.JLabel();
        jLEstClassif = new javax.swing.JLabel();
        jPGerAcervo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPCadItem = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPCadAutor = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPCadEditora = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPCadClassif = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPCadTipoItem = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPLeitor = new javax.swing.JPanel();
        jLTituloLeitor = new javax.swing.JLabel();
        jPGerLeitores = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPCadLeiror = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPLeitorEst = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLEstLeitores = new javax.swing.JLabel();
        jLEstSeries = new javax.swing.JLabel();
        jLEstTurnos = new javax.swing.JLabel();
        jPCadSerie = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPCadTurno = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPMovimentacoes = new javax.swing.JPanel();
        jLTituloMovimentacoes = new javax.swing.JLabel();
        jPMovNovoEmp = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPMovNovaDev = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPMovEst = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLEstEmp = new javax.swing.JLabel();
        jLEstReserva = new javax.swing.JLabel();
        jLEstTotalEmp = new javax.swing.JLabel();
        jPMovHist = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPMovNovaRes = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPMovGerRes = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPPreferencias = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPPrefOtm = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPPrefAparencia = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPConfiguracoes = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jPConfigBb = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPConfigCadUser = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPConfigGerUser = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPRelatorios = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPHeader = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(java.awt.Graphics g){
                super.paintComponent(g);

                int rInicial = 0;
                int gInicial = 130;
                int bInicial = 255;
                int rFinal = 0;
                int gFinal = 51;
                int bFinal = 255;

                Dimension d = jPHeader.getSize();
                int maxX = d.width - 1;
                int maxY = d.height - 1;

                for (int iY = 0; iY <= maxY; iY++) {
                    int rAtual = (int) ((rFinal - rInicial) * iY / (float) maxY + rInicial);
                    int gAtual = (int) ((gFinal - gInicial) * iY / (float) maxY + gInicial);
                    int bAtual = (int) ((bFinal - bInicial) * iY / (float) maxY + bInicial);

                    g.setColor(new Color(rAtual, gAtual, bAtual));
                    g.drawLine(0, iY, maxX, iY);
                }

            }
        };
        jLUsuario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPMenu = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(java.awt.Graphics g){
                super.paintComponent(g);
                g.drawImage(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/bgx.jpg")).getImage(), 0,0, null);
            }
        };
        jPMenuAcervo = new javax.swing.JPanel();
        jLMenuAcervo = new javax.swing.JLabel();
        jPMenuLeitor = new javax.swing.JPanel();
        jLMenuLeitor = new javax.swing.JLabel();
        jPMenuPreferencias = new javax.swing.JPanel();
        jLMenuPreferencias = new javax.swing.JLabel();
        jPMenuMovimentacoes = new javax.swing.JPanel();
        jLMenuMovimentacoes = new javax.swing.JLabel();
        jPMenuConfiguracoes = new javax.swing.JPanel();
        jLMenuConfiguracoes = new javax.swing.JLabel();
        jPMenuInicio = new javax.swing.JPanel();
        jLMenuInicio = new javax.swing.JLabel();
        jPMenuRelatorios = new javax.swing.JPanel();
        jLMenuRelatorios = new javax.swing.JLabel();

        jMenu6.setText("jMenu6");

        jMenuItem11.setText("Modo de espera");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jPMOpcoes.add(jMenuItem11);

        jMenuItem12.setText("Trocar de usuário");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jPMOpcoes.add(jMenuItem12);
        jPMOpcoes.add(jSeparator1);

        jMenuItem10.setText("Configurações da conta");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jPMOpcoes.add(jMenuItem10);

        jMenuItem13.setText("Alterar imagem de exibição");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jPMOpcoes.add(jMenuItem13);
        jPMOpcoes.add(jSeparator2);

        jMenuItem14.setText("Sair");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jPMOpcoes.add(jMenuItem14);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JLibrary 0.1");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/Books-2-icon64.png")).getImage());

        jPMainPanels.setOpaque(false);
        jPMainPanels.setLayout(new java.awt.CardLayout());

        jPInicio.setOpaque(false);

        jLTituloInicio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTituloInicio.setText("Início");

        jPIniEstAcervo.setBackground(new java.awt.Color(102, 153, 255));
        jPIniEstAcervo.setPreferredSize(new java.awt.Dimension(220, 124));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estatísticas do acervo");

        jLIniEstItens.setText("Itens:");

        jLIniEstAutores.setText("Autores:");

        jLIniEstEditoras.setText("Editoras:");

        jLIniEstClassif.setText("Classif. literárias:");

        javax.swing.GroupLayout jPIniEstAcervoLayout = new javax.swing.GroupLayout(jPIniEstAcervo);
        jPIniEstAcervo.setLayout(jPIniEstAcervoLayout);
        jPIniEstAcervoLayout.setHorizontalGroup(
            jPIniEstAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPIniEstAcervoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPIniEstAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLIniEstItens)
                    .addComponent(jLIniEstAutores)
                    .addComponent(jLIniEstEditoras)
                    .addComponent(jLIniEstClassif))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPIniEstAcervoLayout.setVerticalGroup(
            jPIniEstAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPIniEstAcervoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLIniEstItens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLIniEstAutores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLIniEstEditoras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLIniEstClassif)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPIniEstLeitor.setBackground(new java.awt.Color(255, 102, 102));
        jPIniEstLeitor.setPreferredSize(new java.awt.Dimension(220, 104));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estatísticas dos leitores");

        jLIniEstLeitores.setText("Leitores:");

        jLIniEstSeries.setText("Séries:");

        jLIniEstTurnos.setText("Turnos:");

        javax.swing.GroupLayout jPIniEstLeitorLayout = new javax.swing.GroupLayout(jPIniEstLeitor);
        jPIniEstLeitor.setLayout(jPIniEstLeitorLayout);
        jPIniEstLeitorLayout.setHorizontalGroup(
            jPIniEstLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPIniEstLeitorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPIniEstLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLIniEstLeitores)
                    .addComponent(jLIniEstSeries)
                    .addComponent(jLIniEstTurnos))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPIniEstLeitorLayout.setVerticalGroup(
            jPIniEstLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPIniEstLeitorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLIniEstLeitores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLIniEstSeries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLIniEstTurnos)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPIniEstMov.setBackground(new java.awt.Color(154, 240, 154));
        jPIniEstMov.setPreferredSize(new java.awt.Dimension(215, 124));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Estatísticas das movimentações");

        jLIniEstEmp.setText("Emprestados:");

        jLIniEstReserva.setText("Devoluções:");

        jLIniTotalEmp.setText("Total emp.:");

        javax.swing.GroupLayout jPIniEstMovLayout = new javax.swing.GroupLayout(jPIniEstMov);
        jPIniEstMov.setLayout(jPIniEstMovLayout);
        jPIniEstMovLayout.setHorizontalGroup(
            jPIniEstMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPIniEstMovLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPIniEstMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLIniEstEmp)
                    .addComponent(jLIniEstReserva)
                    .addComponent(jLIniTotalEmp))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPIniEstMovLayout.setVerticalGroup(
            jPIniEstMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPIniEstMovLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLIniEstEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLIniEstReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLIniTotalEmp)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Empréstimos atrasados");

        jLEmpAtrasado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLEmpAtrasado.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLEmpAtrasado))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLEmpAtrasado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jPCadItem1.setBackground(new java.awt.Color(27, 72, 255));
        jPCadItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCadItem1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCadItem1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCadItem1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPCadItem1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPCadItem1MouseReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Cadastrar item");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/emblem-library.png"))); // NOI18N

        javax.swing.GroupLayout jPCadItem1Layout = new javax.swing.GroupLayout(jPCadItem1);
        jPCadItem1.setLayout(jPCadItem1Layout);
        jPCadItem1Layout.setHorizontalGroup(
            jPCadItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadItem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadItem1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCadItem1Layout.setVerticalGroup(
            jPCadItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadItem1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addContainerGap())
        );

        jPCadLeiror1.setBackground(new java.awt.Color(255, 51, 51));
        jPCadLeiror1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPCadLeiror1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCadLeiror1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCadLeiror1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCadLeiror1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPCadLeiror1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPCadLeiror1MouseReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cadastrar Leitor");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/Add-User64.png"))); // NOI18N

        javax.swing.GroupLayout jPCadLeiror1Layout = new javax.swing.GroupLayout(jPCadLeiror1);
        jPCadLeiror1.setLayout(jPCadLeiror1Layout);
        jPCadLeiror1Layout.setHorizontalGroup(
            jPCadLeiror1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadLeiror1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadLeiror1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCadLeiror1Layout.setVerticalGroup(
            jPCadLeiror1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadLeiror1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        jPMovNovoEmp1.setBackground(new java.awt.Color(51, 153, 0));
        jPMovNovoEmp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMovNovoEmp1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMovNovoEmp1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMovNovoEmp1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMovNovoEmp1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPMovNovoEmp1MouseReleased(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Novo empréstimo");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/emprestimo.png"))); // NOI18N

        javax.swing.GroupLayout jPMovNovoEmp1Layout = new javax.swing.GroupLayout(jPMovNovoEmp1);
        jPMovNovoEmp1.setLayout(jPMovNovoEmp1Layout);
        jPMovNovoEmp1Layout.setHorizontalGroup(
            jPMovNovoEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMovNovoEmp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMovNovoEmp1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMovNovoEmp1Layout.setVerticalGroup(
            jPMovNovoEmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMovNovoEmp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPInicioLayout = new javax.swing.GroupLayout(jPInicio);
        jPInicio.setLayout(jPInicioLayout);
        jPInicioLayout.setHorizontalGroup(
            jPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTituloInicio)
                    .addGroup(jPInicioLayout.createSequentialGroup()
                        .addGroup(jPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPCadItem1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPIniEstAcervo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPIniEstLeitor, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jPCadLeiror1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPIniEstMov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPMovNovoEmp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPInicioLayout.setVerticalGroup(
            jPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPMovNovoEmp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPCadLeiror1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPCadItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPIniEstLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPIniEstAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPIniEstMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPMainPanels.add(jPInicio, "card5");

        jPAcervo.setOpaque(false);

        jLTituloAcervo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTituloAcervo.setText("Acervo");

        jPAcervoEst.setBackground(new java.awt.Color(72, 118, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estatística");

        jLEstItens.setText("Itens");

        jLEstAutores.setText("Autores:");

        jLEstEditoras.setText("Editoras:");

        jLEstClassif.setText("Classif. literárias:");

        javax.swing.GroupLayout jPAcervoEstLayout = new javax.swing.GroupLayout(jPAcervoEst);
        jPAcervoEst.setLayout(jPAcervoEstLayout);
        jPAcervoEstLayout.setHorizontalGroup(
            jPAcervoEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAcervoEstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAcervoEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLEstItens)
                    .addComponent(jLEstAutores)
                    .addComponent(jLEstEditoras)
                    .addComponent(jLEstClassif))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPAcervoEstLayout.setVerticalGroup(
            jPAcervoEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAcervoEstLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLEstItens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLEstAutores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLEstEditoras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLEstClassif)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPGerAcervo.setBackground(new java.awt.Color(27, 72, 255));
        jPGerAcervo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPGerAcervoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPGerAcervoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPGerAcervoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPGerAcervoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPGerAcervoMouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gerenciar acervo");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/library64.png"))); // NOI18N

        javax.swing.GroupLayout jPGerAcervoLayout = new javax.swing.GroupLayout(jPGerAcervo);
        jPGerAcervo.setLayout(jPGerAcervoLayout);
        jPGerAcervoLayout.setHorizontalGroup(
            jPGerAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGerAcervoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPGerAcervoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPGerAcervoLayout.setVerticalGroup(
            jPGerAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPGerAcervoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jPCadItem.setBackground(new java.awt.Color(27, 72, 255));
        jPCadItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCadItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCadItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCadItemMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPCadItemMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPCadItemMouseReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cadastrar item");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/emblem-library.png"))); // NOI18N

        javax.swing.GroupLayout jPCadItemLayout = new javax.swing.GroupLayout(jPCadItem);
        jPCadItem.setLayout(jPCadItemLayout);
        jPCadItemLayout.setHorizontalGroup(
            jPCadItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadItemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCadItemLayout.setVerticalGroup(
            jPCadItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadItemLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        jPCadAutor.setBackground(new java.awt.Color(0, 51, 153));
        jPCadAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCadAutorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCadAutorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCadAutorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPCadAutorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPCadAutorMouseReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cadastrar autor");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/add.png"))); // NOI18N

        javax.swing.GroupLayout jPCadAutorLayout = new javax.swing.GroupLayout(jPCadAutor);
        jPCadAutor.setLayout(jPCadAutorLayout);
        jPCadAutorLayout.setHorizontalGroup(
            jPCadAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadAutorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCadAutorLayout.setVerticalGroup(
            jPCadAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        jPCadEditora.setBackground(new java.awt.Color(0, 51, 153));
        jPCadEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCadEditoraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCadEditoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCadEditoraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPCadEditoraMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPCadEditoraMouseReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cadastrar editora");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/add.png"))); // NOI18N

        javax.swing.GroupLayout jPCadEditoraLayout = new javax.swing.GroupLayout(jPCadEditora);
        jPCadEditora.setLayout(jPCadEditoraLayout);
        jPCadEditoraLayout.setHorizontalGroup(
            jPCadEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadEditoraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCadEditoraLayout.setVerticalGroup(
            jPCadEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addContainerGap())
        );

        jPCadClassif.setBackground(new java.awt.Color(0, 51, 153));
        jPCadClassif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCadClassifMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCadClassifMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCadClassifMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPCadClassifMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPCadClassifMouseReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cadastrar classificação literária");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/add.png"))); // NOI18N

        javax.swing.GroupLayout jPCadClassifLayout = new javax.swing.GroupLayout(jPCadClassif);
        jPCadClassif.setLayout(jPCadClassifLayout);
        jPCadClassifLayout.setHorizontalGroup(
            jPCadClassifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadClassifLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadClassifLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCadClassifLayout.setVerticalGroup(
            jPCadClassifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadClassifLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addContainerGap())
        );

        jPCadTipoItem.setBackground(new java.awt.Color(0, 51, 153));
        jPCadTipoItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCadTipoItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCadTipoItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCadTipoItemMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPCadTipoItemMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPCadTipoItemMouseReleased(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cadastrar tipo de item");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/add.png"))); // NOI18N

        javax.swing.GroupLayout jPCadTipoItemLayout = new javax.swing.GroupLayout(jPCadTipoItem);
        jPCadTipoItem.setLayout(jPCadTipoItemLayout);
        jPCadTipoItemLayout.setHorizontalGroup(
            jPCadTipoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadTipoItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadTipoItemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCadTipoItemLayout.setVerticalGroup(
            jPCadTipoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadTipoItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPAcervoLayout = new javax.swing.GroupLayout(jPAcervo);
        jPAcervo.setLayout(jPAcervoLayout);
        jPAcervoLayout.setHorizontalGroup(
            jPAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAcervoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPAcervoLayout.createSequentialGroup()
                        .addComponent(jPGerAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPCadItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPAcervoEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLTituloAcervo)
                    .addGroup(jPAcervoLayout.createSequentialGroup()
                        .addComponent(jPCadAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPCadEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPCadClassif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPCadTipoItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPAcervoLayout.setVerticalGroup(
            jPAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAcervoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloAcervo)
                .addGap(18, 18, 18)
                .addGroup(jPAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPCadItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPGerAcervo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPAcervoEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPCadClassif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPCadEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPCadAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPCadTipoItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jPMainPanels.add(jPAcervo, "card2");

        jPLeitor.setOpaque(false);

        jLTituloLeitor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTituloLeitor.setText("Leitor");

        jPGerLeitores.setBackground(new java.awt.Color(255, 51, 51));
        jPGerLeitores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPGerLeitores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPGerLeitoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPGerLeitoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPGerLeitoresMouseExited(evt);
            }
        });
        jPGerLeitores.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPGerLeitoresMouseMoved(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gerenciar Leitores");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/community_users.png"))); // NOI18N

        javax.swing.GroupLayout jPGerLeitoresLayout = new javax.swing.GroupLayout(jPGerLeitores);
        jPGerLeitores.setLayout(jPGerLeitoresLayout);
        jPGerLeitoresLayout.setHorizontalGroup(
            jPGerLeitoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGerLeitoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPGerLeitoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPGerLeitoresLayout.setVerticalGroup(
            jPGerLeitoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPGerLeitoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPCadLeiror.setBackground(new java.awt.Color(255, 51, 51));
        jPCadLeiror.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPCadLeiror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCadLeirorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCadLeirorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCadLeirorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPCadLeirorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPCadLeirorMouseReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cadastrar Leitor");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/Add-User64.png"))); // NOI18N

        javax.swing.GroupLayout jPCadLeirorLayout = new javax.swing.GroupLayout(jPCadLeiror);
        jPCadLeiror.setLayout(jPCadLeirorLayout);
        jPCadLeirorLayout.setHorizontalGroup(
            jPCadLeirorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadLeirorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadLeirorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCadLeirorLayout.setVerticalGroup(
            jPCadLeirorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadLeirorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPLeitorEst.setBackground(new java.awt.Color(255, 102, 102));
        jPLeitorEst.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Estatística");

        jLEstLeitores.setText("Leitores:");

        jLEstSeries.setText("Séries:");

        jLEstTurnos.setText("Turnos:");

        javax.swing.GroupLayout jPLeitorEstLayout = new javax.swing.GroupLayout(jPLeitorEst);
        jPLeitorEst.setLayout(jPLeitorEstLayout);
        jPLeitorEstLayout.setHorizontalGroup(
            jPLeitorEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLeitorEstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPLeitorEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLEstLeitores)
                    .addComponent(jLEstSeries)
                    .addComponent(jLEstTurnos))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPLeitorEstLayout.setVerticalGroup(
            jPLeitorEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLeitorEstLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLEstLeitores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLEstSeries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLEstTurnos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPCadSerie.setBackground(new java.awt.Color(229, 14, 14));
        jPCadSerie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPCadSerie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCadSerieMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCadSerieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCadSerieMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPCadSerieMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPCadSerieMouseReleased(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Cadastrar série");

        javax.swing.GroupLayout jPCadSerieLayout = new javax.swing.GroupLayout(jPCadSerie);
        jPCadSerie.setLayout(jPCadSerieLayout);
        jPCadSerieLayout.setHorizontalGroup(
            jPCadSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadSerieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCadSerieLayout.setVerticalGroup(
            jPCadSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadSerieLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addContainerGap())
        );

        jPCadTurno.setBackground(new java.awt.Color(229, 14, 14));
        jPCadTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPCadTurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCadTurnoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCadTurnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCadTurnoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPCadTurnoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPCadTurnoMouseReleased(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Cadastrar turno");

        javax.swing.GroupLayout jPCadTurnoLayout = new javax.swing.GroupLayout(jPCadTurno);
        jPCadTurno.setLayout(jPCadTurnoLayout);
        jPCadTurnoLayout.setHorizontalGroup(
            jPCadTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadTurnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCadTurnoLayout.setVerticalGroup(
            jPCadTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadTurnoLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPLeitorLayout = new javax.swing.GroupLayout(jPLeitor);
        jPLeitor.setLayout(jPLeitorLayout);
        jPLeitorLayout.setHorizontalGroup(
            jPLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLeitorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTituloLeitor)
                    .addGroup(jPLeitorLayout.createSequentialGroup()
                        .addGroup(jPLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPCadSerie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPGerLeitores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPCadLeiror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPCadTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPLeitorEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPLeitorLayout.setVerticalGroup(
            jPLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLeitorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloLeitor)
                .addGap(18, 18, 18)
                .addGroup(jPLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPGerLeitores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPCadLeiror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPLeitorEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPCadSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPCadTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jPMainPanels.add(jPLeitor, "card3");

        jPMovimentacoes.setOpaque(false);

        jLTituloMovimentacoes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTituloMovimentacoes.setText("Movimentações");

        jPMovNovoEmp.setBackground(new java.awt.Color(51, 153, 0));
        jPMovNovoEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMovNovoEmpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMovNovoEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMovNovoEmpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMovNovoEmpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPMovNovoEmpMouseReleased(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Novo empréstimo");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/emprestimo.png"))); // NOI18N

        javax.swing.GroupLayout jPMovNovoEmpLayout = new javax.swing.GroupLayout(jPMovNovoEmp);
        jPMovNovoEmp.setLayout(jPMovNovoEmpLayout);
        jPMovNovoEmpLayout.setHorizontalGroup(
            jPMovNovoEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMovNovoEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMovNovoEmpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMovNovoEmpLayout.setVerticalGroup(
            jPMovNovoEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMovNovoEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addContainerGap())
        );

        jPMovNovaDev.setBackground(new java.awt.Color(51, 153, 0));
        jPMovNovaDev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMovNovaDevMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMovNovaDevMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMovNovaDevMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMovNovaDevMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPMovNovaDevMouseReleased(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Nova devolução");

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/devolucao.png"))); // NOI18N

        javax.swing.GroupLayout jPMovNovaDevLayout = new javax.swing.GroupLayout(jPMovNovaDev);
        jPMovNovaDev.setLayout(jPMovNovaDevLayout);
        jPMovNovaDevLayout.setHorizontalGroup(
            jPMovNovaDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMovNovaDevLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMovNovaDevLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMovNovaDevLayout.setVerticalGroup(
            jPMovNovaDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMovNovaDevLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addContainerGap())
        );

        jPMovEst.setBackground(new java.awt.Color(102, 255, 102));
        jPMovEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMovEstMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMovEstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMovEstMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMovEstMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPMovEstMouseReleased(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Estatística");

        jLEstEmp.setText("Empréstimos:");

        jLEstReserva.setText("Reservas:");

        jLEstTotalEmp.setText("Total Emp.:");

        javax.swing.GroupLayout jPMovEstLayout = new javax.swing.GroupLayout(jPMovEst);
        jPMovEst.setLayout(jPMovEstLayout);
        jPMovEstLayout.setHorizontalGroup(
            jPMovEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMovEstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMovEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jLEstEmp)
                    .addComponent(jLEstReserva)
                    .addComponent(jLEstTotalEmp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMovEstLayout.setVerticalGroup(
            jPMovEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMovEstLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLEstEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLEstReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLEstTotalEmp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPMovHist.setBackground(new java.awt.Color(0, 204, 51));
        jPMovHist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMovHistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMovHistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMovHistMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMovHistMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPMovHistMouseReleased(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Histórico das movimentações");

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/clock.png"))); // NOI18N

        javax.swing.GroupLayout jPMovHistLayout = new javax.swing.GroupLayout(jPMovHist);
        jPMovHist.setLayout(jPMovHistLayout);
        jPMovHistLayout.setHorizontalGroup(
            jPMovHistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMovHistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMovHistLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMovHistLayout.setVerticalGroup(
            jPMovHistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMovHistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addContainerGap())
        );

        jPMovNovaRes.setBackground(new java.awt.Color(0, 204, 51));
        jPMovNovaRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMovNovaResMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMovNovaResMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMovNovaResMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMovNovaResMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPMovNovaResMouseReleased(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Nova reserva");

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/contents.png"))); // NOI18N

        javax.swing.GroupLayout jPMovNovaResLayout = new javax.swing.GroupLayout(jPMovNovaRes);
        jPMovNovaRes.setLayout(jPMovNovaResLayout);
        jPMovNovaResLayout.setHorizontalGroup(
            jPMovNovaResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMovNovaResLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMovNovaResLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel62)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMovNovaResLayout.setVerticalGroup(
            jPMovNovaResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMovNovaResLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel61)
                .addContainerGap())
        );

        jPMovGerRes.setBackground(new java.awt.Color(0, 204, 51));
        jPMovGerRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMovGerResMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMovGerResMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMovGerResMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMovGerResMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPMovGerResMouseReleased(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Gerenciar reservas");

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/contents_gear.png"))); // NOI18N

        javax.swing.GroupLayout jPMovGerResLayout = new javax.swing.GroupLayout(jPMovGerRes);
        jPMovGerRes.setLayout(jPMovGerResLayout);
        jPMovGerResLayout.setHorizontalGroup(
            jPMovGerResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMovGerResLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMovGerResLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMovGerResLayout.setVerticalGroup(
            jPMovGerResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMovGerResLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(51, 204, 0));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Renovar empréstimo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPMovimentacoesLayout = new javax.swing.GroupLayout(jPMovimentacoes);
        jPMovimentacoes.setLayout(jPMovimentacoesLayout);
        jPMovimentacoesLayout.setHorizontalGroup(
            jPMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMovimentacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTituloMovimentacoes)
                    .addGroup(jPMovimentacoesLayout.createSequentialGroup()
                        .addGroup(jPMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPMovNovaRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPMovNovoEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPMovGerRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPMovNovaDev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPMovEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPMovHist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPMovimentacoesLayout.setVerticalGroup(
            jPMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMovimentacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloMovimentacoes)
                .addGap(18, 18, 18)
                .addGroup(jPMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPMovNovoEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPMovEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPMovNovaDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPMovNovaRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPMovHist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPMovGerRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPMainPanels.add(jPMovimentacoes, "card4");

        jPPreferencias.setOpaque(false);

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel49.setText("Preferências");

        jPPrefOtm.setBackground(new java.awt.Color(102, 0, 204));
        jPPrefOtm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPPrefOtmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPPrefOtmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPPrefOtmMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPPrefOtmMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPPrefOtmMouseReleased(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("<html>Otimizador de preenchimento<br /> de formulários</html>");

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/wizard1.png"))); // NOI18N

        javax.swing.GroupLayout jPPrefOtmLayout = new javax.swing.GroupLayout(jPPrefOtm);
        jPPrefOtm.setLayout(jPPrefOtmLayout);
        jPPrefOtmLayout.setHorizontalGroup(
            jPPrefOtmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrefOtmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrefOtmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPPrefOtmLayout.setVerticalGroup(
            jPPrefOtmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrefOtmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPPrefAparencia.setBackground(new java.awt.Color(102, 0, 204));
        jPPrefAparencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPPrefAparenciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPPrefAparenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPPrefAparenciaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPPrefAparenciaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPPrefAparenciaMouseReleased(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Modificar aparência");

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/appearance.png"))); // NOI18N

        javax.swing.GroupLayout jPPrefAparenciaLayout = new javax.swing.GroupLayout(jPPrefAparencia);
        jPPrefAparencia.setLayout(jPPrefAparenciaLayout);
        jPPrefAparenciaLayout.setHorizontalGroup(
            jPPrefAparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrefAparenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrefAparenciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPPrefAparenciaLayout.setVerticalGroup(
            jPPrefAparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrefAparenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel52)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPPreferenciasLayout = new javax.swing.GroupLayout(jPPreferencias);
        jPPreferencias.setLayout(jPPreferenciasLayout);
        jPPreferenciasLayout.setHorizontalGroup(
            jPPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPreferenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addGroup(jPPreferenciasLayout.createSequentialGroup()
                        .addComponent(jPPrefOtm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPPrefAparencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPPreferenciasLayout.setVerticalGroup(
            jPPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPreferenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addGroup(jPPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPPrefAparencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPPrefOtm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(260, Short.MAX_VALUE))
        );

        jPMainPanels.add(jPPreferencias, "card6");

        jPConfiguracoes.setOpaque(false);

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel54.setText("Configurações");

        jPConfigBb.setBackground(new java.awt.Color(122, 131, 161));
        jPConfigBb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPConfigBbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPConfigBbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPConfigBbMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPConfigBbMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPConfigBbMouseReleased(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("<html>Configurar acesso<br/> ao banco de dados</html>");

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/database_process.png"))); // NOI18N

        javax.swing.GroupLayout jPConfigBbLayout = new javax.swing.GroupLayout(jPConfigBb);
        jPConfigBb.setLayout(jPConfigBbLayout);
        jPConfigBbLayout.setHorizontalGroup(
            jPConfigBbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConfigBbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConfigBbLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel56)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPConfigBbLayout.setVerticalGroup(
            jPConfigBbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConfigBbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPConfigCadUser.setBackground(new java.awt.Color(122, 131, 161));
        jPConfigCadUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPConfigCadUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPConfigCadUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPConfigCadUserMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPConfigCadUserMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPConfigCadUserMouseReleased(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("<html>Cadastrar usuário do<br />sistema</html>");

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/User_64x64.png"))); // NOI18N

        javax.swing.GroupLayout jPConfigCadUserLayout = new javax.swing.GroupLayout(jPConfigCadUser);
        jPConfigCadUser.setLayout(jPConfigCadUserLayout);
        jPConfigCadUserLayout.setHorizontalGroup(
            jPConfigCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConfigCadUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConfigCadUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel58)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPConfigCadUserLayout.setVerticalGroup(
            jPConfigCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConfigCadUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPConfigGerUser.setBackground(new java.awt.Color(122, 131, 161));
        jPConfigGerUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPConfigGerUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPConfigGerUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPConfigGerUserMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPConfigGerUserMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPConfigGerUserMouseReleased(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("<html>Gerenciar usuários do<br />sistema</html>");

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/people.png"))); // NOI18N

        javax.swing.GroupLayout jPConfigGerUserLayout = new javax.swing.GroupLayout(jPConfigGerUser);
        jPConfigGerUser.setLayout(jPConfigGerUserLayout);
        jPConfigGerUserLayout.setHorizontalGroup(
            jPConfigGerUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConfigGerUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConfigGerUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel60)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPConfigGerUserLayout.setVerticalGroup(
            jPConfigGerUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConfigGerUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPConfiguracoesLayout = new javax.swing.GroupLayout(jPConfiguracoes);
        jPConfiguracoes.setLayout(jPConfiguracoesLayout);
        jPConfiguracoesLayout.setHorizontalGroup(
            jPConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConfiguracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addGroup(jPConfiguracoesLayout.createSequentialGroup()
                        .addComponent(jPConfigBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPConfigCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPConfigGerUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPConfiguracoesLayout.setVerticalGroup(
            jPConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConfiguracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addGap(18, 18, 18)
                .addGroup(jPConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPConfigGerUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPConfigCadUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPConfigBb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(254, Short.MAX_VALUE))
        );

        jPMainPanels.add(jPConfiguracoes, "card7");

        jPRelatorios.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Relatórios");

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Acervo");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/emblem-library.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Leitor");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/user64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPRelatoriosLayout = new javax.swing.GroupLayout(jPRelatorios);
        jPRelatorios.setLayout(jPRelatoriosLayout);
        jPRelatoriosLayout.setHorizontalGroup(
            jPRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPRelatoriosLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPRelatoriosLayout.setVerticalGroup(
            jPRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        jPMainPanels.add(jPRelatorios, "card8");

        javax.swing.GroupLayout jPMainLayout = new javax.swing.GroupLayout(jPMain);
        jPMain.setLayout(jPMainLayout);
        jPMainLayout.setHorizontalGroup(
            jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPMainPanels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMainLayout.setVerticalGroup(
            jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPMainPanels, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLUsuario.setText("Usuário");
        jLUsuario.setMaximumSize(new java.awt.Dimension(45, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/icons/pack1/41.png"))); // NOI18N
        jButton1.setText("Opções");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPHeaderLayout = new javax.swing.GroupLayout(jPHeader);
        jPHeader.setLayout(jPHeaderLayout);
        jPHeaderLayout.setHorizontalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPHeaderLayout.setVerticalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPMenuAcervo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPMenuAcervo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuAcervoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuAcervoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMenuAcervoMousePressed(evt);
            }
        });

        jLMenuAcervo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/book.png"))); // NOI18N
        jLMenuAcervo.setText("Acervo");

        javax.swing.GroupLayout jPMenuAcervoLayout = new javax.swing.GroupLayout(jPMenuAcervo);
        jPMenuAcervo.setLayout(jPMenuAcervoLayout);
        jPMenuAcervoLayout.setHorizontalGroup(
            jPMenuAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuAcervoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuAcervo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMenuAcervoLayout.setVerticalGroup(
            jPMenuAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuAcervoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuAcervo)
                .addContainerGap())
        );

        jPMenuLeitor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPMenuLeitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuLeitorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuLeitorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMenuLeitorMousePressed(evt);
            }
        });

        jLMenuLeitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/user.png"))); // NOI18N
        jLMenuLeitor.setText("Leitor");

        javax.swing.GroupLayout jPMenuLeitorLayout = new javax.swing.GroupLayout(jPMenuLeitor);
        jPMenuLeitor.setLayout(jPMenuLeitorLayout);
        jPMenuLeitorLayout.setHorizontalGroup(
            jPMenuLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLeitorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuLeitor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMenuLeitorLayout.setVerticalGroup(
            jPMenuLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLeitorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuLeitor)
                .addContainerGap())
        );

        jPMenuPreferencias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPMenuPreferencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuPreferenciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuPreferenciasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMenuPreferenciasMousePressed(evt);
            }
        });

        jLMenuPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/1352991321_advancedsettings.png"))); // NOI18N
        jLMenuPreferencias.setText("Preferências");

        javax.swing.GroupLayout jPMenuPreferenciasLayout = new javax.swing.GroupLayout(jPMenuPreferencias);
        jPMenuPreferencias.setLayout(jPMenuPreferenciasLayout);
        jPMenuPreferenciasLayout.setHorizontalGroup(
            jPMenuPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuPreferenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuPreferencias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMenuPreferenciasLayout.setVerticalGroup(
            jPMenuPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuPreferenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuPreferencias)
                .addContainerGap())
        );

        jPMenuMovimentacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPMenuMovimentacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuMovimentacoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuMovimentacoesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMenuMovimentacoesMousePressed(evt);
            }
        });

        jLMenuMovimentacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/1352989534_exchange32.png"))); // NOI18N
        jLMenuMovimentacoes.setText("Movimentações");

        javax.swing.GroupLayout jPMenuMovimentacoesLayout = new javax.swing.GroupLayout(jPMenuMovimentacoes);
        jPMenuMovimentacoes.setLayout(jPMenuMovimentacoesLayout);
        jPMenuMovimentacoesLayout.setHorizontalGroup(
            jPMenuMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuMovimentacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuMovimentacoes)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPMenuMovimentacoesLayout.setVerticalGroup(
            jPMenuMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuMovimentacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuMovimentacoes)
                .addContainerGap())
        );

        jPMenuConfiguracoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPMenuConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuConfiguracoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuConfiguracoesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMenuConfiguracoesMousePressed(evt);
            }
        });

        jLMenuConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/system-config-boot.png"))); // NOI18N
        jLMenuConfiguracoes.setText("Configurações");

        javax.swing.GroupLayout jPMenuConfiguracoesLayout = new javax.swing.GroupLayout(jPMenuConfiguracoes);
        jPMenuConfiguracoes.setLayout(jPMenuConfiguracoesLayout);
        jPMenuConfiguracoesLayout.setHorizontalGroup(
            jPMenuConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuConfiguracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuConfiguracoes)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPMenuConfiguracoesLayout.setVerticalGroup(
            jPMenuConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuConfiguracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuConfiguracoes)
                .addContainerGap())
        );

        jPMenuInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPMenuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuInicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMenuInicioMousePressed(evt);
            }
        });

        jLMenuInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/1352989628_home32.png"))); // NOI18N
        jLMenuInicio.setText("Início");

        javax.swing.GroupLayout jPMenuInicioLayout = new javax.swing.GroupLayout(jPMenuInicio);
        jPMenuInicio.setLayout(jPMenuInicioLayout);
        jPMenuInicioLayout.setHorizontalGroup(
            jPMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMenuInicioLayout.setVerticalGroup(
            jPMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuInicio)
                .addContainerGap())
        );

        jPMenuRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPMenuRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuRelatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuRelatoriosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPMenuRelatoriosMousePressed(evt);
            }
        });

        jLMenuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jlibrary/images/report32.png"))); // NOI18N
        jLMenuRelatorios.setText("Relatórios");

        javax.swing.GroupLayout jPMenuRelatoriosLayout = new javax.swing.GroupLayout(jPMenuRelatorios);
        jPMenuRelatorios.setLayout(jPMenuRelatoriosLayout);
        jPMenuRelatoriosLayout.setHorizontalGroup(
            jPMenuRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuRelatorios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMenuRelatoriosLayout.setVerticalGroup(
            jPMenuRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenuRelatorios)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMenuMovimentacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPMenuPreferencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPMenuLeitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPMenuAcervo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPMenuConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPMenuInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPMenuRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPMenuInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPMenuAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPMenuLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPMenuMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPMenuRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPMenuPreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPMenuConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPMOpcoes.show(jButton1, 0, jButton1.getHeight());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        new JFLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        new JDEditUsuario(this, Global.login).showDialog();
        atualizaConta();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        new JDEditUsuario(this, Global.login).showDialog(1);
        atualizaConta();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jPMenuInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuInicioMouseEntered
        jPMenuInicio.setBackground(COLOR_ENTERED);
    }//GEN-LAST:event_jPMenuInicioMouseEntered

    private void jPMenuInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuInicioMouseExited
        if (menuClicked != jPMenuInicio) {
            jPMenuInicio.setBackground(COLOR_DEFAULT);
        }
    }//GEN-LAST:event_jPMenuInicioMouseExited

    private void jPMenuInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuInicioMousePressed
        CardLayout cl = (CardLayout) jPMainPanels.getLayout();
        cl.show(jPMainPanels, "card5");
        if (menuClicked != jPMenuInicio) {
            menuClicked.setBackground(COLOR_DEFAULT);
        }
        menuClicked = jPMenuInicio;
    }//GEN-LAST:event_jPMenuInicioMousePressed

    private void jPMenuAcervoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuAcervoMouseEntered
        jPMenuAcervo.setBackground(COLOR_ENTERED);
    }//GEN-LAST:event_jPMenuAcervoMouseEntered

    private void jPMenuAcervoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuAcervoMouseExited
        if (menuClicked != jPMenuAcervo) {
            jPMenuAcervo.setBackground(COLOR_DEFAULT);
        }
    }//GEN-LAST:event_jPMenuAcervoMouseExited

    private void jPMenuAcervoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuAcervoMousePressed
        CardLayout cl = (CardLayout) jPMainPanels.getLayout();
        cl.show(jPMainPanels, "card2");
        if (menuClicked != jPMenuAcervo) {
            menuClicked.setBackground(COLOR_DEFAULT);
        }
        menuClicked = jPMenuAcervo;
    }//GEN-LAST:event_jPMenuAcervoMousePressed

    private void jPMenuLeitorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuLeitorMouseEntered
        jPMenuLeitor.setBackground(COLOR_ENTERED);
    }//GEN-LAST:event_jPMenuLeitorMouseEntered

    private void jPMenuLeitorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuLeitorMouseExited
        if (menuClicked != jPMenuLeitor) {
            jPMenuLeitor.setBackground(COLOR_DEFAULT);
        }
    }//GEN-LAST:event_jPMenuLeitorMouseExited

    private void jPMenuLeitorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuLeitorMousePressed
        CardLayout cl = (CardLayout) jPMainPanels.getLayout();
        cl.show(jPMainPanels, "card3");
        if (menuClicked != jPMenuLeitor) {
            menuClicked.setBackground(COLOR_DEFAULT);
        }
        menuClicked = jPMenuLeitor;
    }//GEN-LAST:event_jPMenuLeitorMousePressed

    private void jPMenuMovimentacoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuMovimentacoesMouseEntered
        jPMenuMovimentacoes.setBackground(COLOR_ENTERED);
    }//GEN-LAST:event_jPMenuMovimentacoesMouseEntered

    private void jPMenuMovimentacoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuMovimentacoesMouseExited
        if (menuClicked != jPMenuMovimentacoes) {
            jPMenuMovimentacoes.setBackground(COLOR_DEFAULT);
        }
    }//GEN-LAST:event_jPMenuMovimentacoesMouseExited

    private void jPMenuMovimentacoesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuMovimentacoesMousePressed
        CardLayout cl = (CardLayout) jPMainPanels.getLayout();
        cl.show(jPMainPanels, "card4");
        if (menuClicked != jPMenuMovimentacoes) {
            menuClicked.setBackground(COLOR_DEFAULT);
        }
        menuClicked = jPMenuMovimentacoes;
    }//GEN-LAST:event_jPMenuMovimentacoesMousePressed

    private void jPMenuPreferenciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuPreferenciasMouseEntered
        jPMenuPreferencias.setBackground(COLOR_ENTERED);
    }//GEN-LAST:event_jPMenuPreferenciasMouseEntered

    private void jPMenuPreferenciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuPreferenciasMouseExited
        if (menuClicked != jPMenuPreferencias) {
            jPMenuPreferencias.setBackground(COLOR_DEFAULT);
        }
    }//GEN-LAST:event_jPMenuPreferenciasMouseExited

    private void jPMenuPreferenciasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuPreferenciasMousePressed
        CardLayout cl = (CardLayout) jPMainPanels.getLayout();
        cl.show(jPMainPanels, "card6");
        if (menuClicked != jPMenuPreferencias) {
            menuClicked.setBackground(COLOR_DEFAULT);
        }
        menuClicked = jPMenuPreferencias;
    }//GEN-LAST:event_jPMenuPreferenciasMousePressed

    private void jPMenuConfiguracoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuConfiguracoesMouseEntered
        jPMenuConfiguracoes.setBackground(COLOR_ENTERED);
    }//GEN-LAST:event_jPMenuConfiguracoesMouseEntered

    private void jPMenuConfiguracoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuConfiguracoesMouseExited
        if (menuClicked != jPMenuConfiguracoes) {
            jPMenuConfiguracoes.setBackground(COLOR_DEFAULT);
        }
    }//GEN-LAST:event_jPMenuConfiguracoesMouseExited

    private void jPMenuConfiguracoesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuConfiguracoesMousePressed
        CardLayout cl = (CardLayout) jPMainPanels.getLayout();
        cl.show(jPMainPanels, "card7");
        if (menuClicked != jPMenuConfiguracoes) {
            menuClicked.setBackground(COLOR_DEFAULT);
        }
        menuClicked = jPMenuConfiguracoes;
    }//GEN-LAST:event_jPMenuConfiguracoesMousePressed

    private void jPGerAcervoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPGerAcervoMouseClicked
        new JDGerAcervo(this, 0).setVisible(true);
        atualizaEstatisticas();
    }//GEN-LAST:event_jPGerAcervoMouseClicked

    private void jPGerAcervoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPGerAcervoMouseEntered
        jPGerAcervo.setBackground(new Color(15, 15, 255));
    }//GEN-LAST:event_jPGerAcervoMouseEntered

    private void jPGerAcervoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPGerAcervoMousePressed
        jPGerAcervo.setBackground(new Color(0, 51, 255));
    }//GEN-LAST:event_jPGerAcervoMousePressed

    private void jPGerAcervoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPGerAcervoMouseReleased
        jPGerAcervo.setBackground(new Color(27, 72, 255));
    }//GEN-LAST:event_jPGerAcervoMouseReleased

    private void jPGerAcervoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPGerAcervoMouseExited
        jPGerAcervo.setBackground(new Color(27, 72, 255));
    }//GEN-LAST:event_jPGerAcervoMouseExited

    private void jPCadItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadItemMouseClicked
        new JDCadItem(this).setVisible(true);
        atualizaEstatisticas("item");
    }//GEN-LAST:event_jPCadItemMouseClicked

    private void jPCadItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadItemMouseEntered
        jPCadItem.setBackground(new Color(15, 15, 255));
    }//GEN-LAST:event_jPCadItemMouseEntered

    private void jPCadItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadItemMouseExited
        jPCadItem.setBackground(new Color(27, 72, 255));
    }//GEN-LAST:event_jPCadItemMouseExited

    private void jPCadItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadItemMousePressed
        jPCadItem.setBackground(new Color(0, 51, 255));
    }//GEN-LAST:event_jPCadItemMousePressed

    private void jPCadItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadItemMouseReleased
        jPCadItem.setBackground(new Color(27, 72, 255));
    }//GEN-LAST:event_jPCadItemMouseReleased

    private void jPCadAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadAutorMouseClicked
        new JDCadAutor(this).setVisible(true);
        atualizaEstatisticas("autor");
    }//GEN-LAST:event_jPCadAutorMouseClicked

    private void jPCadAutorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadAutorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadAutorMouseEntered

    private void jPCadAutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadAutorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadAutorMouseExited

    private void jPCadAutorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadAutorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadAutorMousePressed

    private void jPCadAutorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadAutorMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadAutorMouseReleased

    private void jPCadEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadEditoraMouseClicked
        new JDCadEditora(this).setVisible(true);
        atualizaEstatisticas("editora");
    }//GEN-LAST:event_jPCadEditoraMouseClicked

    private void jPCadEditoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadEditoraMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadEditoraMouseEntered

    private void jPCadEditoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadEditoraMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadEditoraMouseExited

    private void jPCadEditoraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadEditoraMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadEditoraMousePressed

    private void jPCadEditoraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadEditoraMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadEditoraMouseReleased

    private void jPCadClassifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadClassifMouseClicked
        new JDCadClassif(this).setVisible(true);
        atualizaEstatisticas("classi");
    }//GEN-LAST:event_jPCadClassifMouseClicked

    private void jPCadClassifMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadClassifMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadClassifMouseEntered

    private void jPCadClassifMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadClassifMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadClassifMouseExited

    private void jPCadClassifMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadClassifMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadClassifMousePressed

    private void jPCadClassifMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadClassifMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadClassifMouseReleased

    private void jPCadTipoItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadTipoItemMouseClicked
        new JDCadTipoItem(this).setVisible(true);
    }//GEN-LAST:event_jPCadTipoItemMouseClicked

    private void jPCadTipoItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadTipoItemMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadTipoItemMouseEntered

    private void jPCadTipoItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadTipoItemMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadTipoItemMouseExited

    private void jPCadTipoItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadTipoItemMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadTipoItemMousePressed

    private void jPCadTipoItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadTipoItemMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadTipoItemMouseReleased

    private void jPGerLeitoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPGerLeitoresMouseClicked
        new JDGerLeitor(this).setVisible(true);
        atualizaEstatisticas();
    }//GEN-LAST:event_jPGerLeitoresMouseClicked

    private void jPGerLeitoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPGerLeitoresMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPGerLeitoresMouseEntered

    private void jPGerLeitoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPGerLeitoresMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPGerLeitoresMouseExited

    private void jPGerLeitoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPGerLeitoresMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPGerLeitoresMouseMoved

    private void jPCadLeirorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadLeirorMouseClicked
        new JDCadLeitor(this).setVisible(true);
        atualizaEstatisticas("leitor");
    }//GEN-LAST:event_jPCadLeirorMouseClicked

    private void jPCadLeirorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadLeirorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadLeirorMouseEntered

    private void jPCadLeirorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadLeirorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadLeirorMouseExited

    private void jPCadLeirorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadLeirorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadLeirorMousePressed

    private void jPCadLeirorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadLeirorMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadLeirorMouseReleased

    private void jPCadSerieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadSerieMouseClicked
        new JDCadSerie(this).setVisible(true);
        atualizaEstatisticas("serie");
    }//GEN-LAST:event_jPCadSerieMouseClicked

    private void jPCadSerieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadSerieMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadSerieMouseEntered

    private void jPCadSerieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadSerieMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadSerieMouseExited

    private void jPCadSerieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadSerieMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadSerieMousePressed

    private void jPCadSerieMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadSerieMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadSerieMouseReleased

    private void jPCadTurnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadTurnoMouseClicked
        new JDCadTurno(this).setVisible(true);
        atualizaEstatisticas("turno");
    }//GEN-LAST:event_jPCadTurnoMouseClicked

    private void jPCadTurnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadTurnoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadTurnoMouseEntered

    private void jPCadTurnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadTurnoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadTurnoMouseExited

    private void jPCadTurnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadTurnoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadTurnoMousePressed

    private void jPCadTurnoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadTurnoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadTurnoMouseReleased

    private void jPMovNovoEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovoEmpMouseClicked
        new JDCadEmprestimo(this).setVisible(true);
    }//GEN-LAST:event_jPMovNovoEmpMouseClicked

    private void jPMovNovoEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovoEmpMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovoEmpMouseEntered

    private void jPMovNovoEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovoEmpMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovoEmpMouseExited

    private void jPMovNovoEmpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovoEmpMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovoEmpMousePressed

    private void jPMovNovoEmpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovoEmpMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovoEmpMouseReleased

    private void jPMovNovaDevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovaDevMouseClicked
        new JDCadDevolucao(this).setVisible(true);
    }//GEN-LAST:event_jPMovNovaDevMouseClicked

    private void jPMovNovaDevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovaDevMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovaDevMouseEntered

    private void jPMovNovaDevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovaDevMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovaDevMouseExited

    private void jPMovNovaDevMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovaDevMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovaDevMousePressed

    private void jPMovNovaDevMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovaDevMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovaDevMouseReleased

    private void jPMovEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovEstMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovEstMouseClicked

    private void jPMovEstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovEstMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovEstMouseEntered

    private void jPMovEstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovEstMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovEstMouseExited

    private void jPMovEstMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovEstMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovEstMousePressed

    private void jPMovEstMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovEstMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovEstMouseReleased

    private void jPMovHistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovHistMouseClicked
        new JDHistMov(this).setVisible(true);
    }//GEN-LAST:event_jPMovHistMouseClicked

    private void jPMovHistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovHistMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovHistMouseEntered

    private void jPMovHistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovHistMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovHistMouseExited

    private void jPMovHistMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovHistMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovHistMousePressed

    private void jPMovHistMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovHistMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovHistMouseReleased

    private void jPPrefOtmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPrefOtmMouseClicked
        new JDOtimPreenchForm(this, true).setVisible(true);
    }//GEN-LAST:event_jPPrefOtmMouseClicked

    private void jPPrefOtmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPrefOtmMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPPrefOtmMouseEntered

    private void jPPrefOtmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPrefOtmMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPPrefOtmMouseExited

    private void jPPrefOtmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPrefOtmMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPPrefOtmMousePressed

    private void jPPrefOtmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPrefOtmMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPPrefOtmMouseReleased

    private void jPPrefAparenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPrefAparenciaMouseClicked
        new JDSelSkin(this).setVisible(true);
    }//GEN-LAST:event_jPPrefAparenciaMouseClicked

    private void jPPrefAparenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPrefAparenciaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPPrefAparenciaMouseEntered

    private void jPPrefAparenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPrefAparenciaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPPrefAparenciaMouseExited

    private void jPPrefAparenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPrefAparenciaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPPrefAparenciaMousePressed

    private void jPPrefAparenciaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPrefAparenciaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPPrefAparenciaMouseReleased

    private void jPConfigBbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigBbMouseClicked
        new JDConfigBD(this).setVisible(true);
    }//GEN-LAST:event_jPConfigBbMouseClicked

    private void jPConfigBbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigBbMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPConfigBbMouseEntered

    private void jPConfigBbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigBbMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPConfigBbMouseExited

    private void jPConfigBbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigBbMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPConfigBbMousePressed

    private void jPConfigBbMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigBbMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPConfigBbMouseReleased

    private void jPConfigCadUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigCadUserMouseClicked
        new JDCadUsuario(this).setVisible(true);
    }//GEN-LAST:event_jPConfigCadUserMouseClicked

    private void jPConfigCadUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigCadUserMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPConfigCadUserMouseEntered

    private void jPConfigCadUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigCadUserMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPConfigCadUserMouseExited

    private void jPConfigCadUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigCadUserMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPConfigCadUserMousePressed

    private void jPConfigCadUserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigCadUserMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPConfigCadUserMouseReleased

    private void jPConfigGerUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigGerUserMouseClicked
        new JDGerUsuario(this).setVisible(true);
        atualizaConta();
    }//GEN-LAST:event_jPConfigGerUserMouseClicked

    private void jPConfigGerUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigGerUserMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPConfigGerUserMouseEntered

    private void jPConfigGerUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigGerUserMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPConfigGerUserMouseExited

    private void jPConfigGerUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigGerUserMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPConfigGerUserMousePressed

    private void jPConfigGerUserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPConfigGerUserMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPConfigGerUserMouseReleased

    private void jPMovNovaResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovaResMouseClicked
        new JDCadReserva(this).setVisible(true);
        atualizaEstatisticas();
    }//GEN-LAST:event_jPMovNovaResMouseClicked

    private void jPMovNovaResMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovaResMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovaResMouseEntered

    private void jPMovNovaResMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovaResMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovaResMouseExited

    private void jPMovNovaResMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovaResMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovaResMousePressed

    private void jPMovNovaResMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovaResMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovaResMouseReleased

    private void jPMovGerResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovGerResMouseClicked
        new JDGerReserva(this).setVisible(true);
        atualizaEstatisticas();
    }//GEN-LAST:event_jPMovGerResMouseClicked

    private void jPMovGerResMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovGerResMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovGerResMouseEntered

    private void jPMovGerResMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovGerResMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovGerResMouseExited

    private void jPMovGerResMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovGerResMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovGerResMousePressed

    private void jPMovGerResMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovGerResMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovGerResMouseReleased

    private void jPMenuRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuRelatoriosMouseEntered
        jPMenuRelatorios.setBackground(COLOR_ENTERED);
    }//GEN-LAST:event_jPMenuRelatoriosMouseEntered

    private void jPMenuRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuRelatoriosMouseExited
        if (menuClicked != jPMenuRelatorios) {
            jPMenuRelatorios.setBackground(COLOR_DEFAULT);
        }
    }//GEN-LAST:event_jPMenuRelatoriosMouseExited

    private void jPMenuRelatoriosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuRelatoriosMousePressed
        CardLayout cl = (CardLayout) jPMainPanels.getLayout();
        cl.show(jPMainPanels, "card8");
        if (menuClicked != jPMenuRelatorios) {
            menuClicked.setBackground(COLOR_DEFAULT);
        }
        menuClicked = jPMenuRelatorios;
    }//GEN-LAST:event_jPMenuRelatoriosMousePressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        new JDRepAcervo(this).setVisible(true);
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        new JDRepLeitor(this).setVisible(true);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseReleased

    private void jPCadItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadItem1MouseClicked

    private void jPCadItem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadItem1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadItem1MouseEntered

    private void jPCadItem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadItem1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadItem1MouseExited

    private void jPCadItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadItem1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadItem1MousePressed

    private void jPCadItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadItem1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadItem1MouseReleased

    private void jPCadLeiror1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadLeiror1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadLeiror1MouseClicked

    private void jPCadLeiror1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadLeiror1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadLeiror1MouseEntered

    private void jPCadLeiror1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadLeiror1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadLeiror1MouseExited

    private void jPCadLeiror1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadLeiror1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadLeiror1MousePressed

    private void jPCadLeiror1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadLeiror1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPCadLeiror1MouseReleased

    private void jPMovNovoEmp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovoEmp1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovoEmp1MouseClicked

    private void jPMovNovoEmp1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovoEmp1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovoEmp1MouseEntered

    private void jPMovNovoEmp1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovoEmp1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovoEmp1MouseExited

    private void jPMovNovoEmp1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovoEmp1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovoEmp1MousePressed

    private void jPMovNovoEmp1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMovNovoEmp1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPMovNovoEmp1MouseReleased

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        new JDAtrasados(this, true).setVisible(true);
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        new JDRenovar(this).setVisible(true);
        getEmpAtrasado();
    }//GEN-LAST:event_jPanel4MousePressed

    private void setfont() {
        Fontes f = new Fontes();
        JLabel[] vetor;

        f.setFont(jLUsuario, "Roboto-Light.ttf", 18);

        vetor = new JLabel[]{jLMenuAcervo, jLMenuConfiguracoes, jLMenuInicio,
            jLMenuLeitor, jLMenuMovimentacoes, jLMenuPreferencias, jLMenuRelatorios};
        f.setFont(vetor, "SegoeUI.ttf", 18);

        vetor = new JLabel[]{jLTituloInicio, jLTituloAcervo, jLTituloLeitor,
            jLTituloMovimentacoes};
        f.setFont(vetor, "SegoeUI.ttf", 24);
    }

    private void atualizaConta() {
        Login l = new Login();
        LoginDao loginDao = new LoginDao();
        try {
            l = loginDao.select(Global.login.getIdLogin());
        } catch (SQLException ex) {
        }

        Global.login = l;
        jLUsuario.setText(Global.login.getNome());
        ImageIcon imagem = new ImageIcon(getClass().getResource("/jlibrary/images/user/" + Global.login.getImg()));
        jLUsuario.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(50, 50, 100)));
    }

    private void atualizaEstatisticas() {
        try {
            AutorDao autorDao = new AutorDao();
            ClassifLitDao classLitDao = new ClassifLitDao();
            ControleDao contDao = new ControleDao();
            DevolucaoDao devDao = new DevolucaoDao();
            EditoraDao editoraDao = new EditoraDao();
            ItemDao itemDao = new ItemDao();
            LeitorDao leitorDao = new LeitorDao();
            ReservaDao reservaDao = new ReservaDao();
            SerieDao serieDao = new SerieDao();
            TurnoDao turnoDao = new TurnoDao();

            jLEstAutores.setText("Autores: " + autorDao.cont());
            jLEstClassif.setText("Classif. Literárias: " + classLitDao.cont());
            jLEstEditoras.setText("Editoras: " + editoraDao.cont());
            jLEstItens.setText("Itens: " + itemDao.cont());
            jLEstLeitores.setText("Leitores: " + leitorDao.cont());
            jLEstSeries.setText("Séries: " + serieDao.cont());
            jLEstTurnos.setText("Turnos: " + turnoDao.cont());
            jLEstEmp.setText("Emprestados: " + contDao.countEmp());
            jLEstTotalEmp.setText("Total emp.: " + contDao.countTotalEmp());
            jLEstReserva.setText("Reservas: " + reservaDao.cont());
            jLIniEstAutores.setText("Autores: " + autorDao.cont());
            jLIniEstClassif.setText("Classif. Literárias: " + classLitDao.cont());
            jLIniEstEditoras.setText("Editoras: " + editoraDao.cont());
            jLIniEstItens.setText("Itens: " + itemDao.cont());
            jLIniEstLeitores.setText("Leitores: " + leitorDao.cont());
            jLIniEstSeries.setText("Séries: " + serieDao.cont());
            jLIniEstTurnos.setText("Turnos: " + turnoDao.cont());
            jLIniEstEmp.setText("Emprestados: " + contDao.countEmp());
            jLIniTotalEmp.setText("Total emp.: " + contDao.countTotalEmp());
            jLIniEstReserva.setText("Reservas: " + reservaDao.cont());

        } catch (SQLException ex) {
        }
    }

    private void atualizaEstatisticas(String tab) {
        int qtd;
        try {
            if (tab.equals("autor")) {
                qtd = new AutorDao().cont();
                jLEstAutores.setText("Autores: " + qtd);
                jLIniEstAutores.setText("Autores: " + qtd);
            } else if (tab.equals("classif")) {
                qtd = new ClassifLitDao().cont();
                jLEstClassif.setText("Classif. Literárias: " + qtd);
                jLIniEstClassif.setText("Classif. Literárias: " + qtd);
            } else if (tab.equals("editora")) {
                qtd = new EditoraDao().cont();
                jLEstEditoras.setText("Editoras: " + qtd);
                jLIniEstEditoras.setText("Editoras: " + qtd);
            } else if (tab.equals("item")) {
                qtd = new ItemDao().cont();
                jLEstItens.setText("Itens: " + qtd);
                jLIniEstItens.setText("Itens: " + qtd);
            } else if (tab.equals("leitor")) {
                qtd = new LeitorDao().cont();
                jLEstLeitores.setText("Leitores: " + qtd);
                jLIniEstLeitores.setText("Leitores: " + qtd);
            } else if (tab.equals("serie")) {
                qtd = new SerieDao().cont();
                jLEstSeries.setText("Séries: " + qtd);
                jLIniEstSeries.setText("Séries: " + qtd);
            } else if (tab.equals("turno")) {
                qtd = new TurnoDao().cont();
                jLEstTurnos.setText("Turnos: " + qtd);
                jLIniEstTurnos.setText("Turnos: " + qtd);
            }
        } catch (SQLException ex) {
        }
    }
    
    public void getEmpAtrasado(){
        ControleDao controleDao = new ControleDao();
        try {
            int cont = controleDao.empAtrasado();
            jLEmpAtrasado.setText(String.valueOf(cont));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFMain_Testes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMain_Testes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMain_Testes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMain_Testes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMain_Testes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLEmpAtrasado;
    private javax.swing.JLabel jLEstAutores;
    private javax.swing.JLabel jLEstClassif;
    private javax.swing.JLabel jLEstEditoras;
    private javax.swing.JLabel jLEstEmp;
    private javax.swing.JLabel jLEstItens;
    private javax.swing.JLabel jLEstLeitores;
    private javax.swing.JLabel jLEstReserva;
    private javax.swing.JLabel jLEstSeries;
    private javax.swing.JLabel jLEstTotalEmp;
    private javax.swing.JLabel jLEstTurnos;
    private javax.swing.JLabel jLIniEstAutores;
    private javax.swing.JLabel jLIniEstClassif;
    private javax.swing.JLabel jLIniEstEditoras;
    private javax.swing.JLabel jLIniEstEmp;
    private javax.swing.JLabel jLIniEstItens;
    private javax.swing.JLabel jLIniEstLeitores;
    private javax.swing.JLabel jLIniEstReserva;
    private javax.swing.JLabel jLIniEstSeries;
    private javax.swing.JLabel jLIniEstTurnos;
    private javax.swing.JLabel jLIniTotalEmp;
    private javax.swing.JLabel jLMenuAcervo;
    private javax.swing.JLabel jLMenuConfiguracoes;
    private javax.swing.JLabel jLMenuInicio;
    private javax.swing.JLabel jLMenuLeitor;
    private javax.swing.JLabel jLMenuMovimentacoes;
    private javax.swing.JLabel jLMenuPreferencias;
    private javax.swing.JLabel jLMenuRelatorios;
    private javax.swing.JLabel jLTituloAcervo;
    private javax.swing.JLabel jLTituloInicio;
    private javax.swing.JLabel jLTituloLeitor;
    private javax.swing.JLabel jLTituloMovimentacoes;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JPanel jPAcervo;
    private javax.swing.JPanel jPAcervoEst;
    private javax.swing.JPanel jPCadAutor;
    private javax.swing.JPanel jPCadClassif;
    private javax.swing.JPanel jPCadEditora;
    private javax.swing.JPanel jPCadItem;
    private javax.swing.JPanel jPCadItem1;
    private javax.swing.JPanel jPCadLeiror;
    private javax.swing.JPanel jPCadLeiror1;
    private javax.swing.JPanel jPCadSerie;
    private javax.swing.JPanel jPCadTipoItem;
    private javax.swing.JPanel jPCadTurno;
    private javax.swing.JPanel jPConfigBb;
    private javax.swing.JPanel jPConfigCadUser;
    private javax.swing.JPanel jPConfigGerUser;
    private javax.swing.JPanel jPConfiguracoes;
    private javax.swing.JPanel jPGerAcervo;
    private javax.swing.JPanel jPGerLeitores;
    private javax.swing.JPanel jPHeader;
    private javax.swing.JPanel jPIniEstAcervo;
    private javax.swing.JPanel jPIniEstLeitor;
    private javax.swing.JPanel jPIniEstMov;
    private javax.swing.JPanel jPInicio;
    private javax.swing.JPanel jPLeitor;
    private javax.swing.JPanel jPLeitorEst;
    private javax.swing.JPopupMenu jPMOpcoes;
    private javax.swing.JPanel jPMain;
    private javax.swing.JPanel jPMainPanels;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPMenuAcervo;
    private javax.swing.JPanel jPMenuConfiguracoes;
    private javax.swing.JPanel jPMenuInicio;
    private javax.swing.JPanel jPMenuLeitor;
    private javax.swing.JPanel jPMenuMovimentacoes;
    private javax.swing.JPanel jPMenuPreferencias;
    private javax.swing.JPanel jPMenuRelatorios;
    private javax.swing.JPanel jPMovEst;
    private javax.swing.JPanel jPMovGerRes;
    private javax.swing.JPanel jPMovHist;
    private javax.swing.JPanel jPMovNovaDev;
    private javax.swing.JPanel jPMovNovaRes;
    private javax.swing.JPanel jPMovNovoEmp;
    private javax.swing.JPanel jPMovNovoEmp1;
    private javax.swing.JPanel jPMovimentacoes;
    private javax.swing.JPanel jPPrefAparencia;
    private javax.swing.JPanel jPPrefOtm;
    private javax.swing.JPanel jPPreferencias;
    private javax.swing.JPanel jPRelatorios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
