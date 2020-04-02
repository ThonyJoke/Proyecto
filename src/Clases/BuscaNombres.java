/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Jugador.*;
import java.util.Scanner;
/**
 *
 * @author anthony
 */
public class BuscaNombres {
    static String nombreJugador1;
    static String nombreJugador2;

    public static String getNombreJugador1() {
        return nombreJugador1;
    }

    public static void setNombreJugador1(String nombreJugador1) {
        BuscaNombres.nombreJugador1 = nombreJugador1;
    }

    public static String getNombreJugador2() {
        return nombreJugador2;
    }

    public static void setNombreJugador2(String nombreJugador2) {
        BuscaNombres.nombreJugador2 = nombreJugador2;
    }
    
    public static Jugador[] hazJugadores(){
        //Metodo estatico para garantizar que los jugadores seran los mismos en toda la partida
        
        Jugador[] jugadores = new Jugador[2];
        jugadores[0] = new Jugador();jugadores[0].setNombre(nombreJugador1);
        jugadores[1] = new Jugador();jugadores[1].setNombre(nombreJugador2);
        jugadores [0].setColor("morado");
        jugadores [1].setColor("cyan");
        return jugadores;
    }
    
}
