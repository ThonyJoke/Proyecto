/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Naves;
import Guerreros.*;
import Clases.*;
/**
 *
 * @author Samuel
 */
public class Nave {
    int espaciosNave;
    int costoNave;
    double velocidadNave;
    String planetaOrigen;
    String planetaDestino;
    String tipo;

    public String getPlanetaOrigen() {
        return planetaOrigen;
    }

    public void setPlanetaOrigen(String planetaOrigen) {
        this.planetaOrigen = planetaOrigen;
    }

    public String getPlanetaDestino() {
        return planetaDestino;
    }

    public void setPlanetaDestino(String planetaDestino) {
        this.planetaDestino = planetaDestino;
    }

    
}

