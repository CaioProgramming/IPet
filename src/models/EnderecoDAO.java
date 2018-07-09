package models;

import beans.ClienteBean;
import beans.EnderecoBean;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EnderecoDAO {

    Connection con = Conexao.abrirConexao();
    EnderecoBean ed = null;
    ResultSet rs = null;

    public EnderecoDAO(EnderecoBean ed) {

        this.con = con;
        this.ed = ed;

    }

    public void AdcionarEndereco() {

        String sqlverify = "select * from tbl_endereco where cep = ? and numero = ?;";

        try {
            PreparedStatement psv = this.con.prepareStatement(sqlverify);

            psv.setInt(1, this.ed.getCep());
            psv.setInt(2, this.ed.getNumero());

        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            String sql = "insert into tbl_endereco(rua, cidade, numero) values (?,?,?)";

            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setString(1, this.ed.getRua());
            ps.setString(2, this.ed.getCidade());
            ps.setInt(3, this.ed.getNumero());
            
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Endereço cadastrado com sucesso!");

        } catch (SQLException e) {

            System.out.println("ERRO SQL: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERRO: " + e.getMessage());
        }

    }

}
