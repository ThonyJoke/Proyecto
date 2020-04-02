/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Guerreros.*;
import Clases.*;
import Naves.*;
import Planetas.*;
import Jugador.*;
import java.util.Scanner;
/**
 *
 * @author Samuel
 */
public class Main {
    public static int c;
    public static void main(String[] args) {
       boolean salidaCiclo = false;
       BuscaNombres nombres = new BuscaNombres();
       int posicion = 0;
       int planetasPlayer1=0;
       int planetasPlayer2=0;
       int [] turnosFlota = new int [30];
       int [] turnosObrero = new int [30];
       int [] contadorFlota = new int [30];
       int []ubicacionOrigen = new int [30];
       int ubicacionDestino[]= new int [30];
       String [] origenFlota = new String [30];
       String [] destinoFlota = new String [30];
       String [] tipoEnvioNave = new String [30];
       int envioGuerrerosFlota[] = new int [30];
       int envioNaves[]=new int [30];
       String tipoGuerreroEnvio[]=new String [30];
       String tipoNaveEnvio[]=new String [30];
       int cuentaFlotas=0;
       Scanner in = new Scanner(System.in);
       String nombrePlayer1 = "";
       String nombrePlayer2 = "";
       Flota [] flotaUno = new Flota[30];
       Flota [] flotaDos = new Flota[30];
        System.out.println("****************************");
        System.out.println("Ingrese nombre de JUGADOR 1");
        System.out.println("****************************");
        nombrePlayer1 = in.nextLine();
        System.out.println("****************************");
        System.out.println("Ingrese nombre de JUGADOR 2");
        System.out.println("****************************");
        nombrePlayer2 = in.nextLine();
        boolean salidaCicio = false;
        nombres.setNombreJugador1(nombrePlayer1);
        nombres.setNombreJugador2(nombrePlayer2);
        Jugador[] players = BuscaNombres.hazJugadores();
        String opcion = "0";
  
         while(salidaCicio!=true){
        System.out.println("**************************************");
        System.out.println("Pulsa la tecla de la opcion que desees");
        System.out.println("          y  pulsa ·Enter·");
        System.out.println("***************************************");
        System.out.println("");
        System.out.println("JUGAR YA!!!------< 1 >");
        System.out.println("");
        System.out.println("Hacer mapa-------< 2 >");
        System.err.println("");
   
        opcion = in.nextLine();
       
            if(opcion.equals("1") || opcion.equalsIgnoreCase("uno")){
                salidaCicio=true;
            }else if (opcion.equals("2") || opcion.equalsIgnoreCase("dos")){
                salidaCiclo = true;
                System.out.println("");
                System.out.println("Ha elegido la opción de creación de Mapa");
                System.out.println("");
                System.out.println("A continuación ingrese las medidas del mapa");
                System.out.println("");
                System.out.println("Cantidad de filas: ");
                System.out.println("");
                String cantidadFilas = in.nextLine();
                System.out.println("Cantidad de columnas: ");
                System.out.println("");
                String cantidadColumnas = in.nextLine();
                System.out.println("Cantidad de Planetas en el mapa: ");
                System.out.println("");
                String cantidadPlanetas = in.nextLine();
                System.out.println("Pulsa ·Enter· para iniciar");
                in.nextLine();
                Posicionador.numeroFilas = Integer.parseInt(cantidadFilas);
                Posicionador.numeroColumnas= Integer.parseInt(cantidadColumnas);
                CuantosPlanetas.totalPlanetas=Integer.parseInt(cantidadPlanetas);
                GeneradorDePlanetas.cantidadPlanetas = Integer.parseInt(cantidadPlanetas);;
                GeneradorDePlanetas.comparador=Integer.parseInt(cantidadPlanetas);;
                break;
                        
            }else {
                System.out.println("La opcion que seleccionó no existe");
                System.out.println("Vuelvalo a intentar ;D");
                salidaCicio = false;
            }
        }
        final int comparador = (int)GeneradorDePlanetas.comparador;
        Planeta[] sistema = Posicionador.posicioname();
        Metro metro = new Metro();//objeto metro, calcula distancias
        planetaInicial(sistema);// metodo setea dueños de 2 planetas random
        salidaCicio = false; //salida de ciclo
        boolean salidaSubCiclo = false;// salida de ciclo
        int contadorTurnos = 1;// contador de turnos
        int queJugador = 0;
        int contador = 0;
        boolean salidaFinal = false; //Salida de Ciclo principal
        boolean cambioTurno = false;// variable para cambiar de jugador y de turno
        int [] contadorObrero = new int [30];// array que guarda posicion del planeta del obrero
        boolean [] constructorActivo = new boolean[30];// arrays de posiciones de constructores
        boolean [] maestroActivo = new boolean[30];
        boolean [] arquiActivo = new boolean[30];
        boolean [] ingenieroActivo = new boolean[30];
        int [] turnosMaestro = new int[30];//Arrays para refenciar a los metodos de constructor
        int [] turnosArqui = new int[30];
        int [] turnosIngeniero = new int[30];
        int [] contadorMaestro = new int[30];
        int [] contadorArqui = new int[30];
        int [] contadorIngeniero = new int[30];

        while (salidaFinal != true){//Comienza Ciclote
            cambioTurno=false;
            String [][] tablero = new String [Posicionador.numeroFilas]
                        [Posicionador.numeroColumnas];
        Board(tablero,sistema,players);// muestra tablero (a veces :V)
            System.out.println("//Turno: "+ contadorTurnos);//Muestra datos basicos
            System.out.println("");
            System.out.println("turno de "+players[queJugador].getNombre());
            System.out.println("");
            System.out.println("Acciones: ");
            System.out.println("");
            System.out.println("1) Medir distancia,  2) Ver planeta, 3) Enviar flota");
            System.out.println("4)Consultar Flotas , 5) Construir Nave, 6)Tienda");
            System.out.println("7) Terminar turno    8) Terminar Juego");
            opcion = in.nextLine();//pregunta para empezar
            

            if (opcion.equals("1")){////OPCION 1!!!

                System.out.print("Planeta de origen: ");//pregunta atributos para clase metro
                String origen = in.nextLine();
                System.out.print("Planeta de destino: ");
                String destino = in.nextLine();
                System.out.println(metro.Metro(origen, destino, comparador, sistema)+
                        " Años luz de distancia");
                System.out.println("Presion Enter para continuar");
                in.nextLine();
        }//Fin opcion 1
            else if (opcion.equals("2")){////OPCION 2!!!
                System.out.println("Que planeta desea ver?");
                opcion = in.nextLine();//metodo que compara el dueño del planeta con el del jugador en turno
                int [] resultados = comprobarPlaneta(sistema, opcion, players, queJugador);
                if (resultados[1]==1){
                    contador = resultados[0];
                    muestrame(sistema, contador);
                    System.out.println("Presiona Enter para continuar");
                    in.nextLine();
                    }
                }      
            else if (opcion.equals("3")){//OPCION 3!!!!!!!  //
                System.out.println("planeta origen de flota: ");//pregunta atributos para clase flota
                String origen = in.nextLine();
                System.out.println("planeta destino: ");
                String destino = in.nextLine();
                int [] resultados = comprobarPlaneta(sistema, origen, players, queJugador);
                int [] siDestino = comprobarDestino(sistema, destino, players, queJugador);
                if (resultados[1] == 1 && siDestino [1] == 1){
                    System.out.println("Cuantas naves desea enviar?");
                    String cantNaves = in.nextLine();
                    System.out.println("Que tipo de naves?");
                    String tipoNave = in.nextLine();
                    System.out.println("Cuantos guerreros desea enviar?");
                    String cantGuerreros = in.nextLine();
                    System.out.println("Que tipo de Guerreros?");
                    int cantidadDeGuerreros = Integer.parseInt(cantGuerreros);
                    int cantidadDeNaves = Integer.parseInt(cantNaves);
                    String tipoGuerreros = in.nextLine();
                    int distancia = metro.Metro(origen, destino, comparador, sistema);
                    flotaUno[cuentaFlotas]=new Flota();//usa metodo Comprobar de la clase Flota
                    boolean activar =flotaUno[cuentaFlotas].comprueba(distancia, contadorTurnos,
                            cantidadDeGuerreros, cantidadDeNaves, tipoGuerreros,
                            tipoNave, sistema[resultados[0]]);
                    if (activar == true){//Almacena todos los datos ingresados a Flota para consultar en el futuro;
                        turnosFlota[cuentaFlotas]=flotaUno[cuentaFlotas].getTurnoAcción();
                        contadorFlota[cuentaFlotas]=flotaUno[cuentaFlotas].getTurnoAcción();
                        ubicacionOrigen[cuentaFlotas]=resultados[0];
                        ubicacionDestino[cuentaFlotas]=siDestino[0];
                        origenFlota[cuentaFlotas]=origen;
                        destinoFlota[cuentaFlotas]=destino;
                        envioGuerrerosFlota[cuentaFlotas] = cantidadDeGuerreros;
                        envioNaves[cuentaFlotas]=cantidadDeNaves;
                        tipoGuerreroEnvio[cuentaFlotas]=tipoGuerreros;
                        tipoNaveEnvio[cuentaFlotas]=tipoNave;
                        cuentaFlotas++;
                        if (cuentaFlotas==30) cuentaFlotas = 0;
                    }
                }
            }else if(opcion.equals("4")){//OPCION 4!!
                for (int i = 0; i < contadorFlota.length; i++) {//Muestra los datos de las flotas en curso;
                    if(contadorFlota[i]!= 0){
                        System.out.println("Flota con origen en: "+ubicacionOrigen[i]);
                        System.out.println("Rumbo a: "+ubicacionDestino[i]);
                        System.out.println("Guerreros enviados: "+ envioGuerrerosFlota[i]);
                        System.out.println("Llegara en turno: "+ turnosFlota[i]);
                    }
                }
            }else if (opcion.equals("5")){//OPCION 5
                String opcionPlaneta = "";//Pregunta atributos para constructor
                System.out.println("¿En que planeta desea construir la nave?");
                opcionPlaneta = in.nextLine();
                System.out.println("Seleccione el tipo de Constructor que desea Usar:");
                System.out.println("");
                System.out.println("1)Obrero   2) Maestro de Obra 3)Arquitecto  4)Ingeniero");
                System.out.println("");
                opcion = in.nextLine();
                //comprueba que el dueño sea correcto
                int [] resultados = comprobarPlaneta(sistema, opcionPlaneta, players, queJugador);
                if (resultados [1] == 1){
                    contador = resultados[0];//ifs de seleccion de metodo constructor
                    if (opcion.equals("1") || opcion.equalsIgnoreCase("obrero")) {
                        obrero(sistema, constructorActivo, contador, posicion, 
                                turnosObrero, contadorTurnos, contadorObrero);
                    }
                    else if (opcion.equals("2") || opcion.equalsIgnoreCase("Maestro de obra")) {
                        maestroDeObra(sistema, maestroActivo, contador, posicion, 
                                turnosMaestro, contadorTurnos, contadorMaestro);
                    }
                    else if (opcion.equals("3") || opcion.equalsIgnoreCase("arquitecto")) {
                        arquitecto(sistema, arquiActivo, contador, posicion, 
                                turnosArqui, contadorTurnos, contadorArqui);
                    }
                    else if (opcion.equals("4") || opcion.equalsIgnoreCase("Ingeniero")) {
                        ingeniero(sistema, ingenieroActivo, contador, posicion,
                                turnosIngeniero, contadorTurnos, contadorIngeniero);
                    }
                }
            }
            else if(opcion.equals("6")){//OPCION 6
                System.out.println("Bienvenido a la tienda!");
                System.out.println("Acciones:");
                System.out.println("1) Comprar Constructor,2) Vender Constructor,3) Vender Nave");
                opcion=in.nextLine();
                if (opcion.equals("1")){
                    System.out.println("en que planeta?");//Comprueba planeta para hacer transaccion
                    opcion=in.nextLine();
                    int []resultados =comprobarPlaneta(sistema, opcion, players, queJugador);
                    if(resultados[1]==1){
                        System.out.println("1) Comprar obrero(50G)      2)Comprar Maestro de obra(100G) ");
                        System.out.println("3) Comprar Arquitecto(250G) 4)Comprar INGENIERO(300G) ");
                        opcion=in.nextLine();
                        if(opcion.equals("1")){//Comprueba el dinero del planeta y hace transaccion
                            if (sistema[resultados[0]].getCantidadDinero()<50){
                                System.out.println("No tiene dinero suficiente");
                            }else{
                                System.out.println("Obrero adquirido (No lo explote)");
                                int dinero = sistema [resultados[0]].getCantidadDinero();
                                sistema[resultados[0]].setCantidadDinero(dinero-50);
                                int cantidadBobs = sistema[resultados[0]].getCantidadObreros();
                                sistema[resultados[0]].setCantidadObreros(cantidadBobs+1);
                            }
                        }else if(opcion.equals("2")){
                            if (sistema[resultados[0]].getCantidadDinero()<100){
                                System.out.println("No tiene dinero suficiente");
                            }else{
                                System.out.println("Maestro de obras adquirido (No lo explote)");
                                int dinero = sistema [resultados[0]].getCantidadDinero();
                                sistema[resultados[0]].setCantidadDinero(dinero-100);
                                int cantidadBobs = sistema[resultados[0]].getCantidadMaestrosDeObra();
                                sistema[resultados[0]].setCantidadMaestrosDeObra(cantidadBobs+1);
                            }
                        }else if(opcion.equals("3")){
                            if (sistema[resultados[0]].getCantidadDinero()<250){
                                System.out.println("No tiene dinero suficiente");
                            }else{
                                System.out.println("Arquitecto (No lo explote)");
                                int dinero = sistema [resultados[0]].getCantidadDinero();
                                sistema[resultados[0]].setCantidadDinero(dinero-250);
                                int cantidadBobs = sistema[resultados[0]].getCantidadArquitectos();
                                sistema[resultados[0]].setCantidadArquitectos(cantidadBobs+1);
                            }
                        }else if(opcion.equals("4")){
                            if (sistema[resultados[0]].getCantidadDinero()<50){
                                System.out.println("No tiene dinero suficiente");
                            }else{
                                System.out.println("Ingeniero (El no se cansa)");
                                int dinero = sistema [resultados[0]].getCantidadDinero();
                                sistema[resultados[0]].setCantidadDinero(dinero-50);
                                int cantidadBobs = sistema[resultados[0]].getCantidadIngenieros();
                                sistema[resultados[0]].setCantidadIngenieros(cantidadBobs+1);
                            }
                        }
                    }   
                }else if(opcion.equals("2")){//pregunta dinero para transaccion...
                    System.out.println("En que planeta?");
                    int []resultados =comprobarPlaneta(sistema, opcion, players, queJugador);
                    if (resultados[1]==1){
                          System.out.println("1) Vender obrero(40G)      2)Vender Maestro de obra(70G) ");
                        System.out.println("3) Vender Arquitecto(175G) 4)Vender INGENIERO(200G) ");
                        opcion=in.nextLine();
                        if(opcion.equals("1")){
                            if (sistema[resultados[0]].getCantidadObreros()==0){
                                System.out.println("No tiene constructores para vender");
                            }else{
                                System.out.println("Obrero  vendido");
                                int dinero = sistema [resultados[0]].getCantidadDinero();
                                sistema[resultados[0]].setCantidadDinero(dinero+40);
                                int cantidadBobs = sistema[resultados[0]].getCantidadObreros();
                                sistema[resultados[0]].setCantidadObreros(cantidadBobs-1);
                            }
                        }else if(opcion.equals("2")){
                            if (sistema[resultados[0]].getCantidadMaestrosDeObra()==0){
                                System.out.println("No tiene constructores para vender");
                            }else{
                                System.out.println("Maestro de obras vendido");
                                int dinero = sistema [resultados[0]].getCantidadDinero();
                                sistema[resultados[0]].setCantidadDinero(dinero+70);
                                int cantidadBobs = sistema[resultados[0]].getCantidadMaestrosDeObra();
                                sistema[resultados[0]].setCantidadMaestrosDeObra(cantidadBobs-1);
                            }
                        }else if(opcion.equals("3")){
                            if (sistema[resultados[0]].getCantidadArquitectos()==0){
                                System.out.println("No tiene constructores para vender");
                            }else{
                                System.out.println("Arquitecto vendido");
                                int dinero = sistema [resultados[0]].getCantidadDinero();
                                sistema[resultados[0]].setCantidadDinero(dinero+175);
                                int cantidadBobs = sistema[resultados[0]].getCantidadArquitectos();
                                sistema[resultados[0]].setCantidadArquitectos(cantidadBobs-1);
                            }
                        }else if(opcion.equals("4")){
                            if (sistema[resultados[0]].getCantidadIngenieros()==0){
                                System.out.println("No tiene constructores para vender");
                            }else{
                                System.out.println("Ingeniero vendido");
                                int dinero = sistema [resultados[0]].getCantidadDinero();
                                sistema[resultados[0]].setCantidadDinero(dinero+200);
                                int cantidadBobs = sistema[resultados[0]].getCantidadIngenieros();
                                sistema[resultados[0]].setCantidadIngenieros(cantidadBobs-1);
                            }
                        }
                    }//vende naves
                }else if(opcion.equals("3")){
                    System.out.println("En que planeta?");
                    int []resultados =comprobarPlaneta(sistema, opcion, players, queJugador);
                    if (resultados[1]==1){
                          System.out.println("1) Vender Naboo n1(20G)      2)Vender XWing(40G) ");
                        System.out.println("3) Vender Milenial Falcon(50G) 4)Vender STAR DESTROYER (70) ");
                        opcion=in.nextLine();
                        if(opcion.equals("1")){
                            if (sistema[resultados[0]].getCantidadObreros()==0){
                                System.out.println("No tiene naves para vender");
                            }else{
                                System.out.println("Naboo n1  vendido");
                                int dinero = sistema [resultados[0]].getCantidadDinero();
                                sistema[resultados[0]].setCantidadDinero(dinero+20);
                                int cantidadBobs = sistema[resultados[0]].getCantidadNaboo_N1s();
                                sistema[resultados[0]].setCantidadNaboo_N1s(cantidadBobs-1);
                            }
                        }else if(opcion.equals("2")){
                            if (sistema[resultados[0]].getCantidadMaestrosDeObra()==0){
                                System.out.println("No tiene naves para vender");
                            }else{
                                System.out.println("XWing vendido");
                                int dinero = sistema [resultados[0]].getCantidadDinero();
                                sistema[resultados[0]].setCantidadDinero(dinero+40);
                                int cantidadBobs = sistema[resultados[0]].getCantidadWings();
                                sistema[resultados[0]].setCantidadWings(cantidadBobs-1);
                            }
                        }else if(opcion.equals("3")){
                            if (sistema[resultados[0]].getCantidadArquitectos()==0){
                                System.out.println("No tiene naves para vender");
                            }else{
                                System.out.println("Milenial Falcon vendido");
                                int dinero = sistema [resultados[0]].getCantidadDinero();
                                sistema[resultados[0]].setCantidadDinero(dinero+50);
                                int cantidadBobs = sistema[resultados[0]].getCantidadArquitectos();
                                sistema[resultados[0]].setCantidadArquitectos(cantidadBobs-1);
                            }
                        }else if(opcion.equals("4")){
                            if (sistema[resultados[0]].getCantidadIngenieros()==0){
                                System.out.println("No tiene naves para vender");
                            }else{
                                System.out.println("Star destroyer vendido");
                                int dinero = sistema [resultados[0]].getCantidadDinero();
                                sistema[resultados[0]].setCantidadDinero(dinero+70);
                                int cantidadBobs = sistema[resultados[0]].getCantidadIngenieros();
                                sistema[resultados[0]].setCantidadIngenieros(cantidadBobs-1);
                            }
                        }
                    }
                }
            }else if (opcion.equals("7")){//OPCION 7!!!
              cambioTurno = true;//cambia estado de varible para cambiar al jugador en turno y/o cambiar el turno
            }else if (opcion.equals("8")){
                salidaFinal=true;
            }
            if (queJugador == 0 && cambioTurno == true ){queJugador = 1;}
            else if (queJugador ==1 && cambioTurno == true){
                queJugador = 0;
                sumarCosas(sistema);
                contadorTurnos++;
            }
            //le suministra datos a los constructores para que tengan referencia del turno en curso
            comprobarObrero(sistema, constructorActivo, turnosObrero, contadorTurnos,
                    contadorObrero);
            comprobarMaestro(sistema, maestroActivo, turnosMaestro, contadorTurnos,
                    contadorMaestro);
            comprobarArquitecto(sistema, arquiActivo, turnosArqui, contadorTurnos,
                    contadorArqui);
            comprobarIngeniero(sistema, ingenieroActivo, turnosIngeniero, contadorTurnos,
                    contadorIngeniero);
            
//Gana partida (No sirve :/)
            if (planetasPlayer1 == comparador){
                System.out.println("       _                       _              __     _____                   ");
                System.out.println("      | |                     | |            /_ |   / ____|                  ");
                System.out.println("      | |_   _  __ _  __ _  __| | ___  _ __   | |  | |  __  __ _ _ __   __ _ ");
                System.out.println("  _   | | | | |/ _` |/ _` |/ _` |/ _  | '__|  | |  | | |_ |/ _` | '_   / _` |");
                System.out.println(" | |__| | |_| | (_| | (_| | (_| | (_) | |     | |  | |__| | (_| | | | | (_| |");
                System.out.println("   ___/ \\__,_\\__, \\__,_\\__,_\\___/|_|     |_|  \\_____\\__,_|_| |_\\__,_|");
                System.out.println("                __/ |                                                        ");
                System.out.println("               |___/                                                         ");
                salidaFinal=true;
            }else if(planetasPlayer2 == comparador){
                System.out.println("       _                       _              ___       _____                   ");
                System.out.println("      | |                     | |            |__ \\    / ____|                  ");
                System.out.println("      | |_   _  __ _  __ _  __| | ___  _ __      | |  | |  __  __ _ _ __   __ _ ");
                System.out.println("  _   | | | | |/ _` |/ _` |/ _` |/ _  | '__|     / /  | | |_ |/ _` | '_   / _` |");
                System.out.println(" | |__| | |_| | (_| | (_| | (_| | (_) | |       / /   | |__| | (_| | | | | (_| |");
                System.out.println("   ___/ \\__,_\\__, \\__,_\\__,_\\___/|_|      / /    \\_____\\__,_|_| |_\\__,_|");
                System.out.println("                __/ |                         | |___                             ");
                System.out.println("               |___/                          |_____|                               ");
                salidaFinal=true;
            }//Resta naves enviadas a las flotas
            for (int i = 0; i < contadorFlota.length; i++) {
                if (turnosFlota[i]==contadorTurnos){
                    
                    flotaUno[i].Flota(sistema[ubicacionOrigen[i]],
                                sistema [ubicacionDestino[i]], envioGuerrerosFlota[i],
                                tipoGuerreroEnvio[i], players);
                    if (tipoNaveEnvio[i].equalsIgnoreCase("Naboo N1")||
                            tipoNaveEnvio[i].equalsIgnoreCase("Naboo_N1")||
                            tipoNaveEnvio[i].equalsIgnoreCase("NabooN1")){
                        sistema[ubicacionDestino[i]].setCantidadNaboo_N1s(envioNaves[i]);
                        sistema[ubicacionDestino[i]].setCantidadNaboo_N1s(
                                sistema[ubicacionOrigen[i]].getCantidadNaboo_N1s()-envioNaves[i]);
                    }else if (tipoNaveEnvio[i].equalsIgnoreCase("X Wing")||
                tipoNaveEnvio[i].equalsIgnoreCase("XWING")||
                tipoNaveEnvio[i].equalsIgnoreCase("X_WING")){
                        sistema[ubicacionDestino[i]].setCantidadWings(envioNaves[i]);
                        sistema[ubicacionOrigen[i]].setCantidadWings(
                                sistema[ubicacionOrigen[i]].getCantidadWings()-envioNaves[i]);
                    }else if (tipoNaveEnvio[i].equalsIgnoreCase("Milenial Falcon")||
                tipoNaveEnvio[i].equalsIgnoreCase("MILENIALFALCON")||
                tipoNaveEnvio[i].equalsIgnoreCase("MILENIAL_FALCON")){
                        sistema[ubicacionDestino[i]].setCantidadFalcons(envioNaves[i]);
                        sistema[ubicacionOrigen[i]].setCantidadFalcons(
                                sistema[ubicacionOrigen[i]].getCantidadFalcons()-envioNaves[i]);
                    }else if(tipoNaveEnvio[ubicacionOrigen[i]].equalsIgnoreCase("Star Destroyer")||
                tipoNaveEnvio[i].equalsIgnoreCase("STARRESTROYER")||
                tipoNaveEnvio[i].equalsIgnoreCase("star_destroyer")){
                        sistema[i].setCantidadDestroyers(
                                sistema[ubicacionOrigen[i]].getCantidadDestroyers()-envioNaves[i]);
                        sistema[ubicacionDestino[i]].setCantidadDestroyers(envioNaves[i]);
                        turnosFlota[i]=0;// cambia valor de bandera para evitar que se repita
                    }
                }
            }
//Termina ciclote 
        }
    }//Setea dueños para planetas aleatorios en array
      public static void planetaInicial(Planeta[]sistema){

          if (sistema [0]==null){
          for (int i = 0; i < sistema.length; i++) {
              sistema[i] = new Tierra();
              }sumarCosas(sistema);
          }// si los jugadores son iguales, cambia el numero
       Jugador [] players = BuscaNombres.hazJugadores();
       boolean salidaCiclo = false;
       int contador = 0 ;
       while (salidaCiclo!=true){
       contador++;
       if(contador==40){
       sistema[0].setDueño(players[0].getNombre());
       sistema[1].setDueño(players[1].getNombre());
       }
       salidaCiclo=true;
       int suerte = (int)Math.floor(Math.random()*GeneradorDePlanetas.comparador);
       int muestra = (int)Math.floor(Math.random()*GeneradorDePlanetas.comparador);
       if (sistema [suerte]!=null){
       sistema[suerte].setDueño(players[0].getNombre());
       }
       if (sistema [muestra]!=null){
        while(suerte == muestra){  
                muestra = (int)Math.floor(Math.random()*GeneradorDePlanetas.comparador);
        }// da cantidades exageradas para agilizar partida en prueba
        sistema [muestra].setDueño(players[1].getNombre());
        salidaCiclo = true;
        sistema[muestra].setCantidadWings(200);
        sistema[suerte].setCantidadWings(200);
            if (sistema[muestra].getCantidadMoles() != 0){
               sistema[muestra].setCantidadMoles(2000);
           }
           if (sistema[muestra].getCantidadNemos() != 0){
               sistema[muestra].setCantidadNemos(2000);
           }
           if (sistema[muestra].getCantidadMagmas()!= 0){
               sistema[muestra].setCantidadMagmas(2000);
           }
           if (sistema[muestra].getCantidadGroots() != 0){
               sistema[muestra].setCantidadGroots(2000);
           }
           if (sistema[muestra].getCantidadFisionGuys() != 0){
           }
               sistema[muestra].setCantidadFisionGuys(2000);
           if (sistema[suerte].getCantidadMoles() != 0){
               sistema[suerte].setCantidadMoles(2000);
           }
           if (sistema[suerte].getCantidadNemos() != 0){
               sistema[suerte].setCantidadNemos(2000);
           }
           if (sistema[suerte].getCantidadMagmas()!= 0){
               sistema[suerte].setCantidadMagmas(2000);
           }
           if (sistema[suerte].getCantidadGroots() != 0){
                sistema[suerte].setCantidadGroots(2000);
           }
           if (sistema[suerte].getCantidadFisionGuys() != 0){
               sistema[suerte].setCantidadFisionGuys(2000);
           }
       }
       }
   }public static void sumarCosas(Planeta[]sistema){
       //Suma a cada planeta guerreros, y dinero
        Mole mole = new Mole();
        Nemo nemo = new Nemo();
        Magma magma = new Magma();
        Groot groot = new Groot();
        FisionGuy fisionGuy = new FisionGuy();
        
            for (int i = 0; i < GeneradorDePlanetas.cantidadPlanetas; i++) {
               int dinero = sistema [i].getCantidadDinero();
               int dineroExtra = ((int)(Math.random()*100)+100);
               sistema [i].setCantidadDinero(dinero+dineroExtra);
               if (sistema[i].getTipo().equalsIgnoreCase("tierra")){
                   int cantidadNueva = (sistema[i].getCantidadMoles()+mole.reproducción);
                   sistema[i].setCantidadMoles(cantidadNueva);
               }else if (sistema[i].getTipo().equalsIgnoreCase("agua")){
                   int cantidadNueva = (sistema[i].getCantidadNemos()+nemo.reproducción);
                   sistema [i]. setCantidadNemos(cantidadNueva);
               }else if (sistema[i].getTipo().equalsIgnoreCase("magma")){
                   int cantidadNueva = (sistema[i].getCantidadMagmas()+magma.reproducción);
                   sistema [i].setCantidadMagmas(cantidadNueva);
               }else if (sistema[i].getTipo().equalsIgnoreCase("organico")){
                   int cantidadNueva = (sistema[i].getCantidadGroots()+groot.reproducción);
                   sistema [i].setCantidadGroots(cantidadNueva);
               }else if (sistema[i].getTipo().equalsIgnoreCase("radio")){
                   int cantidadNueva = (sistema[i].getCantidadFisionGuys()+fisionGuy.reproducción);
                   sistema [i].setCantidadFisionGuys(cantidadNueva);
            }
         }
           
    }public static int [] comprobarPlaneta(Planeta [] sistema,String opcion,
            Jugador[] players, int queJugador){
                int [] resultados = new int [2];
                boolean salidaCicio = false;
                int contador = 0;
                int comparador = (int)GeneradorDePlanetas.comparador;
                while (salidaCicio!=true){
                if(contador == comparador){
                    salidaCicio = true;
                    System.out.println("No se encontro el planeta");
                }
                //Si el nombre del dueño del planeta es igual al nombre del jugador, son el mismo
                else if(contador == comparador && 
                        (sistema [contador].getNombrePlaneta() == null ? opcion != null : !sistema [contador].getNombrePlaneta().equals(opcion))){
                    salidaCicio = true;
                    System.out.println("El planeta no existe");
                }else if(!opcion.equalsIgnoreCase(sistema [contador].getNombrePlaneta())){
                    contador++;
                        resultados [0] = 0;
                        resultados [1] = 0;                    
                }
                else if (sistema [contador].getNombrePlaneta().equalsIgnoreCase(opcion)){
                    if(sistema[contador].getDueño() == null ? players[queJugador].getNombre() == null : sistema[contador].getDueño().equals(players[queJugador].getNombre())){
                        resultados [0] = contador;
                        resultados [1] = 1;
                        salidaCicio = true;
                    }else{
                        System.out.println("El planeta no le pertence");
                        System.out.println("Presione Enter para continuar");
                        Scanner in = new Scanner(System.in);
                        in.nextLine();
                        resultados [0] = 0;
                        resultados [1] = 0;
                        salidaCicio = true;
                    }
                }
            }return resultados;
    }public static void muestrame(Planeta[]sistema,int contador){
           System.out.println("Planeta: "+ sistema[contador].getNombrePlaneta());
           System.out.println(sistema[contador].getCantidadDinero() +
                   " ·Galactus disponibles");
           //Muestra datos de planeta si no son 0 o null
           if (sistema[contador].getCantidadMoles() != 0){
               System.out.println("·Moles disponibles: "+sistema[contador].getCantidadMoles() );
           }
           if (sistema[contador].getCantidadNemos() != 0){
               System.out.println("·Nemos disponibles: "+sistema[contador].getCantidadNemos());
           }
           if (sistema[contador].getCantidadMagmas()!= 0){
               System.out.println("·Magmas disponibles: "+sistema[contador].getCantidadMagmas());
           }
           if (sistema[contador].getCantidadGroots() != 0){
               System.out.println("·Groots disponibles: "+sistema[contador].getCantidadGroots());
           }
           if (sistema[contador].getCantidadFisionGuys() != 0){
               System.out.println( "·Fision Guy´s disponibles: "+sistema[contador].getCantidadFisionGuys());
           }if (sistema[contador].getCantidadNaboo_N1s() != 0){
               System.out.println("Naboos N1 Disponibles: "+sistema[contador].getCantidadNaboo_N1s());
           }
           if (sistema[contador].getCantidadWings()!= 0){
               System.out.println("X Wings Disponibles: "+sistema[contador].getCantidadWings());
           }
           if (sistema[contador].getCantidadFalcons()!= 0){
               System.out.println("Milenial Falcons disponibles: "+sistema[contador].getCantidadFalcons());
           }
           if (sistema[contador].getCantidadDestroyers() != 0){
               System.out.println("Star Destroyers disponibles: "+sistema[contador].getCantidadDestroyers());
           }if (sistema[contador].getCantidadObreros() != 0){
               System.out.println("Obreros disponibles: "+sistema[contador].getCantidadObreros() );
           }if (sistema[contador].getCantidadMaestrosDeObra() != 0){
               System.out.println("Maestros de obra disponibles: "+ sistema[contador].getCantidadMaestrosDeObra() );            
           }if (sistema[contador].getCantidadArquitectos() != 0){
               System.out.println("Arquitectos disponibles: " + sistema[contador].getCantidadArquitectos());
           }if (sistema[contador].getCantidadIngenieros() != 0){
               System.out.println("Ingenieros disponibles: "+sistema[contador].getCantidadIngenieros());
           }
           
                        
        }public static void obrero(Planeta[]sistema, boolean [] constructorActivo,
            int contador, int posicion, int []turnosObrero, int contadorTurnos,
            int [] contadorObrero){
        if (sistema[contador].getCantidadObreros()==0) {
            System.out.println("No hay obreros disponibles");//Suma 1 nave y resta dinero
        }else {
            while (posicion != 30 && constructorActivo[posicion]==true){
                posicion++;
            }
            constructorActivo [posicion] = true;
            turnosObrero [posicion] = contadorTurnos;
            contadorObrero [posicion]=contador;
            int valor = sistema[contador].getCantidadObreros();
            valor-=1;
            sistema[contador].setCantidadObreros(valor);
            System.out.println("Nave encargada!");
            posicion++;
            if (posicion == 30){
                posicion = 0;
            }
        }
    }public static void comprobarObrero(Planeta[]sistema, boolean [] constructorActivo, int []turnosObrero, int contadorTurnos,
            int [] contadorObrero){//Con la referencia de turno, espera n jugadas hasta actuar
                    for (int i = 0; i < constructorActivo.length; i++) {
                if (constructorActivo[i]==true){
                    int activo = (contadorTurnos-turnosObrero[i]);
                    if (activo == 3){
                        System.out.println("NabooN1 construida en planeta: " +sistema[contadorObrero[i]].getNombrePlaneta());
                        int nuevaNave = sistema [contadorObrero[i]].getCantidadNaboo_N1s();
                        int florQueDaFulgor = sistema[contadorObrero[i]].getCantidadObreros();
                        constructorActivo[i]=false;
                        turnosObrero[i]=0;
                        nuevaNave += 1;
                        florQueDaFulgor +=1;
                        sistema[contadorObrero[i]].setCantidadNaboo_N1s(nuevaNave);
                        sistema[contadorObrero[i]].setCantidadObreros(florQueDaFulgor);
                 }
                
               }
            }
    } public static void maestroDeObra(Planeta[]sistema, boolean [] maestrosActivos,
            int contador, int posicion, int []turnosMaestro, int contadorTurnos,
            int [] contadorMaestro){
        if (sistema[contador].getCantidadMaestrosDeObra()==0) {
            System.out.println("No hay Maestros de obra disponibles");
        }else {
            while (posicion != 30 && maestrosActivos[posicion]==true){
                posicion++;
            }
            maestrosActivos [posicion] = true;
            turnosMaestro [posicion] = contadorTurnos;
            contadorMaestro [posicion]=contador;
            int valor = sistema[contador].getCantidadMaestrosDeObra();
            valor-=1;
            sistema[contador].setCantidadMaestrosDeObra(valor);
            System.out.println("Nave encargada!");
            posicion++;
            if (posicion == 30){
                posicion = 0;
            }
        }
    }public static void arquitecto(Planeta[]sistema, boolean [] arquiActivo,
            int contador, int posicion, int []turnosArqui, int contadorTurnos,
            int [] contadorArqui){
        if (sistema[contador].getCantidadObreros()==0) {
            System.out.println("No hay Arquitectos disponibles");
        }else {
            while (posicion != 30 && arquiActivo[posicion]==true){
                posicion++;
            }
            arquiActivo [posicion] = true;
            turnosArqui [posicion] = contadorTurnos;
            contadorArqui [posicion]=contador;
            int valor = sistema[contador].getCantidadArquitectos();
            valor-=1;
            sistema[contador].setCantidadArquitectos(valor);
            System.out.println("Nave encargada!");
            posicion++;
            if (posicion == 30){
                posicion = 0;
            }
        }
    }public static void ingeniero(Planeta[]sistema, boolean [] IngenieroActivo,
            int contador, int posicion, int []turnosIngeniero, int contadorTurnos,
            int [] contadorIngeniero){
        if (sistema[contador].getCantidadObreros()==0) {
            System.out.println("No hay Ingenieros disponibles");
        }else {
            while (posicion != 30 && IngenieroActivo[posicion]==true){
                posicion++;
            }
            IngenieroActivo [posicion] = true;
            turnosIngeniero [posicion] = contadorTurnos;
            contadorIngeniero [posicion]=contador;
            int valor = sistema[contador].getCantidadIngenieros();
            valor-=1;
            sistema[contador].setCantidadIngenieros(valor);
            System.out.println("Nave encargada!");
            posicion++;
            if (posicion == 30){
                posicion = 0;
            }
        }
    }public static void comprobarArquitecto(Planeta[]sistema, boolean [] arquiActivo,
            int []turnosArqui, int contadorTurnos,
            int [] contadorArqui){
                    for (int i = 0; i < arquiActivo.length; i++) {
                if (arquiActivo[i]==true){
                    int activo = (contadorTurnos-turnosArqui[i]);
                    if (activo == 1){
                        System.out.println("X Wing construida en planeta: " +sistema[contadorArqui[i]].getNombrePlaneta());
                        int nuevaNave = sistema [contadorArqui[i]].getCantidadFalcons();
                        int florQueDaFulgor = sistema[contadorArqui[i]].getCantidadFalcons();
                        arquiActivo[i]=false;
                        turnosArqui[i]=0;
                        nuevaNave += 1;
                        florQueDaFulgor +=1;
                        sistema[contadorArqui[i]].setCantidadFalcons(nuevaNave);
                        sistema[contadorArqui[i]].setCantidadArquitectos(florQueDaFulgor);
                 }
                
               }
            }
    }public static void comprobarMaestro(Planeta[]sistema, boolean [] maestroActivo,
            int []turnosMaestro, int contadorTurnos,
            int [] contadorMaestro){
                    for (int i = 0; i < maestroActivo.length; i++) {
                if (maestroActivo[i]==true){
                    int activo = (contadorTurnos-turnosMaestro[i]);
                    if (activo == 1){
                        System.out.println("Milenial Falcon construida en planeta: " +
                                sistema[contadorMaestro[i]].getNombrePlaneta());
                        int nuevaNave = sistema [contadorMaestro[i]].getCantidadWings();
                        int florQueDaFulgor = sistema[contadorMaestro[i]].getCantidadWings();
                        maestroActivo[i]=false;
                        turnosMaestro[i]=0;
                        nuevaNave += 1;
                        florQueDaFulgor +=1;
                        sistema[contadorMaestro[i]].setCantidadWings(nuevaNave);
                        sistema[contadorMaestro[i]].setCantidadMaestrosDeObra(florQueDaFulgor);
                 }
                
               }
            }
    }public static void comprobarIngeniero(Planeta[]sistema, boolean [] ingenieroActivo,
            int []turnosIngeniero, int contadorTurnos,
            int [] contadorIngeniero){
        for (int i = 0; i < ingenieroActivo.length; i++) {
                if (ingenieroActivo[i]==true){
                    int activo = (contadorTurnos-contadorIngeniero[i]);
                    if (activo == 1){
                        System.out.println("STAR DESTROYER!! construida en planeta: " +sistema[contadorIngeniero[i]].getNombrePlaneta());
                        int nuevaNave = sistema [contadorIngeniero[i]].getCantidadFalcons();
                        int florQueDaFulgor = sistema[contadorIngeniero[i]].getCantidadFalcons();
                        ingenieroActivo[i]=false;
                        turnosIngeniero[i]=0;
                        nuevaNave += 1;
                        florQueDaFulgor +=1;
                        sistema[contadorIngeniero[i]].setCantidadFalcons(nuevaNave);
                        sistema[contadorIngeniero[i]].setCantidadArquitectos(florQueDaFulgor);
                    }
                }
        }
    }public static int [] comprobarDestino(Planeta [] sistema,String opcion,
            Jugador[] players, int queJugador){
                int [] resultados = new int [2];
                boolean salidaCicio = false;

                int contador = 0;
                int comparador = (int)GeneradorDePlanetas.comparador;
                while (salidaCicio!=true){
                if(contador == comparador){
                    salidaCicio = true;
                    System.out.println("No se encontro el planeta destino");
                }
                else if(contador == comparador && 
                        (sistema [contador].getNombrePlaneta() == null ? opcion != null : !sistema [contador].getNombrePlaneta().equals(opcion))){
                    salidaCicio = true;
                    System.out.println("El Destino no existe");
                }else if(!opcion.equalsIgnoreCase(sistema [contador].getNombrePlaneta())){
                    contador++;
                        resultados [0] = 0;
                        resultados [1] = 0;                    
                }
                else if (sistema [contador].getNombrePlaneta().equalsIgnoreCase(opcion)){
                    if(sistema[contador].getDueño() == null ? players[queJugador].getNombre() == null : sistema[contador].getDueño().equals(players[queJugador].getNombre())){
                        System.out.println("El planeta de destino le pertenece");
                        System.out.println("No puede atacar");
                        resultados [0] = 0;
                        resultados [1] = 0;
                        salidaCicio = true;
                    }else{
                        Scanner in = new Scanner(System.in);
    
                        resultados [0] = contador;
                        resultados [1] = 1;
                        salidaCicio = true;
                    }
                }
            }return resultados;
    }public static void Board(String [][] tablero ,Planeta[]sistema, Jugador [] players){
       int contadorX=0;//MUestra tablero(a veces jaja)
       int contadorY=0;
       String purple="\033[35m";
       String cyan="\033[36m";
       String reset="\u001B[0m"; 
       String yellow="\033[33m";
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j]=("   ");
                
            }
        }
            for (int i = 0; i < sistema.length; i++) {
                contadorX = sistema[i].getPosiciónX();
                contadorY = sistema[i].getPosiciónY();
                if (sistema [i].getDueño() == players[0].getNombre()){
                tablero[contadorX][contadorY]=(purple+"▓"+reset+sistema[i].
                        getNombrePlaneta()+purple+"▓");
                }else if (sistema [i].getDueño() == players[1].getNombre()){
                tablero[contadorX][contadorY]=(cyan+"▓"+reset+sistema[i].
                        getNombrePlaneta()+cyan+"▓");
                }else {
                    tablero[contadorX][contadorY]=(reset+"▓"+reset+sistema[i].
                        getNombrePlaneta()+reset+"▓");
                }
                }
                
            
for (int x=0; x < tablero.length; x++) {
  System.out.print("");
  for (int y=0; y < tablero[x].length; y++) {  
    System.out.print (tablero[x][y]);
    if (y!=tablero[x].length-1) System.out.print("\t");
  }
  System.out.println(reset+"");
}
    }public static int [] comprobadorSilencioso(Planeta [] sistema,String opcion,
            Jugador[] players, int queJugador){
                int [] resultados = new int [2];
                boolean salidaCicio = false;

                int contador = 0;
                int comparador = (int)GeneradorDePlanetas.comparador;
                while (salidaCicio!=true){
                if(contador == comparador){
                    salidaCicio = true;
                }
                else if(contador == comparador && 
                        (sistema [contador].getNombrePlaneta() == null ? opcion != null : !sistema [contador].getNombrePlaneta().equals(opcion))){
                    salidaCicio = true;
                }else if(!opcion.equalsIgnoreCase(sistema [contador].getNombrePlaneta())){
                    contador++;
                        resultados [0] = 0;
                        resultados [1] = 0;                    
                }
                else if (sistema [contador].getNombrePlaneta().equalsIgnoreCase(opcion)){
                    if(sistema[contador].getDueño() == null ? players[queJugador].getNombre() == null : sistema[contador].getDueño().equals(players[queJugador].getNombre())){
                        resultados [0] = contador;
                        resultados [1] = 1;
                        salidaCicio = true;
                    }else{
                        Scanner in = new Scanner(System.in);
                        in.nextLine();
                        resultados [0] = 0;
                        resultados [1] = 0;
                        salidaCicio = true;
                    }
                }
            }return resultados;
    }
}