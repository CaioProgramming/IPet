/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import beans.AnimalBean;
import models.AnimalDAO;

/**
 *
 * @author cacai
 */
public class AnimalController {
    AnimalBean ab = null;
    AnimalDAO ad = null;

    public AnimalController(AnimalBean ab) {
        this.ab = ab;
        this.ad = new AnimalDAO(ab);
    }
    
    public void alterar(){
    
    this.ad.alterarAnimal();
    
    }
    
    public void remover(){
    this.ad.removerAnimal();
    
    }
    
    
}
