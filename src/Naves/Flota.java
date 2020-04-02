
package Naves;
import Guerreros.*;
import Planetas.*;
import Clases.*;
import Jugador.*;

public class Flota {
    public int turnos;
    int espacios;
    int oportunidadInvasor;
    int oportunidadResistencia;
    int turnoAcción;
    double factorInvasion;
    double factorResistencia;
    public void Flota(Planeta origen, Planeta destino, int cantidadDeGuerreros,
    String tipoGuerreros, Jugador [] players){
        Mole mole = new Mole();
        Nemo nemo = new Nemo();
        Magma magma = new Magma();
        Groot groot = new Groot();
        FisionGuy fisionGuy = new FisionGuy();
        if (destino.getTipoDeGuerrero().equalsIgnoreCase("mole")){
            //Si se ha validado en Main, genera valores con los atributos de cada clase y planeta
            //gana el valor mas alto
            oportunidadResistencia = (int)Math.ceil(destino.getCantidadMoles()*
                mole.factorDeMuerte*destino.getPorcentajeMuerte());
            factorResistencia = mole.factorDeMuerte;
        }else if (destino.getTipoDeGuerrero().equalsIgnoreCase("nemo")){
            factorResistencia = nemo.factorDeMuerte;
            oportunidadResistencia = (int)Math.ceil(destino.getCantidadNemos()*
                nemo.factorDeMuerte*destino.getPorcentajeMuerte());
        }else if (destino.getTipoDeGuerrero().equalsIgnoreCase("magma")){
            factorResistencia = magma.factorDeMuerte;
            oportunidadResistencia = (int)Math.ceil(destino.getCantidadMagmas()*
                magma.factorDeMuerte *destino.getPorcentajeMuerte());
        }else if (destino.getTipoDeGuerrero().equalsIgnoreCase("groot")){
            factorResistencia = groot.factorDeMuerte;
            oportunidadResistencia = (int)Math.ceil(destino.getCantidadGroots()*
                groot.factorDeMuerte*destino.getPorcentajeMuerte());
        }else if (destino.getTipoDeGuerrero().equalsIgnoreCase("fision guy")){
            factorResistencia = fisionGuy.factorDeMuerte;
            oportunidadResistencia = (int)Math.ceil(destino.getCantidadFisionGuys()*
                groot.factorDeMuerte*destino.getPorcentajeMuerte());
        }////////////////                                                                                          /////////////////////////
        if (tipoGuerreros.equalsIgnoreCase("mole")){
             factorInvasion = mole.factorDeMuerte;
            oportunidadInvasor = (int)Math.ceil(cantidadDeGuerreros*
                mole.factorDeMuerte*destino.getPorcentajeMuerte());
        }else if (tipoGuerreros.equalsIgnoreCase("nemo")){
             factorInvasion = nemo.factorDeMuerte;
            oportunidadInvasor = (int)Math.ceil(cantidadDeGuerreros*
                nemo.factorDeMuerte*destino.getPorcentajeMuerte());
        }else if (tipoGuerreros.equalsIgnoreCase("magma")){
             factorInvasion = magma.factorDeMuerte;
            oportunidadInvasor = (int)Math.ceil(cantidadDeGuerreros*
                magma.factorDeMuerte *destino.getPorcentajeMuerte());
        }else if (tipoGuerreros.equalsIgnoreCase("groot")){
             factorInvasion = groot.factorDeMuerte;
            oportunidadInvasor = (int)Math.ceil(cantidadDeGuerreros*
                groot.factorDeMuerte*destino.getPorcentajeMuerte());
        }else if (tipoGuerreros.equalsIgnoreCase("fision guy")){
             factorInvasion = fisionGuy.factorDeMuerte;
            oportunidadInvasor = (int)Math.ceil(cantidadDeGuerreros*
                fisionGuy.factorDeMuerte*destino.getPorcentajeMuerte());
        }
        int resultado = 0;
        if (oportunidadInvasor>oportunidadResistencia){
            resultado = (int)Math.ceil((oportunidadInvasor-oportunidadResistencia)/factorInvasion);
            System.out.println("Planeta "+ destino.getNombrePlaneta()+ " es conquistado por "+
                            origen.getDueño());
            System.out.println("Quedan "+ resultado+ "Guerreros3");
                    destino.setDueño(origen.getDueño());
                    origen.setCantidadDinero(origen.getCantidadDinero()+destino.getCantidadDinero());
                    if(origen.getDueño().equalsIgnoreCase(players[0].getNombre())){
                        destino.setColor(players[0].getColor());
                    }else if (origen.getDueño().equalsIgnoreCase(players[1].getNombre())){
                        
                    }
                    if(tipoGuerreros.equalsIgnoreCase("mole")){
                        destino.setCantidadMoles(resultado);
                    }else if(tipoGuerreros.equalsIgnoreCase("nemo")){
                        destino.setCantidadNemos(resultado);
                    }else if(tipoGuerreros.equalsIgnoreCase("magma")){
                        destino.setCantidadMagmas(resultado);
                    }else if(tipoGuerreros.equalsIgnoreCase("groot")){
                        destino.setCantidadGroots(resultado);
                    }else if(tipoGuerreros.equalsIgnoreCase("fision guy")){
                        destino.setCantidadFisionGuys(resultado);
                    }
                    
                }else if (oportunidadResistencia>oportunidadInvasor){
                    System.out.println("Planeta "+ destino.getNombrePlaneta()+ " Defendido Exitosamente");
                    resultado =(int)Math.ceil ((oportunidadResistencia-oportunidadInvasor)/factorResistencia);
                   System.out.println("Quedan "+ resultado+ " Guerreros");
                if(destino.getTipoDeGuerrero().equalsIgnoreCase("mole")){
                        destino.setCantidadMoles(resultado);
                    }else if(destino.getTipoDeGuerrero().equalsIgnoreCase("nemo")){
                        destino.setCantidadNemos(resultado);
                    }else if(destino.getTipoDeGuerrero().equalsIgnoreCase("magma")){
                        destino.setCantidadMagmas(resultado);
                    }else if(destino.getTipoDeGuerrero().equalsIgnoreCase("groot")){
                        destino.setCantidadGroots(resultado);
                    }else if(destino.getTipoDeGuerrero().equalsIgnoreCase("fision guy")){
                        destino.setCantidadFisionGuys(resultado);
                    }
                }
    }
    public boolean comprueba (int distancia, int contadorTurnos, int cantidadDeGuerreros,
    int cantidadDeNaves, String tipoGuerreros, String tipoNave,
    Planeta planeta){
        Naboo_N1 naboo_N1 = new Naboo_N1();
        XWing xWing = new XWing();
        MilenialFalcon milenialFalcon = new MilenialFalcon();
        StarDestroyer starDestroyer = new StarDestroyer();
        //Comprueba el tipo de nave comparandolo con algunos strings
        //Comprueba las cantidades para validar la acción del jugador
        if (tipoNave.equalsIgnoreCase("Naboo N1")||
                tipoNave.equalsIgnoreCase("Naboo_N1")||
                tipoNave.equalsIgnoreCase("NabooN1")){
        turnos =(int)Math.floor(distancia/naboo_N1.velocidadNave);
        espacios = cantidadDeNaves*naboo_N1.espaciosNave;
                if (cantidadDeNaves>planeta.getCantidadNaboo_N1s()) {
                    System.out.println("No tiene suficientes naves");
                    return false;
                }else planeta.setCantidadNaboo_N1s(planeta.getCantidadNaboo_N1s()-cantidadDeNaves);
        }else if (tipoNave.equalsIgnoreCase("X Wing")||
                tipoNave.equalsIgnoreCase("XWING")||
                tipoNave.equalsIgnoreCase("X_WING")){
            turnos =(int)Math.floor(distancia/xWing.velocidadNave);
            espacios = cantidadDeNaves*xWing.espaciosNave;
        
                if (cantidadDeNaves>planeta.getCantidadWings()) {
                        System.out.println("No tiene suficientes naves");
                        return false;
                    }else planeta.setCantidadWings(planeta.getCantidadWings()-cantidadDeNaves);
        }else if (tipoNave.equalsIgnoreCase("Milenial Falcon")||
                tipoNave.equalsIgnoreCase("MILENIALFALCON")||
                tipoNave.equalsIgnoreCase("MILENIAL_FALCON")){
            turnos =(int)Math.floor(distancia/milenialFalcon.velocidadNave);
            espacios = cantidadDeNaves*milenialFalcon.espaciosNave;

                if (cantidadDeNaves>planeta.getCantidadFalcons()) {
                        System.out.println("No tiene suficientes naves");
                        return false;
                    }else planeta.setCantidadFalcons(planeta.getCantidadFalcons()-cantidadDeNaves);
        }else if(tipoNave.equalsIgnoreCase("Star Destroyer")||
                tipoNave.equalsIgnoreCase("STARRESTROYER")||
                tipoNave.equalsIgnoreCase("star_destroyer")){
            turnos =(int)Math.floor(distancia/starDestroyer.velocidadNave);
            espacios = cantidadDeNaves*starDestroyer.espaciosNave;
                if (cantidadDeNaves>planeta.getCantidadDestroyers()) {
                        System.out.println("No tiene suficientes naves");
                        return false;
                    }else planeta.setCantidadDestroyers(planeta.getCantidadDestroyers()-cantidadDeNaves);
        }else{
            System.out.println("Tipo de nave no encontrada");
            return false;
        }if(tipoGuerreros.equalsIgnoreCase("mole")){
            if (cantidadDeGuerreros > planeta.getCantidadMoles()){
                System.out.println("No tiene suficientes guerreros");
            }else {planeta.setCantidadMoles(planeta.getCantidadMoles()-cantidadDeGuerreros);}
        }else if(tipoGuerreros.equalsIgnoreCase("nemo")){

            if (cantidadDeGuerreros > planeta.getCantidadNemos()){
                System.out.println("No tiene suficientes guerreros");
            }else {planeta.setCantidadNemos(planeta.getCantidadNemos()-cantidadDeGuerreros);}
        }else if(tipoGuerreros.equalsIgnoreCase("magma")){

            if (cantidadDeGuerreros > planeta.getCantidadMagmas()){
                System.out.println("No tiene suficientes guerreros");
            }else {planeta.setCantidadMagmas(planeta.getCantidadMagmas()-cantidadDeGuerreros);}
        }else if(tipoGuerreros.equalsIgnoreCase("groot")){
            if (cantidadDeGuerreros > planeta.getCantidadGroots()){
                System.out.println("No tiene suficientes guerreros");
            }else {planeta.setCantidadGroots(planeta.getCantidadGroots()-cantidadDeGuerreros);}
        }else if(tipoGuerreros.equalsIgnoreCase("fision guy")){
            if (cantidadDeGuerreros > planeta.getCantidadFisionGuys()){
                System.out.println("No tiene suficientes guerreros");
            }else {planeta.setCantidadFisionGuys(planeta.getCantidadFisionGuys()-cantidadDeGuerreros);}
        }
        turnoAcción=contadorTurnos+turnos;
        
        if (cantidadDeGuerreros>espacios){
            System.out.println("Demasiados Guerreros");
            return false;
        }
        System.err.println("Correcto");
        return true;
    }
    public int getTurnoAcción() {
        return turnoAcción;
    }
}

