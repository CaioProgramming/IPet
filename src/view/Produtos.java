package view;

import View.Home;
import View.Pets;
import beans.ProdutoBean;
import controllers.ListarController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Produtos extends javax.swing.JFrame {

    ListarController list = null;
    ProdutoBean pb = null;
    ResultSet rs = null;

    public Produtos() throws SQLException {
        setIcon();
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        jScrollPane1.getViewport().setBackground(new Color(255, 255, 255));
        list = new ListarController();
        this.listarProdutos();
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
        tbl_produtos = new javax.swing.JTable();

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
        jLabel3.setText("Produtos");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

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

        tbl_produtos.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        tbl_produtos.setForeground(new java.awt.Color(51, 153, 255));
        tbl_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor", "Descrição", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_produtos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_produtos.setFillsViewportHeight(true);
        tbl_produtos.setGridColor(new java.awt.Color(0, 102, 255));
        tbl_produtos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_produtosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_produtos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 690, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon_1.png")));
    }

    public void listarProdutos() throws SQLException {

        this.rs = list.listarItems();

        DefaultTableModel dtm = (DefaultTableModel) tbl_produtos.getModel();

        dtm.setNumRows(0);

        while (this.rs.next()) {

            dtm.addRow(new String[]{
                String.valueOf(rs.getString("IDProduto")),
                String.valueOf(rs.getString("nome")),
                String.valueOf(rs.getString("valor")),
                String.valueOf(rs.getString("descricao")),
                String.valueOf(rs.getString("categoria"))
                    
            });
        }

    }

    
    private void tbl_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_produtosMouseClicked

        if (evt.getClickCount() == 2) {
            //CASO O CARA DÊ 2 CLICKS EM UM REGISTRO DA TABELA, ELE SERA EXIBIDO COM DETALHES EM UM MODAL
            ProdutosDetalhes frm = new ProdutosDetalhes();
            frm.receberDados(tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 0).toString(),
                    tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 1).toString(),
                    tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 2).toString(),
                    tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 3).toString());
            frm.setVisible(true);
        }
    }//GEN-LAST:event_tbl_produtosMouseClicked

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
            java.util.logging.Logger.getLogger(Pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Produtos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Produtos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel close3;
    private javax.swing.JLabel closelabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_produtos;
    // End of variables declaration//GEN-END:variables
}
