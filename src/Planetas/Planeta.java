/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Planetas;
import Guerreros.*;
import Naves.*;

/**
 *
 * @author Samuel
 */
public class Planeta {
    String nombrePlaneta;
    double porcentajeMuerte;
    int cantidadDinero;
    double probabilidadAparición;
    String dueño;
    String tipo;
    String tipoDeGuerrero;
    String Color;
    Guerrero guerrero;
    int posiciónX;
    int posiciónY;
    int navesEnviadas;
    int cantidadMoles;
    int cantidadNemos;
    int cantidadMagmas;
    int cantidadGroots;
    int cantidadFisionGuys;
    int cantidadNaboo_N1s;
    int cantidadWings;
    int cantidadFalcons;
    int cantidadDestroyers;
    int cantidadObreros;
    int cantidadMaestrosDeObra;
    int cantidadArquitectos;
    int cantidadIngenieros;
    Flota [] flotas;

    public Flota[] getFlotas() {
        return flotas;
    }

    public void setFlotas(Flota[] flotas) {
        this.flotas = flotas;
    }

    public String getTipoDeGuerrero() {
        return tipoDeGuerrero;
    }

    public int getCantidadObreros() {
        return cantidadObreros;
    }

    public void setCantidadObreros(int cantidadObreros) {
        this.cantidadObreros = cantidadObreros;
    }

    public int getCantidadMaestrosDeObra() {
        return cantidadMaestrosDeObra;
    }

    public void setCantidadMaestrosDeObra(int cantidadMaestrosDeObra) {
        this.cantidadMaestrosDeObra = cantidadMaestrosDeObra;
    }

    public int getCantidadArquitectos() {
        return cantidadArquitectos;
    }

    public void setCantidadArquitectos(int cantidadArquitectos) {
        this.cantidadArquitectos = cantidadArquitectos;
    }

    public int getCantidadIngenieros() {
        return cantidadIngenieros;
    }

    public void setCantidadIngenieros(int cantidadIngenieros) {
        this.cantidadIngenieros = cantidadIngenieros;
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public int getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(int cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getPosiciónX() {
        return posiciónX;
    }

    public void setPosiciónX(int posiciónX) {
        this.posiciónX = posiciónX;
    }

    public int getPosiciónY() {
        return posiciónY;
    }

    public void setPosiciónY(int posiciónY) {
        this.posiciónY = posiciónY;
    }

    public int getNavesEnviadas() {
        return navesEnviadas;
    }

    public void setNavesEnviadas(int navesEnviadas) {
        this.navesEnviadas = navesEnviadas;
    }

    public double getPorcentajeMuerte() {
        return porcentajeMuerte;
    }

    public double getProbabilidadAparición() {
        return probabilidadAparición;
    }


    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidadMoles() {
        return cantidadMoles;
    }

    public void setCantidadMoles(int cantidadMoles) {
        this.cantidadMoles = cantidadMoles;
    }

    public int getCantidadNemos() {
        return cantidadNemos;
    }

    public void setCantidadNemos(int cantidadNemos) {
        this.cantidadNemos = cantidadNemos;
    }

    public int getCantidadMagmas() {
        return cantidadMagmas;
    }

    public void setCantidadMagmas(int cantidadMagmas) {
        this.cantidadMagmas = cantidadMagmas;
    }

    public int getCantidadGroots() {
        return cantidadGroots;
    }

    public void setCantidadGroots(int cantidadGroots) {
        this.cantidadGroots = cantidadGroots;
    }

    public int getCantidadFisionGuys() {
        return cantidadFisionGuys;
    }

    public void setCantidadFisionGuys(int cantidadFisionGuys) {
        this.cantidadFisionGuys = cantidadFisionGuys;
    }

    public int getCantidadNaboo_N1s() {
        return cantidadNaboo_N1s;
    }

    public void setCantidadNaboo_N1s(int cantidadNaboo_N1s) {
        this.cantidadNaboo_N1s = cantidadNaboo_N1s;
    }

    public int getCantidadWings() {
        return cantidadWings;
    }

    public void setCantidadWings(int cantidadWings) {
        this.cantidadWings = cantidadWings;
    }

    public int getCantidadFalcons() {
        return cantidadFalcons;
    }

    public void setCantidadFalcons(int cantidadFalcons) {
        this.cantidadFalcons = cantidadFalcons;
    }

    public int getCantidadDestroyers() {
        return cantidadDestroyers;
    }

    public void setCantidadDestroyers(int cantidadDestroyers) {
        this.cantidadDestroyers = cantidadDestroyers;
    }


    
}
