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
public class ServicoBean extends ProdutoBean {

    public int getIDServico() {
        return IDServico;
    }


    public void setIDServico(int IDServico) {
        this.IDServico = IDServico;
    }
    private int IDServico;
    public ServicoBean() {
    }

    public ServicoBean(int idProduto, String nome, double valor, String descricao, int IDServico) {
        super(idProduto, nome, valor, descricao);
        this.IDServico = IDServico;
    }
    


}
