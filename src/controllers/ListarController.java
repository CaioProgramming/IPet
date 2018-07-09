package controllers;

import beans.*;

import java.sql.ResultSet;
import models.AnimalDAO;
import models.ClienteDAO;
import models.EnderecoDAO;
import models.FuncionarioDAO;
import models.ItemDAO;

public class ListarController {

    AnimalDAO ad = null;
    EnderecoDAO ed = null;
    ClienteDAO cd = null;
    FuncionarioDAO fd = null;
    ItemDAO id = null;

    public ListarController() {

        this.ad = new AnimalDAO(null);
        this.cd = new ClienteDAO(null);
        this.ed = new EnderecoDAO(null);
        this.fd = new FuncionarioDAO(null);
        this.id = new ItemDAO(null,null);
    }

    public ResultSet listarClienteController() {

        return cd.listarCliente();

    }

    public ResultSet listarItems() {

        return id.listar();

    }

    public ResultSet listarServicos() {

        return id.listarservico();

    }

    public ResultSet listarFuncionarios() {

        return fd.listarFuncionario();

    }

    public ResultSet listarAnimais() {

        return ad.listarAnimal();

    }

}
