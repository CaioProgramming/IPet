package models;

import beans.AnimalBean;
import beans.ClienteBean;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AnimalDAO {

    Connection con = Conexao.abrirConexao();
    AnimalBean ab = null;
    ResultSet rs = null;

    public AnimalDAO(AnimalBean ab) {

        this.con = con;
        this.ab = ab;

    }
    
    public int getidcliente() {
        String last_idEndereco = "select max(IDCliente) from tbl_cliente;";
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
    
    
    public void adicionarAnimal() {

        try {

            String sql = "call addAnimal(?,?,?,?);";
            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setString(1, this.ab.getNome());
            ps.setString(2, this.ab.getRaca());
            ps.setDouble(3, this.ab.getPeso());
            ps.setInt(4, getidcliente());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!");

        } catch (SQLException e) {

            System.out.println("ERRO SQL: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }

    }

    public void removerAnimal() {

        try {

            String sql = "delete from tbl_animal where idAnimal = ?";

            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setInt(1, this.ab.getIdAnimal());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Animal removido com sucesso!");

        } catch (SQLException e) {

            System.out.println("ERRO NO BANCO: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }

    }

    public void alterarAnimal() {

        try {

            String sql = "update tbl_animal set nome = ?, raca = ?, peso = ? where IDCliente = ?";
             PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setString(1, this.ab.getNome());
            ps.setString(2, this.ab.getRaca());
            ps.setDouble(3, this.ab.getPeso());
            ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Animal alterado com sucesso!");

        } catch (Exception e) {

        }

    }

    public ResultSet listarAnimal() {

        try {

            String sql = "select * from pets";

            PreparedStatement ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

        } catch (SQLException e) {

            System.out.println("ERRO: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }

        return this.rs;

    }

}
