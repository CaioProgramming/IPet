/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import beans.AnimalBean;
import beans.ClienteBean;
import beans.EnderecoBean;
import controllers.ClienteController;
import controllers.ListarController;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Dataconverter;

/**
 *
 * @author aluno.etec
 */
public class Cadastro_cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_cliente
     */
    ClienteBean cb;
    AnimalBean ab;
    EnderecoBean eb;

    public Cadastro_cliente() {
        cb = new ClienteBean();
        ab = new AnimalBean();
        eb = new EnderecoBean();

        setIcon();
        initComponents();
        listarclientes();
    }

    public void limit() {

    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon_1.png")));
    }

    public void listarclientes() {
        try {
            ResultSet rs;
            ListarController list = new ListarController();
            
            rs = list.listarClienteController();
            while(rs.next()){
                clientesbox.addItem(String.valueOf(rs.getInt("IDCliente")) + " " + String.valueOf(rs.getString("nome")));}
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelcliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        clientetxt = new javax.swing.JTextField();
        cpftxt = new javax.swing.JTextField();
        telefonetxt = new javax.swing.JTextField();
        celulartxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        clientebtn = new javax.swing.JButton();
        cancelarbtn = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ruatxt = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        cidadetxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        numerotxt = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        CEPtxt = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        dtnasctxt = new javax.swing.JFormattedTextField();
        no_animal = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        close3 = new javax.swing.JPanel();
        closelabel3 = new javax.swing.JLabel();
        onlyanimal = new javax.swing.JLabel();
        panelanimal = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nomeanimaltxt = new javax.swing.JTextField();
        pesoanimaltxt = new javax.swing.JTextField();
        racatxt = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        concluirbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        clientesbox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        close4 = new javax.swing.JPanel();
        closelabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        panelcliente.setBackground(new java.awt.Color(255, 255, 255));
        panelcliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel1.setText("Cadastre um cliente");
        panelcliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel3.setText("Nome");
        panelcliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel4.setText("CPF");
        panelcliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel5.setText("Data de nascimento");
        panelcliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel6.setText("Telefone");
        panelcliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel7.setText("Celular");
        panelcliente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        clientetxt.setBorder(null);
        panelcliente.add(clientetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 160, -1));

        cpftxt.setBorder(null);
        panelcliente.add(cpftxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 190, -1));

        telefonetxt.setBorder(null);
        panelcliente.add(telefonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 284, 190, 10));

        celulartxt.setBorder(null);
        panelcliente.add(celulartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 190, -1));
        panelcliente.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));
        panelcliente.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 160, 10));
        panelcliente.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 190, 10));
        panelcliente.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 190, 10));
        panelcliente.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 190, 10));
        panelcliente.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 190, 10));

        clientebtn.setBackground(new java.awt.Color(255, 255, 255));
        clientebtn.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        clientebtn.setText("Avançar");
        clientebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        clientebtn.setContentAreaFilled(false);
        clientebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientebtnMouseClicked(evt);
            }
        });
        clientebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientebtnActionPerformed(evt);
            }
        });
        panelcliente.add(clientebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 110, 35));

        cancelarbtn.setBackground(new java.awt.Color(51, 153, 255));
        cancelarbtn.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        cancelarbtn.setText("Cancelar");
        cancelarbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        cancelarbtn.setContentAreaFilled(false);
        cancelarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbtnActionPerformed(evt);
            }
        });
        panelcliente.add(cancelarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 110, 35));
        panelcliente.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 160, 10));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel8.setText("Nome");
        panelcliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel9.setText("Rua");
        panelcliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        ruatxt.setBorder(null);
        panelcliente.add(ruatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 160, -1));
        panelcliente.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, 10));

        cidadetxt.setBorder(null);
        panelcliente.add(cidadetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 160, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel10.setText("Cidade");
        panelcliente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));
        panelcliente.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 160, 10));

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel11.setText("Número");
        panelcliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        numerotxt.setBorder(null);
        numerotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerotxtActionPerformed(evt);
            }
        });
        panelcliente.add(numerotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 70, -1));
        panelcliente.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 60, 10));

        jLabel17.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel17.setText("CEP");
        panelcliente.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        CEPtxt.setBorder(null);
        CEPtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEPtxtActionPerformed(evt);
            }
        });
        panelcliente.add(CEPtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 70, -1));
        panelcliente.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 60, 10));

        dtnasctxt.setBorder(null);
        try {
            dtnasctxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dtnasctxt.setToolTipText("");
        panelcliente.add(dtnasctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 190, -1));

        no_animal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        no_animal.setForeground(new java.awt.Color(255, 0, 51));
        no_animal.setText("Não possui animal");
        no_animal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        no_animal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                no_animalMouseClicked(evt);
            }
        });
        panelcliente.add(no_animal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cadastro.png"))); // NOI18N
        panelcliente.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 190, 480));

        close3.setBackground(new java.awt.Color(255, 101, 101));
        close3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close3MouseExited(evt);
            }
        });
        close3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closelabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        closelabel3.setForeground(new java.awt.Color(255, 255, 255));
        closelabel3.setText("X");
        close3.add(closelabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        panelcliente.add(close3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 40, 30));

        onlyanimal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        onlyanimal.setForeground(new java.awt.Color(153, 204, 255));
        onlyanimal.setText("Somente animal");
        onlyanimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        onlyanimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onlyanimalMouseClicked(evt);
            }
        });
        panelcliente.add(onlyanimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        getContentPane().add(panelcliente, "card2");

        panelanimal.setBackground(new java.awt.Color(255, 255, 255));
        panelanimal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel13.setText("Cadastre um animal");
        panelanimal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel14.setText("Nome");
        panelanimal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel15.setText("Peso");
        panelanimal.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel16.setText("Raça");
        panelanimal.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        nomeanimaltxt.setBorder(null);
        panelanimal.add(nomeanimaltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 160, -1));

        pesoanimaltxt.setBorder(null);
        panelanimal.add(pesoanimaltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 190, -1));

        racatxt.setBorder(null);
        panelanimal.add(racatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 190, -1));
        panelanimal.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));
        panelanimal.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 160, 10));
        panelanimal.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 190, 10));
        panelanimal.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 190, 10));

        concluirbtn.setBackground(new java.awt.Color(255, 255, 255));
        concluirbtn.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        concluirbtn.setText("Concluir");
        concluirbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        concluirbtn.setContentAreaFilled(false);
        concluirbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        concluirbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                concluirbtnMouseClicked(evt);
            }
        });
        panelanimal.add(concluirbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 110, 35));

        cancelbtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelbtn.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        cancelbtn.setText("Cancelar");
        cancelbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        cancelbtn.setContentAreaFilled(false);
        cancelbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelanimal.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 110, 35));
        panelanimal.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 160, 10));

        jLabel19.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel19.setText("Nome");
        panelanimal.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cadastroanimal.png"))); // NOI18N
        panelanimal.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 190, 480));

        clientesbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o dono" }));
        clientesbox.setEnabled(false);
        clientesbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesboxMouseClicked(evt);
            }
        });
        clientesbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesboxActionPerformed(evt);
            }
        });
        panelanimal.add(clientesbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Dono");
        panelanimal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        close4.setBackground(new java.awt.Color(255, 101, 101));
        close4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close4MouseExited(evt);
            }
        });
        close4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closelabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        closelabel4.setForeground(new java.awt.Color(255, 255, 255));
        closelabel4.setText("X");
        close4.add(closelabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        panelanimal.add(close4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 40, 30));

        getContentPane().add(panelanimal, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numerotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numerotxtActionPerformed

    private void clientebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientebtnMouseClicked
        panelcliente.setVisible(false);
        panelanimal.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_clientebtnMouseClicked

    private void concluirbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_concluirbtnMouseClicked
        // TODO add your handling code here:

        System.out.println(dtnasctxt.getText());
        

        //setando cliente
        cb.setNome(clientetxt.getText());
        cb.setCpf(Integer.parseInt(cpftxt.getText()));
        cb.setCelular(celulartxt.getText());
        cb.setTelefone(telefonetxt.getText());
        try {
            cb.setData_nascimento(Dataconverter.data2SQL(dtnasctxt.getText()));

        } catch (ParseException ex) {
            Logger.getLogger(Cadastro_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        eb.setRua(ruatxt.getText());
        eb.setNumero(Integer.parseInt(numerotxt.getText()));
        eb.setCidade(cidadetxt.getText());
        eb.setCep(Integer.parseInt(CEPtxt.getText()));

        ab.setNome(nomeanimaltxt.getText());
        ab.setPeso(Double.parseDouble(pesoanimaltxt.getText()));
        ab.setRaca(racatxt.getText());
        

        ClienteController cc = new ClienteController(ab, cb, eb);

        cc.cadastrar();


    }//GEN-LAST:event_concluirbtnMouseClicked

    private void CEPtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEPtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CEPtxtActionPerformed

    private void no_animalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_animalMouseClicked
        // TODO add your handling code here:
        System.out.println(dtnasctxt.getText());
        ab = new AnimalBean();
        cb = new ClienteBean();
        eb = new EnderecoBean();

        //setando cliente
        cb.setNome(clientetxt.getText());
        cb.setCpf(Integer.parseInt(cpftxt.getText()));
        cb.setCelular(celulartxt.getText());
        cb.setTelefone(telefonetxt.getText());

        try {
            cb.setData_nascimento((Dataconverter.data2SQL(dtnasctxt.getText())));
        } catch (ParseException ex) {
            Logger.getLogger(Cadastro_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        eb.setRua(ruatxt.getText());
        eb.setNumero(Integer.parseInt(numerotxt.getText()));
        eb.setCidade(cidadetxt.getText());
        eb.setCep(Integer.parseInt(CEPtxt.getText()));

        ClienteController cc = new ClienteController(cb, eb);

        cc.cadastrarSemAnimal();
    }//GEN-LAST:event_no_animalMouseClicked

    private void cancelarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtnActionPerformed

        voltar();

    }//GEN-LAST:event_cancelarbtnActionPerformed

    private void voltar() {
        Home home = new Home();
        this.setVisible(false);
        home.setVisible(true);
        this.dispose();
    }

    private void clientebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientebtnActionPerformed

    private void close3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close3MouseClicked
        Home home = new Home();
        this.setVisible(false);
        home.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_close3MouseClicked

    private void close3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close3MouseEntered

        Color darkred = new Color(130, 0, 0);

        close3.setBackground(darkred);
    }//GEN-LAST:event_close3MouseEntered

    private void close3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close3MouseExited
        Color red = new Color(255, 101, 101);

        close3.setBackground(red);
        closelabel3.setForeground(Color.WHITE);
    }//GEN-LAST:event_close3MouseExited

    private void onlyanimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onlyanimalMouseClicked
        panelcliente.setVisible(false);
        panelanimal.setVisible(true);
        clientesbox.setEnabled(true);


    }//GEN-LAST:event_onlyanimalMouseClicked

    private void close4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close4MouseClicked
        // TODO add your handling code here:
        Home home = new Home();
        this.setVisible(false);
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_close4MouseClicked

    private void close4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_close4MouseEntered

    private void close4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_close4MouseExited

    private void clientesboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesboxMouseClicked
                    // TODO add your handling code here:
    }//GEN-LAST:event_clientesboxMouseClicked

    private void clientesboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesboxActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CEPtxt;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JTextField celulartxt;
    private javax.swing.JTextField cidadetxt;
    private javax.swing.JButton clientebtn;
    private javax.swing.JComboBox<String> clientesbox;
    private javax.swing.JTextField clientetxt;
    private javax.swing.JPanel close3;
    private javax.swing.JPanel close4;
    private javax.swing.JLabel closelabel3;
    private javax.swing.JLabel closelabel4;
    private javax.swing.JButton concluirbtn;
    private javax.swing.JTextField cpftxt;
    private javax.swing.JFormattedTextField dtnasctxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel no_animal;
    private javax.swing.JTextField nomeanimaltxt;
    private javax.swing.JTextField numerotxt;
    private javax.swing.JLabel onlyanimal;
    private javax.swing.JPanel panelanimal;
    private javax.swing.JPanel panelcliente;
    private javax.swing.JTextField pesoanimaltxt;
    private javax.swing.JTextField racatxt;
    private javax.swing.JTextField ruatxt;
    private javax.swing.JTextField telefonetxt;
    // End of variables declaration//GEN-END:variables
}