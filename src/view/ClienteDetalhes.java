package View;

import beans.ClienteBean;
import controllers.ClienteController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Dataconverter;

public class ClienteDetalhes extends javax.swing.JFrame {

    ClienteBean cb = null;
    ClienteController cc = null;

    public ClienteDetalhes() {
        setIcon();
        initComponents();
        cb = new ClienteBean();
        cc = new ClienteController(cb);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

    }

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon_1.png")));
    }

    public void receberDados(String id, String nome, String cpf, String data_nasc, String celular, String telefone) {

        idtxt.setText(id);
        clientetxt.setText(nome);
        cpftxt.setText(cpf);
        dtnasctxt.setText(data_nasc.toString());
        celulartxt.setText(celular);
        telefonetxt.setText(telefone);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jLabel12 = new javax.swing.JLabel();
        idtxt = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        close3 = new javax.swing.JPanel();
        closelabel3 = new javax.swing.JLabel();
        dtnasctxt = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelcliente.setBackground(new java.awt.Color(255, 255, 255));
        panelcliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel1.setText("Alterar cliente");
        panelcliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

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
        panelcliente.add(telefonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 190, -1));

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
        clientebtn.setText("Alterar");
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

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("ID");
        panelcliente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        idtxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idtxt.setText("jLabel13");
        panelcliente.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/alterar.png"))); // NOI18N
        panelcliente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 180, 470));

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

        dtnasctxt.setBorder(null);
        try {
            dtnasctxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dtnasctxt.setToolTipText("");
        panelcliente.add(dtnasctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/eraser.png"))); // NOI18N
        jLabel2.setText("Excluir");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panelcliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jPanel1.add(panelcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 657, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientebtnMouseClicked


    }//GEN-LAST:event_clientebtnMouseClicked

    private void cancelarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtnActionPerformed

        try {
            Clientes home = new Clientes();
            home.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelarbtnActionPerformed

    private void numerotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numerotxtActionPerformed

    private void CEPtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEPtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CEPtxtActionPerformed

    private void clientebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientebtnActionPerformed
        this.cb.setNome(clientetxt.getText());
        this.cb.setId(Integer.parseInt(idtxt.getText()));
        try {
            this.cb.setData_nascimento(Dataconverter.data2SQL(dtnasctxt.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(ClienteDetalhes.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.cb.setTelefone(telefonetxt.getText());
        this.cb.setCelular(celulartxt.getText());
        this.cb.setCpf(Integer.parseInt(cpftxt.getText()));

        this.cc.alterar();


    }//GEN-LAST:event_clientebtnActionPerformed

    private void close3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close3MouseClicked
       
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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        cb.setId(Integer.parseInt(idtxt.getText()));
        this.cc.excluir();

    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(ClienteDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteDetalhes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CEPtxt;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JTextField celulartxt;
    private javax.swing.JTextField cidadetxt;
    private javax.swing.JButton clientebtn;
    private javax.swing.JTextField clientetxt;
    private javax.swing.JPanel close3;
    private javax.swing.JLabel closelabel3;
    private javax.swing.JTextField cpftxt;
    private javax.swing.JFormattedTextField dtnasctxt;
    private javax.swing.JLabel idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField numerotxt;
    private javax.swing.JPanel panelcliente;
    private javax.swing.JTextField ruatxt;
    private javax.swing.JTextField telefonetxt;
    // End of variables declaration//GEN-END:variables
}
