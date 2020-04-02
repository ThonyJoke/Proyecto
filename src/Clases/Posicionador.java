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
public class Posicionador {
    public static int numeroFilas = 10;
    public static int numeroColumnas = 10;

    public static int getNumeroFilas() {
        return numeroFilas;
    }

    public static void setNumeroFilas(int numeroFilas) {
        Posicionador.numeroFilas = numeroFilas;
    }

    public static int getNumeroColumnas() {
        return numeroColumnas;
    }

    public static void setNumeroColumnas(int numeroColumnas) {
        Posicionador.numeroColumnas = numeroColumnas;
    }
    public static Planeta[]posicioname(){
        int tamaño = 0;
        Planeta[][] temporal = AdanPlanetario.AdanPlanetario();
        if (GeneradorDePlanetas.comparador == 10){
        tamaño =(int)GeneradorDePlanetas.comparador+5;
        }else if (GeneradorDePlanetas.comparador != 10){
        tamaño = (int)GeneradorDePlanetas.comparador;
        }
        Planeta [] sistema = new Planeta [tamaño];
        int contadorX = 0;
        int contadorY = 0;
        // Genera posiciones aleatorias para cada planeta, dentro del array
        int contador = 0;
        boolean salidaCiclo = false;
        do{
            int fila = (int)(Math.random()*numeroFilas);
            int columna = (int)(Math.random()*numeroColumnas);
            if(contadorX == 4 && temporal[contadorX][contadorY] == null){
                salidaCiclo = true;
            }
            
            else if(temporal[contadorX][contadorY] == null){
                contadorX++;
                contadorY=0;
            }
            else if (contador == GeneradorDePlanetas.comparador && sistema[contador]==null){
                salidaCiclo = true;
            }
            else if (contador < GeneradorDePlanetas.comparador && 
                    sistema[contador] == null){
                sistema[contador] = temporal[contadorX][contadorY];
                sistema[contador].setPosiciónX(fila);
                
                sistema[contador].setPosiciónY(columna);
                sistema[contador].setColor("Blanco");
                contadorY++;
                contador++;
            }            
        }while(salidaCiclo!=true);
        
        
        return sistema;
    } 
}