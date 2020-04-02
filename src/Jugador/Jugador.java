/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import Planetas.*;
/**
 *
 * @author anthony
 */
public class Jugador {
   String nombre;
   int numeroDeNaves;
   int numeroDePlanetas;
   public static String color;

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Jugador.color = color;
    }
   
   Planeta [] planetasConquistados;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeNaves() {
        return numeroDeNaves;
    }

    public void setNumeroDeNaves(int numeroDeNaves) {
        this.numeroDeNaves = numeroDeNaves;
    }

    public int getNumeroDePlanetas() {
        return numeroDePlanetas;
    }

    public void setNumeroDePlanetas(int numeroDePlanetas) {
        this.numeroDePlanetas = numeroDePlanetas;
    }

    public Planeta[] getPlanetasConquistados() {
        return planetasConquistados;
    }

    public void setPlanetasConquistados(Planeta[] planetasConquistados) {
        this.planetasConquistados = planetasConquistados;
    }
   
}
