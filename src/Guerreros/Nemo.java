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
public class Nemo extends Guerrero{
    public Nemo(){
        factorDeMuerte=1.6;
        escpaciosEnNave=1;
        tipo="Nemos";
        reproducción = (int)(Math.random()*11)+12;

    }
}
