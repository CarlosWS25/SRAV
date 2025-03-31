/*
 * Esta classe representa a interface gráfica para a seleção de lugares em um voo.
 * Autores: Carlos Rodrigues, João Pedro Andrade, Pedro Vicente
 */
package com.mycompany.srav;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe que define a interface gráfica para a seleção de lugares em um voo.
 */
public class Lugares extends javax.swing.JFrame {

    private Voo voo;  // Representa o voo associado a esta janela de lugares
    private List<JButton> botaoEscolhido;  // Lista de botões escolhidos pelo utilizador
    private List<JButton> listaTodosLugares;  // Lista de todos os botões de lugares na interface
    private UI lugaresUI;  // Instância da classe UI para manipulação da interface geral
    private double precoFinal;  // Preço final a ser calculado com base nas escolhas do utilizador
    private double precoTotalAssento;  // Preço total dos assentos escolhidos

    /**
     * Construtor da classe Lugares. Recebe um objeto Voo como parâmetro.
     */
    public Lugares(Voo voo) {
        initComponents();  // Inicia os componentes da interface gerados pelo NetBeans
        PreçoBagExtra.setVisible(false);  // Configura a visibilidade do componente PreçoBagExtra
        PreçoSeguro.setVisible(false);  // Configura a visibilidade do componente PreçoSeguro
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Define o comportamento ao fechar a janela
        this.voo = voo;  // Associa o voo recebido ao atributo da classe
        this.botaoEscolhido = new ArrayList<>();  // Inicia a lista de botões escolhidos
        this.listaTodosLugares = new ArrayList<>();  // Inicia a lista de todos os botões de lugares
        this.lugaresUI = UI.getInstance();  // Obtém uma instância única da classe UI

        // Itera sobre os componentes do painel jPanel1
        Component[] componentes = jPanel1.getComponents();
        for (int i = 0; i < componentes.length; i++) {
            Component componente = componentes[i];

            // Verifica se o componente é um JButton
            if (componente instanceof JButton botao) {
                // Adiciona botões que começam com letras específicas à listaTodosLugares
                if (botao.getText().startsWith("A") || botao.getText().startsWith("B") ||
                    botao.getText().startsWith("C") || botao.getText().startsWith("D") ||
                    botao.getText().startsWith("E") || botao.getText().startsWith("F")) {
                    listaTodosLugares.add(botao);

                    // Remove o botão Confirmar da listaTodosLugares
                    if (botao.getText().equals("Confirmar")) {
                        listaTodosLugares.remove(botao);
                    }
                }
            }
        }

        // Itera sobre a lista de todos os lugares
        for (int i = 0; i < listaTodosLugares.size(); i++) {
            JButton botao = listaTodosLugares.get(i);
            String textoBotao = botao.getText();

            // Verifica se o lugar está ocupado e configura a aparência do botão
            if (voo.getListaNomeLugaresOcupados().contains(textoBotao)) {
                botao.setBackground(Color.RED);
                botao.setEnabled(false);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton178 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        MiniLogo_AdminUser = new javax.swing.JLabel();
        ButtonA1 = new javax.swing.JButton();
        ButtonA2 = new javax.swing.JButton();
        ButtonA3 = new javax.swing.JButton();
        ButtonA4 = new javax.swing.JButton();
        ButtonA5 = new javax.swing.JButton();
        ButtonA6 = new javax.swing.JButton();
        ButtonA7 = new javax.swing.JButton();
        ButtonA8 = new javax.swing.JButton();
        ButtonA9 = new javax.swing.JButton();
        ButtonA10 = new javax.swing.JButton();
        ButtonA11 = new javax.swing.JButton();
        ButtonA12 = new javax.swing.JButton();
        ButtonA13 = new javax.swing.JButton();
        ButtonA14 = new javax.swing.JButton();
        ButtonA15 = new javax.swing.JButton();
        ButtonA16 = new javax.swing.JButton();
        ButtonA17 = new javax.swing.JButton();
        ButtonA18 = new javax.swing.JButton();
        ButtonA19 = new javax.swing.JButton();
        ButtonA20 = new javax.swing.JButton();
        ButtonA21 = new javax.swing.JButton();
        ButtonA22 = new javax.swing.JButton();
        ButtonA23 = new javax.swing.JButton();
        ButtonA24 = new javax.swing.JButton();
        ButtonA25 = new javax.swing.JButton();
        ButtonA26 = new javax.swing.JButton();
        ButtonA27 = new javax.swing.JButton();
        ButtonA28 = new javax.swing.JButton();
        ButtonA29 = new javax.swing.JButton();
        ButtonA30 = new javax.swing.JButton();
        ButtonB1 = new javax.swing.JButton();
        ButtonB2 = new javax.swing.JButton();
        ButtonB3 = new javax.swing.JButton();
        ButtonB4 = new javax.swing.JButton();
        ButtonB5 = new javax.swing.JButton();
        ButtonB6 = new javax.swing.JButton();
        ButtonB7 = new javax.swing.JButton();
        ButtonB8 = new javax.swing.JButton();
        ButtonB9 = new javax.swing.JButton();
        ButtonB10 = new javax.swing.JButton();
        ButtonB11 = new javax.swing.JButton();
        ButtonB12 = new javax.swing.JButton();
        ButtonB13 = new javax.swing.JButton();
        ButtonB14 = new javax.swing.JButton();
        ButtonB15 = new javax.swing.JButton();
        ButtonB16 = new javax.swing.JButton();
        ButtonB17 = new javax.swing.JButton();
        ButtonB18 = new javax.swing.JButton();
        ButtonB19 = new javax.swing.JButton();
        ButtonB20 = new javax.swing.JButton();
        ButtonB21 = new javax.swing.JButton();
        ButtonB22 = new javax.swing.JButton();
        ButtonB23 = new javax.swing.JButton();
        ButtonB24 = new javax.swing.JButton();
        ButtonB25 = new javax.swing.JButton();
        ButtonB26 = new javax.swing.JButton();
        ButtonB27 = new javax.swing.JButton();
        ButtonB28 = new javax.swing.JButton();
        ButtonB29 = new javax.swing.JButton();
        ButtonB30 = new javax.swing.JButton();
        ButtonC1 = new javax.swing.JButton();
        ButtonC2 = new javax.swing.JButton();
        ButtonC3 = new javax.swing.JButton();
        ButtonC4 = new javax.swing.JButton();
        ButtonC5 = new javax.swing.JButton();
        ButtonC6 = new javax.swing.JButton();
        ButtonC7 = new javax.swing.JButton();
        ButtonC8 = new javax.swing.JButton();
        ButtonC9 = new javax.swing.JButton();
        ButtonC10 = new javax.swing.JButton();
        ButtonC11 = new javax.swing.JButton();
        ButtonC12 = new javax.swing.JButton();
        ButtonC13 = new javax.swing.JButton();
        ButtonC14 = new javax.swing.JButton();
        ButtonC15 = new javax.swing.JButton();
        ButtonC16 = new javax.swing.JButton();
        ButtonC17 = new javax.swing.JButton();
        ButtonC18 = new javax.swing.JButton();
        ButtonC19 = new javax.swing.JButton();
        ButtonC20 = new javax.swing.JButton();
        ButtonC21 = new javax.swing.JButton();
        ButtonC22 = new javax.swing.JButton();
        ButtonC23 = new javax.swing.JButton();
        ButtonC24 = new javax.swing.JButton();
        ButtonC25 = new javax.swing.JButton();
        ButtonC26 = new javax.swing.JButton();
        ButtonC27 = new javax.swing.JButton();
        ButtonC28 = new javax.swing.JButton();
        ButtonC29 = new javax.swing.JButton();
        ButtonC30 = new javax.swing.JButton();
        ButtonD1 = new javax.swing.JButton();
        ButtonD2 = new javax.swing.JButton();
        ButtonD3 = new javax.swing.JButton();
        ButtonD4 = new javax.swing.JButton();
        ButtonD5 = new javax.swing.JButton();
        ButtonD6 = new javax.swing.JButton();
        ButtonD7 = new javax.swing.JButton();
        ButtonD8 = new javax.swing.JButton();
        ButtonD9 = new javax.swing.JButton();
        ButtonD10 = new javax.swing.JButton();
        ButtonD11 = new javax.swing.JButton();
        ButtonD12 = new javax.swing.JButton();
        ButtonD13 = new javax.swing.JButton();
        ButtonD14 = new javax.swing.JButton();
        ButtonD15 = new javax.swing.JButton();
        ButtonD16 = new javax.swing.JButton();
        ButtonD17 = new javax.swing.JButton();
        ButtonD18 = new javax.swing.JButton();
        ButtonD19 = new javax.swing.JButton();
        ButtonD20 = new javax.swing.JButton();
        ButtonD21 = new javax.swing.JButton();
        ButtonD22 = new javax.swing.JButton();
        ButtonD23 = new javax.swing.JButton();
        ButtonD24 = new javax.swing.JButton();
        ButtonD25 = new javax.swing.JButton();
        ButtonD26 = new javax.swing.JButton();
        ButtonD27 = new javax.swing.JButton();
        ButtonD28 = new javax.swing.JButton();
        ButtonD29 = new javax.swing.JButton();
        ButtonD30 = new javax.swing.JButton();
        ButtonE1 = new javax.swing.JButton();
        ButtonE2 = new javax.swing.JButton();
        ButtonE3 = new javax.swing.JButton();
        ButtonE4 = new javax.swing.JButton();
        ButtonE5 = new javax.swing.JButton();
        ButtonE6 = new javax.swing.JButton();
        ButtonE7 = new javax.swing.JButton();
        ButtonE8 = new javax.swing.JButton();
        ButtonE9 = new javax.swing.JButton();
        ButtonE10 = new javax.swing.JButton();
        ButtonE11 = new javax.swing.JButton();
        ButtonE12 = new javax.swing.JButton();
        ButtonE13 = new javax.swing.JButton();
        ButtonE14 = new javax.swing.JButton();
        ButtonE15 = new javax.swing.JButton();
        ButtonE16 = new javax.swing.JButton();
        ButtonE17 = new javax.swing.JButton();
        ButtonE18 = new javax.swing.JButton();
        ButtonE19 = new javax.swing.JButton();
        ButtonE20 = new javax.swing.JButton();
        ButtonE21 = new javax.swing.JButton();
        ButtonE22 = new javax.swing.JButton();
        ButtonE23 = new javax.swing.JButton();
        ButtonE24 = new javax.swing.JButton();
        ButtonE25 = new javax.swing.JButton();
        ButtonE26 = new javax.swing.JButton();
        ButtonE27 = new javax.swing.JButton();
        ButtonE28 = new javax.swing.JButton();
        ButtonE29 = new javax.swing.JButton();
        ButtonE30 = new javax.swing.JButton();
        ButtonF1 = new javax.swing.JButton();
        ButtonF2 = new javax.swing.JButton();
        ButtonF3 = new javax.swing.JButton();
        ButtonF4 = new javax.swing.JButton();
        ButtonF5 = new javax.swing.JButton();
        ButtonF6 = new javax.swing.JButton();
        ButtonF7 = new javax.swing.JButton();
        ButtonF8 = new javax.swing.JButton();
        ButtonF9 = new javax.swing.JButton();
        ButtonF10 = new javax.swing.JButton();
        ButtonF11 = new javax.swing.JButton();
        ButtonF12 = new javax.swing.JButton();
        ButtonF13 = new javax.swing.JButton();
        ButtonF14 = new javax.swing.JButton();
        ButtonF15 = new javax.swing.JButton();
        ButtonF16 = new javax.swing.JButton();
        ButtonF17 = new javax.swing.JButton();
        ButtonF18 = new javax.swing.JButton();
        ButtonF19 = new javax.swing.JButton();
        ButtonF20 = new javax.swing.JButton();
        ButtonF21 = new javax.swing.JButton();
        ButtonF22 = new javax.swing.JButton();
        ButtonF23 = new javax.swing.JButton();
        ButtonF24 = new javax.swing.JButton();
        ButtonF25 = new javax.swing.JButton();
        ButtonF26 = new javax.swing.JButton();
        ButtonF27 = new javax.swing.JButton();
        ButtonF28 = new javax.swing.JButton();
        ButtonF29 = new javax.swing.JButton();
        ButtonF30 = new javax.swing.JButton();
        PreçoAssento = new javax.swing.JLabel();
        TaxaDeAdmin = new javax.swing.JLabel();
        BagagemExtra = new javax.swing.JLabel();
        ConfirmarButton = new javax.swing.JButton();
        OnOffBagagemExtra = new javax.swing.JToggleButton();
        OnOffSeguro = new javax.swing.JToggleButton();
        PreçoBagExtra = new javax.swing.JLabel();
        PrecoFinal = new javax.swing.JLabel();
        Seguro = new javax.swing.JLabel();
        PreçoSeguro = new javax.swing.JLabel();

        jButton178.setText("jButton9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(170, 205, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MiniLogo_AdminUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MiniLogo_AdminUser.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\logo_empresa.png"));
        jPanel1.add(MiniLogo_AdminUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 110));

        ButtonA1.setText("A1");
        ButtonA1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA1MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 23, -1, -1));

        ButtonA2.setText("A2");
        ButtonA2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA2MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 47, -1, -1));

        ButtonA3.setText("A3");
        ButtonA3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA3MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 71, -1, -1));

        ButtonA4.setText("A4");
        ButtonA4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA4MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 95, -1, -1));

        ButtonA5.setText("A5");
        ButtonA5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA5MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 119, -1, -1));

        ButtonA6.setText("A6");
        ButtonA6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA6MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 143, -1, -1));

        ButtonA7.setText("A7");
        ButtonA7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA7MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 167, -1, -1));

        ButtonA8.setText("A8");
        ButtonA8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA8MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 191, -1, -1));

        ButtonA9.setText("A9");
        ButtonA9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA9MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 215, -1, -1));

        ButtonA10.setText("A10");
        ButtonA10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA10MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 239, -1, -1));

        ButtonA11.setText("A11");
        ButtonA11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA11MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 263, -1, -1));

        ButtonA12.setText("A12");
        ButtonA12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA12MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA12, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 287, -1, -1));

        ButtonA13.setText("A13");
        ButtonA13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA13MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA13, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 311, -1, -1));

        ButtonA14.setText("A14");
        ButtonA14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA14MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA14, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 335, -1, -1));

        ButtonA15.setText("A15");
        ButtonA15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA15MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA15, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 359, -1, -1));

        ButtonA16.setText("A16");
        ButtonA16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA16MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA16, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 383, -1, -1));

        ButtonA17.setText("A17");
        ButtonA17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA17MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA17, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 407, -1, -1));

        ButtonA18.setText("A18");
        ButtonA18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA18MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA18, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 431, -1, -1));

        ButtonA19.setText("A19");
        ButtonA19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA19MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA19, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 455, -1, -1));

        ButtonA20.setText("A20");
        ButtonA20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA20MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA20, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 479, -1, -1));

        ButtonA21.setText("A21");
        ButtonA21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA21MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA21, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 503, -1, -1));

        ButtonA22.setText("A22");
        ButtonA22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA22MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA22, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 527, -1, -1));

        ButtonA23.setText("A23");
        ButtonA23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA23MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA23, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 551, -1, -1));

        ButtonA24.setText("A24");
        ButtonA24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA24MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA24, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 575, -1, -1));

        ButtonA25.setText("A25");
        ButtonA25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA25MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA25, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 599, -1, -1));

        ButtonA26.setText("A26");
        ButtonA26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA26MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA26, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 623, -1, -1));

        ButtonA27.setText("A27");
        ButtonA27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA27MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA27, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 647, -1, -1));

        ButtonA28.setText("A28");
        ButtonA28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA28MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA28, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 671, -1, -1));

        ButtonA29.setText("A29");
        ButtonA29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA29MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA29, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 695, -1, -1));

        ButtonA30.setText("A30");
        ButtonA30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonA30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonA30MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonA30, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 719, -1, -1));

        ButtonB1.setText("B1");
        ButtonB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB1MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 23, -1, -1));

        ButtonB2.setText("B2");
        ButtonB2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB2MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 47, -1, -1));

        ButtonB3.setText("B3");
        ButtonB3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB3MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 71, -1, -1));

        ButtonB4.setText("B4");
        ButtonB4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB4MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 95, -1, -1));

        ButtonB5.setText("B5");
        ButtonB5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB5MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 119, -1, -1));

        ButtonB6.setText("B6");
        ButtonB6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB6MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 143, -1, -1));

        ButtonB7.setText("B7");
        ButtonB7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB7MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 167, -1, -1));

        ButtonB8.setText("B8");
        ButtonB8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB8MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 191, -1, -1));

        ButtonB9.setText("B9");
        ButtonB9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB9MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB9, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 215, -1, -1));

        ButtonB10.setText("B10");
        ButtonB10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB10MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 239, -1, -1));

        ButtonB11.setText("B11");
        ButtonB11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB11MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 263, -1, -1));

        ButtonB12.setText("B12");
        ButtonB12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB12MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB12, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 287, -1, -1));

        ButtonB13.setText("B13");
        ButtonB13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB13MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB13, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 311, -1, -1));

        ButtonB14.setText("B14");
        ButtonB14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB14MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB14, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 335, -1, -1));

        ButtonB15.setText("B15");
        ButtonB15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB15MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB15, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 359, -1, -1));

        ButtonB16.setText("B16");
        ButtonB16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB16MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB16, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 383, -1, -1));

        ButtonB17.setText("B17");
        ButtonB17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB17MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB17, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 407, -1, -1));

        ButtonB18.setText("B18");
        ButtonB18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB18MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB18, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 431, -1, -1));

        ButtonB19.setText("B19");
        ButtonB19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB19MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB19, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 455, -1, -1));

        ButtonB20.setText("B20");
        ButtonB20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB20MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB20, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 479, -1, -1));

        ButtonB21.setText("B21");
        ButtonB21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB21MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB21, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 503, -1, -1));

        ButtonB22.setText("B22");
        ButtonB22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB22MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB22, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 527, -1, -1));

        ButtonB23.setText("B23");
        ButtonB23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB23MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB23, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 551, -1, -1));

        ButtonB24.setText("B24");
        ButtonB24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB24MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB24, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 575, -1, -1));

        ButtonB25.setText("B25");
        ButtonB25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB25MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB25, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 599, -1, -1));

        ButtonB26.setText("B26");
        ButtonB26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB26MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB26, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 623, -1, -1));

        ButtonB27.setText("B27");
        ButtonB27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB27MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB27, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 647, -1, -1));

        ButtonB28.setText("B28");
        ButtonB28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB28MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB28, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 671, -1, -1));

        ButtonB29.setText("B29");
        ButtonB29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB29MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB29, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 695, -1, -1));

        ButtonB30.setText("B30");
        ButtonB30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonB30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonB30MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonB30, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 719, -1, -1));

        ButtonC1.setText("C1");
        ButtonC1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC1MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 23, -1, -1));

        ButtonC2.setText("C2");
        ButtonC2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC2MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 47, -1, -1));

        ButtonC3.setText("C3");
        ButtonC3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC3MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 71, -1, -1));

        ButtonC4.setText("C4");
        ButtonC4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC4MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 95, -1, -1));

        ButtonC5.setText("C5");
        ButtonC5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC5MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 119, -1, -1));

        ButtonC6.setText("C6");
        ButtonC6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC6MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 143, -1, -1));

        ButtonC7.setText("C7");
        ButtonC7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC7MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 167, -1, -1));

        ButtonC8.setText("C8");
        ButtonC8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC8MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 191, -1, -1));

        ButtonC9.setText("C9");
        ButtonC9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC9MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC9, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 215, -1, -1));

        ButtonC10.setText("C10");
        ButtonC10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC10MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC10, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 239, -1, -1));

        ButtonC11.setText("C11");
        ButtonC11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC11MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC11, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 263, -1, -1));

        ButtonC12.setText("C12");
        ButtonC12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC12MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC12, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 287, -1, -1));

        ButtonC13.setText("C13");
        ButtonC13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC13MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC13, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 311, -1, -1));

        ButtonC14.setText("C14");
        ButtonC14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC14MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC14, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 335, -1, -1));

        ButtonC15.setText("C15");
        ButtonC15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC15MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC15, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 359, -1, -1));

        ButtonC16.setText("C16");
        ButtonC16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC16MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC16, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 383, -1, -1));

        ButtonC17.setText("C17");
        ButtonC17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC17MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC17, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 407, -1, -1));

        ButtonC18.setText("C18");
        ButtonC18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC18MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC18, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 431, -1, -1));

        ButtonC19.setText("C19");
        ButtonC19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC19MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC19, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 455, -1, -1));

        ButtonC20.setText("C20");
        ButtonC20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC20MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC20, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 479, -1, -1));

        ButtonC21.setText("C21");
        ButtonC21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC21MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC21, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 503, -1, -1));

        ButtonC22.setText("C22");
        ButtonC22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC22MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC22, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 527, -1, -1));

        ButtonC23.setText("C23");
        ButtonC23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC23MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC23, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 551, -1, -1));

        ButtonC24.setText("C24");
        ButtonC24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC24MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC24, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 575, -1, -1));

        ButtonC25.setText("C25");
        ButtonC25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC25MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC25, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 599, -1, -1));

        ButtonC26.setText("C26");
        ButtonC26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC26MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC26, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 623, -1, -1));

        ButtonC27.setText("C27");
        ButtonC27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC27MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC27, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 647, -1, -1));

        ButtonC28.setText("C28");
        ButtonC28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC28MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC28, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 671, -1, -1));

        ButtonC29.setText("C29");
        ButtonC29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC29MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC29, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 695, -1, -1));

        ButtonC30.setText("C30");
        ButtonC30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonC30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonC30MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonC30, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 719, -1, -1));

        ButtonD1.setText("D1");
        ButtonD1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD1MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 23, -1, -1));

        ButtonD2.setText("D2");
        ButtonD2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD2MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 47, -1, -1));

        ButtonD3.setText("D3");
        ButtonD3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD3MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 71, -1, -1));

        ButtonD4.setText("D4");
        ButtonD4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD4MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 95, -1, -1));

        ButtonD5.setText("D5");
        ButtonD5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD5MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 119, -1, -1));

        ButtonD6.setText("D6");
        ButtonD6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD6MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 143, -1, -1));

        ButtonD7.setText("D7");
        ButtonD7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD7MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD7, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 167, -1, -1));

        ButtonD8.setText("D8");
        ButtonD8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD8MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD8, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 191, -1, -1));

        ButtonD9.setText("D9");
        ButtonD9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD9MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD9, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 215, -1, -1));

        ButtonD10.setText("D10");
        ButtonD10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD10MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD10, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 239, -1, -1));

        ButtonD11.setText("D11");
        ButtonD11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD11MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD11, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 263, -1, -1));

        ButtonD12.setText("D12");
        ButtonD12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD12MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD12, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 287, -1, -1));

        ButtonD13.setText("D13");
        ButtonD13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD13MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD13, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 311, -1, -1));

        ButtonD14.setText("D14");
        ButtonD14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD14MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD14, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 335, -1, -1));

        ButtonD15.setText("D15");
        ButtonD15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD15MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD15, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 359, -1, -1));

        ButtonD16.setText("D16");
        ButtonD16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD16MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD16, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 383, -1, -1));

        ButtonD17.setText("D17");
        ButtonD17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD17MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD17, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 407, -1, -1));

        ButtonD18.setText("D18");
        ButtonD18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD18MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD18, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 431, -1, -1));

        ButtonD19.setText("D19");
        ButtonD19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD19MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD19, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 455, -1, -1));

        ButtonD20.setText("D20");
        ButtonD20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD20MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD20, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 479, -1, -1));

        ButtonD21.setText("D21");
        ButtonD21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD21MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD21, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 503, -1, -1));

        ButtonD22.setText("D22");
        ButtonD22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD22MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD22, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 527, -1, -1));

        ButtonD23.setText("D23");
        ButtonD23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD23MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD23, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 551, -1, -1));

        ButtonD24.setText("D24");
        ButtonD24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD24MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD24, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 575, -1, -1));

        ButtonD25.setText("D25");
        ButtonD25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD25MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD25, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 599, -1, -1));

        ButtonD26.setText("D26");
        ButtonD26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD26MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD26, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 623, -1, -1));

        ButtonD27.setText("D27");
        ButtonD27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD27MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD27, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 647, -1, -1));

        ButtonD28.setText("D28");
        ButtonD28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD28MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD28, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 671, -1, -1));

        ButtonD29.setText("D29");
        ButtonD29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD29MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD29, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 695, -1, -1));

        ButtonD30.setText("D30");
        ButtonD30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonD30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonD30MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonD30, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 719, -1, -1));

        ButtonE1.setText("E1");
        ButtonE1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE1MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 23, -1, -1));

        ButtonE2.setText("E2");
        ButtonE2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE2MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 47, -1, -1));

        ButtonE3.setText("E3");
        ButtonE3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE3MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 71, -1, -1));

        ButtonE4.setText("E4");
        ButtonE4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE4MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 95, -1, -1));

        ButtonE5.setText("E5");
        ButtonE5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE5MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 119, -1, -1));

        ButtonE6.setText("E6");
        ButtonE6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE6MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE6, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 143, -1, -1));

        ButtonE7.setText("E7");
        ButtonE7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE7MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE7, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 167, -1, -1));

        ButtonE8.setText("E8");
        ButtonE8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE8MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE8, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 191, -1, -1));

        ButtonE9.setText("E9");
        ButtonE9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE9MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE9, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 215, -1, -1));

        ButtonE10.setText("E10");
        ButtonE10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE10MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE10, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 239, -1, -1));

        ButtonE11.setText("E11");
        ButtonE11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE11MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE11, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 263, -1, -1));

        ButtonE12.setText("E12");
        ButtonE12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE12MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE12, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 287, -1, -1));

        ButtonE13.setText("E13");
        ButtonE13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE13MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE13, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 311, -1, -1));

        ButtonE14.setText("E14");
        ButtonE14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE14MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE14, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 335, -1, -1));

        ButtonE15.setText("E15");
        ButtonE15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE15MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE15, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 359, -1, -1));

        ButtonE16.setText("E16");
        ButtonE16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE16MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE16, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 383, -1, -1));

        ButtonE17.setText("E17");
        ButtonE17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE17MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE17, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 407, -1, -1));

        ButtonE18.setText("E18");
        ButtonE18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE18MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE18, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 431, -1, -1));

        ButtonE19.setText("E19");
        ButtonE19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE19MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE19, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 455, -1, -1));

        ButtonE20.setText("E20");
        ButtonE20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE20MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE20, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 479, -1, -1));

        ButtonE21.setText("E21");
        ButtonE21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE21MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE21, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 503, -1, -1));

        ButtonE22.setText("E22");
        ButtonE22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE22MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE22, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 527, -1, -1));

        ButtonE23.setText("E23");
        ButtonE23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE23MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE23, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 551, -1, -1));

        ButtonE24.setText("E24");
        ButtonE24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE24MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE24, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 575, -1, -1));

        ButtonE25.setText("E25");
        ButtonE25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE25MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE25, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 599, -1, -1));

        ButtonE26.setText("E26");
        ButtonE26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE26MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE26, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 623, -1, -1));

        ButtonE27.setText("E27");
        ButtonE27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE27MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE27, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 647, -1, -1));

        ButtonE28.setText("E28");
        ButtonE28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE28MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE28, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 671, -1, -1));

        ButtonE29.setText("E29");
        ButtonE29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE29MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE29, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 695, -1, -1));

        ButtonE30.setText("E30");
        ButtonE30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonE30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonE30MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonE30, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 719, -1, -1));

        ButtonF1.setText("F1");
        ButtonF1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF1MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 23, -1, -1));

        ButtonF2.setText("F2");
        ButtonF2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF2MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 47, -1, -1));

        ButtonF3.setText("F3");
        ButtonF3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF3MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 71, -1, -1));

        ButtonF4.setText("F4");
        ButtonF4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF4MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 95, -1, -1));

        ButtonF5.setText("F5");
        ButtonF5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF5MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 119, -1, -1));

        ButtonF6.setText("F6");
        ButtonF6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF6MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 143, -1, -1));

        ButtonF7.setText("F7");
        ButtonF7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF7MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 167, -1, -1));

        ButtonF8.setText("F8");
        ButtonF8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF8MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 191, -1, -1));

        ButtonF9.setText("F9");
        ButtonF9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF9MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 215, -1, -1));

        ButtonF10.setText("F10");
        ButtonF10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF10MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 239, -1, -1));

        ButtonF11.setText("F11");
        ButtonF11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF11MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 263, -1, -1));

        ButtonF12.setText("F12");
        ButtonF12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF12MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 287, -1, -1));

        ButtonF13.setText("F13");
        ButtonF13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF13MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 311, -1, -1));

        ButtonF14.setText("F14");
        ButtonF14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF14MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 335, -1, -1));

        ButtonF15.setText("F15");
        ButtonF15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF15MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 359, -1, -1));

        ButtonF16.setText("F16");
        ButtonF16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF16MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 383, -1, -1));

        ButtonF17.setText("F17");
        ButtonF17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF17MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 407, -1, -1));

        ButtonF18.setText("F18");
        ButtonF18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF18MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 431, -1, -1));

        ButtonF19.setText("F19");
        ButtonF19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF19MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 455, -1, -1));

        ButtonF20.setText("F20");
        ButtonF20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF20MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 479, -1, -1));

        ButtonF21.setText("F21");
        ButtonF21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF21MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 503, -1, -1));

        ButtonF22.setText("F22");
        ButtonF22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF22MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 527, -1, -1));

        ButtonF23.setText("F23");
        ButtonF23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF23MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 551, -1, -1));

        ButtonF24.setText("F24");
        ButtonF24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF24MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 575, -1, -1));

        ButtonF25.setText("F25");
        ButtonF25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF25MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 599, -1, -1));

        ButtonF26.setText("F26");
        ButtonF26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF26MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 623, -1, -1));

        ButtonF27.setText("F27");
        ButtonF27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF27MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 647, -1, -1));

        ButtonF28.setText("F28");
        ButtonF28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF28MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 671, -1, -1));

        ButtonF29.setText("F29");
        ButtonF29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF29MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 695, -1, -1));

        ButtonF30.setText("F30");
        ButtonF30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonF30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonF30MouseClicked(evt);
            }
        });
        jPanel1.add(ButtonF30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 719, -1, -1));

        PreçoAssento.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        PreçoAssento.setForeground(new java.awt.Color(7, 76, 112));
        PreçoAssento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PreçoAssento.setText("Preço do assento: 0€");
        jPanel1.add(PreçoAssento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 390, 40));

        TaxaDeAdmin.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        TaxaDeAdmin.setForeground(new java.awt.Color(7, 76, 112));
        TaxaDeAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TaxaDeAdmin.setText("Taxa de Administração 15€");
        jPanel1.add(TaxaDeAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 420, 50));

        BagagemExtra.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        BagagemExtra.setForeground(new java.awt.Color(7, 76, 112));
        BagagemExtra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BagagemExtra.setText("Bagagem Extra");
        jPanel1.add(BagagemExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 270, 50));

        ConfirmarButton.setBackground(new java.awt.Color(7, 76, 112));
        ConfirmarButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        ConfirmarButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmarButton.setText("Confirmar");
        ConfirmarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConfirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ConfirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 271, 84));

        OnOffBagagemExtra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        OnOffBagagemExtra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OnOffBagagemExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnOffBagagemExtraActionPerformed(evt);
            }
        });
        jPanel1.add(OnOffBagagemExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 40, 40));

        OnOffSeguro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        OnOffSeguro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OnOffSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnOffSeguroActionPerformed(evt);
            }
        });
        jPanel1.add(OnOffSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 40, 40));

        PreçoBagExtra.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        PreçoBagExtra.setForeground(new java.awt.Color(7, 76, 112));
        PreçoBagExtra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PreçoBagExtra.setText("30€");
        jPanel1.add(PreçoBagExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 70, -1));

        PrecoFinal.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        PrecoFinal.setForeground(new java.awt.Color(7, 76, 112));
        PrecoFinal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PrecoFinal.setText("Preço Total:  0€                    ");
        jPanel1.add(PrecoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 410, 40));

        Seguro.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Seguro.setForeground(new java.awt.Color(7, 76, 112));
        Seguro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Seguro.setText("Seguro ");
        jPanel1.add(Seguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        PreçoSeguro.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        PreçoSeguro.setForeground(new java.awt.Color(7, 76, 112));
        PreçoSeguro.setText("25€");
        jPanel1.add(PreçoSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void alterarCorBotao(MouseEvent evt) {
        JButton botaoClicado = (JButton) evt.getSource();

        // Limpa a seleção anterior se existir
        if (!botaoEscolhido.isEmpty()) {
            JButton botaoSelecionadoAnterior = botaoEscolhido.get(0);
            botaoSelecionadoAnterior.setBackground(Color.WHITE);

            // Remove o assento da lista de lugares escolhidos
            lugaresUI.getDataStorage().getLugarEscolhido().remove(botaoSelecionadoAnterior.getText());
            botaoEscolhido.clear();
        }

        // Configura o botão clicado como selecionado
        botaoClicado.setBackground(Color.GREEN);
        botaoEscolhido.add(botaoClicado);

        // Adiciona o assento à lista de lugares escolhidos
        lugaresUI.getDataStorage().getLugarEscolhido().add(botaoClicado.getText());

        // Atualiza o nome do assento do cliente
        lugaresUI.getDataStorage().getListaDeClientes().get(lugaresUI.getDataStorage().getListaDeClientes().size() - 1).setNomeAssento(botaoClicado.getText());

        // Calcula o preço dos lugares
        precoLugares();
    }

    private void precoLugares() {
        int precoTotalAssento = 0;

        // Verifica se um assento foi selecionado
        if (!botaoEscolhido.isEmpty()) {
            JButton botao = botaoEscolhido.get(0);
            String nomeLugar = botao.getText();
            String numerosDoBotao = nomeLugar.substring(1);
            int numero = Integer.parseInt(numerosDoBotao);

            // Calcula o preço do assento com base no número do assento
            if (numero > 6) {
                precoTotalAssento = 150;
            } else {
                precoTotalAssento = 350;
            }
        }

        // Calcula o preço final com base nos extras selecionados
        precoFinal = precoTotalAssento + 15;

        if (OnOffBagagemExtra.getText().equals("X")) {
            precoFinal += 30;
        }

        if (OnOffSeguro.getText().equals("X")) {
            precoFinal += 25;
        }

        // Atualiza os rótulos de preço na interface
        PreçoAssento.setText("Preço do assento: " + precoTotalAssento + "€");
        PrecoFinal.setText("Preço Total: " + precoFinal + "€");

        // Atualiza os valores do cliente na lista de clientes
        lugaresUI.getDataStorage().getListaDeClientes().get(lugaresUI.getDataStorage().getListaDeClientes().size() - 1).setPrecoAssento(precoTotalAssento);
        lugaresUI.getDataStorage().getListaDeClientes().get(lugaresUI.getDataStorage().getListaDeClientes().size() - 1).setPrecoTotal(precoFinal);
    }


    
    private void OnOffBagagemExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnOffBagagemExtraActionPerformed
        String textoAtual = OnOffBagagemExtra.getText();

        // Alterna a visibilidade da PreçoBagExtra e atualiza a informação do cliente
        if (textoAtual.equals("X")) {
            OnOffBagagemExtra.setText("");
            PreçoBagExtra.setVisible(false);
            lugaresUI.getDataStorage().getListaDeClientes().get(lugaresUI.getDataStorage().getListaDeClientes().size() - 1).setQuerBagagemExtra(PreçoBagExtra.isVisible());
        } else {
            OnOffBagagemExtra.setText("X");
            PreçoBagExtra.setVisible(true);
            lugaresUI.getDataStorage().getListaDeClientes().get(lugaresUI.getDataStorage().getListaDeClientes().size() - 1).setQuerBagagemExtra(PreçoBagExtra.isVisible());
        }

        // Atualiza os preços
        precoLugares();
    }//GEN-LAST:event_OnOffBagagemExtraActionPerformed
    
    private void ButtonA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA1MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA1MouseClicked

    private void ButtonA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA2MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA2MouseClicked

    private void ButtonA3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA3MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA3MouseClicked

    private void ButtonA4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA4MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA4MouseClicked

    private void ButtonA5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA5MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA5MouseClicked

    private void ButtonA6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA6MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA6MouseClicked

    private void ButtonA7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA7MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA7MouseClicked

    private void ButtonA8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA8MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA8MouseClicked

    private void ButtonA9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA9MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA9MouseClicked

    private void ButtonA10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA10MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA10MouseClicked

    private void ButtonA11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA11MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA11MouseClicked

    private void ButtonA12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA12MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA12MouseClicked

    private void ButtonA13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA13MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA13MouseClicked

    private void ButtonA14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA14MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA14MouseClicked

    private void ButtonA15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA15MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA15MouseClicked

    private void ButtonA16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA16MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA16MouseClicked

    private void ButtonA17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA17MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA17MouseClicked

    private void ButtonA18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA18MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA18MouseClicked

    private void ButtonA19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA19MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA19MouseClicked

    private void ButtonA20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA20MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA20MouseClicked

    private void ButtonA21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA21MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA21MouseClicked

    private void ButtonA22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA22MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA22MouseClicked

    private void ButtonA23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA23MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA23MouseClicked

    private void ButtonA24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA24MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA24MouseClicked

    private void ButtonA25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA25MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA25MouseClicked

    private void ButtonA26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA26MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA26MouseClicked

    private void ButtonA27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA27MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA27MouseClicked

    private void ButtonA28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA28MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA28MouseClicked

    private void ButtonA29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA29MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA29MouseClicked

    private void ButtonA30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonA30MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonA30MouseClicked

    private void ButtonB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB1MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB1MouseClicked

    private void ButtonB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB2MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB2MouseClicked

    private void ButtonB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB3MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB3MouseClicked

    private void ButtonB4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB4MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB4MouseClicked

    private void ButtonB5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB5MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB5MouseClicked

    private void ButtonB6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB6MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB6MouseClicked

    private void ButtonB7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB7MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB7MouseClicked

    private void ButtonB8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB8MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB8MouseClicked

    private void ButtonB9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB9MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB9MouseClicked

    private void ButtonB10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB10MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB10MouseClicked

    private void ButtonB11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB11MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB11MouseClicked

    private void ButtonB12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB12MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB12MouseClicked

    private void ButtonB13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB13MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB13MouseClicked

    private void ButtonB14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB14MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB14MouseClicked

    private void ButtonB15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB15MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB15MouseClicked

    private void ButtonB16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB16MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB16MouseClicked

    private void ButtonB17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB17MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB17MouseClicked

    private void ButtonB18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB18MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB18MouseClicked

    private void ButtonB19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB19MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB19MouseClicked

    private void ButtonB20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB20MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB20MouseClicked

    private void ButtonB21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB21MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB21MouseClicked

    private void ButtonB22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB22MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB22MouseClicked

    private void ButtonB23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB23MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB23MouseClicked

    private void ButtonB24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB24MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB24MouseClicked

    private void ButtonB25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB25MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB25MouseClicked

    private void ButtonB26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB26MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB26MouseClicked

    private void ButtonB27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB27MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB27MouseClicked

    private void ButtonB28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB28MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB28MouseClicked

    private void ButtonB29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB29MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB29MouseClicked

    private void ButtonB30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonB30MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonB30MouseClicked

    private void ButtonC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC1MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC1MouseClicked

    private void ButtonC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC2MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC2MouseClicked

    private void ButtonC3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC3MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC3MouseClicked

    private void ButtonC4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC4MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC4MouseClicked

    private void ButtonC5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC5MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC5MouseClicked

    private void ButtonC6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC6MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC6MouseClicked

    private void ButtonC7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC7MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC7MouseClicked

    private void ButtonC8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC8MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC8MouseClicked

    private void ButtonC9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC9MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC9MouseClicked

    private void ButtonC10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC10MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC10MouseClicked

    private void ButtonC11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC11MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC11MouseClicked

    private void ButtonC12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC12MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC12MouseClicked

    private void ButtonC13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC13MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC13MouseClicked

    private void ButtonC14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC14MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC14MouseClicked

    private void ButtonC15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC15MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC15MouseClicked

    private void ButtonC16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC16MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC16MouseClicked

    private void ButtonC17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC17MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC17MouseClicked

    private void ButtonC18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC18MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC18MouseClicked

    private void ButtonC19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC19MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC19MouseClicked

    private void ButtonC20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC20MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC20MouseClicked

    private void ButtonC21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC21MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC21MouseClicked

    private void ButtonC22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC22MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC22MouseClicked

    private void ButtonC23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC23MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC23MouseClicked

    private void ButtonC24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC24MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC24MouseClicked

    private void ButtonC25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC25MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC25MouseClicked

    private void ButtonC26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC26MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC26MouseClicked

    private void ButtonC27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC27MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC27MouseClicked

    private void ButtonC28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC28MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC28MouseClicked

    private void ButtonC29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC29MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC29MouseClicked

    private void ButtonC30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonC30MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonC30MouseClicked

    private void ButtonD1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD1MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD1MouseClicked

    private void ButtonD2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD2MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD2MouseClicked

    private void ButtonD3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD3MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD3MouseClicked

    private void ButtonD4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD4MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD4MouseClicked

    private void ButtonD5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD5MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD5MouseClicked

    private void ButtonD6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD6MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD6MouseClicked

    private void ButtonD7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD7MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD7MouseClicked

    private void ButtonD8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD8MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD8MouseClicked

    private void ButtonD9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD9MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD9MouseClicked

    private void ButtonD10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD10MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD10MouseClicked

    private void ButtonD11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD11MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD11MouseClicked

    private void ButtonD12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD12MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD12MouseClicked

    private void ButtonD13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD13MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD13MouseClicked

    private void ButtonD14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD14MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD14MouseClicked

    private void ButtonD15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD15MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD15MouseClicked

    private void ButtonD16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD16MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD16MouseClicked

    private void ButtonD17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD17MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD17MouseClicked

    private void ButtonD18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD18MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD18MouseClicked

    private void ButtonD19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD19MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD19MouseClicked

    private void ButtonD20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD20MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD20MouseClicked

    private void ButtonD21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD21MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD21MouseClicked

    private void ButtonD22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD22MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD22MouseClicked

    private void ButtonD23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD23MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD23MouseClicked

    private void ButtonD24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD24MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD24MouseClicked

    private void ButtonD25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD25MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD25MouseClicked

    private void ButtonD26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD26MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD26MouseClicked

    private void ButtonD27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD27MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD27MouseClicked

    private void ButtonD28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD28MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD28MouseClicked

    private void ButtonD29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD29MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD29MouseClicked

    private void ButtonD30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonD30MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonD30MouseClicked

    private void ButtonE1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE1MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE1MouseClicked

    private void ButtonE2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE2MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE2MouseClicked

    private void ButtonE3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE3MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE3MouseClicked

    private void ButtonE4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE4MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE4MouseClicked

    private void ButtonE5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE5MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE5MouseClicked

    private void ButtonE6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE6MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE6MouseClicked

    private void ButtonE7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE7MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE7MouseClicked

    private void ButtonE8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE8MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE8MouseClicked

    private void ButtonE9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE9MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE9MouseClicked

    private void ButtonE10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE10MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE10MouseClicked

    private void ButtonE11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE11MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE11MouseClicked

    private void ButtonE12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE12MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE12MouseClicked

    private void ButtonE13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE13MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE13MouseClicked

    private void ButtonE14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE14MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE14MouseClicked

    private void ButtonE15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE15MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE15MouseClicked

    private void ButtonE16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE16MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE16MouseClicked

    private void ButtonE17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE17MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE17MouseClicked

    private void ButtonE18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE18MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE18MouseClicked

    private void ButtonE19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE19MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE19MouseClicked

    private void ButtonE20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE20MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE20MouseClicked

    private void ButtonE21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE21MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE21MouseClicked

    private void ButtonE22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE22MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE22MouseClicked

    private void ButtonE23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE23MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE23MouseClicked

    private void ButtonE24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE24MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE24MouseClicked

    private void ButtonE25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE25MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE25MouseClicked

    private void ButtonE26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE26MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE26MouseClicked

    private void ButtonE27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE27MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE27MouseClicked

    private void ButtonE28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE28MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE28MouseClicked

    private void ButtonE29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE29MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE29MouseClicked

    private void ButtonE30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonE30MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonE30MouseClicked

    private void ButtonF1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF1MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF1MouseClicked

    private void ButtonF2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF2MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF2MouseClicked

    private void ButtonF3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF3MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF3MouseClicked

    private void ButtonF4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF4MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF4MouseClicked

    private void ButtonF5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF5MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF5MouseClicked

    private void ButtonF6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF6MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF6MouseClicked

    private void ButtonF7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF7MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF7MouseClicked

    private void ButtonF8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF8MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF8MouseClicked

    private void ButtonF9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF9MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF9MouseClicked

    private void ButtonF10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF10MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF10MouseClicked

    private void ButtonF11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF11MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF11MouseClicked

    private void ButtonF12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF12MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF12MouseClicked

    private void ButtonF13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF13MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF13MouseClicked

    private void ButtonF14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF14MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF14MouseClicked

    private void ButtonF15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF15MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF15MouseClicked

    private void ButtonF16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF16MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF16MouseClicked

    private void ButtonF17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF17MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF17MouseClicked

    private void ButtonF18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF18MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF18MouseClicked

    private void ButtonF19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF19MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF19MouseClicked

    private void ButtonF20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF20MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF20MouseClicked

    private void ButtonF21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF21MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF21MouseClicked

    private void ButtonF22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF22MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF22MouseClicked

    private void ButtonF23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF23MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF23MouseClicked

    private void ButtonF24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF24MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF24MouseClicked

    private void ButtonF25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF25MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF25MouseClicked

    private void ButtonF26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF26MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF26MouseClicked

    private void ButtonF27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF27MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF27MouseClicked

    private void ButtonF28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF28MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF28MouseClicked

    private void ButtonF29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF29MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF29MouseClicked

    private void ButtonF30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonF30MouseClicked
        alterarCorBotao(evt);
    }//GEN-LAST:event_ButtonF30MouseClicked

    private void ConfirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarButtonActionPerformed
        if(botaoEscolhido.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, escolha um lugar antes de confirmar.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            // Verifica se o lugar escolhido já está ocupado
            if (voo.getListaNomeLugaresOcupados().contains(botaoEscolhido.get(0).getText())) {
                JOptionPane.showMessageDialog(this, "Esse lugar já se encontra ocupado.", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                // Esconde o painel de dados e exibe o painel de pagamento
                lugaresUI.getDataPanel().setVisible(false);
                lugaresUI.getPagamentoPanel().setVisible(true);

                // Atualiza o rótulo de preço total no painel de pagamento
                lugaresUI.getPrecoTotalPagamento().setText("Preço Total: " + precoFinal + "€");

                // Reinicia as variáveis de preço
                precoFinal = 0;
                precoTotalAssento = 0;

                // Fecha a janela de lugares
                dispose();
            }
        }
    }//GEN-LAST:event_ConfirmarButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         // Exibe o painel de pagamento ao fechar a janela de lugares
        lugaresUI.getUserPanel().setVisible(true);
    
        // Remove o cliente da lista se a janela foi fechada sem confirmação
        lugaresUI.getDataStorage().getListaDeClientes().remove(lugaresUI.getDataStorage().getListaDeClientes().size() - 1);

        // Atualiza o número de lugares livres no voo
        voo.setLugaresLivres(voo.getLugaresLivres() + 1);
    }//GEN-LAST:event_formWindowClosing

    private void OnOffSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnOffSeguroActionPerformed
        String textoAtual = OnOffSeguro.getText();

        // Alterna a visibilidade da PreçoSeguro e atualiza a informação do cliente
        if (textoAtual.equals("X")) {
            OnOffSeguro.setText("");
            PreçoSeguro.setVisible(false);
            lugaresUI.getDataStorage().getListaDeClientes().get(lugaresUI.getDataStorage().getListaDeClientes().size() - 1).setQuerSeguro(PreçoSeguro.isVisible());
        } else {
            OnOffSeguro.setText("X");
            PreçoSeguro.setVisible(true);
            lugaresUI.getDataStorage().getListaDeClientes().get(lugaresUI.getDataStorage().getListaDeClientes().size() - 1).setQuerSeguro(PreçoSeguro.isVisible());
        }

        // Atualiza os preços
        precoLugares();
    }//GEN-LAST:event_OnOffSeguroActionPerformed
  
    
    
    public static void main(String args[]) {
        // Cria uma instância da classe Lugares com um argumento nulo (null)
        Lugares lugares = new Lugares(null);

        try {
            // Configura o look and feel para Nimbus, se disponível
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            // Regista exceções relacionadas à configuração do look and feel
            java.util.logging.Logger.getLogger(Lugares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Cria e executa uma thread de evento para exibir a janela Lugares
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                lugares.setVisible(true);
            }
        });
    }

    
    
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BagagemExtra;
    private javax.swing.JButton ButtonA1;
    private javax.swing.JButton ButtonA10;
    private javax.swing.JButton ButtonA11;
    private javax.swing.JButton ButtonA12;
    private javax.swing.JButton ButtonA13;
    private javax.swing.JButton ButtonA14;
    private javax.swing.JButton ButtonA15;
    private javax.swing.JButton ButtonA16;
    private javax.swing.JButton ButtonA17;
    private javax.swing.JButton ButtonA18;
    private javax.swing.JButton ButtonA19;
    private javax.swing.JButton ButtonA2;
    private javax.swing.JButton ButtonA20;
    private javax.swing.JButton ButtonA21;
    private javax.swing.JButton ButtonA22;
    private javax.swing.JButton ButtonA23;
    private javax.swing.JButton ButtonA24;
    private javax.swing.JButton ButtonA25;
    private javax.swing.JButton ButtonA26;
    private javax.swing.JButton ButtonA27;
    private javax.swing.JButton ButtonA28;
    private javax.swing.JButton ButtonA29;
    private javax.swing.JButton ButtonA3;
    private javax.swing.JButton ButtonA30;
    private javax.swing.JButton ButtonA4;
    private javax.swing.JButton ButtonA5;
    private javax.swing.JButton ButtonA6;
    private javax.swing.JButton ButtonA7;
    private javax.swing.JButton ButtonA8;
    private javax.swing.JButton ButtonA9;
    private javax.swing.JButton ButtonB1;
    private javax.swing.JButton ButtonB10;
    private javax.swing.JButton ButtonB11;
    private javax.swing.JButton ButtonB12;
    private javax.swing.JButton ButtonB13;
    private javax.swing.JButton ButtonB14;
    private javax.swing.JButton ButtonB15;
    private javax.swing.JButton ButtonB16;
    private javax.swing.JButton ButtonB17;
    private javax.swing.JButton ButtonB18;
    private javax.swing.JButton ButtonB19;
    private javax.swing.JButton ButtonB2;
    private javax.swing.JButton ButtonB20;
    private javax.swing.JButton ButtonB21;
    private javax.swing.JButton ButtonB22;
    private javax.swing.JButton ButtonB23;
    private javax.swing.JButton ButtonB24;
    private javax.swing.JButton ButtonB25;
    private javax.swing.JButton ButtonB26;
    private javax.swing.JButton ButtonB27;
    private javax.swing.JButton ButtonB28;
    private javax.swing.JButton ButtonB29;
    private javax.swing.JButton ButtonB3;
    private javax.swing.JButton ButtonB30;
    private javax.swing.JButton ButtonB4;
    private javax.swing.JButton ButtonB5;
    private javax.swing.JButton ButtonB6;
    private javax.swing.JButton ButtonB7;
    private javax.swing.JButton ButtonB8;
    private javax.swing.JButton ButtonB9;
    private javax.swing.JButton ButtonC1;
    private javax.swing.JButton ButtonC10;
    private javax.swing.JButton ButtonC11;
    private javax.swing.JButton ButtonC12;
    private javax.swing.JButton ButtonC13;
    private javax.swing.JButton ButtonC14;
    private javax.swing.JButton ButtonC15;
    private javax.swing.JButton ButtonC16;
    private javax.swing.JButton ButtonC17;
    private javax.swing.JButton ButtonC18;
    private javax.swing.JButton ButtonC19;
    private javax.swing.JButton ButtonC2;
    private javax.swing.JButton ButtonC20;
    private javax.swing.JButton ButtonC21;
    private javax.swing.JButton ButtonC22;
    private javax.swing.JButton ButtonC23;
    private javax.swing.JButton ButtonC24;
    private javax.swing.JButton ButtonC25;
    private javax.swing.JButton ButtonC26;
    private javax.swing.JButton ButtonC27;
    private javax.swing.JButton ButtonC28;
    private javax.swing.JButton ButtonC29;
    private javax.swing.JButton ButtonC3;
    private javax.swing.JButton ButtonC30;
    private javax.swing.JButton ButtonC4;
    private javax.swing.JButton ButtonC5;
    private javax.swing.JButton ButtonC6;
    private javax.swing.JButton ButtonC7;
    private javax.swing.JButton ButtonC8;
    private javax.swing.JButton ButtonC9;
    private javax.swing.JButton ButtonD1;
    private javax.swing.JButton ButtonD10;
    private javax.swing.JButton ButtonD11;
    private javax.swing.JButton ButtonD12;
    private javax.swing.JButton ButtonD13;
    private javax.swing.JButton ButtonD14;
    private javax.swing.JButton ButtonD15;
    private javax.swing.JButton ButtonD16;
    private javax.swing.JButton ButtonD17;
    private javax.swing.JButton ButtonD18;
    private javax.swing.JButton ButtonD19;
    private javax.swing.JButton ButtonD2;
    private javax.swing.JButton ButtonD20;
    private javax.swing.JButton ButtonD21;
    private javax.swing.JButton ButtonD22;
    private javax.swing.JButton ButtonD23;
    private javax.swing.JButton ButtonD24;
    private javax.swing.JButton ButtonD25;
    private javax.swing.JButton ButtonD26;
    private javax.swing.JButton ButtonD27;
    private javax.swing.JButton ButtonD28;
    private javax.swing.JButton ButtonD29;
    private javax.swing.JButton ButtonD3;
    private javax.swing.JButton ButtonD30;
    private javax.swing.JButton ButtonD4;
    private javax.swing.JButton ButtonD5;
    private javax.swing.JButton ButtonD6;
    private javax.swing.JButton ButtonD7;
    private javax.swing.JButton ButtonD8;
    private javax.swing.JButton ButtonD9;
    private javax.swing.JButton ButtonE1;
    private javax.swing.JButton ButtonE10;
    private javax.swing.JButton ButtonE11;
    private javax.swing.JButton ButtonE12;
    private javax.swing.JButton ButtonE13;
    private javax.swing.JButton ButtonE14;
    private javax.swing.JButton ButtonE15;
    private javax.swing.JButton ButtonE16;
    private javax.swing.JButton ButtonE17;
    private javax.swing.JButton ButtonE18;
    private javax.swing.JButton ButtonE19;
    private javax.swing.JButton ButtonE2;
    private javax.swing.JButton ButtonE20;
    private javax.swing.JButton ButtonE21;
    private javax.swing.JButton ButtonE22;
    private javax.swing.JButton ButtonE23;
    private javax.swing.JButton ButtonE24;
    private javax.swing.JButton ButtonE25;
    private javax.swing.JButton ButtonE26;
    private javax.swing.JButton ButtonE27;
    private javax.swing.JButton ButtonE28;
    private javax.swing.JButton ButtonE29;
    private javax.swing.JButton ButtonE3;
    private javax.swing.JButton ButtonE30;
    private javax.swing.JButton ButtonE4;
    private javax.swing.JButton ButtonE5;
    private javax.swing.JButton ButtonE6;
    private javax.swing.JButton ButtonE7;
    private javax.swing.JButton ButtonE8;
    private javax.swing.JButton ButtonE9;
    private javax.swing.JButton ButtonF1;
    private javax.swing.JButton ButtonF10;
    private javax.swing.JButton ButtonF11;
    private javax.swing.JButton ButtonF12;
    private javax.swing.JButton ButtonF13;
    private javax.swing.JButton ButtonF14;
    private javax.swing.JButton ButtonF15;
    private javax.swing.JButton ButtonF16;
    private javax.swing.JButton ButtonF17;
    private javax.swing.JButton ButtonF18;
    private javax.swing.JButton ButtonF19;
    private javax.swing.JButton ButtonF2;
    private javax.swing.JButton ButtonF20;
    private javax.swing.JButton ButtonF21;
    private javax.swing.JButton ButtonF22;
    private javax.swing.JButton ButtonF23;
    private javax.swing.JButton ButtonF24;
    private javax.swing.JButton ButtonF25;
    private javax.swing.JButton ButtonF26;
    private javax.swing.JButton ButtonF27;
    private javax.swing.JButton ButtonF28;
    private javax.swing.JButton ButtonF29;
    private javax.swing.JButton ButtonF3;
    private javax.swing.JButton ButtonF30;
    private javax.swing.JButton ButtonF4;
    private javax.swing.JButton ButtonF5;
    private javax.swing.JButton ButtonF6;
    private javax.swing.JButton ButtonF7;
    private javax.swing.JButton ButtonF8;
    private javax.swing.JButton ButtonF9;
    private javax.swing.JButton ConfirmarButton;
    private javax.swing.JLabel MiniLogo_AdminUser;
    private javax.swing.JToggleButton OnOffBagagemExtra;
    private javax.swing.JToggleButton OnOffSeguro;
    private javax.swing.JLabel PrecoFinal;
    private javax.swing.JLabel PreçoAssento;
    private javax.swing.JLabel PreçoBagExtra;
    private javax.swing.JLabel PreçoSeguro;
    private javax.swing.JLabel Seguro;
    private javax.swing.JLabel TaxaDeAdmin;
    private javax.swing.JButton jButton178;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
