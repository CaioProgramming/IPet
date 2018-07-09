/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import beans.ProdutoBean;
import beans.ServicoBean;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.ItemDAO;

/**
 *
 * @author REDES
 */
public class ItemController {

    ItemDAO id = null;
    ProdutoBean pb = null;
    ServicoBean sb = null;

    public ItemController(ProdutoBean pb, ServicoBean sb) {

        this.pb = pb;
        this.sb = sb;
        id = new ItemDAO(pb, sb);

    }

    public void cadastrarItem() {
        this.id.insere();

    }

    public void cadastrarServico() {

        this.id.addServico();

    }

    public void excluirItem() {

        this.id.exclui();
    }

    public void excluirServico() {

        this.id.excluiservico();
    }

    public void alterarItem() {

        this.id.altera();
    }

    public void alterarServico() {

        this.id.alteraservico();
    }



}
