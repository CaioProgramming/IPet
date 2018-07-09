
package beans;


public class ClienteBean {

    private int id;
    private String nome;
    private int cpf;
    private java.sql.Date data_nascimento;
    private String telefone;
    private String celular;
    
    public ClienteBean() {}
    
    public ClienteBean(int idCliente, String nome, int cpf, java.sql.Date data_nascimento) {
        this.id = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int idCliente) {
        this.id = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public java.sql.Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(java.sql.Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
        public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    

    
    
    
}
