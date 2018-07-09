package models;

import beans.ProdutoBean;
import beans.ServicoBean;
import conexao.Conexao;
import interfaces.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ItemDAO {

    Connection con = Conexao.abrirConexao();
    ServicoBean sb = null;
    ProdutoBean pb = null;
    ResultSet rs = null;

    public ItemDAO(ProdutoBean pb, ServicoBean sb) {
        this.sb = sb;
        this.pb = pb;

    }

    public void insere() {

        try {

            String sql = "call addProduto(?,?,?,?);";

            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setString(1, this.pb.getNome());
            ps.setDouble(2, this.pb.getValor());
            ps.setString(3, this.pb.getDescricao());
            ps.setString(4, this.pb.getCategoria());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");

        } catch (SQLException e) {

            System.out.println("ERRO SQL: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }

    }

    public void addServico() {

        try {

            String sql = "call addServico(?,?,?);";

            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setString(1, this.sb.getNome());
            ps.setDouble(2, this.sb.getValor());
            ps.setString(3, this.sb.getDescricao());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso!");

        } catch (SQLException e) {

            System.out.println("ERRO SQL: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }
    }

    public void altera() {

        try {
            String sql = "update tbl_produto set nome = ?,valor = ?,descricao = ?,categoria = ? where IDProduto = ?";

            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setString(1, this.pb.getNome());
            ps.setDouble(2, this.pb.getValor());
            ps.setString(3, this.pb.getDescricao());
            ps.setString(4, this.pb.getCategoria());
            ps.setInt(5, this.pb.getIdProduto());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void alteraservico() {

        try {
            String sql = "update tbl_servico set nome = ?,valor = ?,descricao = ? where IDServico = ?";

            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setString(1, this.sb.getNome());
            ps.setDouble(2, this.sb.getValor());
            ps.setString(3, this.sb.getDescricao());
            ps.setInt(4, this.sb.getIdProduto());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @return
     */
    public ResultSet listar() {

        try {

            String sql = "select * from tbl_produto";

            PreparedStatement ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

        } catch (SQLException e) {

            System.out.println("ERRO: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }

        return this.rs;

    }

    public ResultSet listarservico() {

        try {

            String sql = "select * from tbl_servico";

            PreparedStatement ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

        } catch (SQLException e) {

            System.out.println("ERRO: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }

        return this.rs;

    }

    public void exclui() {
        try {
            String sql = "delete * from tbl_produto where IDProduto = ?";
            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setInt(1, this.pb.getIdProduto());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void excluiservico() {
        try {
            String sql = "delete * from tbl_servico where IDServico = ?";
            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setInt(1, this.sb.getIdProduto());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Serviço excluído com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
