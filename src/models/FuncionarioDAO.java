/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import beans.ClienteBean;
import beans.FuncionarioBean;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.etec
 */
public class FuncionarioDAO {

    Connection con = Conexao.abrirConexao();
    FuncionarioBean fb = null;
    ResultSet rs = null;
    PreparedStatement ps;

    public FuncionarioDAO(FuncionarioBean fb) {

        this.fb = fb;

    }

    public void adicionarFuncionario() {
        try {

            String sql = "call addFuncionario(?,?,?,?,?)";
            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setString(1, this.fb.getNome());
            ps.setInt(2, this.fb.getCpf());
            ps.setDate(3, this.fb.getData_nascimento());
            ps.setString(4, this.fb.getTipo());
            ps.setString(5, this.fb.getSenha());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Funcionario adicionado com sucesso!");

        } catch (SQLException e) {

            System.out.println("ERRO: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }

    }

    public void alterarFuncionario() {

        try {

            String sql = "update tbl_funcionario set nome = ?, cpf = ?, data_nascimento = ?, tipo = ?, senha = ? where IDFuncionario = ?";

            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setString(1, this.fb.getNome());
            ps.setInt(2, this.fb.getCpf());
            ps.setDate(3, this.fb.getData_nascimento());
            ps.setString(4, this.fb.getSenha());
            ps.setInt(6, this.fb.getId());
            JOptionPane.showMessageDialog(null, "Funcionario alterado com sucesso!");

        } catch (Exception e) {

        }

    }

    public boolean login() {
        boolean check = false;
        try {
            String sql = "SELECT * FROM tbl_funcionario WHERE nome = ? and senha = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, this.fb.getNome());
            stmt.setString(2, this.fb.getSenha());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                this.fb.setNome(rs.getString("nome"));
                this.fb.setTipo(rs.getString("tipo"));
                check = true;
            }
        } catch (SQLException e) {
            System.out.println("ERRO " + e.getLocalizedMessage());
            JOptionPane.showMessageDialog(null, "ERRO NO BANCO DE DADOS! VERIFIQUE. ", "ATENÇÃO !", JOptionPane.INFORMATION_MESSAGE);

        }
        return check;
    }

    public void removerFuncionario() {

        try {

            String sql = "delete from tbl_funcionario where idFuncionario = ?";

            ps.setInt(1, this.fb.getId());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Funcionario removido com sucesso!");

        } catch (SQLException e) {

            System.out.println("ERRO: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }

    }

    public ResultSet listarFuncionario() {

        try {

            String sql = "select * from tbl_funcionario";

            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

        } catch (SQLException e) {

            System.out.println("ERRO: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }

        return this.rs;

    }

    public int getidfuncionario() {
        String idfuncionario = "select IDFuncionario from tbl_funcionario where cpf = ?";
        int id = 0;

        try {
            PreparedStatement ps = this.con.prepareStatement(idfuncionario);
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

}
