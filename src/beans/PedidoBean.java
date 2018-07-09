package beans;

import java.util.ArrayList;

public class PedidoBean {

    public int idPedido;
    public String data;
    public ProdutoBean produto = null;
    public ServicoBean servico = null;

    public ArrayList<ProdutoBean> listacompras = null;

     

    public PedidoBean(int idPedido, String data) {
        this.idPedido = idPedido;
        this.data = data;
        this.listacompras = new ArrayList();
     }

    public ServicoBean getServico() {
        return servico;
    }

    public void setServico(ServicoBean servico) {
        this.servico = servico;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ProdutoBean getProduto() {
        return produto;
    }

    public void setProduto(ProdutoBean produto) {
        this.produto = produto;
    }

    public ArrayList getProdutoArray() {
        return listacompras;
    }

    public void adcionarProduto(ProdutoBean pb) {
        this.listacompras.add(pb);
    }

    public void adcionarsServico(ServicoBean sb) {
        this.listacompras.add(sb);
    }

     public void listarPedido(){
        System.out.println("CÓDIGO DO PEDIDO: " + getIdPedido());
        System.out.println("DATA DO PEDIDO: " + getData() );
        System.out.println("Listagem de produtos do pedido");
        for(Object listacompras: this.listacompras){
            ProdutoBean Item = (ProdutoBean) produto;
            System.out.println("Código Produto: " + Item.getNome());
             System.out.println("Descrição Produto: " + Item.getDescricao());
            System.out.println("Preço: " + Item.getValor());
        }
    }
    
}
