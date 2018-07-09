package controllers;

import beans.AnimalBean;
import beans.ClienteBean;
import beans.EnderecoBean;
import models.AnimalDAO;
import models.ClienteDAO;
import models.EnderecoDAO;

public class ClienteController {

    AnimalDAO ad = null;
    EnderecoDAO ed = null;
    ClienteDAO cd = null;

    public ClienteController(AnimalBean ab, ClienteBean cb, EnderecoBean eb) {

        this.ad = new AnimalDAO(ab);
        this.cd = new ClienteDAO(cb);
        this.ed = new EnderecoDAO(eb);
    }

    public ClienteController(ClienteBean cb, EnderecoBean eb) {

        this.cd = new ClienteDAO(cb);
        this.ed = new EnderecoDAO(eb);
    }
    
     public ClienteController(ClienteBean cb) {

        this.cd = new ClienteDAO(cb);
    }

    public void cadastrar() {

        this.ed.AdcionarEndereco();
        this.cd.adicionarCliente();
        this.ad.adicionarAnimal();

    }

    public void cadastrarSemAnimal() {

        this.ed.AdcionarEndereco();
        this.cd.adicionarCliente();

    }
    
    public void alterar(){
    
    this.cd.alterarCliente();
    
    }
    
    public void excluir(){
    
        this.cd.removerCliente();
    
    }
    
 

}
