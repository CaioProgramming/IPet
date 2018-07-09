package models;

import beans.ClienteBean;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Connection con = Conexao.abrirConexao();
    ClienteBean cb = null;
    ResultSet rs = null;

    public ClienteDAO(ClienteBean cb) {

        this.cb = cb;

    }

    public int pegarIdCliente() {

        String sql = "select IDCliente from tbl_cliente where cpf = ?";

        int id = 0;

        try {

            PreparedStatement stmt = this.con.prepareStatement(sql);

            stmt.setInt(1, this.cb.getCpf());

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                this.cb.setId(rs.getInt(1));

                id = this.cb.getId();

            }

            rs.close();
            stmt.close();
            return id;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return 0;

        }

    }

    public int getidendereco() {
        String last_idEndereco = "select max(IDEndereco) from tbl_endereco";
        int id = 0;

        try {
            PreparedStatement ps = this.con.prepareStatement(last_idEndereco);
            rs = ps.executeQuery();
            while (rs.next()) {

                //this.cb.setIdCliente(rs.getInt(1));
                id = rs.getInt(1);

            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;

    }

    public void adicionarCliente() {
        try {

            String sql = "call addCliente(?,?,?,?,?,?)";
            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setString(1, this.cb.getNome());
            ps.setInt(2, this.cb.getCpf());
            ps.setDate(3, this.cb.getData_nascimento());
            ps.setInt(4, getidendereco());
            ps.setString(5, this.cb.getTelefone());
            ps.setString(6, this.cb.getCelular());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!");

        } catch (SQLException e) {

            System.out.println("ERRO: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }

    }

    public void alterarCliente() {

        try {

            String sql = "update tbl_cliente set nome = ?, cpf = ?, data_nascimento = ?, telefone = ?, celular = ? where IDCliente = ?";

            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setString(1, this.cb.getNome());
            ps.setInt(2, this.cb.getCpf());
            ps.setDate(3, this.cb.getData_nascimento());
            ps.setString(4, this.cb.getTelefone());
            ps.setString(5, this.cb.getCelular());
            ps.setInt(6, this.cb.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");

        } catch (Exception e) {

        }

    }

    public void removerCliente() {

        try {

            String sql = "delete from tbl_cliente where idCliente = ?";

            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setInt(1, this.cb.getId());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");

        } catch (SQLException e) {

            System.out.println("ERRO: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }

    }

    public ResultSet listarCliente() {

        try {

            String sql = "select * from tbl_cliente";

            PreparedStatement ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

        } catch (SQLException e) {

            System.out.println("ERRO: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }

        return this.rs;

    }

    public void clienteslist(JComboBox vetor){
    
        try {
            String sql = "select IDCliente and nome from tbl_cliente";
            PreparedStatement ps = con.prepareStatement(sql);
            while(rs.next()){
                vetor.addItem(rs.getString("nome"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

}
