package ipet;

import View.Splash;
import beans.PedidoBean;
import beans.ProdutoBean;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IPet {

    public static void main(String[] args) {

        /*ProdutoBean pb = new ProdutoBean(1, "bolinha", 10, "teste");
        ProdutoBean pb2 = new ProdutoBean(2, "bolinha", 10, "teste2");
        
        System.out.println(pb.getNome());
        Date d = new Date();
        PedidoBean ppb = new PedidoBean(1, String.valueOf(d.getDate()));

        ppb.adcionarProduto(pb);
        
        ppb.adcionarProduto(pb2);
        
        ppb.listarPedido();*/

      try {
        Splash intro = new Splash();
        intro.setVisible(true);

        //FuncionarioBean fb = new FuncionarioBean();
        //fb.setNome("caio");
        //fb.setSenha("123");
        //FuncionarioController fc = new FuncionarioController(fb);
        //fc.loginval();
        //FuncionarioDAO fd = new FuncionarioDAO(fb);
        //fd.login();
        //ListarController list = new ListarController();
        //list.listarClienteController();
//        ClienteBean cb = new ClienteBean();
//        AnimalBean ab = new AnimalBean(); 
//        EnderecoBean eb = new EnderecoBean();
//        ProdutoBean pd = new ProdutoBean();
//        ServicoBean sd = new ServicoBean();        
//        AnimalDAO ad = new AnimalDAO(ab);
//        ClienteDAO cd = new ClienteDAO(cb);
//        EnderecoDAO ed = new EnderecoDAO(eb);
//        CadastroController cc = new CadastroController(ab,cb,eb);
//
//        ab.setIdAnimal(1);
//        ab.setNome("rex");
//        ab.setRaca("dobberman");
//        ab.setPeso(65);
//       
//        eb.setCidade("São Paulo");
//        eb.setRua("Brigadeiro");
//        eb.setNumero(2);
//        
//       cb.setNome("Jeferson");
//       cb.setCpf(471887698);
//       cb.setData_nascimento("19981115");
//cc.cadastrar();
//cd.adicionarCliente(ep);
//System.out.println("ID " + cb.getIdCliente());
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(IPet.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

}
