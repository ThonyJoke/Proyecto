/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Planetas.*;
import java.util.Scanner;
/**
 *
 * @author anthony
 */
public class Metro {
    public int posicionXa;
    public int posicionYa;
    public int posicionXb;
    public int posicionYb;
    int distancia=0;
    public int Metro(String origen, String destino,int comparador, Planeta [] sistema){
                //usa coordenadas de los planetas para calcular su distancia
                Scanner in = new Scanner (System.in);
                int contador = 0;
                boolean salidaSubCiclo = false;
                salidaSubCiclo = false;
                while (salidaSubCiclo==false){
                    if (contador == comparador){
                        salidaSubCiclo = true;
                    }else if(contador == comparador && 
                            !origen.equalsIgnoreCase(sistema [contador].getNombrePlaneta()) &&
                            !destino.equalsIgnoreCase(sistema [contador].getNombrePlaneta())){
                        salidaSubCiclo = true;
                        System.out.println("no se ha podido identificar la ubicacion de los planetas");
                    }
                    else if (sistema [contador]==null){
                        salidaSubCiclo = true;
                    }
                    else if (posicionXa != 0 && posicionXb != 0){
                        salidaSubCiclo = true;
                        
                    }
                    else if (origen.equalsIgnoreCase(sistema [contador].getNombrePlaneta())){
                        posicionXa = sistema[contador].getPosiciónX();
                        posicionYa = sistema[contador].getPosiciónY();
                        contador ++;
                    }else if (destino.equalsIgnoreCase(sistema [contador].getNombrePlaneta())){
                        posicionXb = sistema[contador].getPosiciónX();
                        posicionYb = sistema[contador].getPosiciónY();
                        contador ++;
                     }else if (posicionXa == 0 && posicionXb == 0){
                         contador++;
                     }else {
                         contador ++;
                     }
                         
                } 
       System.out.println(posicionXa +" "+posicionYa+" "+ posicionXb+" "+posicionYb);
        if(posicionXa == posicionXb){
            distancia = Math.abs(posicionYa-posicionYb);
            
        }else if (posicionYa == posicionYb){
            distancia = Math.abs(posicionXa - posicionXb);
            // si las coordenadas difieren, usa pitagoras
        }else if (posicionXa != posicionXb & 
                posicionYa != posicionYb){
            
            int opuesto = Math.abs(posicionYa - posicionYb);
            int adyacente = Math.abs(posicionXa - posicionXb);
            
            distancia = (int)Math.ceil(Math.sqrt(((opuesto*opuesto)+(adyacente*adyacente))));
        }
        return distancia;
    }
}
