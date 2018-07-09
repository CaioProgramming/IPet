package View;

import beans.FuncionarioBean;
import controllers.FuncionarioController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utils.Dataconverter;

public class FuncionarioDetalhes extends javax.swing.JFrame {

    FuncionarioBean fb = null;
    FuncionarioController fc = null;

    public FuncionarioDetalhes() {
        setIcon();
        initComponents();
        fb = new FuncionarioBean();
        fc = new FuncionarioController(fb);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

    }

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon_1.png")));
    }
     private void voltar() {
        Home home = new Home();
        this.setVisible(false);
        home.setVisible(true);
        this.dispose();
    }

    public void receberDados(String id, String nome, String cpf, String data_nasc, String tipo) {

        idtxt.setText("ID: " + id);
        nometxt.setText(nome);
        cpftxt.setText(cpf);
        dtnasctxt.setText(data_nasc.toString());
        if(tipo == "M"){
        comboboxtipo.setSelectedIndex(1);
        
        }else if(tipo == "V"){
            comboboxtipo.setSelectedIndex(2);
            
        }else if(tipo == "A"){
            comboboxtipo.setSelectedIndex(3);
            
        } 
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelfuncionario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nometxt = new javax.swing.JTextField();
        cpftxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        funcionariobtn = new javax.swing.JButton();
        cancelarbtn = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        dtnasctxt = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        comboboxtipo = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        senhatxt = new javax.swing.JPasswordField();
        close3 = new javax.swing.JPanel();
        closelabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idtxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfuncionario.setBackground(new java.awt.Color(255, 255, 255));
        panelfuncionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel1.setText("Alterar funcionário");
        panelfuncionario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel3.setText("Nome");
        panelfuncionario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel4.setText("CPF");
        panelfuncionario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel5.setText("Data de nascimento");
        panelfuncionario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        nometxt.setBorder(null);
        panelfuncionario.add(nometxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 160, -1));

        cpftxt.setBorder(null);
        panelfuncionario.add(cpftxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 190, -1));
        panelfuncionario.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));
        panelfuncionario.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 160, 10));
        panelfuncionario.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 190, 10));
        panelfuncionario.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 190, 10));

        funcionariobtn.setBackground(new java.awt.Color(255, 255, 255));
        funcionariobtn.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        funcionariobtn.setText("Alterar");
        funcionariobtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        funcionariobtn.setContentAreaFilled(false);
        funcionariobtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        funcionariobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                funcionariobtnMouseClicked(evt);
            }
        });
        funcionariobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionariobtnActionPerformed(evt);
            }
        });
        panelfuncionario.add(funcionariobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 110, 35));

        cancelarbtn.setBackground(new java.awt.Color(51, 153, 255));
        cancelarbtn.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        cancelarbtn.setText("Cancelar");
        cancelarbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        cancelarbtn.setContentAreaFilled(false);
        cancelarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarbtnMouseClicked(evt);
            }
        });
        cancelarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbtnActionPerformed(evt);
            }
        });
        panelfuncionario.add(cancelarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 110, 35));
        panelfuncionario.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 160, 10));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel8.setText("Nome");
        panelfuncionario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        dtnasctxt.setBorder(null);
        try {
            dtnasctxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dtnasctxt.setToolTipText("");
        panelfuncionario.add(dtnasctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 190, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/alterarfuncionario.png"))); // NOI18N
        panelfuncionario.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 190, 480));

        comboboxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo de funcionário", "Veterinário", "Vendedor", "Administrador" }));
        comboboxtipo.setBorder(null);
        panelfuncionario.add(comboboxtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, 30));
        panelfuncionario.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));
        panelfuncionario.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 122, -1, 0));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel6.setText("Senha");
        panelfuncionario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));
        panelfuncionario.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, 10));

        senhatxt.setBorder(null);
        panelfuncionario.add(senhatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 160, -1));

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

        panelfuncionario.add(close3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 40, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/eraser.png"))); // NOI18N
        jLabel2.setText("Excluir");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panelfuncionario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        idtxt.setBackground(new java.awt.Color(255, 255, 255));
        idtxt.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        idtxt.setForeground(new java.awt.Color(204, 204, 204));
        idtxt.setText("jLabel7");
        panelfuncionario.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jPanel1.add(panelfuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void funcionariobtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionariobtnMouseClicked

        int select = comboboxtipo.getSelectedIndex();
        switch (select) {

            case 0:
            JOptionPane.showMessageDialog(null, "Selecione o tipo de funcionário");
            case 1:
            fb.setTipo("M");
            case 2:
            fb.setTipo("V");
            case 3:
            fb.setTipo("A");

        }
        System.out.println(fb.getTipo());
        fb.setNome(nometxt.getText());
        fb.setSenha(senhatxt.getText());
        fb.setCpf(Integer.parseInt(cpftxt.getText()));
        try {
            fb.setData_nascimento(Dataconverter.data2SQL(dtnasctxt.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(Cadastro_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }

        fc.Alterar();

    }//GEN-LAST:event_funcionariobtnMouseClicked

    private void funcionariobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionariobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionariobtnActionPerformed

    private void cancelarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarbtnMouseClicked
        voltar();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarbtnMouseClicked

    private void cancelarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtnActionPerformed

        voltar();
    }//GEN-LAST:event_cancelarbtnActionPerformed

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

        fb.setId(Integer.parseInt(idtxt.getText()));
        this.fc.Remover();
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
            java.util.logging.Logger.getLogger(FuncionarioDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioDetalhes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JPanel close3;
    private javax.swing.JLabel closelabel3;
    private javax.swing.JComboBox<String> comboboxtipo;
    private javax.swing.JTextField cpftxt;
    private javax.swing.JFormattedTextField dtnasctxt;
    private javax.swing.JButton funcionariobtn;
    private javax.swing.JLabel idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField nometxt;
    private javax.swing.JPanel panelfuncionario;
    private javax.swing.JPasswordField senhatxt;
    // End of variables declaration//GEN-END:variables
}
