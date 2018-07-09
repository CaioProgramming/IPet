/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author aluno.etec
 */
public class EnderecoBean {

    /**
     * @return the cep
     */
    public int getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(int cep) {
        this.cep = cep;
    }

    public EnderecoBean() {
    }

    public EnderecoBean(int IDEndereco, String rua, String cidade, int numero, int cep) {
        this.IDEndereco = IDEndereco;
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
    }

    /**
     * @return the IDEndereco
     */
    public int getIDEndereco() {
        return IDEndereco;
    }

    /**
     * @param IDEndereco the IDEndereco to set
     */
    public void setIDEndereco(int IDEndereco) {
        this.IDEndereco = IDEndereco;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
     private int IDEndereco;
     private String rua;
     private String cidade;
     private int numero;
     private int cep;
     
    
    
    
}
