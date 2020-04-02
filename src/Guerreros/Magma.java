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
public class Magma extends Guerrero{
    
    public Magma(){
        factorDeMuerte= 1.75;
        escpaciosEnNave = 2;
        tipo="Magmas";
        reproducción = (int)(Math.random()*10)+10;

    }
    
}
