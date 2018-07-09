
package beans;

import java.sql.Date;


public class FuncionarioBean extends ClienteBean{
    
    private String tipo;
    private String senha;
    
    
    public FuncionarioBean() {}

    public FuncionarioBean(int idCliente, String nome, int cpf, Date data_nascimento) {
        super(idCliente, nome, cpf, data_nascimento);
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
