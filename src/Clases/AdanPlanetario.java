/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Planetas.*;
/**
 *
 * @author Samuel
 */
public class AdanPlanetario {
    
    
    public static Planeta[][] AdanPlanetario(){

        Planeta [][] sistema = GeneradorDePlanetas.Creador();
        int contadorX=0;
        int contadorY=0;
        int contadorNombre = 0;
        boolean salidaCiclo = false;
        String abc [] = new String [] {"A","B","C","D","E","F","G","H","I",
                                       "J","K","L","M","N","Ñ","O","P","Q",
                                       "R","S","T","U","V","W","X","Y","Z"};
      
        
        
            while(salidaCiclo != true){
                if(contadorX == 4 && sistema[contadorX][contadorY] == null){
                    salidaCiclo=true;
                }else if (sistema[contadorX][contadorY] == null){
                    contadorX ++;
                    contadorY = 0;
                }else{
                    sistema[contadorX][contadorY].setNombrePlaneta(abc[contadorNombre]);
                    ++contadorNombre;
                    ++contadorY;
                }
            }
                
        
                return sistema;
    }
    
}
