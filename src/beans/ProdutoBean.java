
package beans;


public class ProdutoBean {
   
    public int idProduto;
    public String nome;
    public double valor;
    public String descricao;
    public String categoria;

    
    public ProdutoBean() {}
    
    public ProdutoBean(int idProduto, String nome, double valor, String descricao) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    
    public int getIdProduto() {
        return idProduto;
    }
    
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
