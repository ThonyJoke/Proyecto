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
public class FisionGuy extends Guerrero{
    
    public FisionGuy (){
        factorDeMuerte = 1.95;
        escpaciosEnNave = 4;
        tipo="Fisions";
        reproducción = (int)(Math.random()*7)+3;
    }
    
}
