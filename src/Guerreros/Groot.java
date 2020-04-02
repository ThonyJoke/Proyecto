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
public class Groot extends  Guerrero{
    
    public Groot (){
        factorDeMuerte = 1.85;
        escpaciosEnNave = 3;
        tipo="Groots";
        reproducción = (int)(Math.random()*15)+5;
    }
    
}
