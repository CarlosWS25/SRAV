/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.srav;

import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import java.io.*;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * A classe UI representa a interface gráfica principal do sistema InfinityJet.
 * Ela é responsável por gerenciar as diversas funcionalidades oferecidas pelo sistema.
 * Nesta implementação, a classe utiliza o padrão Singleton para garantir apenas uma instância
 * da interface durante a execução do programa.
 * Além disso, são realizadas configurações iniciais, como carregamento de dados, definição de propriedades visuais,
 * e ocultação de painéis não utilizados no início.
 *
 * Autores: Carlos Rodrigues, João Pedro Andrade, Pedro Vicente
 *
 * @author carlo
 */
public class UI extends javax.swing.JFrame implements Serializable {
    
    // Código para acesso a funcionalidades dos administradores
    char[] adminCode = {'2', '8', '0', '0'};
    
    // Instância única da classe UI
    private static UI instance;
    
    // Armazenamento de dados central do sistema
    private DataStorage dataStorage;
    
    /**
     * Construtor privado para garantir o Singleton e realizar configurações iniciais.
     */
    private UI() {
        initComponents();
        dataStorage = new DataStorage();
        loadDataFromFile();
        setResizable(false);
        setTitle("InfinityJet");
        MainRightPanel.setVisible(false);
        MainLeftPanel.setVisible(false);
        VindaPanel.setVisible(false);
        PartidaPanel.setVisible(false);
        UserPanel.setVisible(false);
        AdminUserPanel.setVisible(false);
        AdminLeftPanel.setVisible(false);
        AdminRightPanel.setVisible(false);
        AdminPartirLisboa.setVisible(false);
        AdminAteLisboa.setVisible(false);
        EstatisticaPanel.setVisible(false);
        EscolherDataPanel.setVisible(false);
        GestorClientes.setVisible(false);
        RelatorioDeCompra.setVisible(false);
        PagamentoPanel.setVisible(false);
        addDadosFinaisTabelaVoos();
        addClientesdaListaATabela(dataStorage.getListaDeClientes());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WelcomePanel = new javax.swing.JPanel();
        EntrarButton = new javax.swing.JButton();
        bemvindoLabel1 = new javax.swing.JLabel();
        WelcomeSublinhado = new javax.swing.JLabel();
        LogoWelcome = new javax.swing.JLabel();
        MiniLogoPanel = new javax.swing.JPanel();
        MiniLogo_AdminUser = new javax.swing.JLabel();
        AdminUserPanel = new javax.swing.JPanel();
        AdminButton = new javax.swing.JButton();
        UserButton = new javax.swing.JButton();
        AdminUserTitulo = new javax.swing.JLabel();
        AdminUserTitulo2 = new javax.swing.JLabel();
        AdminUserSublinhado = new javax.swing.JLabel();
        Back_AdminUser = new javax.swing.JButton();
        MainLeftPanel = new javax.swing.JPanel();
        abaRegistoButton = new javax.swing.JButton();
        abaLoginButton = new javax.swing.JButton();
        VoltarButton1 = new javax.swing.JButton();
        bemvindoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MainRightPanel = new javax.swing.JTabbedPane();
        registoPanel = new javax.swing.JPanel();
        registoTituloR = new javax.swing.JLabel();
        nomeLabelR = new javax.swing.JLabel();
        passLabelR = new javax.swing.JLabel();
        ConfirmarPassLabelR = new javax.swing.JLabel();
        nifLabelR = new javax.swing.JLabel();
        nomeEntryR = new javax.swing.JTextField();
        passEntryR = new javax.swing.JPasswordField();
        RegistarButton = new javax.swing.JButton();
        AdminCodeEntryR = new javax.swing.JPasswordField();
        ConfirmarPassEntryR = new javax.swing.JPasswordField();
        loginPanel = new javax.swing.JPanel();
        loginTitulo = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        passEntry = new javax.swing.JPasswordField();
        userEntry = new javax.swing.JFormattedTextField();
        loginButton = new javax.swing.JButton();
        AdminRightPanel = new javax.swing.JTabbedPane();
        CriarPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ApartirButtonAdmin = new javax.swing.JButton();
        AteButtonAdmin = new javax.swing.JButton();
        LinhaAdminCriar = new javax.swing.JLabel();
        AdminPartirLisboa = new javax.swing.JPanel();
        ApartirLisboaLabel = new javax.swing.JLabel();
        ApartirSublinhado = new javax.swing.JLabel();
        ApartirPartidaLabel = new javax.swing.JLabel();
        ApartirDestinoLabel = new javax.swing.JLabel();
        ApartirDataVooLabel = new javax.swing.JLabel();
        ApartirPaisesCombo = new javax.swing.JComboBox<>();
        ApartirConfirmarButton = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        AdminAteLisboa = new javax.swing.JPanel();
        AteLisboaLabel = new javax.swing.JLabel();
        AteSublinhado = new javax.swing.JLabel();
        AtePartidaLabel = new javax.swing.JLabel();
        AteDestinoLabel = new javax.swing.JLabel();
        AteDataVooLabel = new javax.swing.JLabel();
        AtePaisesCombo = new javax.swing.JComboBox<>();
        AteConfirmarButton = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        AdminLeftPanel = new javax.swing.JPanel();
        bemvindoLabel3 = new javax.swing.JLabel();
        AdminSublinhado = new javax.swing.JLabel();
        CriarButton = new javax.swing.JButton();
        EstatisticaButton = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        GerirClientesButton = new javax.swing.JButton();
        EstatisticaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVoosAdmin = new javax.swing.JTable();
        EstatisticaVoltar = new javax.swing.JButton();
        deleteVooButton = new javax.swing.JButton();
        TabelaVoosLabel = new javax.swing.JLabel();
        TabelaSublinhado = new javax.swing.JLabel();
        GestorClientes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaClientesAdmin = new javax.swing.JTable();
        ListaClientesLabel = new javax.swing.JLabel();
        ListaClientesSublinhado = new javax.swing.JLabel();
        VoltarGestorClientes = new javax.swing.JButton();
        ApagarClientes = new javax.swing.JButton();
        UserPanel = new javax.swing.JPanel();
        PartidaButton = new javax.swing.JButton();
        VindaButton = new javax.swing.JButton();
        bemvindoLabel2 = new javax.swing.JLabel();
        Linha_User = new javax.swing.JLabel();
        MiniLogo_User = new javax.swing.JLabel();
        Back_User = new javax.swing.JButton();
        PartidaPanel = new javax.swing.JPanel();
        LisboaToBarcelona = new javax.swing.JButton();
        LisboaToParis = new javax.swing.JButton();
        LisboaToLondres = new javax.swing.JButton();
        LisboaToAmesterdão = new javax.swing.JButton();
        LisboaToAtenas = new javax.swing.JButton();
        LisboaToVarsovia = new javax.swing.JButton();
        Back_Partida = new javax.swing.JButton();
        VindaPanel = new javax.swing.JPanel();
        BarcelonaToLisboa = new javax.swing.JButton();
        ParisToLisboa = new javax.swing.JButton();
        LondresToLisboa = new javax.swing.JButton();
        AmesterdãoToLisboa = new javax.swing.JButton();
        AtenasToLisboa = new javax.swing.JButton();
        VarsoviaToLisboa = new javax.swing.JButton();
        Back_Vinda = new javax.swing.JButton();
        EscolherDataPanel = new javax.swing.JPanel();
        DataVooCombo = new javax.swing.JComboBox<>();
        EscolhaDataLabel = new javax.swing.JLabel();
        ConfirmarDataVoo = new javax.swing.JButton();
        WelcomeSublinhado1 = new javax.swing.JLabel();
        VoltarEscolherData = new javax.swing.JButton();
        PagamentoPanel = new javax.swing.JPanel();
        NomeDadosCompra = new javax.swing.JLabel();
        MetodosPagamento = new javax.swing.JLabel();
        OnOffBolsaDeMao = new javax.swing.JToggleButton();
        BolsaDeMão = new javax.swing.JLabel();
        DadosCompraLabel = new javax.swing.JLabel();
        PagamentoSublinhado = new javax.swing.JLabel();
        PagamentoCombo = new javax.swing.JComboBox<>();
        ConfirmarCompra = new javax.swing.JButton();
        VoltarPagamento = new javax.swing.JButton();
        NomeClienteEntry = new javax.swing.JTextField();
        PrecoTotalPagamento = new javax.swing.JLabel();
        RelatorioDeCompra = new javax.swing.JPanel();
        RelatorioCompra = new javax.swing.JLabel();
        RelatorioSublinhado = new javax.swing.JLabel();
        PrecoAssentoRelat = new javax.swing.JLabel();
        TaxAdminRelat = new javax.swing.JLabel();
        BolsaMaoRelat = new javax.swing.JLabel();
        SegRelat = new javax.swing.JLabel();
        BagExtraRelat = new javax.swing.JLabel();
        VoltarRelat = new javax.swing.JButton();
        PrecoTotalRelat = new javax.swing.JLabel();
        NomeRelat = new javax.swing.JLabel();
        PartidaRelat = new javax.swing.JLabel();
        DestinoRelat = new javax.swing.JLabel();
        LugarRelat = new javax.swing.JLabel();
        PagamentoRelat = new javax.swing.JLabel();
        FundoAzulPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("layoutInicial");
        setBackground(new java.awt.Color(170, 205, 245));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomePanel.setBackground(new java.awt.Color(170, 205, 245));

        EntrarButton.setBackground(new java.awt.Color(7, 76, 112));
        EntrarButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        EntrarButton.setForeground(new java.awt.Color(255, 255, 255));
        EntrarButton.setText("Entrar");
        EntrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EntrarButton.setFocusPainted(false);
        EntrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarButtonActionPerformed(evt);
            }
        });

        bemvindoLabel1.setFont(new java.awt.Font("Eras Bold ITC", 3, 40)); // NOI18N
        bemvindoLabel1.setForeground(new java.awt.Color(7, 76, 112));
        bemvindoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bemvindoLabel1.setText("Bem-Vindo");

        WelcomeSublinhado.setText("__________________________________________________");

        LogoWelcome.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\logo_empresa_welcome.png"));

        javax.swing.GroupLayout WelcomePanelLayout = new javax.swing.GroupLayout(WelcomePanel);
        WelcomePanel.setLayout(WelcomePanelLayout);
        WelcomePanelLayout.setHorizontalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(LogoWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EntrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(WelcomeSublinhado, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bemvindoLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        WelcomePanelLayout.setVerticalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(bemvindoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WelcomePanelLayout.createSequentialGroup()
                        .addComponent(WelcomeSublinhado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(EntrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogoWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        getContentPane().add(WelcomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        MiniLogoPanel.setBackground(new java.awt.Color(170, 205, 245));

        MiniLogo_AdminUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MiniLogo_AdminUser.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\logo_empresa.png"));

        javax.swing.GroupLayout MiniLogoPanelLayout = new javax.swing.GroupLayout(MiniLogoPanel);
        MiniLogoPanel.setLayout(MiniLogoPanelLayout);
        MiniLogoPanelLayout.setHorizontalGroup(
            MiniLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiniLogoPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(MiniLogo_AdminUser, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MiniLogoPanelLayout.setVerticalGroup(
            MiniLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MiniLogo_AdminUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );

        getContentPane().add(MiniLogoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 0, 180, -1));

        AdminUserPanel.setBackground(new java.awt.Color(170, 205, 245));

        AdminButton.setBackground(new java.awt.Color(7, 76, 112));
        AdminButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        AdminButton.setForeground(new java.awt.Color(255, 255, 255));
        AdminButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\admin_user_branco.png"));
        AdminButton.setText("Admin");
        AdminButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminButton.setFocusPainted(false);
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });

        UserButton.setBackground(new java.awt.Color(7, 76, 112));
        UserButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        UserButton.setForeground(new java.awt.Color(255, 255, 255));
        UserButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\normal_user_branco.png"));
        UserButton.setText("User");
        UserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserButtonActionPerformed(evt);
            }
        });

        AdminUserTitulo.setFont(new java.awt.Font("Eras Bold ITC", 3, 36)); // NOI18N
        AdminUserTitulo.setForeground(new java.awt.Color(7, 76, 112));
        AdminUserTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminUserTitulo.setText("Escolha de que forma ");

        AdminUserTitulo2.setFont(new java.awt.Font("Eras Bold ITC", 3, 36)); // NOI18N
        AdminUserTitulo2.setForeground(new java.awt.Color(7, 76, 112));
        AdminUserTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminUserTitulo2.setText("pretende aceder à plataforma");

        AdminUserSublinhado.setForeground(new java.awt.Color(7, 76, 112));
        AdminUserSublinhado.setText("_______________________________________________________________________________________________________________");

        Back_AdminUser.setBackground(new java.awt.Color(7, 76, 112));
        Back_AdminUser.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Back_AdminUser.setForeground(new java.awt.Color(255, 255, 255));
        Back_AdminUser.setText("Voltar");
        Back_AdminUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_AdminUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_AdminUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminUserPanelLayout = new javax.swing.GroupLayout(AdminUserPanel);
        AdminUserPanel.setLayout(AdminUserPanelLayout);
        AdminUserPanelLayout.setHorizontalGroup(
            AdminUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminUserPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AdminUserSublinhado)
                .addGap(124, 124, 124))
            .addGroup(AdminUserPanelLayout.createSequentialGroup()
                .addGroup(AdminUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AdminUserPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AdminUserTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminUserPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AdminUserTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AdminUserPanelLayout.createSequentialGroup()
                        .addGroup(AdminUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AdminUserPanelLayout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(Back_AdminUser, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AdminUserPanelLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(AdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(UserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        AdminUserPanelLayout.setVerticalGroup(
            AdminUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminUserPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(AdminUserTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminUserTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminUserSublinhado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(AdminUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(Back_AdminUser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(AdminUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        MainLeftPanel.setBackground(new java.awt.Color(170, 205, 245));

        abaRegistoButton.setBackground(new java.awt.Color(7, 76, 112));
        abaRegistoButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        abaRegistoButton.setForeground(new java.awt.Color(255, 255, 255));
        abaRegistoButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\edit_branco.png"));
        abaRegistoButton.setText("  Registar  ");
        abaRegistoButton.setToolTipText("");
        abaRegistoButton.setBorder(null);
        abaRegistoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abaRegistoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaRegistoButtonActionPerformed(evt);
            }
        });

        abaLoginButton.setBackground(new java.awt.Color(7, 76, 112));
        abaLoginButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        abaLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        abaLoginButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\user_branco.png"));
        abaLoginButton.setText("  Login     ");
        abaLoginButton.setActionCommand("Login");
        abaLoginButton.setBorder(null);
        abaLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abaLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaLoginButtonActionPerformed(evt);
            }
        });

        VoltarButton1.setBackground(new java.awt.Color(7, 76, 112));
        VoltarButton1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        VoltarButton1.setForeground(new java.awt.Color(255, 255, 255));
        VoltarButton1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\back_branco.png"));
        VoltarButton1.setText("  Voltar");
        VoltarButton1.setActionCommand("Login");
        VoltarButton1.setBorder(null);
        VoltarButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarButton1ActionPerformed(evt);
            }
        });

        bemvindoLabel.setFont(new java.awt.Font("Eras Bold ITC", 3, 40)); // NOI18N
        bemvindoLabel.setForeground(new java.awt.Color(7, 76, 112));
        bemvindoLabel.setText("  InfinityJet");

        jLabel1.setText("__________________________________________________");

        javax.swing.GroupLayout MainLeftPanelLayout = new javax.swing.GroupLayout(MainLeftPanel);
        MainLeftPanel.setLayout(MainLeftPanelLayout);
        MainLeftPanelLayout.setHorizontalGroup(
            MainLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLeftPanelLayout.createSequentialGroup()
                .addGroup(MainLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLeftPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLeftPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(MainLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bemvindoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(VoltarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(abaLoginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(abaRegistoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        MainLeftPanelLayout.setVerticalGroup(
            MainLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLeftPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(bemvindoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(abaRegistoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(abaLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(VoltarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        getContentPane().add(MainLeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 540));

        MainRightPanel.setBackground(new java.awt.Color(255, 255, 255));

        registoPanel.setBackground(new java.awt.Color(170, 205, 245));

        registoTituloR.setFont(new java.awt.Font("Eras Bold ITC", 3, 48)); // NOI18N
        registoTituloR.setForeground(new java.awt.Color(7, 76, 112));
        registoTituloR.setText("Registo");
        registoTituloR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nomeLabelR.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nomeLabelR.setForeground(new java.awt.Color(7, 76, 112));
        nomeLabelR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeLabelR.setText("Nome");

        passLabelR.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        passLabelR.setForeground(new java.awt.Color(7, 76, 112));
        passLabelR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passLabelR.setText("Pass");

        ConfirmarPassLabelR.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ConfirmarPassLabelR.setForeground(new java.awt.Color(7, 76, 112));
        ConfirmarPassLabelR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConfirmarPassLabelR.setText("Confirmar pass");

        nifLabelR.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nifLabelR.setForeground(new java.awt.Color(7, 76, 112));
        nifLabelR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nifLabelR.setText("Admin Code");

        nomeEntryR.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nomeEntryR.setForeground(new java.awt.Color(7, 76, 112));

        passEntryR.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        passEntryR.setForeground(new java.awt.Color(7, 76, 112));

        RegistarButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        RegistarButton.setForeground(new java.awt.Color(7, 76, 112));
        RegistarButton.setText("Registar");
        RegistarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistarButtonActionPerformed(evt);
            }
        });

        AdminCodeEntryR.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        AdminCodeEntryR.setForeground(new java.awt.Color(7, 76, 112));

        ConfirmarPassEntryR.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ConfirmarPassEntryR.setForeground(new java.awt.Color(7, 76, 112));

        javax.swing.GroupLayout registoPanelLayout = new javax.swing.GroupLayout(registoPanel);
        registoPanel.setLayout(registoPanelLayout);
        registoPanelLayout.setHorizontalGroup(
            registoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registoPanelLayout.createSequentialGroup()
                .addGroup(registoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registoPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(nifLabelR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(registoPanelLayout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addComponent(ConfirmarPassLabelR, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)))
                .addGroup(registoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmarPassEntryR, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminCodeEntryR, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(registoPanelLayout.createSequentialGroup()
                .addGroup(registoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registoPanelLayout.createSequentialGroup()
                        .addGroup(registoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabelR, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passLabelR, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(registoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passEntryR, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeEntryR, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(registoPanelLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(registoTituloR, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registoPanelLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(RegistarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registoPanelLayout.setVerticalGroup(
            registoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registoPanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(registoTituloR)
                .addGap(33, 33, 33)
                .addGroup(registoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeEntryR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeLabelR))
                .addGap(18, 18, 18)
                .addGroup(registoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passEntryR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLabelR))
                .addGap(18, 18, 18)
                .addGroup(registoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmarPassEntryR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmarPassLabelR))
                .addGap(18, 18, 18)
                .addGroup(registoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminCodeEntryR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nifLabelR))
                .addGap(31, 31, 31)
                .addComponent(RegistarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        MainRightPanel.addTab("tab2", registoPanel);

        loginPanel.setBackground(new java.awt.Color(170, 205, 245));

        loginTitulo.setFont(new java.awt.Font("Eras Bold ITC", 3, 48)); // NOI18N
        loginTitulo.setForeground(new java.awt.Color(7, 76, 112));
        loginTitulo.setText("Login");

        userLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(7, 76, 112));
        userLabel.setText("Nome do utilizador");

        passLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        passLabel.setForeground(new java.awt.Color(7, 76, 112));
        passLabel.setText("Palavra-Passe");

        passEntry.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        passEntry.setForeground(new java.awt.Color(7, 76, 112));

        userEntry.setForeground(new java.awt.Color(7, 76, 112));
        userEntry.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        loginButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(7, 76, 112));
        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabel)
                            .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(loginTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(loginTitulo)
                .addGap(70, 70, 70)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        MainRightPanel.addTab("tab1", loginPanel);

        getContentPane().add(MainRightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -40, 550, 580));

        CriarPanel.setBackground(new java.awt.Color(170, 205, 245));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 3, 34)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 76, 112));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Escolha a sua opção");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ApartirButtonAdmin.setBackground(new java.awt.Color(7, 76, 112));
        ApartirButtonAdmin.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        ApartirButtonAdmin.setForeground(new java.awt.Color(255, 255, 255));
        ApartirButtonAdmin.setText("A partir de Lisboa");
        ApartirButtonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ApartirButtonAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApartirButtonAdminMouseClicked(evt);
            }
        });
        ApartirButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApartirButtonAdminActionPerformed(evt);
            }
        });

        AteButtonAdmin.setBackground(new java.awt.Color(7, 76, 112));
        AteButtonAdmin.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        AteButtonAdmin.setForeground(new java.awt.Color(255, 255, 255));
        AteButtonAdmin.setText("Até Lisboa");
        AteButtonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AteButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AteButtonAdminActionPerformed(evt);
            }
        });

        LinhaAdminCriar.setText("_________________________________________________________________________________");

        javax.swing.GroupLayout CriarPanelLayout = new javax.swing.GroupLayout(CriarPanel);
        CriarPanel.setLayout(CriarPanelLayout);
        CriarPanelLayout.setHorizontalGroup(
            CriarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CriarPanelLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(CriarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CriarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CriarPanelLayout.createSequentialGroup()
                            .addGroup(CriarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(AteButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ApartirButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(92, 92, 92))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CriarPanelLayout.createSequentialGroup()
                            .addComponent(LinhaAdminCriar)
                            .addGap(43, 43, 43)))))
        );
        CriarPanelLayout.setVerticalGroup(
            CriarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriarPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LinhaAdminCriar)
                .addGap(37, 37, 37)
                .addComponent(ApartirButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(AteButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        AdminRightPanel.addTab("tab1", CriarPanel);

        AdminPartirLisboa.setBackground(new java.awt.Color(170, 205, 245));

        ApartirLisboaLabel.setFont(new java.awt.Font("Eras Bold ITC", 3, 36)); // NOI18N
        ApartirLisboaLabel.setForeground(new java.awt.Color(7, 76, 112));
        ApartirLisboaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApartirLisboaLabel.setText("A partir de Lisboa");

        ApartirSublinhado.setText("__________________________________________________________________");

        ApartirPartidaLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ApartirPartidaLabel.setForeground(new java.awt.Color(7, 76, 112));
        ApartirPartidaLabel.setText("Partida : Lisboa");

        ApartirDestinoLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ApartirDestinoLabel.setForeground(new java.awt.Color(7, 76, 112));
        ApartirDestinoLabel.setText("Destino : ");

        ApartirDataVooLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ApartirDataVooLabel.setForeground(new java.awt.Color(7, 76, 112));
        ApartirDataVooLabel.setText("Data do Voo :");

        ApartirPaisesCombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ApartirPaisesCombo.setForeground(new java.awt.Color(7, 76, 112));
        ApartirPaisesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amesterdão", "Atenas", "Barcelona", "Londres", "Paris", "Varsóvia" }));
        ApartirPaisesCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ApartirPaisesCombo.setFocusable(false);

        ApartirConfirmarButton.setBackground(new java.awt.Color(7, 76, 122));
        ApartirConfirmarButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        ApartirConfirmarButton.setForeground(new java.awt.Color(255, 255, 255));
        ApartirConfirmarButton.setText("Confirmar");
        ApartirConfirmarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ApartirConfirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApartirConfirmarButtonActionPerformed(evt);
            }
        });

        jDateChooser1.setFocusable(false);
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jDateChooser1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout AdminPartirLisboaLayout = new javax.swing.GroupLayout(AdminPartirLisboa);
        AdminPartirLisboa.setLayout(AdminPartirLisboaLayout);
        AdminPartirLisboaLayout.setHorizontalGroup(
            AdminPartirLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPartirLisboaLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(AdminPartirLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPartirLisboaLayout.createSequentialGroup()
                        .addComponent(ApartirSublinhado)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPartirLisboaLayout.createSequentialGroup()
                        .addComponent(ApartirConfirmarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(AdminPartirLisboaLayout.createSequentialGroup()
                .addGroup(AdminPartirLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPartirLisboaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(AdminPartirLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ApartirPartidaLabel)
                            .addGroup(AdminPartirLisboaLayout.createSequentialGroup()
                                .addComponent(ApartirDestinoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ApartirPaisesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AdminPartirLisboaLayout.createSequentialGroup()
                                .addComponent(ApartirDataVooLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(AdminPartirLisboaLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(ApartirLisboaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AdminPartirLisboaLayout.setVerticalGroup(
            AdminPartirLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPartirLisboaLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(ApartirLisboaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ApartirSublinhado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(ApartirPartidaLabel)
                .addGap(43, 43, 43)
                .addGroup(AdminPartirLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApartirPaisesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApartirDestinoLabel))
                .addGap(39, 39, 39)
                .addGroup(AdminPartirLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ApartirDataVooLabel)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(ApartirConfirmarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        AdminRightPanel.addTab("tab4", AdminPartirLisboa);

        AdminAteLisboa.setBackground(new java.awt.Color(170, 205, 245));

        AteLisboaLabel.setFont(new java.awt.Font("Eras Bold ITC", 3, 36)); // NOI18N
        AteLisboaLabel.setForeground(new java.awt.Color(7, 76, 112));
        AteLisboaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AteLisboaLabel.setText("Até Lisboa");

        AteSublinhado.setText("___________________________________________________");

        AtePartidaLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        AtePartidaLabel.setForeground(new java.awt.Color(7, 76, 112));
        AtePartidaLabel.setText("Partida :");

        AteDestinoLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        AteDestinoLabel.setForeground(new java.awt.Color(7, 76, 112));
        AteDestinoLabel.setText("Destino : Lisboa");

        AteDataVooLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        AteDataVooLabel.setForeground(new java.awt.Color(7, 76, 112));
        AteDataVooLabel.setText("Data do Voo :");

        AtePaisesCombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AtePaisesCombo.setForeground(new java.awt.Color(7, 76, 112));
        AtePaisesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amesterdão", "Atenas", "Barcelona", "Londres", "Paris", "Varsóvia" }));
        AtePaisesCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AtePaisesCombo.setFocusable(false);

        AteConfirmarButton.setBackground(new java.awt.Color(7, 76, 112));
        AteConfirmarButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        AteConfirmarButton.setForeground(new java.awt.Color(255, 255, 255));
        AteConfirmarButton.setText("Confirmar");
        AteConfirmarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AteConfirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AteConfirmarButtonActionPerformed(evt);
            }
        });

        jDateChooser2.setFocusable(false);
        jDateChooser2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout AdminAteLisboaLayout = new javax.swing.GroupLayout(AdminAteLisboa);
        AdminAteLisboa.setLayout(AdminAteLisboaLayout);
        AdminAteLisboaLayout.setHorizontalGroup(
            AdminAteLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminAteLisboaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(AdminAteLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminAteLisboaLayout.createSequentialGroup()
                        .addComponent(AteDataVooLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AteDestinoLabel))
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminAteLisboaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AdminAteLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminAteLisboaLayout.createSequentialGroup()
                        .addComponent(AteConfirmarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminAteLisboaLayout.createSequentialGroup()
                        .addComponent(AtePartidaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminAteLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AteSublinhado)
                            .addComponent(AtePaisesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminAteLisboaLayout.createSequentialGroup()
                        .addComponent(AteLisboaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );
        AdminAteLisboaLayout.setVerticalGroup(
            AdminAteLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminAteLisboaLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(AteLisboaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminAteLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminAteLisboaLayout.createSequentialGroup()
                        .addComponent(AteSublinhado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(AdminAteLisboaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AtePartidaLabel)
                            .addComponent(AtePaisesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(AteDestinoLabel)
                        .addGap(41, 41, 41)
                        .addComponent(AteDataVooLabel))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(AteConfirmarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        AdminRightPanel.addTab("tab5", AdminAteLisboa);

        getContentPane().add(AdminRightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -40, 520, 550));

        AdminLeftPanel.setBackground(new java.awt.Color(170, 205, 245));

        bemvindoLabel3.setFont(new java.awt.Font("Eras Bold ITC", 3, 40)); // NOI18N
        bemvindoLabel3.setForeground(new java.awt.Color(7, 76, 112));
        bemvindoLabel3.setText("  InfinityJet");

        AdminSublinhado.setText("__________________________________________________");

        CriarButton.setBackground(new java.awt.Color(7, 76, 112));
        CriarButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        CriarButton.setForeground(new java.awt.Color(255, 255, 255));
        CriarButton.setText("Criar Voos");
        CriarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CriarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarButtonActionPerformed(evt);
            }
        });

        EstatisticaButton.setBackground(new java.awt.Color(7, 76, 112));
        EstatisticaButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        EstatisticaButton.setForeground(new java.awt.Color(255, 255, 255));
        EstatisticaButton.setText("Gerir Voos");
        EstatisticaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EstatisticaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstatisticaButtonActionPerformed(evt);
            }
        });

        LogOutButton.setBackground(new java.awt.Color(7, 76, 112));
        LogOutButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogOutButton.setText("Log Out");
        LogOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        GerirClientesButton.setBackground(new java.awt.Color(7, 76, 112));
        GerirClientesButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        GerirClientesButton.setForeground(new java.awt.Color(255, 255, 255));
        GerirClientesButton.setText("Gerir Clientes");
        GerirClientesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GerirClientesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerirClientesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminLeftPanelLayout = new javax.swing.GroupLayout(AdminLeftPanel);
        AdminLeftPanel.setLayout(AdminLeftPanelLayout);
        AdminLeftPanelLayout.setHorizontalGroup(
            AdminLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminSublinhado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AdminLeftPanelLayout.createSequentialGroup()
                .addGroup(AdminLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bemvindoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CriarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EstatisticaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GerirClientesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AdminLeftPanelLayout.setVerticalGroup(
            AdminLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLeftPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(bemvindoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminSublinhado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CriarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EstatisticaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GerirClientesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(AdminLeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 510));

        EstatisticaPanel.setBackground(new java.awt.Color(170, 205, 245));

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        tabelaVoosAdmin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tabelaVoosAdmin.setForeground(new java.awt.Color(7, 76, 112));
        tabelaVoosAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Partida", "Destino", "Data do Voo", "Lugares Disponiveis", "ID do Voo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVoosAdmin.setToolTipText("");
        tabelaVoosAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaVoosAdmin.setFocusable(false);
        tabelaVoosAdmin.setGridColor(new java.awt.Color(7, 76, 112));
        tabelaVoosAdmin.setRequestFocusEnabled(false);
        tabelaVoosAdmin.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabelaVoosAdmin);
        if (tabelaVoosAdmin.getColumnModel().getColumnCount() > 0) {
            tabelaVoosAdmin.getColumnModel().getColumn(0).setResizable(false);
            tabelaVoosAdmin.getColumnModel().getColumn(1).setResizable(false);
            tabelaVoosAdmin.getColumnModel().getColumn(2).setResizable(false);
            tabelaVoosAdmin.getColumnModel().getColumn(3).setResizable(false);
            tabelaVoosAdmin.getColumnModel().getColumn(4).setResizable(false);
        }
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < tabelaVoosAdmin.getColumnCount(); i++) {
            tabelaVoosAdmin.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        EstatisticaVoltar.setBackground(new java.awt.Color(7, 76, 112));
        EstatisticaVoltar.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        EstatisticaVoltar.setForeground(new java.awt.Color(255, 255, 255));
        EstatisticaVoltar.setText("Voltar");
        EstatisticaVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EstatisticaVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstatisticaVoltarActionPerformed(evt);
            }
        });

        deleteVooButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\apagar_voo.png"));
        deleteVooButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteVooButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVooButtonActionPerformed(evt);
            }
        });

        TabelaVoosLabel.setFont(new java.awt.Font("Eras Bold ITC", 3, 40)); // NOI18N
        TabelaVoosLabel.setForeground(new java.awt.Color(7, 76, 112));
        TabelaVoosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TabelaVoosLabel.setText("Tabela de Voos");
        TabelaVoosLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        TabelaSublinhado.setText("_____________________________________________________________________");

        javax.swing.GroupLayout EstatisticaPanelLayout = new javax.swing.GroupLayout(EstatisticaPanel);
        EstatisticaPanel.setLayout(EstatisticaPanelLayout);
        EstatisticaPanelLayout.setHorizontalGroup(
            EstatisticaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EstatisticaPanelLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addGroup(EstatisticaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TabelaVoosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(TabelaSublinhado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(EstatisticaPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(EstatisticaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EstatisticaPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(EstatisticaPanelLayout.createSequentialGroup()
                        .addComponent(deleteVooButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EstatisticaVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        EstatisticaPanelLayout.setVerticalGroup(
            EstatisticaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstatisticaPanelLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(TabelaVoosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabelaSublinhado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(EstatisticaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EstatisticaPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(EstatisticaVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EstatisticaPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(deleteVooButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        getContentPane().add(EstatisticaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        GestorClientes.setBackground(new java.awt.Color(170, 205, 245));

        TabelaClientesAdmin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TabelaClientesAdmin.setForeground(new java.awt.Color(7, 76, 112));
        TabelaClientesAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Passageiro", "ID", "Partida", "Destino", "Assento", "Data do Voo", "Preço Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaClientesAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabelaClientesAdmin.setFocusable(false);
        TabelaClientesAdmin.setGridColor(new java.awt.Color(7, 76, 112));
        TabelaClientesAdmin.setRequestFocusEnabled(false);
        TabelaClientesAdmin.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < TabelaClientesAdmin.getColumnCount(); i++) {
            TabelaClientesAdmin.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        TabelaClientesAdmin.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TabelaClientesAdmin);
        if (TabelaClientesAdmin.getColumnModel().getColumnCount() > 0) {
            TabelaClientesAdmin.getColumnModel().getColumn(0).setResizable(false);
            TabelaClientesAdmin.getColumnModel().getColumn(1).setResizable(false);
            TabelaClientesAdmin.getColumnModel().getColumn(2).setResizable(false);
            TabelaClientesAdmin.getColumnModel().getColumn(3).setResizable(false);
            TabelaClientesAdmin.getColumnModel().getColumn(4).setResizable(false);
            TabelaClientesAdmin.getColumnModel().getColumn(5).setResizable(false);
            TabelaClientesAdmin.getColumnModel().getColumn(6).setResizable(false);
        }

        ListaClientesLabel.setFont(new java.awt.Font("Eras Bold ITC", 3, 40)); // NOI18N
        ListaClientesLabel.setForeground(new java.awt.Color(7, 76, 112));
        ListaClientesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListaClientesLabel.setText("Lista de Clientes");

        ListaClientesSublinhado.setText("_______________________________________________________________________");

        VoltarGestorClientes.setBackground(new java.awt.Color(7, 76, 112));
        VoltarGestorClientes.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        VoltarGestorClientes.setForeground(new java.awt.Color(255, 255, 255));
        VoltarGestorClientes.setText("Voltar");
        VoltarGestorClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarGestorClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarGestorClientesActionPerformed(evt);
            }
        });

        ApagarClientes.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\apagar_voo.png"));
        ApagarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ApagarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GestorClientesLayout = new javax.swing.GroupLayout(GestorClientes);
        GestorClientes.setLayout(GestorClientesLayout);
        GestorClientesLayout.setHorizontalGroup(
            GestorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestorClientesLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(GestorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, GestorClientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(GestorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListaClientesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListaClientesSublinhado, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, GestorClientesLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(GestorClientesLayout.createSequentialGroup()
                        .addComponent(ApagarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VoltarGestorClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        GestorClientesLayout.setVerticalGroup(
            GestorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestorClientesLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(ListaClientesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListaClientesSublinhado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(GestorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GestorClientesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ApagarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GestorClientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(VoltarGestorClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        getContentPane().add(GestorClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        UserPanel.setBackground(new java.awt.Color(170, 205, 245));

        PartidaButton.setBackground(new java.awt.Color(7, 76, 112));
        PartidaButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        PartidaButton.setForeground(new java.awt.Color(255, 255, 255));
        PartidaButton.setText("A partir de Lisboa");
        PartidaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PartidaButton.setFocusPainted(false);
        PartidaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartidaButtonActionPerformed(evt);
            }
        });

        VindaButton.setBackground(new java.awt.Color(7, 76, 112));
        VindaButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        VindaButton.setForeground(new java.awt.Color(255, 255, 255));
        VindaButton.setText("Até Lisboa");
        VindaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VindaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VindaButtonActionPerformed(evt);
            }
        });

        bemvindoLabel2.setFont(new java.awt.Font("Eras Bold ITC", 3, 36)); // NOI18N
        bemvindoLabel2.setForeground(new java.awt.Color(7, 76, 112));
        bemvindoLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bemvindoLabel2.setText("Escolha a opção de voo que pretende");

        Linha_User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Linha_User.setText("_____________________________________________________________________________________________________________________________________________");

        MiniLogo_User.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\logo_empresa.png"));

        Back_User.setBackground(new java.awt.Color(7, 76, 112));
        Back_User.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Back_User.setForeground(new java.awt.Color(255, 255, 255));
        Back_User.setText("Voltar");
        Back_User.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_UserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserPanelLayout = new javax.swing.GroupLayout(UserPanel);
        UserPanel.setLayout(UserPanelLayout);
        UserPanelLayout.setHorizontalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addGroup(UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserPanelLayout.createSequentialGroup()
                        .addGroup(UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UserPanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(PartidaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(VindaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UserPanelLayout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(Back_User, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(MiniLogo_User, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Linha_User)
                    .addComponent(bemvindoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        UserPanelLayout.setVerticalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addComponent(MiniLogo_User, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(bemvindoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Linha_User)
                .addGap(51, 51, 51)
                .addGroup(UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PartidaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VindaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(Back_User, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        getContentPane().add(UserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        PartidaPanel.setBackground(new java.awt.Color(170, 205, 245));

        LisboaToBarcelona.setBackground(new java.awt.Color(170, 205, 245));
        LisboaToBarcelona.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\botão_lisboa_to_barcelona.png"));
        LisboaToBarcelona.setContentAreaFilled(false);
        LisboaToBarcelona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LisboaToBarcelona.setFocusPainted(false);
        LisboaToBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LisboaToBarcelonaActionPerformed(evt);
            }
        });

        LisboaToParis.setBackground(new java.awt.Color(170, 205, 245));
        LisboaToParis.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\botão_lisboa_to_paris.png"));
        LisboaToParis.setContentAreaFilled(false);
        LisboaToParis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LisboaToParis.setFocusPainted(false);
        LisboaToParis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LisboaToParisActionPerformed(evt);
            }
        });

        LisboaToLondres.setBackground(new java.awt.Color(170, 205, 245));
        LisboaToLondres.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\botão_lisboa_to_londres.png"));
        LisboaToLondres.setContentAreaFilled(false);
        LisboaToLondres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LisboaToLondres.setFocusPainted(false);
        LisboaToLondres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LisboaToLondresActionPerformed(evt);
            }
        });

        LisboaToAmesterdão.setBackground(new java.awt.Color(170, 205, 245));
        LisboaToAmesterdão.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\botão_lisboa_to_amesterdão.png"));
        LisboaToAmesterdão.setContentAreaFilled(false);
        LisboaToAmesterdão.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LisboaToAmesterdão.setFocusPainted(false);
        LisboaToAmesterdão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LisboaToAmesterdãoActionPerformed(evt);
            }
        });

        LisboaToAtenas.setBackground(new java.awt.Color(170, 205, 245));
        LisboaToAtenas.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\botão_lisboa_to_atenas.png"));
        LisboaToAtenas.setContentAreaFilled(false);
        LisboaToAtenas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LisboaToAtenas.setFocusPainted(false);
        LisboaToAtenas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LisboaToAtenasActionPerformed(evt);
            }
        });

        LisboaToVarsovia.setBackground(new java.awt.Color(170, 205, 245));
        LisboaToVarsovia.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\botão_lisboa_to_varsovia.png"));
        LisboaToVarsovia.setContentAreaFilled(false);
        LisboaToVarsovia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LisboaToVarsovia.setFocusPainted(false);
        LisboaToVarsovia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LisboaToVarsoviaActionPerformed(evt);
            }
        });

        Back_Partida.setBackground(new java.awt.Color(7, 76, 112));
        Back_Partida.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Back_Partida.setForeground(new java.awt.Color(255, 255, 255));
        Back_Partida.setText("Voltar");
        Back_Partida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_Partida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_PartidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PartidaPanelLayout = new javax.swing.GroupLayout(PartidaPanel);
        PartidaPanel.setLayout(PartidaPanelLayout);
        PartidaPanelLayout.setHorizontalGroup(
            PartidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PartidaPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(PartidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LisboaToAmesterdão, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LisboaToBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(PartidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LisboaToAtenas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LisboaToParis, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(PartidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LisboaToLondres, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LisboaToVarsovia, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
            .addGroup(PartidaPanelLayout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(Back_Partida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PartidaPanelLayout.setVerticalGroup(
            PartidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PartidaPanelLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(PartidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PartidaPanelLayout.createSequentialGroup()
                        .addComponent(LisboaToLondres, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LisboaToVarsovia, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PartidaPanelLayout.createSequentialGroup()
                        .addComponent(LisboaToBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LisboaToAmesterdão, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PartidaPanelLayout.createSequentialGroup()
                        .addComponent(LisboaToParis, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LisboaToAtenas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Back_Partida)
                .addGap(50, 50, 50))
        );

        getContentPane().add(PartidaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        VindaPanel.setBackground(new java.awt.Color(170, 205, 245));

        BarcelonaToLisboa.setBackground(new java.awt.Color(170, 205, 245));
        BarcelonaToLisboa.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\botão_barcelona_to_lisboa.png"));
        BarcelonaToLisboa.setContentAreaFilled(false);
        BarcelonaToLisboa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BarcelonaToLisboa.setFocusPainted(false);
        BarcelonaToLisboa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarcelonaToLisboaActionPerformed(evt);
            }
        });

        ParisToLisboa.setBackground(new java.awt.Color(170, 205, 245));
        ParisToLisboa.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\botão_paris_to_lisboa.png"));
        ParisToLisboa.setContentAreaFilled(false);
        ParisToLisboa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ParisToLisboa.setFocusPainted(false);
        ParisToLisboa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParisToLisboaActionPerformed(evt);
            }
        });

        LondresToLisboa.setBackground(new java.awt.Color(170, 205, 245));
        LondresToLisboa.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\botão_londres_to_lisboa.png"));
        LondresToLisboa.setContentAreaFilled(false);
        LondresToLisboa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LondresToLisboa.setFocusPainted(false);
        LondresToLisboa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LondresToLisboaActionPerformed(evt);
            }
        });

        AmesterdãoToLisboa.setBackground(new java.awt.Color(170, 205, 245));
        AmesterdãoToLisboa.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\botão_amsterdao_to_lisboa.png"));
        AmesterdãoToLisboa.setContentAreaFilled(false);
        AmesterdãoToLisboa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AmesterdãoToLisboa.setFocusPainted(false);
        AmesterdãoToLisboa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmesterdãoToLisboaActionPerformed(evt);
            }
        });

        AtenasToLisboa.setBackground(new java.awt.Color(170, 205, 245));
        AtenasToLisboa.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\botão_atenas_to_lisboa.png"));
        AtenasToLisboa.setContentAreaFilled(false);
        AtenasToLisboa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AtenasToLisboa.setFocusPainted(false);
        AtenasToLisboa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtenasToLisboaActionPerformed(evt);
            }
        });

        VarsoviaToLisboa.setBackground(new java.awt.Color(170, 205, 245));
        VarsoviaToLisboa.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\botão_varsovia_to_lisboa.png"));
        VarsoviaToLisboa.setContentAreaFilled(false);
        VarsoviaToLisboa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VarsoviaToLisboa.setFocusPainted(false);
        VarsoviaToLisboa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VarsoviaToLisboaActionPerformed(evt);
            }
        });

        Back_Vinda.setBackground(new java.awt.Color(7, 76, 112));
        Back_Vinda.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Back_Vinda.setForeground(new java.awt.Color(255, 255, 255));
        Back_Vinda.setText("Voltar");
        Back_Vinda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_Vinda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_VindaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VindaPanelLayout = new javax.swing.GroupLayout(VindaPanel);
        VindaPanel.setLayout(VindaPanelLayout);
        VindaPanelLayout.setHorizontalGroup(
            VindaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VindaPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(VindaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BarcelonaToLisboa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LondresToLisboa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(VindaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VarsoviaToLisboa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmesterdãoToLisboa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(VindaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AtenasToLisboa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParisToLisboa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VindaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_Vinda)
                .addGap(364, 364, 364))
        );
        VindaPanelLayout.setVerticalGroup(
            VindaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VindaPanelLayout.createSequentialGroup()
                .addGap(55, 163, Short.MAX_VALUE)
                .addGroup(VindaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VarsoviaToLisboa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BarcelonaToLisboa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AtenasToLisboa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VindaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AmesterdãoToLisboa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LondresToLisboa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParisToLisboa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back_Vinda)
                .addGap(47, 47, 47))
        );

        getContentPane().add(VindaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        EscolherDataPanel.setBackground(new java.awt.Color(170, 205, 245));

        DataVooCombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DataVooCombo.setForeground(new java.awt.Color(7, 76, 112));

        EscolhaDataLabel.setFont(new java.awt.Font("Eras Bold ITC", 3, 40)); // NOI18N
        EscolhaDataLabel.setForeground(new java.awt.Color(7, 76, 112));
        EscolhaDataLabel.setText("Escolha a data do seu voo:");

        ConfirmarDataVoo.setBackground(new java.awt.Color(7, 76, 112));
        ConfirmarDataVoo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        ConfirmarDataVoo.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmarDataVoo.setText("Confirmar");
        ConfirmarDataVoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarDataVooActionPerformed(evt);
            }
        });

        WelcomeSublinhado1.setText("__________________________________________________________________________________________________________");

        VoltarEscolherData.setBackground(new java.awt.Color(7, 76, 112));
        VoltarEscolherData.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        VoltarEscolherData.setForeground(new java.awt.Color(255, 255, 255));
        VoltarEscolherData.setText("Voltar");
        VoltarEscolherData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarEscolherDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EscolherDataPanelLayout = new javax.swing.GroupLayout(EscolherDataPanel);
        EscolherDataPanel.setLayout(EscolherDataPanelLayout);
        EscolherDataPanelLayout.setHorizontalGroup(
            EscolherDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscolherDataPanelLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(EscolherDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscolherDataPanelLayout.createSequentialGroup()
                        .addComponent(WelcomeSublinhado1)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscolherDataPanelLayout.createSequentialGroup()
                        .addComponent(VoltarEscolherData, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscolherDataPanelLayout.createSequentialGroup()
                        .addComponent(DataVooCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscolherDataPanelLayout.createSequentialGroup()
                        .addComponent(ConfirmarDataVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249))
                    .addGroup(EscolherDataPanelLayout.createSequentialGroup()
                        .addComponent(EscolhaDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        EscolherDataPanelLayout.setVerticalGroup(
            EscolherDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscolherDataPanelLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(EscolhaDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WelcomeSublinhado1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(DataVooCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConfirmarDataVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(VoltarEscolherData, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(EscolherDataPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        PagamentoPanel.setBackground(new java.awt.Color(175, 205, 245));

        NomeDadosCompra.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        NomeDadosCompra.setForeground(new java.awt.Color(7, 76, 112));
        NomeDadosCompra.setText("Nome do Cliente :");

        MetodosPagamento.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        MetodosPagamento.setForeground(new java.awt.Color(7, 76, 112));
        MetodosPagamento.setText("Métodos de Pagamento ");

        OnOffBolsaDeMao.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        OnOffBolsaDeMao.setForeground(new java.awt.Color(7, 76, 112));
        OnOffBolsaDeMao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OnOffBolsaDeMao.setFocusPainted(false);
        OnOffBolsaDeMao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnOffBolsaDeMaoActionPerformed(evt);
            }
        });

        BolsaDeMão.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        BolsaDeMão.setForeground(new java.awt.Color(7, 76, 112));
        BolsaDeMão.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BolsaDeMão.setText("Bolsa de mão grátis");

        DadosCompraLabel.setFont(new java.awt.Font("Eras Bold ITC", 3, 40)); // NOI18N
        DadosCompraLabel.setForeground(new java.awt.Color(7, 76, 112));
        DadosCompraLabel.setText("Dados da Compra");

        PagamentoSublinhado.setForeground(new java.awt.Color(7, 76, 112));
        PagamentoSublinhado.setText("______________________________________________________________________________");

        PagamentoCombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PagamentoCombo.setForeground(new java.awt.Color(7, 76, 112));
        PagamentoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mastercard", "Paypal", "MBWay", "Visa" }));
        PagamentoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagamentoComboActionPerformed(evt);
            }
        });

        ConfirmarCompra.setBackground(new java.awt.Color(7, 76, 112));
        ConfirmarCompra.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ConfirmarCompra.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmarCompra.setText("Confirmar Compra");
        ConfirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarCompraActionPerformed(evt);
            }
        });

        VoltarPagamento.setBackground(new java.awt.Color(7, 76, 112));
        VoltarPagamento.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        VoltarPagamento.setForeground(new java.awt.Color(255, 255, 255));
        VoltarPagamento.setText("Cancelar Compra");
        VoltarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarPagamentoActionPerformed(evt);
            }
        });

        NomeClienteEntry.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        NomeClienteEntry.setForeground(new java.awt.Color(7, 76, 112));

        PrecoTotalPagamento.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        PrecoTotalPagamento.setForeground(new java.awt.Color(7, 76, 112));
        PrecoTotalPagamento.setText("Preço Total:");

        javax.swing.GroupLayout PagamentoPanelLayout = new javax.swing.GroupLayout(PagamentoPanel);
        PagamentoPanel.setLayout(PagamentoPanelLayout);
        PagamentoPanelLayout.setHorizontalGroup(
            PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagamentoPanelLayout.createSequentialGroup()
                .addGroup(PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PagamentoPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PagamentoPanelLayout.createSequentialGroup()
                                .addComponent(NomeDadosCompra)
                                .addGap(18, 18, 18)
                                .addComponent(NomeClienteEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PagamentoPanelLayout.createSequentialGroup()
                                .addComponent(MetodosPagamento)
                                .addGap(18, 18, 18)
                                .addComponent(PagamentoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PagamentoPanelLayout.createSequentialGroup()
                                .addGroup(PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PagamentoPanelLayout.createSequentialGroup()
                                        .addGroup(PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(PrecoTotalPagamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BolsaDeMão, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(OnOffBolsaDeMao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ConfirmarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addComponent(VoltarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PagamentoPanelLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DadosCompraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PagamentoSublinhado))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        PagamentoPanelLayout.setVerticalGroup(
            PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagamentoPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(DadosCompraLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PagamentoSublinhado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NomeDadosCompra)
                    .addComponent(NomeClienteEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MetodosPagamento)
                    .addComponent(PagamentoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BolsaDeMão, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OnOffBolsaDeMao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PrecoTotalPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VoltarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        getContentPane().add(PagamentoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        RelatorioDeCompra.setBackground(new java.awt.Color(170, 205, 245));

        RelatorioCompra.setFont(new java.awt.Font("Eras Bold ITC", 3, 40)); // NOI18N
        RelatorioCompra.setForeground(new java.awt.Color(7, 76, 112));
        RelatorioCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RelatorioCompra.setText("Relatório da Compra");

        RelatorioSublinhado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RelatorioSublinhado.setText("________________________________________________________________________________________");

        PrecoAssentoRelat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        PrecoAssentoRelat.setForeground(new java.awt.Color(7, 76, 112));
        PrecoAssentoRelat.setText("Preço do Assento : ");

        TaxAdminRelat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        TaxAdminRelat.setForeground(new java.awt.Color(7, 76, 112));
        TaxAdminRelat.setText("Taxa de Administração : 15.0€");

        BolsaMaoRelat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BolsaMaoRelat.setForeground(new java.awt.Color(7, 76, 112));
        BolsaMaoRelat.setText("Bolsa de Mão Grátis : ");

        SegRelat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SegRelat.setForeground(new java.awt.Color(7, 76, 112));
        SegRelat.setText("Seguro :");

        BagExtraRelat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BagExtraRelat.setForeground(new java.awt.Color(7, 76, 112));
        BagExtraRelat.setText("Bagagem Extra : ");

        VoltarRelat.setBackground(new java.awt.Color(7, 76, 112));
        VoltarRelat.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        VoltarRelat.setForeground(new java.awt.Color(255, 255, 255));
        VoltarRelat.setText("Voltar");
        VoltarRelat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarRelatActionPerformed(evt);
            }
        });

        PrecoTotalRelat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        PrecoTotalRelat.setForeground(new java.awt.Color(7, 76, 112));
        PrecoTotalRelat.setText("Preço Total : ");

        NomeRelat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        NomeRelat.setForeground(new java.awt.Color(7, 76, 112));
        NomeRelat.setText("Nome do Cliente :");

        PartidaRelat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        PartidaRelat.setForeground(new java.awt.Color(7, 76, 112));
        PartidaRelat.setText("Partida :");

        DestinoRelat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        DestinoRelat.setForeground(new java.awt.Color(7, 76, 112));
        DestinoRelat.setText("Destino :");

        LugarRelat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LugarRelat.setForeground(new java.awt.Color(7, 76, 122));
        LugarRelat.setText("Lugar :");

        PagamentoRelat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        PagamentoRelat.setForeground(new java.awt.Color(7, 76, 112));
        PagamentoRelat.setText("Metodo de Pagamento :");

        javax.swing.GroupLayout RelatorioDeCompraLayout = new javax.swing.GroupLayout(RelatorioDeCompra);
        RelatorioDeCompra.setLayout(RelatorioDeCompraLayout);
        RelatorioDeCompraLayout.setHorizontalGroup(
            RelatorioDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RelatorioDeCompraLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(RelatorioDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RelatorioDeCompraLayout.createSequentialGroup()
                        .addComponent(PagamentoRelat)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(RelatorioDeCompraLayout.createSequentialGroup()
                        .addGroup(RelatorioDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeRelat)
                            .addComponent(PartidaRelat)
                            .addComponent(DestinoRelat)
                            .addComponent(LugarRelat)
                            .addComponent(BolsaMaoRelat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addGroup(RelatorioDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TaxAdminRelat)
                            .addComponent(PrecoAssentoRelat)
                            .addComponent(SegRelat)
                            .addComponent(PrecoTotalRelat)
                            .addComponent(BagExtraRelat, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))))
            .addGroup(RelatorioDeCompraLayout.createSequentialGroup()
                .addGroup(RelatorioDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RelatorioDeCompraLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(RelatorioDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RelatorioSublinhado)
                            .addComponent(RelatorioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RelatorioDeCompraLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(VoltarRelat, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RelatorioDeCompraLayout.setVerticalGroup(
            RelatorioDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RelatorioDeCompraLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(RelatorioCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RelatorioSublinhado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(RelatorioDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecoAssentoRelat)
                    .addComponent(NomeRelat))
                .addGap(18, 18, 18)
                .addGroup(RelatorioDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BagExtraRelat)
                    .addComponent(PartidaRelat))
                .addGap(18, 18, 18)
                .addGroup(RelatorioDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SegRelat)
                    .addComponent(DestinoRelat))
                .addGap(18, 18, 18)
                .addGroup(RelatorioDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TaxAdminRelat)
                    .addComponent(LugarRelat))
                .addGap(18, 18, 18)
                .addGroup(RelatorioDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PrecoTotalRelat)
                    .addComponent(BolsaMaoRelat))
                .addGap(18, 18, 18)
                .addComponent(PagamentoRelat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(VoltarRelat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        getContentPane().add(RelatorioDeCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        FundoAzulPanel.setBackground(new java.awt.Color(170, 205, 245));

        javax.swing.GroupLayout FundoAzulPanelLayout = new javax.swing.GroupLayout(FundoAzulPanel);
        FundoAzulPanel.setLayout(FundoAzulPanelLayout);
        FundoAzulPanelLayout.setHorizontalGroup(
            FundoAzulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        FundoAzulPanelLayout.setVerticalGroup(
            FundoAzulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(FundoAzulPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Ação executada quando o botão "Login" é pressionado.
     * Navega para a aba de login.
     * @param evt O evento associado ao botão.
     */
    private void abaLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaLoginButtonActionPerformed
        MainRightPanel.setSelectedIndex(1);
    }//GEN-LAST:event_abaLoginButtonActionPerformed
    /**
     * Ação executada quando o botão "Registar" é pressionado.
     * Navega para a aba de registo.
     * @param evt O evento associado ao botão.
     */
    private void abaRegistoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaRegistoButtonActionPerformed
        MainRightPanel.setSelectedIndex(0);
    }//GEN-LAST:event_abaRegistoButtonActionPerformed
    /**
     * Ação executada quando o botão "Voltar" é pressionado.
     * Oculta os painéis de administração, voltando para o painel principal.
     * @param evt O evento associado ao botão.
     */
    private void VoltarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarButton1ActionPerformed
        MainRightPanel.setVisible(false);
        MainLeftPanel.setVisible(false);
        AdminUserPanel.setVisible(true);        
    }//GEN-LAST:event_VoltarButton1ActionPerformed
    /**
     * Ação executada quando o botão "Entrar" é pressionado.
     * Oculta o painel de boas-vindas e exibe o painel principal.
     * @param evt O evento associado ao botão.
     */
    private void EntrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarButtonActionPerformed
        WelcomePanel.setVisible(false);
        AdminUserPanel.setVisible(true);
    }//GEN-LAST:event_EntrarButtonActionPerformed
    /**
     * Ação executada quando o botão "Admin" é pressionado.
     * Oculta o painel de utilizador e exibe os painéis de administração.
     * @param evt O evento associado ao botão.
     */
    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
        AdminUserPanel.setVisible(false);
        MainRightPanel.setVisible(true);
        MainLeftPanel.setVisible(true);
    }//GEN-LAST:event_AdminButtonActionPerformed
    /**
     * Ação executada quando o botão "User" é pressionado.
     * Oculta o painel principal e exibe o painel de utilizador.
     * @param evt O evento associado ao botão.
     */
    private void UserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserButtonActionPerformed
         AdminUserPanel.setVisible(false);
         UserPanel.setVisible(true);
    }//GEN-LAST:event_UserButtonActionPerformed
    /**
     * Ação executada quando o botão "A partir de Lisboa" é pressionado.
     * Oculta o painel de utilizador e exibe o painel dos voos.
     * @param evt O evento associado ao botão.
     */
    private void PartidaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartidaButtonActionPerformed
        UserPanel.setVisible(false);
        PartidaPanel.setVisible(true);
    }//GEN-LAST:event_PartidaButtonActionPerformed
    /**
     * Ação executada quando o botão "Até Lisboa" é pressionado.
     * Oculta o painel de utilizador e exibe o painel dos voos.
     * @param evt O evento associado ao botão.
     */
    private void VindaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VindaButtonActionPerformed
        UserPanel.setVisible(false);
        VindaPanel.setVisible(true);
    }//GEN-LAST:event_VindaButtonActionPerformed
    /**
     * Ação executada quando o botão "Registar" é pressionado.
     * Obtém informações do utilizador, senha, código de administrador e realiza o registo se todas as condições forem atendidas.
     * Exibe mensagens de erro ou sucesso conforme necessário.
     * @param evt O evento associado ao botão.
     */
    private void RegistarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistarButtonActionPerformed
        String user = this.nomeEntryR.getText();
        char[] password = this.passEntryR.getPassword();
        char[] passwordConfirm = this.ConfirmarPassEntryR.getPassword();
        char[] adminCodeTry = this.AdminCodeEntryR.getPassword();
        Boolean userExiste = false;
        
        // Verifica se o nome de utilizador já existe na lista de administradores
        for (int i=0; i< dataStorage.getListaAdmins().size(); i++ ){
            if(dataStorage.getListaAdmins().get(i).getUsername().equals(user)){
                userExiste = true;
                break;
            }
        }
        
        // Exibe mensagens de erro ou realiza o registo se todas as condições forem atendidas
        if (userExiste){
            JOptionPane.showMessageDialog(null, "Já existe um utilizador com esse nome.", "Erro", JOptionPane.ERROR_MESSAGE);
        }else if(user.equals("") || password.length == 0 || adminCodeTry.length == 0){
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos obrigatórios para se registar.", "Erro", JOptionPane.ERROR_MESSAGE);
        }else if(!Arrays.equals(password, passwordConfirm)){
            JOptionPane.showMessageDialog(null, "As passwords não coincidem.", "Erro", JOptionPane.ERROR_MESSAGE);
        }else if(!Arrays.equals(adminCodeTry, adminCode)){
            JOptionPane.showMessageDialog(null, "Código de Admin incorreto.", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            // Registra o novo administrador, salva os dados e exibe mensagem de sucesso
            AdminRegister admin = new AdminRegister(user, password);
            dataStorage.getListaAdmins().add(admin);
            saveDataToFile();
            JOptionPane.showMessageDialog(null, "Registo concluído! Bem-vindo, " + user + "!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }    
    }//GEN-LAST:event_RegistarButtonActionPerformed
    /**
     * Ação executada quando o botão "Barcelona to Lisboa" é pressionado.
     * Executa a ação associada a esse botão específico.
     * @param evt O evento associado ao botão.
     */
    private void BarcelonaToLisboaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarcelonaToLisboaActionPerformed
        acaoBotaoComprarVoo(dataStorage.getListaVoosBarcelonaToLisboa());
        dataStorage.setFlagBarcelonaToLisboaButton(true);
    }//GEN-LAST:event_BarcelonaToLisboaActionPerformed
    /**
     * Ação executada quando o botão "Lisboa to Londres" é pressionado.
     * Executa a ação associada a esse botão específico.
     * @param evt O evento associado ao botão.
     */
    private void LisboaToLondresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LisboaToLondresActionPerformed
        acaoBotaoComprarVoo(dataStorage.getListaVoosLisboaToLondres());
        dataStorage.setFlagLisboaToLondresButton(true);
    }//GEN-LAST:event_LisboaToLondresActionPerformed
    /**
     * Ação executada quando o botão "Voltar" é pressionado na tela de "Até Lisboa".
     * Oculta o painel de "Até Lisboa" e exibe o painel de utilizador.
     * @param evt O evento associado ao botão.
     */
    private void Back_VindaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_VindaActionPerformed
        UserPanel.setVisible(true);
        VindaPanel.setVisible(false);
    }//GEN-LAST:event_Back_VindaActionPerformed
    /**
     * Ação executada quando o botão "Voltar" é pressionado na tela principal.
     * Oculta o painel princiapal e exibe o painel de boas vindas.
     * @param evt O evento associado ao botão.
     */
    private void Back_AdminUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_AdminUserActionPerformed
        WelcomePanel.setVisible(true);
        AdminUserPanel.setVisible(false);
    }//GEN-LAST:event_Back_AdminUserActionPerformed
    /**
     * Ação executada quando o botão "Voltar" é pressionado na tela de "A partir de Lisboa".
     * Oculta o painel de "A partir de Lisboa" e exibe o painel de utilizador.
     * @param evt O evento associado ao botão.
     */
    private void Back_PartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_PartidaActionPerformed
        UserPanel.setVisible(true);
        PartidaPanel.setVisible(false);
    }//GEN-LAST:event_Back_PartidaActionPerformed
     /**
     * Ação executada quando o botão "Voltar" é pressionado na tela de utilizador.
     * Oculta o painel de utilizador e exibe o painel principal.
     * @param evt O evento associado ao botão.
     */
    private void Back_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_UserActionPerformed
        AdminUserPanel.setVisible(true);
         UserPanel.setVisible(false);
    }//GEN-LAST:event_Back_UserActionPerformed
    /**
     * Ação executada quando o botão de login é pressionado.
     * Obtém o nome de utilizador e a senha inseridos, verifica se o utilizador está registado e se a senha está correta.
     * Exibe mensagens de sucesso ou erro conforme necessário.
     * @param evt O evento associado ao botão.
     */
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String user = this.userEntry.getText();
        char[] password = this.passEntry.getPassword();
        boolean userEncontrado = false;

        // Verifica se o utilizador está registado e se a senha está correta
        for (int i = 0; i < dataStorage.getListaAdmins().size(); i++) {
            if (dataStorage.getListaAdmins().get(i).getUsername().equals(user)) {
                userEncontrado = true;
                if (Arrays.equals(password, dataStorage.getListaAdmins().get(i).getPassword())) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    AdminRightPanel.setVisible(true);
                    AdminLeftPanel.setVisible(true);
                    MainRightPanel.setVisible(false);
                    MainLeftPanel.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "User e/ou password incorreto(s)!", "Erro", JOptionPane.ERROR_MESSAGE);
                    break; 
                }
            }
        }

        // Exibe mensagem de erro se o utilizador não estiver registado
        if (!userEncontrado) {
            JOptionPane.showMessageDialog(null, "Esse utilizador ("+ user + ") não se encontra registado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
                                            
    }//GEN-LAST:event_loginButtonActionPerformed
    /**
     * Ação executada quando o botão do voo especifico é pressionado na tela de escolha de voos.
     * Executa a ação associada a esse botão específico.
     * @param evt O evento associado ao botão.
     */
    private void LisboaToBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LisboaToBarcelonaActionPerformed
        acaoBotaoComprarVoo(dataStorage.getListaVoosLisboaToBarcelona());
        dataStorage.setFlagLisboaToBarcelonaButton(true);
    }//GEN-LAST:event_LisboaToBarcelonaActionPerformed

    private void LisboaToParisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LisboaToParisActionPerformed
        acaoBotaoComprarVoo(dataStorage.getListaVoosLisboaToParis());
        dataStorage.setFlagLisboaToParisButton(true);
    }//GEN-LAST:event_LisboaToParisActionPerformed

    private void LisboaToAmesterdãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LisboaToAmesterdãoActionPerformed
        acaoBotaoComprarVoo(dataStorage.getListaVoosLisboaToAmesterdao());
        dataStorage.setFlagLisboaToAmesterdaoButton(true);
    }//GEN-LAST:event_LisboaToAmesterdãoActionPerformed

    private void LisboaToAtenasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LisboaToAtenasActionPerformed
        acaoBotaoComprarVoo(dataStorage.getListaVoosLisboaToAtenas());
        dataStorage.setFlagLisboaToAtenasButton(true);
    }//GEN-LAST:event_LisboaToAtenasActionPerformed

    private void LisboaToVarsoviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LisboaToVarsoviaActionPerformed
        acaoBotaoComprarVoo(dataStorage.getListaVoosLisboaToVarsovia());
        dataStorage.setFlagLisboaToVarsoviaButton(true);
    }//GEN-LAST:event_LisboaToVarsoviaActionPerformed

    private void ParisToLisboaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParisToLisboaActionPerformed
        acaoBotaoComprarVoo(dataStorage.getListaVoosParisToLisboa());
        dataStorage.setFlagParisToLisboaButton(true);
    }//GEN-LAST:event_ParisToLisboaActionPerformed
           
    private void LondresToLisboaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LondresToLisboaActionPerformed
        acaoBotaoComprarVoo(dataStorage.getListaVoosLondresToLisboa());
        dataStorage.setFlagLondresToLisboaButton(true);
    }//GEN-LAST:event_LondresToLisboaActionPerformed

    private void AmesterdãoToLisboaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmesterdãoToLisboaActionPerformed
        acaoBotaoComprarVoo(dataStorage.getListaVoosAmesterdaoToLisboa());
        dataStorage.setFlagAmesterdaoToLisboaButton(true);
    }//GEN-LAST:event_AmesterdãoToLisboaActionPerformed

    private void AtenasToLisboaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtenasToLisboaActionPerformed
        acaoBotaoComprarVoo(dataStorage.getListaVoosAtenasToLisboa());
        dataStorage.setFlagAtenasToLisboaButton(true);
    }//GEN-LAST:event_AtenasToLisboaActionPerformed

    private void VarsoviaToLisboaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarsoviaToLisboaActionPerformed
        acaoBotaoComprarVoo(dataStorage.getListaVoosVarsoviaToLisboa());
        dataStorage.setFlagVarsoviaToLisboaButton(true);
    }//GEN-LAST:event_VarsoviaToLisboaActionPerformed
    /**
     * Ação executada quando o botão "Criar Voos" é pressionado.
     * Seleciona o índice 0 no painel da direita (criar voo).
     * @param evt O evento associado ao botão.
     */
    private void CriarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarButtonActionPerformed
        AdminRightPanel.setSelectedIndex(0);
    }//GEN-LAST:event_CriarButtonActionPerformed
    /**
     * Ação executada quando o botão "Gerir Voos" é pressionado.
     * Oculta os painéis de administração e exibe a tabela dos voos.
     * @param evt O evento associado ao botão.
     */
    private void EstatisticaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstatisticaButtonActionPerformed
        AdminRightPanel.setVisible(false);
        AdminLeftPanel.setVisible(false);
        EstatisticaPanel.setVisible(true);
    }//GEN-LAST:event_EstatisticaButtonActionPerformed
    /**
     * Ação executada quando o botão "Log out" é pressionado.
     * Pede confirmação ao utilizador antes de efetuar o logout. 
     * Se confirmado, retorna à tela de boas-vindas e limpa os campos de entrada.
     * @param evt O evento associado ao botão.
     */
    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // Pede confirmação ao utilizador antes de efetuar o logout
        int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fazer log out?", "Confirmação", JOptionPane.YES_NO_OPTION);
        
        // Se a resposta for sim, realiza o logout
        if (resposta == JOptionPane.YES_OPTION) {
            // Volta à tela de boas-vindas e oculta os painéis de administração
            WelcomePanel.setVisible(true);
            AdminRightPanel.setVisible(false);
            AdminLeftPanel.setVisible(false);
            
            // Limpa os campos de entrada
            this.passEntryR.setText("");
            this.nomeEntryR.setText("");
            this.ConfirmarPassEntryR.setText("");
            this.AdminCodeEntryR.setText("");
            this.userEntry.setText("");
            this.passEntry.setText("");
        }
    }//GEN-LAST:event_LogOutButtonActionPerformed
    /**
     * Ação executada quando o botão "A partir de Lisboa" é clicado.
     * @param evt O evento associado ao botão.
     */
    private void ApartirButtonAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApartirButtonAdminMouseClicked
        // Seleciona o índice 1 no painel da direita (voos partindo de Lisboa)
        AdminRightPanel.setSelectedIndex(1);
    }//GEN-LAST:event_ApartirButtonAdminMouseClicked
    /**
     * Ação executada quando o botão "Até" é pressionado.
     * @param evt O evento associado ao botão.
     */
    private void AteButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AteButtonAdminActionPerformed
        // Seleciona o índice 2 no painel da direita (voos chegando a Lisboa)
        AdminRightPanel.setSelectedIndex(2);
    }//GEN-LAST:event_AteButtonAdminActionPerformed
    /**
     * Ação executada quando o botão "Confirmar" é pressionado.
     * Verifica se os campos estão preenchidos e adiciona um novo voo a partir de Lisboa 
     * para o destino selecionado na data especificada.
     * Exibe uma mensagem de erro se a data selecionada for anterior à data atual.
     * @param evt O evento associado ao botão.
     */
    private void ApartirConfirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApartirConfirmarButtonActionPerformed
        // Verifica se o país de partida e a data foram selecionados
        if (ApartirPaisesCombo.getSelectedItem() != null && jDateChooser1.getDate() != null) {
            // Obtém a data e hora atuais
            Calendar dataAtual = Calendar.getInstance();
            // Obtém a data selecionada do seletor de data
            Date dataSelecionada = jDateChooser1.getDate();
            // Converte a data selecionada para uma string no formato específico
            String dataSelecionadaString = new SimpleDateFormat("dd/MM/yyyy").format(jDateChooser1.getDate());

            // Verifica se a data selecionada não é anterior à data atual
            if (!dataSelecionada.before(dataAtual.getTime())) {
                // Com base no país de partida, adiciona um voo para o destino correspondente na lista de voos
                if ("Amesterdão".equals(ApartirPaisesCombo.getSelectedItem())) {
                    adicionarVooParaDestino("Lisboa", "Amesterdão", dataStorage.getListaVoosLisboaToAmesterdao(), dataSelecionadaString);
                } else if ("Barcelona".equals(ApartirPaisesCombo.getSelectedItem())) {
                    adicionarVooParaDestino("Lisboa", "Barcelona", dataStorage.getListaVoosLisboaToBarcelona(), dataSelecionadaString);
                } else if ("Paris".equals(ApartirPaisesCombo.getSelectedItem())) {
                    adicionarVooParaDestino("Lisboa", "Paris", dataStorage.getListaVoosLisboaToParis(), dataSelecionadaString);
                } else if ("Londres".equals(ApartirPaisesCombo.getSelectedItem())) {
                    adicionarVooParaDestino("Lisboa", "Londres", dataStorage.getListaVoosLisboaToLondres(), dataSelecionadaString);
                } else if ("Atenas".equals(ApartirPaisesCombo.getSelectedItem())) {
                    adicionarVooParaDestino("Lisboa", "Atenas", dataStorage.getListaVoosLisboaToAtenas(), dataSelecionadaString);
                } else if ("Varsóvia".equals(ApartirPaisesCombo.getSelectedItem())) {
                    adicionarVooParaDestino("Lisboa", "Varsóvia", dataStorage.getListaVoosLisboaToVarsovia(), dataSelecionadaString);
                }
            } else {
                // Exibe uma mensagem de erro se a data selecionada for anterior à data atual
                JOptionPane.showMessageDialog(null, "A data selecionada é anterior à data atual", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            // Exibe uma mensagem de erro se o país de partida ou a data não foram selecionados
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ApartirConfirmarButtonActionPerformed

    private void EstatisticaVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstatisticaVoltarActionPerformed
        // Esconde o painel de estatísticas
        EstatisticaPanel.setVisible(false);
        // Torna visíveis os painéis de administração
        AdminRightPanel.setVisible(true);
        AdminLeftPanel.setVisible(true);
    }//GEN-LAST:event_EstatisticaVoltarActionPerformed

    private void AteConfirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AteConfirmarButtonActionPerformed
        // Verifica se o país de origem e a data de partida estão selecionados
        System.out.println(AtePaisesCombo.getSelectedItem());
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(jDateChooser2.getDate()));
        if (AtePaisesCombo.getSelectedItem() != null && jDateChooser2.getDate() != null) {
            // Obtém a data atual
            Calendar dataAtual = Calendar.getInstance();
            // Obtém a data selecionada pelo utilizador
            Date dataSelecionada = jDateChooser2.getDate();
            // Formata a data selecionada para o formato dd/MM/yyyy
            String dataSelecionadaString = new SimpleDateFormat("dd/MM/yyyy").format(jDateChooser2.getDate());

            // Verifica se a data selecionada é posterior à data atual
            if (!dataSelecionada.before(dataAtual.getTime())) {
                // Adiciona um voo para o destino correspondente com base nas seleções do utilizador
                if ("Amesterdão".equals(AtePaisesCombo.getSelectedItem())) {
                    adicionarVooParaDestino("Amesterdão", "Lisboa", dataStorage.getListaVoosAmesterdaoToLisboa(), dataSelecionadaString);
                } else if ("Barcelona".equals(AtePaisesCombo.getSelectedItem())) {
                    adicionarVooParaDestino("Barcelona", "Lisboa", dataStorage.getListaVoosBarcelonaToLisboa(), dataSelecionadaString);
                } else if ("Paris".equals(AtePaisesCombo.getSelectedItem())) {
                    adicionarVooParaDestino("Paris", "Lisboa", dataStorage.getListaVoosParisToLisboa(), dataSelecionadaString);
                } else if ("Londres".equals(AtePaisesCombo.getSelectedItem())) {
                    adicionarVooParaDestino("Londres", "Lisboa", dataStorage.getListaVoosLondresToLisboa(), dataSelecionadaString);
                } else if ("Atenas".equals(AtePaisesCombo.getSelectedItem())) {
                    adicionarVooParaDestino("Atenas", "Lisboa", dataStorage.getListaVoosAtenasToLisboa(), dataSelecionadaString);
                } else if ("Varsóvia".equals(AtePaisesCombo.getSelectedItem())) {
                    adicionarVooParaDestino("Varsóvia", "Lisboa", dataStorage.getListaVoosVarsoviaToLisboa(), dataSelecionadaString);
                }
            } else {
                // Exibe mensagem de erro se a data selecionada for anterior à data atual
                JOptionPane.showMessageDialog(null, "A data selecionada é anterior à data atual", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            // Exibe mensagem de erro se algum dos campos não estiver preenchido
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AteConfirmarButtonActionPerformed

    private void deleteVooButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVooButtonActionPerformed
        // Obtém a linha selecionada na tabela de voos 
        int linhaEscolhida = tabelaVoosAdmin.getSelectedRow();

        // Obtém os modelos da tabela dos voos e da tabela dos clientes 
        DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
        DefaultTableModel clientesAdmin = (DefaultTableModel) TabelaClientesAdmin.getModel();

        // Verifica se há pelo menos um voo na tabela de voos
        if (tabelaVoosAdmin.getRowCount() != 0) {
            // Verifica se alguma linha foi selecionada
            if (linhaEscolhida != -1) {
                // Obtém o ID do voo na linha selecionada
                String idVoo = (String) tabelaVoosAdmin.getValueAt(linhaEscolhida, 4);

                // Procura o voo correspondente pelo ID
                Voo vooEncontrado = procurarVooPorId(idVoo);

                // Pede confirmação ao utilizador para excluir o voo
                int resposta = JOptionPane.showConfirmDialog(this, "Tem a certeza que deseja eliminar esse voo?", "Confirmação", JOptionPane.YES_NO_OPTION);

                // Se o utilizador confirmar a exclusão
                if (resposta == JOptionPane.YES_OPTION) {
                    // Remove o ID do voo da lista geral de IDs de voos
                    dataStorage.getIdVoos().remove(idVoo);

                    // Remove o voo das listas específicas de voos
                    dataStorage.removerVooDaListaDeListasDeVoos(vooEncontrado);

                    // Remove a linha correspondente na tabela de voos
                    voosAdmin.removeRow(linhaEscolhida);

                    // Remove clientes associados a esse voo da lista de clientes
                    for (int i = 0; i < dataStorage.getListaDeClientes().size(); i++) {
                        if (dataStorage.getListaDeClientes().get(i).getIdVooComprado().equals(idVoo)) {
                            dataStorage.getListaDeClientes().remove(i);
                        }
                    }

                    // Limpa a tabela dos clientes
                    clientesAdmin.setRowCount(0);

                    // Preenche novamente a tabela dos clientes após a exclusão
                    for (int i = 0; i < dataStorage.getListaDeClientes().size(); i++) {
                        Object[] linhaClientes = {
                            dataStorage.getListaDeClientes().get(i).getNome(),
                            dataStorage.getListaDeClientes().get(i).getId(),
                            dataStorage.getListaDeClientes().get(i).getPartida(),
                            dataStorage.getListaDeClientes().get(i).getDestino(),
                            dataStorage.getListaDeClientes().get(i).getNomeAssento(),
                            dataStorage.getListaDeClientes().get(i).getDataVooComprado(),
                            dataStorage.getListaDeClientes().get(i).getPrecoTotal()
                        };
                        clientesAdmin.addRow(linhaClientes);
                    }
                }
                // Salva os dados atualizados no arquivo
                saveDataToFile();
            } else {
                // Exibe mensagem se nenhuma linha foi selecionada
                JOptionPane.showMessageDialog(null, "Selecione um voo para apagar.");
            }
        } else {
            // Exibe mensagem se não houver voos registados
            JOptionPane.showMessageDialog(null, "Não existem voos registados.");
        }
    }//GEN-LAST:event_deleteVooButtonActionPerformed

    private void VoltarEscolherDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarEscolherDataActionPerformed
        // Torna a interface do utilizador visível e a do painel de escolha de data invisível
        UserPanel.setVisible(true);
        EscolherDataPanel.setVisible(false);

        // Reseta as flags associadas aos botões de voos
        dataStorage.setFlagLisboaToBarcelonaButton(false);
        dataStorage.setFlagLisboaToParisButton(false);
        dataStorage.setFlagLisboaToLondresButton(false);
        dataStorage.setFlagLisboaToAmesterdaoButton(false);
        dataStorage.setFlagLisboaToAtenasButton(false);
        dataStorage.setFlagLisboaToVarsoviaButton(false);
        dataStorage.setFlagBarcelonaToLisboaButton(false);
        dataStorage.setFlagParisToLisboaButton(false);
        dataStorage.setFlagLondresToLisboaButton(false);
        dataStorage.setFlagAmesterdaoToLisboaButton(false);
        dataStorage.setFlagAtenasToLisboaButton(false);
        dataStorage.setFlagVarsoviaToLisboaButton(false);
    }//GEN-LAST:event_VoltarEscolherDataActionPerformed

    private void GerirClientesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerirClientesButtonActionPerformed
        // Torna o painel de gestão de clientes visível e esconde os painéis de administração
        AdminLeftPanel.setVisible(false);
        AdminRightPanel.setVisible(false);
        GestorClientes.setVisible(true);
    }//GEN-LAST:event_GerirClientesButtonActionPerformed

    private void VoltarGestorClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarGestorClientesActionPerformed
        // Torna os painéis de administração visíveis e esconde o painel de gestão de clientes
        AdminLeftPanel.setVisible(true);
        AdminRightPanel.setVisible(true);
        GestorClientes.setVisible(false);
    }//GEN-LAST:event_VoltarGestorClientesActionPerformed

    private void ConfirmarDataVooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarDataVooActionPerformed
        if(DataVooCombo.getItemCount() != 0){
            if (dataStorage.isFlagLisboaToBarcelonaButton() == true) {
                Voo voo = procurarVooPorDataOnLista(dataStorage.getListaVoosLisboaToBarcelona());
                Lugares lugares = new Lugares(voo);
                lugares.setVisible(true);
                Cliente cliente = new Cliente();
                cliente.setPartida(voo.getPartida());
                cliente.setDestino(voo.getDestino());
                cliente.setDataVooComprado((String)DataVooCombo.getSelectedItem());
                cliente.setIdVooComprado(voo.getIdVoo());
                dataStorage.getListaDeClientes().add(cliente);
                voo.setLugaresLivres(voo.getLugaresLivres() - 1);
                DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
                voosAdmin.fireTableDataChanged();
                dataStorage.setFlagLisboaToBarcelonaButton(false);
            }else if(dataStorage.isFlagLisboaToParisButton() == true) {
                Voo voo = procurarVooPorDataOnLista(dataStorage.getListaVoosLisboaToParis());
                Lugares lugares = new Lugares(voo);
                lugares.setVisible(true);
                Cliente cliente = new Cliente();
                cliente.setPartida(voo.getPartida());
                cliente.setDestino(voo.getDestino());
                cliente.setDataVooComprado((String)DataVooCombo.getSelectedItem());
                cliente.setIdVooComprado(voo.getIdVoo());
                dataStorage.getListaDeClientes().add(cliente);
                voo.setLugaresLivres(voo.getLugaresLivres() - 1);
                DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
                voosAdmin.fireTableDataChanged();
                dataStorage.setFlagLisboaToParisButton(false);
            }else if(dataStorage.isFlagLisboaToLondresButton() == true) {
                Voo voo = procurarVooPorDataOnLista(dataStorage.getListaVoosLisboaToLondres());
                Lugares lugares = new Lugares(voo);
                lugares.setVisible(true);
                Cliente cliente = new Cliente();
                cliente.setPartida(voo.getPartida());
                cliente.setDestino(voo.getDestino());
                cliente.setDataVooComprado((String)DataVooCombo.getSelectedItem());
                cliente.setIdVooComprado(voo.getIdVoo());
                dataStorage.getListaDeClientes().add(cliente);
                voo.setLugaresLivres(voo.getLugaresLivres() - 1);
                DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
                voosAdmin.fireTableDataChanged();
                dataStorage.setFlagLisboaToLondresButton(false);
            }else if(dataStorage.isFlagLisboaToAmesterdaoButton() == true) {
                Voo voo = procurarVooPorDataOnLista(dataStorage.getListaVoosLisboaToAmesterdao());
                Lugares lugares = new Lugares(voo);
                lugares.setVisible(true);
                Cliente cliente = new Cliente();
                cliente.setPartida(voo.getPartida());
                cliente.setDestino(voo.getDestino());
                cliente.setDataVooComprado((String)DataVooCombo.getSelectedItem());
                cliente.setIdVooComprado(voo.getIdVoo());
                dataStorage.getListaDeClientes().add(cliente);
                voo.setLugaresLivres(voo.getLugaresLivres() - 1);
                DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
                voosAdmin.fireTableDataChanged();
                dataStorage.setFlagLisboaToAmesterdaoButton(false);
            }else if(dataStorage.isFlagLisboaToAtenasButton() == true) {
                Voo voo = procurarVooPorDataOnLista(dataStorage.getListaVoosLisboaToAtenas());
                Lugares lugares = new Lugares(voo);
                lugares.setVisible(true);
                Cliente cliente = new Cliente();
                cliente.setPartida(voo.getPartida());
                cliente.setDestino(voo.getDestino());
                cliente.setDataVooComprado((String)DataVooCombo.getSelectedItem());
                cliente.setIdVooComprado(voo.getIdVoo());
                dataStorage.getListaDeClientes().add(cliente);
                voo.setLugaresLivres(voo.getLugaresLivres() - 1);
                DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
                voosAdmin.fireTableDataChanged();
                dataStorage.setFlagLisboaToAtenasButton(false);
            }else if(dataStorage.isFlagLisboaToVarsoviaButton() == true) {
                Voo voo = procurarVooPorDataOnLista(dataStorage.getListaVoosLisboaToVarsovia());
                Lugares lugares = new Lugares(voo);
                lugares.setVisible(true);
                Cliente cliente = new Cliente();
                cliente.setPartida(voo.getPartida());
                cliente.setDestino(voo.getDestino());
                cliente.setDataVooComprado((String)DataVooCombo.getSelectedItem());
                cliente.setIdVooComprado(voo.getIdVoo());
                dataStorage.getListaDeClientes().add(cliente);
                voo.setLugaresLivres(voo.getLugaresLivres() - 1);
                DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
                voosAdmin.fireTableDataChanged();
                dataStorage.setFlagLisboaToVarsoviaButton(false);
            }else if(dataStorage.isFlagBarcelonaToLisboaButton() == true) {
                Voo voo = procurarVooPorDataOnLista(dataStorage.getListaVoosBarcelonaToLisboa());
                Lugares lugares = new Lugares(voo);
                lugares.setVisible(true);
                Cliente cliente = new Cliente();
                cliente.setPartida(voo.getPartida());
                cliente.setDestino(voo.getDestino());
                cliente.setDataVooComprado((String)DataVooCombo.getSelectedItem());
                cliente.setIdVooComprado(voo.getIdVoo());
                dataStorage.getListaDeClientes().add(cliente);
                voo.setLugaresLivres(voo.getLugaresLivres() - 1);
                DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
                voosAdmin.fireTableDataChanged();
                dataStorage.setFlagBarcelonaToLisboaButton(false);
            }else if(dataStorage.isFlagParisToLisboaButton() == true) {
                Voo voo = procurarVooPorDataOnLista(dataStorage.getListaVoosParisToLisboa());
                Lugares lugares = new Lugares(voo);
                lugares.setVisible(true);
                Cliente cliente = new Cliente();
                cliente.setPartida(voo.getPartida());
                cliente.setDestino(voo.getDestino());
                cliente.setDataVooComprado((String)DataVooCombo.getSelectedItem());
                cliente.setIdVooComprado(voo.getIdVoo());
                dataStorage.getListaDeClientes().add(cliente);
                voo.setLugaresLivres(voo.getLugaresLivres() - 1);
                DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
                voosAdmin.fireTableDataChanged();
                dataStorage.setFlagParisToLisboaButton(false);
            }else if(dataStorage.isFlagLondresToLisboaButton() == true) {
                Voo voo = procurarVooPorDataOnLista(dataStorage.getListaVoosLondresToLisboa());
                Lugares lugares = new Lugares(voo);
                lugares.setVisible(true);
                Cliente cliente = new Cliente();
                cliente.setPartida(voo.getPartida());
                cliente.setDestino(voo.getDestino());
                cliente.setDataVooComprado((String)DataVooCombo.getSelectedItem());
                cliente.setIdVooComprado(voo.getIdVoo());
                dataStorage.getListaDeClientes().add(cliente);
                voo.setLugaresLivres(voo.getLugaresLivres() - 1);
                DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
                voosAdmin.fireTableDataChanged();
                dataStorage.setFlagLondresToLisboaButton(false);
            }else if(dataStorage.isFlagAmesterdaoToLisboaButton() == true) {
                Voo voo = procurarVooPorDataOnLista(dataStorage.getListaVoosAmesterdaoToLisboa());
                Lugares lugares = new Lugares(voo);
                lugares.setVisible(true);
                Cliente cliente = new Cliente();
                cliente.setPartida(voo.getPartida());
                cliente.setDestino(voo.getDestino());
                cliente.setDataVooComprado((String)DataVooCombo.getSelectedItem());
                cliente.setIdVooComprado(voo.getIdVoo());
                dataStorage.getListaDeClientes().add(cliente);
                voo.setLugaresLivres(voo.getLugaresLivres() - 1);
                DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
                voosAdmin.fireTableDataChanged();
                dataStorage.setFlagAmesterdaoToLisboaButton(false);
            }else if(dataStorage.isFlagAtenasToLisboaButton() == true) {
                Voo voo = procurarVooPorDataOnLista(dataStorage.getListaVoosAtenasToLisboa());
                Lugares lugares = new Lugares(voo);
                lugares.setVisible(true);
                Cliente cliente = new Cliente();
                cliente.setPartida(voo.getPartida());
                cliente.setDestino(voo.getDestino());
                cliente.setDataVooComprado((String)DataVooCombo.getSelectedItem());
                cliente.setIdVooComprado(voo.getIdVoo());
                dataStorage.getListaDeClientes().add(cliente);
                voo.setLugaresLivres(voo.getLugaresLivres() - 1);
                DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
                voosAdmin.fireTableDataChanged();
                dataStorage.setFlagAtenasToLisboaButton(false);
            }else if(dataStorage.isFlagVarsoviaToLisboaButton() == true) {
                Voo voo = procurarVooPorDataOnLista(dataStorage.getListaVoosVarsoviaToLisboa());
                Lugares lugares = new Lugares(voo);
                lugares.setVisible(true);
                Cliente cliente = new Cliente();
                cliente.setPartida(voo.getPartida());
                cliente.setDestino(voo.getDestino());
                cliente.setDataVooComprado((String)DataVooCombo.getSelectedItem());
                cliente.setIdVooComprado(voo.getIdVoo());
                dataStorage.getListaDeClientes().add(cliente);
                voo.setLugaresLivres(voo.getLugaresLivres() - 1);
                DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
                voosAdmin.fireTableDataChanged();
                dataStorage.setFlagVarsoviaToLisboaButton(false);

            }
            EscolherDataPanel.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Não existem datas disponíveis para este voo.", "Erro", JOptionPane.ERROR_MESSAGE);

            }
        
    }//GEN-LAST:event_ConfirmarDataVooActionPerformed
    /**
    * Método associado à ação do botão On/Off da bolsa de mão.
    * Alterna entre ativar/desativar a opção de bolsa de mão gratuita para o cliente atual.
    * Se o botão estiver marcado ("X"), desmarca e define a bolsa de mão como não gratuita.
    * Se o botão não estiver marcado, marca o botão como "X" e define a bolsa de mão como gratuita.
    *
    */
    private void OnOffBolsaDeMaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnOffBolsaDeMaoActionPerformed
        String textoAtual = OnOffBolsaDeMao.getText();
        // Verifica se o botão está marcado
        if (textoAtual.equals("X")) {
            // Desmarca o botão e define bolsa de mão como não gratuita
            OnOffBolsaDeMao.setText("");
            dataStorage.getListaDeClientes().get(dataStorage.getListaDeClientes().size() - 1).setBolsaMaoGratis(false);
        } else {
            // Marca o botão como "X" e define bolsa de mão como gratuita
            OnOffBolsaDeMao.setText("X");
            dataStorage.getListaDeClientes().get(dataStorage.getListaDeClientes().size() - 1).setBolsaMaoGratis(true);
        }
    }//GEN-LAST:event_OnOffBolsaDeMaoActionPerformed
    /**
    * Método associado à ação do botão "Cancelar Compra" na tela de Pagamento.
    * Exibe uma confirmação para o cliente, perguntando se ele tem certeza de que deseja cancelar a compra.
    * Se o cliente confirmar, remove o cliente da lista de clientes, libera o lugar no voo e retorna à tela principal do utilizador.
    * Caso contrário, permanece na tela de Pagamento.
    */
    private void VoltarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarPagamentoActionPerformed
        // Obtém o índice do último cliente na lista
        int idUltimoCliente = dataStorage.getListaDeClientes().size() - 1;

        // Exibe uma caixa de diálogo de confirmação
        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza que deseja cancelar a sua compra?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION
        );

        // Obtém o voo associado ao último cliente
        Voo vooDoCliente = procurarVooPorId(dataStorage.getListaDeClientes().get(idUltimoCliente).getIdVooComprado());

        // Verifica se o cliente confirmou o cancelamento
        if (resposta == JOptionPane.YES_OPTION) {
            // Remove o cliente da lista
            dataStorage.getListaDeClientes().remove(idUltimoCliente);

            // Libera o lugar no voo
            vooDoCliente.setLugaresLivres(vooDoCliente.getLugaresLivres() + 1);

            // Volta para a tela principal do utilizador
            PagamentoPanel.setVisible(false);
            UserPanel.setVisible(true);
        }
        // Se o cliente optar por não cancelar, permanece na tela de Pagamento
    }//GEN-LAST:event_VoltarPagamentoActionPerformed
    /**
    * Método associado à ação do botão "Confirmar Compra" na tela de Pagamento.
    * Realiza a confirmação da compra, adiciona informações ao relatório de compra e atualiza as tabelas de clientes e voos.
    * Se o nome do cliente inserido for válido, a compra é confirmada e o utilizador é redirecionado para o relatório de compra.
    * Caso contrário, exibe uma mensagem de erro solicitando que o nome seja inserido sem caracteres inválidos.
    */
    private void ConfirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarCompraActionPerformed
        // Obtém o índice do último cliente na lista
        int indexUltimoCliente = dataStorage.getListaDeClientes().size() - 1;

        // Obtém o voo associado ao último cliente
        Voo vooDoCliente = procurarVooPorId(dataStorage.getListaDeClientes().get(indexUltimoCliente).getIdVooComprado());

        // Obtém informações sobre o último cliente
        Cliente ultimoCliente = dataStorage.getListaDeClientes().get(indexUltimoCliente);

        // Obtém referências às tabelas de clientes e voos.
        DefaultTableModel clientesAdmin = (DefaultTableModel) TabelaClientesAdmin.getModel();
        DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();

        // Verifica se o nome do cliente inserido é válido
        if (NomeClienteEntry.getText().matches("[a-zA-Z]+( [a-zA-Z]+)?")) {
            // Adiciona informações ao relatório de compra
            vooDoCliente.getListaNomeLugaresOcupados().add(ultimoCliente.getNomeAssento());
            ultimoCliente.setMetodoPagamento((String) PagamentoCombo.getSelectedItem());
            ultimoCliente.setNome(NomeClienteEntry.getText());

            // Atualiza os rótulos do relatório de compra com informações do último cliente
            NomeRelat.setText("Nome do Cliente: " + ultimoCliente.getNome());
            PartidaRelat.setText("Partida: " + ultimoCliente.getPartida());
            DestinoRelat.setText("Destino: " + ultimoCliente.getDestino());
            LugarRelat.setText("Lugar: " + ultimoCliente.getNomeAssento());

            // Adiciona informações adicionais ao relatório de compra
            if (ultimoCliente.getBolsaMaoGratis()) {
                BolsaMaoRelat.setText("Bolsa de mão grátis: Sim");
            } else {
                BolsaMaoRelat.setText("Bolsa de mão grátis: Não");
            }

            PagamentoRelat.setText("Método de pagamento: " + ultimoCliente.getMetodoPagamento());
            PrecoAssentoRelat.setText("Preço do Voo: " + ultimoCliente.getPrecoAssento() + "€");

            if (ultimoCliente.getQuerBagagemExtra()) {
                BagExtraRelat.setText("Bagagem extra: " + ultimoCliente.getPrecoBagagemExtra() + "€");
            } else {
                BagExtraRelat.setText("Bagagem extra: Não");
            }

            if (ultimoCliente.getQuerSeguro()) {
                SegRelat.setText("Seguro: " + ultimoCliente.getPrecoSeguro() + "€");
            } else {
                SegRelat.setText("Seguro: Não");
            }

            PrecoTotalRelat.setText("Preço Total: " + ultimoCliente.getPrecoTotal() + "€");

            // Adiciona uma nova linha à tabela de clientes
            Object[] linha = {ultimoCliente.getNome(), ultimoCliente.getId(), ultimoCliente.getPartida(), ultimoCliente.getDestino(), ultimoCliente.getNomeAssento(), ultimoCliente.getDataVooComprado(), ultimoCliente.getPrecoTotal()};
            clientesAdmin.addRow(linha);
            clientesAdmin.fireTableDataChanged();

            // Atualiza a tabela de voos
            voosAdmin.setRowCount(0);
            for (int i = 0; i < dataStorage.getListaDeListasDeVoos().size(); i++) {
                for (int k = 0; k < dataStorage.getListaDeListasDeVoos().get(i).size(); k++) {
                    Object[] linhaVoo = {dataStorage.getListaDeListasDeVoos().get(i).get(k).getPartida(), dataStorage.getListaDeListasDeVoos().get(i).get(k).getDestino(), dataStorage.getListaDeListasDeVoos().get(i).get(k).getData(), dataStorage.getListaDeListasDeVoos().get(i).get(k).getLugaresLivres(), dataStorage.getListaDeListasDeVoos().get(i).get(k).getIdVoo()};
                    voosAdmin.addRow(linhaVoo);
                }
            }
            voosAdmin.fireTableDataChanged();

            // Exibe o relatório de compra e salva os dados em arquivo
            PagamentoPanel.setVisible(false);
            RelatorioDeCompra.setVisible(true);
            saveDataToFile();

        } else {
            // Exibe mensagem de erro se o nome do cliente inserido não for válido
            JOptionPane.showMessageDialog(this, "Insira o seu nome sem caracteres inválidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConfirmarCompraActionPerformed
    /**
    * Método associado à ação do botão "ApartirButtonAdmin".
    * Navega para o painel seguinte no AdminRightPanel.
    */
    private void ApartirButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApartirButtonAdminActionPerformed
        AdminRightPanel.setSelectedIndex(1);
    }//GEN-LAST:event_ApartirButtonAdminActionPerformed
    /**
    * Método chamado quando a janela está prestes a ser fechada.
    * Verifica se o PagamentoPanel está visível e, em caso afirmativo, solicita confirmação para fechar a janela.
    * Se confirmado, remove o último cliente registado e fecha a janela.
    * Se cancelado, impede o fechamento da janela.
    */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int ultimaLinha = dataStorage.getListaDeClientes().size() - 1;
        if (PagamentoPanel.isVisible()) {
            int resposta = JOptionPane.showConfirmDialog(null, "O seu registo vai ser eliminado caso escolha.\nTem certeza que deseja sair agora?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                dataStorage.getListaDeClientes().remove(ultimaLinha);
                saveDataToFile();
                dispose();
            } else {
                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            }
        } else {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing
    /**
    * Método associado à ação do evento quando há uma seleção no PagamentoCombo.
    * Atualiza o método de pagamento do último cliente na lista com a opção selecionada no combo.
    */
    private void PagamentoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagamentoComboActionPerformed
        dataStorage.getListaDeClientes().get(dataStorage.getListaDeClientes().size() - 1).setMetodoPagamento((String)PagamentoCombo.getSelectedItem());
    }//GEN-LAST:event_PagamentoComboActionPerformed
    /**
    * Método associado à ação do botão "VoltarRelat" na interface de relatório de compra.
    * Oculta o painel de relatório de compra e exibe o painel de boas-vindas.
    */
    private void VoltarRelatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarRelatActionPerformed
        RelatorioDeCompra.setVisible(false);
        WelcomePanel.setVisible(true);
    }//GEN-LAST:event_VoltarRelatActionPerformed
    /**
    * Método associado à ação do botão "ApagarClientes".
    * Permite ao administrador apagar um cliente selecionado na tabela de clientes.
    */
    private void ApagarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarClientesActionPerformed
        // Obtém a linha selecionada na tabela de clientes
        int linhaEscolhida = TabelaClientesAdmin.getSelectedRow();
        // Obtém os modelos de tabela para clientes e voos
        DefaultTableModel clienteAdmin = (DefaultTableModel) TabelaClientesAdmin.getModel();
        DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();

        // Verifica se há clientes na tabela
        if (TabelaClientesAdmin.getRowCount() != 0) {
            // Verifica se uma linha está selecionada
            if (TabelaClientesAdmin.getSelectedRow() != -1) {
                // Obtém o ID do cliente selecionado
                String idCliente = (String) TabelaClientesAdmin.getValueAt(linhaEscolhida, 1);
                // Procura o cliente na lista usando o ID
                Cliente clienteEncontrado = procurarClientePorId(idCliente);
                // Obtém o voo associado ao cliente
                Voo vooDoCliente = procurarVooPorId(clienteEncontrado.getIdVooComprado());

                // Pede confirmação antes de apagar o cliente
                int resposta = JOptionPane.showConfirmDialog(this, "Tem a certeza que deseja eliminar esse cliente?", "Confirmação", JOptionPane.YES_NO_OPTION);

                // Se a confirmação for positiva
                if (resposta == JOptionPane.YES_OPTION) {
                    // Remove o cliente da lista
                    dataStorage.getListaDeClientes().remove(clienteEncontrado);
                    // Remove a linha correspondente na tabela de clientes
                    clienteAdmin.removeRow(linhaEscolhida);
                    // Libera o lugar ocupado pelo cliente no voo
                    vooDoCliente.getListaNomeLugaresOcupados().remove(clienteEncontrado.getNomeAssento());
                    vooDoCliente.setLugaresLivres(vooDoCliente.getLugaresLivres() + 1);

                    // Atualiza a tabela de voos
                    voosAdmin.setRowCount(0);
                    for (int i = 0; i < dataStorage.getListaDeListasDeVoos().size(); i++) {
                        for (int k = 0; k < dataStorage.getListaDeListasDeVoos().get(i).size(); k++) {
                            Object[] linhaVoo = {dataStorage.getListaDeListasDeVoos().get(i).get(k).getPartida(),
                                    dataStorage.getListaDeListasDeVoos().get(i).get(k).getDestino(),
                                    dataStorage.getListaDeListasDeVoos().get(i).get(k).getData(),
                                    dataStorage.getListaDeListasDeVoos().get(i).get(k).getLugaresLivres(),
                                    dataStorage.getListaDeListasDeVoos().get(i).get(k).getIdVoo()};
                            voosAdmin.addRow(linhaVoo);
                        }
                    }
                    voosAdmin.fireTableDataChanged();
                    // Salva as alterações no arquivo
                    saveDataToFile();
                }
            } else {
                // Avisa quando nenhuma linha está selecionada
                JOptionPane.showMessageDialog(null, "Selecione um cliente para apagar.");
            }
        } else {
            // Avisa quando não há clientes na tabela
            JOptionPane.showMessageDialog(null, "Não existem clientes registados em nenhum voo.");
        }
    }//GEN-LAST:event_ApagarClientesActionPerformed

    /**
    * Ponto de entrada principal do programa.
    * Configura o tema visual FlatCyanLightIJ e inicia a interface do utilizador.
    */
    public static void main(String args[]) {
        // Configura o tema visual FlatCyanLightIJ
        FlatCyanLightIJTheme.setup();

        // Inicia a interface do utilizador em uma thread de despacho de eventos
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Torna a instância da UI visível
                UI.getInstance().setVisible(true);
            }
        });
    }
    
    /**
    * Carrega os dados do arquivo "dataStorage.ser" para a instância do DataStorage.
    * Se o arquivo não for encontrado, cria uma nova instância e salva-a no arquivo.
    * Em caso de exceções, imprime o rastreamento de pilha.
    */
    private void loadDataFromFile() {
        try (FileInputStream fileIn = new FileInputStream("dataStorage.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            // Tenta ler a instância serializada do DataStorage do arquivo
            dataStorage = (DataStorage) objectIn.readObject();
        } catch (FileNotFoundException e) {
            // Cria uma nova instância do DataStorage se o arquivo não for encontrado
            dataStorage = new DataStorage();
            // Salva a nova instância no arquivo
            saveDataToFile();
        } catch (IOException | ClassNotFoundException e) {
            // Imprime o rastreamento de pilha para exceções de E/S ou de classe não encontrada
            e.printStackTrace();
        }
}

    /**
     * Salva a instância atual do DataStorage no arquivo "dataStorage.ser".
     * Em caso de exceção de E/S, imprime o rastreamento de pilha.
     */
    private void saveDataToFile() {
        try (FileOutputStream fileOut = new FileOutputStream("dataStorage.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            // Serializa e salva a instância do DataStorage no arquivo
            objectOut.writeObject(dataStorage);
        } catch (IOException e) {
            // Imprime o rastreamento de pilha para exceções de E/S
            e.printStackTrace();
        }
    }
    
    /**
    * Adiciona voos de uma lista à tabela na interface gráfica.
    * @param list Lista de listas de voos a serem adicionados à tabela.
    */
    private void addVoosdaListaATabela(List<List<Voo>> list) {
        DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
        for (int i = 0; i < list.size(); i++) {
            for (int k = 0; k < list.get(i).size(); k++) {
                // Cria uma linha com os dados do voo e a adiciona à tabela
                Object[] linha = {list.get(i).get(k).getPartida(), list.get(i).get(k).getDestino(),
                                   list.get(i).get(k).getData(), list.get(i).get(k).getLugaresLivres(),
                                   list.get(i).get(k).getIdVoo()};
                voosAdmin.addRow(linha);   
            }
        }
        // Notifica a tabela de que os dados foram alterados
        voosAdmin.fireTableDataChanged();
    }

    /**
     * Adiciona os dados finais à tabela de voos na interface gráfica.
     */
    private void addDadosFinaisTabelaVoos() {
        // Chama o método para adicionar voos à tabela usando a lista de listas de voos do DataStorage
        addVoosdaListaATabela(dataStorage.getListaDeListasDeVoos());
    }
    
    /**
    * Adiciona clientes de uma lista à tabela na interface gráfica.
    * @param list Lista de clientes a serem adicionados à tabela.
    */
    private void addClientesdaListaATabela(List<Cliente> list) {
        DefaultTableModel clientesAdmin = (DefaultTableModel) TabelaClientesAdmin.getModel();
        for (int i = 0; i < list.size(); i++) {
            // Cria uma linha com os dados do cliente e a adiciona à tabela
            Object[] linha = {list.get(i).getNome(), list.get(i).getId(), list.get(i).getPartida(),
                              list.get(i).getDestino(), list.get(i).getNomeAssento(),
                              list.get(i).getDataVooComprado(), list.get(i).getPrecoTotal()};
            clientesAdmin.addRow(linha);   
       }
        // Notifica a tabela de que os dados foram alterados
        clientesAdmin.fireTableDataChanged();
   }

        
    
   /**
   * Procura um voo na lista de listas de voos com base no ID.
   * @param ID Identificador único do voo.
   * @return Objeto Voo correspondente ao ID, ou null se não encontrado.
   */
   private Voo procurarVooPorId(String ID) {
       for (List<Voo> lista : dataStorage.getListaDeListasDeVoos()) {
           for (Voo voo : lista) {
               if (voo.getIdVoo().equals(ID)) {
                   return voo;
               }
           }
       }
       return null;
   }

    /**
    * Procura um voo na lista fornecida com base na data selecionada no combo box.
    * @param lista Lista de voos a ser pesquisada.
    * @return Objeto Voo correspondente à data selecionada, ou null se não encontrado.
    */
    private Voo procurarVooPorDataOnLista(List<Voo> lista) {
        String opcaoEscolhida = (String) DataVooCombo.getSelectedItem();
        for (Voo voo : lista) {
            if (voo.getData().equals(opcaoEscolhida)) {
               return voo;
            }
        }
        return null;
    }

    /**
    * Procura um cliente na lista de clientes com base no ID.
    * @param ID Identificador único do cliente.
    * @return Objeto Cliente correspondente ao ID, ou null se não encontrado.
    */
    private Cliente procurarClientePorId(String ID) {
        for (Cliente cliente : dataStorage.getListaDeClientes()) {
            if (cliente.getId().equals(ID)) {
                return cliente;
            }
        }
        return null;
    }

    
    /**
    * Adiciona um novo voo à lista de voos, evitando voos repetidos para o mesmo destino na mesma data.
    * @param partida Local de partida do voo.
    * @param destino Local de destino do voo.
    * @param listaVoos Lista de voos onde o novo voo será adicionado.
    * @param dataSelecionadaString Data selecionada para o novo voo.
    */
    private void adicionarVooParaDestino(String partida, String destino, List<Voo> listaVoos, String dataSelecionadaString) {
        // Verifica se já existe um voo para o mesmo destino na mesma data
        boolean vooExistente = false;

        for (int i = 0; i < listaVoos.size(); i++) {
            Voo voo = listaVoos.get(i);
            if (dataSelecionadaString.equals(voo.getData())) {
                JOptionPane.showMessageDialog(null, "Já existe um voo de " + partida + " até " + destino + " nesse dia.\n(Limite de um voo diário)", "Erro", JOptionPane.ERROR_MESSAGE);
                vooExistente = true;
                break;
            }
        }

        // Se não houver voo existente, cria um novo voo e o adiciona à lista
        if (!vooExistente) {
            Voo voo = new Voo(partida, destino, dataSelecionadaString);
            listaVoos.add(voo);

            // Atualiza a tabela de voos na interface gráfica
            DefaultTableModel voosAdmin = (DefaultTableModel) tabelaVoosAdmin.getModel();
            Object[] linha = {voo.getPartida(), voo.getDestino(), voo.getData(), voo.getLugaresLivres(), voo.getIdVoo()};
            voosAdmin.addRow(linha);
            voosAdmin.fireTableDataChanged();

            // Salva os dados atualizados em arquivo
            saveDataToFile();

            // Exibe uma mensagem indicando o sucesso da criação do voo
            JOptionPane.showMessageDialog(null, "Voo criado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

       
    
    /**
    * Executa as ações necessárias quando o botão de compra de voo é acionado.
    * @param lista Lista de voos disponíveis para a compra.
    */
    private void acaoBotaoComprarVoo(List<Voo> lista) {
        // Oculta painéis desnecessários e exibe o painel de escolha de data
        VindaPanel.setVisible(false);
        PartidaPanel.setVisible(false);
        EscolherDataPanel.setVisible(true);
        DataVooCombo.removeAllItems();

       // Preenche o combo box de datas com as datas disponíveis para os voos
        for (int i = 0; i < lista.size(); i++) {
            String data = lista.get(i).getData();
            boolean encontrado = false;

            // Verifica se a data já foi adicionada ao combo box
            for (int k = 0; k < DataVooCombo.getItemCount(); k++) {
                String item = (String) DataVooCombo.getItemAt(k);
                if (item.equals(data)) {
                    encontrado = true;
                    break;
                }
            }

            // Se a data ainda não foi adicionada, inclui no combo box
            if (!encontrado) {
                DataVooCombo.addItem(data);
            }
        }
    }

   /**
   * Obtém a instância única da classe UI (Singleton pattern).
   * @return A instância única da classe UI.
   */
   public static UI getInstance() {
       if (instance == null) {
           instance = new UI();
       }
       return instance;
   }

    
    public JPanel getDataPanel() {
        return EscolherDataPanel;
                
    }
    
    public JPanel getPagamentoPanel() {
        return PagamentoPanel;
    }
    
     public JPanel getUserPanel() {
        return UserPanel;
    }
    
    public DataStorage getDataStorage() {
        return dataStorage;
    }
    
    
    public JLabel getPrecoTotalPagamento() {
        return PrecoTotalPagamento;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminAteLisboa;
    private javax.swing.JButton AdminButton;
    private javax.swing.JPasswordField AdminCodeEntryR;
    private javax.swing.JPanel AdminLeftPanel;
    private javax.swing.JPanel AdminPartirLisboa;
    private javax.swing.JTabbedPane AdminRightPanel;
    private javax.swing.JLabel AdminSublinhado;
    private javax.swing.JPanel AdminUserPanel;
    private javax.swing.JLabel AdminUserSublinhado;
    private javax.swing.JLabel AdminUserTitulo;
    private javax.swing.JLabel AdminUserTitulo2;
    private javax.swing.JButton AmesterdãoToLisboa;
    private javax.swing.JButton ApagarClientes;
    private javax.swing.JButton ApartirButtonAdmin;
    private javax.swing.JButton ApartirConfirmarButton;
    private javax.swing.JLabel ApartirDataVooLabel;
    private javax.swing.JLabel ApartirDestinoLabel;
    private javax.swing.JLabel ApartirLisboaLabel;
    private javax.swing.JComboBox<String> ApartirPaisesCombo;
    private javax.swing.JLabel ApartirPartidaLabel;
    private javax.swing.JLabel ApartirSublinhado;
    private javax.swing.JButton AteButtonAdmin;
    private javax.swing.JButton AteConfirmarButton;
    private javax.swing.JLabel AteDataVooLabel;
    private javax.swing.JLabel AteDestinoLabel;
    private javax.swing.JLabel AteLisboaLabel;
    private javax.swing.JComboBox<String> AtePaisesCombo;
    private javax.swing.JLabel AtePartidaLabel;
    private javax.swing.JLabel AteSublinhado;
    private javax.swing.JButton AtenasToLisboa;
    private javax.swing.JButton Back_AdminUser;
    private javax.swing.JButton Back_Partida;
    private javax.swing.JButton Back_User;
    private javax.swing.JButton Back_Vinda;
    private javax.swing.JLabel BagExtraRelat;
    private javax.swing.JButton BarcelonaToLisboa;
    private javax.swing.JLabel BolsaDeMão;
    private javax.swing.JLabel BolsaMaoRelat;
    private javax.swing.JButton ConfirmarCompra;
    private javax.swing.JButton ConfirmarDataVoo;
    private javax.swing.JPasswordField ConfirmarPassEntryR;
    private javax.swing.JLabel ConfirmarPassLabelR;
    private javax.swing.JButton CriarButton;
    private javax.swing.JPanel CriarPanel;
    private javax.swing.JLabel DadosCompraLabel;
    private javax.swing.JComboBox<String> DataVooCombo;
    private javax.swing.JLabel DestinoRelat;
    private javax.swing.JButton EntrarButton;
    private javax.swing.JLabel EscolhaDataLabel;
    private javax.swing.JPanel EscolherDataPanel;
    private javax.swing.JButton EstatisticaButton;
    private javax.swing.JPanel EstatisticaPanel;
    private javax.swing.JButton EstatisticaVoltar;
    private javax.swing.JPanel FundoAzulPanel;
    private javax.swing.JButton GerirClientesButton;
    private javax.swing.JPanel GestorClientes;
    private javax.swing.JLabel LinhaAdminCriar;
    private javax.swing.JLabel Linha_User;
    private javax.swing.JButton LisboaToAmesterdão;
    private javax.swing.JButton LisboaToAtenas;
    private javax.swing.JButton LisboaToBarcelona;
    private javax.swing.JButton LisboaToLondres;
    private javax.swing.JButton LisboaToParis;
    private javax.swing.JButton LisboaToVarsovia;
    private javax.swing.JLabel ListaClientesLabel;
    private javax.swing.JLabel ListaClientesSublinhado;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JLabel LogoWelcome;
    private javax.swing.JButton LondresToLisboa;
    private javax.swing.JLabel LugarRelat;
    private javax.swing.JPanel MainLeftPanel;
    private javax.swing.JTabbedPane MainRightPanel;
    private javax.swing.JLabel MetodosPagamento;
    private javax.swing.JPanel MiniLogoPanel;
    private javax.swing.JLabel MiniLogo_AdminUser;
    private javax.swing.JLabel MiniLogo_User;
    private javax.swing.JTextField NomeClienteEntry;
    private javax.swing.JLabel NomeDadosCompra;
    private javax.swing.JLabel NomeRelat;
    private javax.swing.JToggleButton OnOffBolsaDeMao;
    private javax.swing.JComboBox<String> PagamentoCombo;
    private javax.swing.JPanel PagamentoPanel;
    private javax.swing.JLabel PagamentoRelat;
    private javax.swing.JLabel PagamentoSublinhado;
    private javax.swing.JButton ParisToLisboa;
    private javax.swing.JButton PartidaButton;
    private javax.swing.JPanel PartidaPanel;
    private javax.swing.JLabel PartidaRelat;
    private javax.swing.JLabel PrecoAssentoRelat;
    private javax.swing.JLabel PrecoTotalPagamento;
    private javax.swing.JLabel PrecoTotalRelat;
    private javax.swing.JButton RegistarButton;
    private javax.swing.JLabel RelatorioCompra;
    private javax.swing.JPanel RelatorioDeCompra;
    private javax.swing.JLabel RelatorioSublinhado;
    private javax.swing.JLabel SegRelat;
    private javax.swing.JTable TabelaClientesAdmin;
    private javax.swing.JLabel TabelaSublinhado;
    private javax.swing.JLabel TabelaVoosLabel;
    private javax.swing.JLabel TaxAdminRelat;
    private javax.swing.JButton UserButton;
    private javax.swing.JPanel UserPanel;
    private javax.swing.JButton VarsoviaToLisboa;
    private javax.swing.JButton VindaButton;
    private javax.swing.JPanel VindaPanel;
    private javax.swing.JButton VoltarButton1;
    private javax.swing.JButton VoltarEscolherData;
    private javax.swing.JButton VoltarGestorClientes;
    private javax.swing.JButton VoltarPagamento;
    private javax.swing.JButton VoltarRelat;
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JLabel WelcomeSublinhado;
    private javax.swing.JLabel WelcomeSublinhado1;
    private javax.swing.JButton abaLoginButton;
    private javax.swing.JButton abaRegistoButton;
    private javax.swing.JLabel bemvindoLabel;
    private javax.swing.JLabel bemvindoLabel1;
    private javax.swing.JLabel bemvindoLabel2;
    private javax.swing.JLabel bemvindoLabel3;
    private javax.swing.JButton deleteVooButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginTitulo;
    private javax.swing.JLabel nifLabelR;
    private javax.swing.JTextField nomeEntryR;
    private javax.swing.JLabel nomeLabelR;
    private javax.swing.JPasswordField passEntry;
    private javax.swing.JPasswordField passEntryR;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel passLabelR;
    private javax.swing.JPanel registoPanel;
    private javax.swing.JLabel registoTituloR;
    private javax.swing.JTable tabelaVoosAdmin;
    private javax.swing.JFormattedTextField userEntry;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
