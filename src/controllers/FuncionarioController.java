/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import beans.FuncionarioBean;
import models.FuncionarioDAO;

/**
 *
 * @author cacai
 */
public class FuncionarioController {

    FuncionarioBean fb = null;
    FuncionarioDAO fd = null; 

    public FuncionarioController(FuncionarioBean fb) {
        
        this.fb = fb;
        this.fd = new FuncionarioDAO(fb);
    }
    
    public void Cadastrar(){
    
    this.fd.adicionarFuncionario();
        
    }
    
    public void Remover(){
    
    this.fd.removerFuncionario();
    
    }
    
     public boolean loginval(){
        boolean islogin = false;
        islogin = this.fd.login();
        return islogin;
        
    }
     
    public void Listar(){
    
    this.fd.listarFuncionario();
    
    }
    
    public void Alterar(){
    
    this.fd.alterarFuncionario();
    
    }

}
