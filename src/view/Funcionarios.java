package View;

import beans.ClienteBean;
import beans.FuncionarioBean;
import controllers.ListarController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import models.FuncionarioDAO;

public class Funcionarios extends javax.swing.JFrame {

    ListarController list = null;
    FuncionarioBean fb = null;
    ResultSet rs = null;

    public Funcionarios() throws SQLException {
        setIcon();
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        fb = new FuncionarioBean();
        list = new ListarController();
        this.listarFuncionario();
        jScrollPane1.getViewport().setBackground(new Color(255, 255, 255));
// change the Foreground
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        close3 = new javax.swing.JPanel();
        closelabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IPet");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Funcionários");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

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

        jPanel2.add(close3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 40, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 120));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_cliente.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        tbl_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "Data de nascimento", "Senha", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_cliente.setFillsViewportHeight(true);
        tbl_cliente.setGridColor(new java.awt.Color(0, 102, 255));
        tbl_cliente.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_cliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 690, 340));

        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 10, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon_1.png")));
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);

// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tbl_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clienteMouseClicked

        if (evt.getClickCount() == 2) {
            //CASO O CARA DÊ 2 CLICKS EM UM REGISTRO DA TABELA, ELE SERA EXIBIDO COM DETALHES EM UM MODAL
            FuncionarioDetalhes frm = new FuncionarioDetalhes();
            frm.receberDados(tbl_cliente.getValueAt(tbl_cliente.getSelectedRow(), 0).toString(),
                    tbl_cliente.getValueAt(tbl_cliente.getSelectedRow(), 1).toString(),
                    tbl_cliente.getValueAt(tbl_cliente.getSelectedRow(), 2).toString(),
                    tbl_cliente.getValueAt(tbl_cliente.getSelectedRow(), 3).toString(),
                    tbl_cliente.getValueAt(tbl_cliente.getSelectedRow(), 4).toString());
            frm.setVisible(true);
        }
    }//GEN-LAST:event_tbl_clienteMouseClicked

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

   
    
    public void listarFuncionario() throws SQLException {

        this.rs = list.listarFuncionarios();

        DefaultTableModel dtm = (DefaultTableModel) tbl_cliente.getModel();

        dtm.setNumRows(0);

        while (this.rs.next()) {

            dtm.addRow(new String[]{
                String.valueOf(rs.getString("IDFuncionario")),
                String.valueOf(rs.getString("nome")),
                String.valueOf(rs.getInt("cpf")),
                String.valueOf(rs.getDate("data_nascimento")),
                String.valueOf(rs.getString("senha")),
                String.valueOf(rs.getString("tipo"))
            });
        }

    }

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
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Funcionarios().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Funcionarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel close3;
    private javax.swing.JLabel closelabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_cliente;
    // End of variables declaration//GEN-END:variables
}
