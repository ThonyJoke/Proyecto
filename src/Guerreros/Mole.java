/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guerreros;

/**
 *
 * @author Samuel
 */
public class Mole extends Guerrero {
   
    public Mole(){
        factorDeMuerte=1.5;
        escpaciosEnNave=1;
        tipo="Moles";
        reproducción = (int)(Math.random()*10)+15;

    }
    
}
