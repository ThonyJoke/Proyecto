/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Planetas.*;
import Guerreros.*;
import Naves.*;

/**
 *
 * @author Samuel
 */
public class GeneradorDePlanetas {
    static Tierra tierra = new Tierra();
    static Agua agua = new Agua();
    static Fuego fuego = new Fuego();
    static Organico organico = new Organico();
    static Radioactivo radioactivo = new Radioactivo();
    static Mole mole = new Mole();
    static Nemo nemo = new Nemo();
    static Magma magma = new Magma();
    static Groot groot = new Groot();
    static FisionGuy fisionGuy = new FisionGuy();
    public static float cantidadPlanetas = CuantosPlanetas.totalPlanetas;
    public static float comparador = cantidadPlanetas;
    //Genera una cantidad de planetas y se los envia a posicionador para que los coloque
    public static Planeta[][] Creador(){
        
        int dineroInicial = 0;
        boolean salidaCiclo = false;
        int cantidadTierras = 0;
        int cantidadAguas = 0;
        int cantidadFuegos = 0;
        int cantidadOrganicos = 0;        
        int cantidadRadioactivos = 0;
        int total = 0;
   
        Planeta[] tipo = new Planeta [] {tierra, agua, fuego, organico, radioactivo};
        int[] cuantosPlanetas = new int []{cantidadTierras, cantidadAguas,
                   cantidadFuegos, cantidadOrganicos,cantidadRadioactivos};
        
        while (salidaCiclo == false){
            for (int i = 0; i < 5; i++) {
                cuantosPlanetas[i]=(int)Math.round(tipo[i].
                    getProbabilidadAparición()*cantidadPlanetas);
               total += cuantosPlanetas[i];
                
                }if (total > comparador){
                    cantidadPlanetas -= 0.05;
                }else if (total < comparador){
                    cantidadPlanetas += 0.05;
                }
                else if(total == comparador){
                    salidaCiclo = true;
            }
        }
          
        Planeta [][] planetas = new Planeta[6][10];
        final int cuantasMoles = mole.reproducción;
        final int cuantosNemos = nemo.reproducción;
        final int cuantosMagmas = magma.reproducción;
        final int cuantosGroots = groot.reproducción;
        final int cuantosFisions = fisionGuy.reproducción;
 
        for (int i = 0; i < cuantosPlanetas[0]; i++) {

            dineroInicial = (int)(Math.random()*400)+100;
            planetas[0][i] = new Tierra();         
            planetas[0][i].setCantidadMoles(cuantasMoles);
            planetas[0][i].setCantidadDinero(dineroInicial);
            planetas[0][i].setCantidadNaboo_N1s(1);
            planetas[0][i].setCantidadObreros(1);

        }
        for (int i = 0; i < cuantosPlanetas[1]; i++) {

            dineroInicial = (int)(Math.random()*400)+100;
            planetas[1][i] = new Agua();
            planetas[1][i].setCantidadNemos(cuantosNemos);
            planetas[1][i].setCantidadDinero(dineroInicial);
            planetas[1][i].setCantidadNaboo_N1s(1);
            planetas[1][i].setCantidadObreros(1);
           
        }
        for (int i = 0; i < cuantosPlanetas[2]; i++) {


            dineroInicial = (int)(Math.random()*400)+100;
            planetas[2][i] = new Fuego();
            planetas[2][i].setCantidadMagmas(cuantosMagmas);
            planetas[2][i].setCantidadDinero(dineroInicial);
            planetas[2][i].setCantidadNaboo_N1s(1);
            planetas[2][i].setCantidadObreros(1);
            
        }
        for (int i = 0; i < cuantosPlanetas[3]; i++) {


            Naboo_N1[] navesOrganico = new Naboo_N1[1];
            navesOrganico [0] = new Naboo_N1();
            dineroInicial = (int)(Math.random()*400)+100;
            planetas[3][i] = new Organico();
            planetas[3][i].setCantidadGroots(cuantosGroots);
            planetas[3][i].setCantidadDinero(dineroInicial);
            planetas[3][i].setCantidadNaboo_N1s(1);
            planetas[3][i].setCantidadObreros(1);
           
        }
        for (int i = 0; i < cuantosPlanetas[4]; i++) {
            Naboo_N1[] navesRadioactivo = new Naboo_N1[1];
            navesRadioactivo [0] = new Naboo_N1();
            dineroInicial = (int)(Math.random()*400)+100;
            planetas[4][i] = new Radioactivo();
            planetas[4][i].setCantidadFisionGuys(cuantosFisions);
            planetas[4][i].setCantidadDinero(dineroInicial);
            planetas[4][i].setCantidadNaboo_N1s(1);
            planetas[4][i].setCantidadObreros(1);
        }     
   return planetas;
        }
}   

    

