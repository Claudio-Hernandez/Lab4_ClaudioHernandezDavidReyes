/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_claudiohernandezdavidreyes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Claudio Hernandez
 */
public class Lab4_ClaudioHernandezDavidReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner v = new Scanner(System.in);
        ArrayList<equiipos> equipo1 = new ArrayList();
        ArrayList<equiipos> equipo2 = new ArrayList();

        int ejer = 0;
        while (ejer != 6) {
            ArrayList<Jugadores> jugadores1 = new ArrayList();
            ArrayList<Jugadores> jugadores2 = new ArrayList();

            System.out.println("=====================MENU=============\n"
                    + "1.Agregar \n"
                    + "2.Modificar\n"
                    + "3.Eliminar\n"
                    + "4.Simulacion\n"
                    + "5.Reporte\n"
                    + "6.Salir");

            ejer = v.nextInt();
            switch (ejer) {

                case 1: {
                    /*
                    Los jugadores contarán con un Nombre, Apodo,
                    Numero de Camiseta, Equipo de Futbol Favorito, 
                    Equipo de Baloncesto Favorito, Jugador Favorito,
                    Si es mayor de edad o no, Año de Nacimiento y
                    Numero de Estrellas (1-5) y podrán atacar.   
                    
                    
                    
                     */
                    //===========================equipo 1============================================
                    System.out.println("ingrese nombre");
                    String nombreEquipo = v.next();
                    System.out.println("ingrese nombre de estadio");
                    String nombreDeEstadio = v.next();

                    System.out.println("ingrese pais del equipo");
                    String pais = v.next();

                    System.out.println("ingrese nombre de entrenador");
                    String nombreDeEntrenador = v.next();

                    System.out.println("ingrese nombre del duenio");
                    String nombreDelDueño = v.next();

                    System.out.println("ingrese nombre de la mascota");
                    String nombreDeMascota = v.next();

                    System.out.println("ingrese fecha de creacion(dd/MM/yyyy)");
                    String fechaCreacion = v.next();

                    System.out.println("ingrese color principal");
                    String Color = v.next();
                    System.out.println("su equipo debe llevar 3 pateadores y 2 tiradores");
                    char resp1 = 's';
                     int acum1=0,acum2=0,acum3=0,acum4=0;
                    while (resp1 == 's' || resp1 == 'S') {
                        
                        System.out.println("ingrese nombre de jugador");
                        String nombre = v.next();

                        System.out.println("ingrese apodo del jugador");
                        String apodo = v.next();

                        System.out.println("ingrese equipo de fubtol favorito");
                        String efut = v.next();

                        System.out.println("ingrese equipo de baloncesto favorito?");
                        String ebf = v.next();

                        System.out.println("Ingrese nombre de jugador favorito");
                        String jf = v.next();
                        System.out.println("ingrese numero de estrellas 1-5");
                        int stars = v.nextInt();
                        System.out.println("ingrese numero de camisas");
                        int ncamisa = v.nextInt();
                        System.out.println("indique que tipo  de jugador es \n1.pateador\n2.tirador");
                        int respTipo = v.nextInt();
                        if (acum1==3) {
                            System.out.println("ya no puede ingresar mas pateadores");
                            respTipo=2;
                        }else if(acum2==2){
                            System.out.println("Ya no puede ingresar mas tiradores");
                            respTipo=1;
                        }else if (acum1==3&&acum2==2) {
                            break;
                        }//valida cuantos pateadores y tiradores

                        if (respTipo == 1) {
                            System.out.println("============datos de jugador tipo pateador===================");
                            System.out.println("ingrese la fuerza:");
                            int fuerza = v.nextInt();
                            System.out.println("ingrese habilidad pateadora:");
                            int habilidadPateadora = v.nextInt();
                            System.out.println("ingrese habilidad regateadora:");
                            int habilidadRegateadora = v.nextInt();
                            
                            jugadores1.add(new pateadores(habilidadPateadora, fuerza, habilidadRegateadora, nombre, apodo, ncamisa, efut, ebf, jf, stars));
                            acum1+=1;
                        } else if (respTipo == 2) {
                            System.out.println("====================datos de jugador tipo tirador=============");
                            System.out.println("ingrese tiro de 3(1-100):");
                            int TT = v.nextInt();
                            System.out.println("ingrese tiro de dos(1-100):");
                            int TD = v.nextInt();
                            System.out.println("ingrese habilidad de manejo de balon(1-100):");
                            int HB = v.nextInt();
                            //  jugadores1.add(new Tiradores());
                            acum2+=1;
                        }
                        if (jugadores1.size() != 5) {
                            resp1 = 's';
                        } else {
                            resp1 = 'm';
                        }
                        equipo1.add(new equiipos(nombreEquipo, nombreDeEstadio, pais, nombreDeEntrenador, nombreDelDueño, nombreDeMascota, fechaCreacion, Color, jugadores1));

                    }//while de jugadores equipo1
                    //===========================================equipo2=========================================
                    System.out.println("ingrese nombre");
                    String nombreEquipo2 = v.next();
                    System.out.println("ingrese nombre de estadio");
                    String nombreDeEstadio2 = v.next();

                    System.out.println("ingrese pais del equipo");
                    String pais2 = v.next();

                    System.out.println("ingrese nombre de entrenador");
                    String nombreDeEntrenador2 = v.next();

                    System.out.println("ingrese nombre del duenio");
                    String nombreDelDueño2 = v.next();

                    System.out.println("ingrese nombre de la mascota");
                    String nombreDeMascota2 = v.next();

                    System.out.println("ingrese fecha de creacion(dd/MM/yyyy)");
                    String fechaCreacion2 = v.next();

                    System.out.println("ingrese color principal");
                    String Color2 = v.next();
                    System.out.println("su equipo debe llevar 3 pateadores y 2 tiradores");

                    char resp11 = 's';
                    while (resp11 == 's' || resp11 == 'S') {
                        System.out.println("ingrese nombre de jugador");
                        String nombre = v.next();

                        System.out.println("ingrese apodo del jugador");
                        String apodo = v.next();

                        System.out.println("ingrese equipo de fubtol favorito");
                        String efut = v.next();

                        System.out.println("ingrese equipo de baloncesto favorito?");
                        String ebf = v.next();

                        System.out.println("Ingrese nombre de jugador favorito");
                        String jf = v.next();
                        System.out.println("ingrese numero de estrellas 1-5");
                        int stars = v.nextInt();
                        System.out.println("ingrese numero de camisas");
                        int ncamisa = v.nextInt();
                        System.out.println("indique que tipo  de jugador es \n1.pateador\n2.tirador");
                        int respTipo = v.nextInt();

                        if (respTipo == 1) {
                            System.out.println("============datos de jugador tipo pateador===================");
                            System.out.println("ingrese la fuerza:");
                            int fuerza = v.nextInt();
                            System.out.println("ingrese habilidad pateadora:");
                            int habilidadPateadora = v.nextInt();
                            System.out.println("ingrese habilidad regateadora:");
                            int habilidadRegateadora = v.nextInt();
                            jugadores2.add(new pateadores(habilidadPateadora, fuerza, habilidadRegateadora, nombre, apodo, ncamisa, efut, ebf, jf, stars));
                        } else if (respTipo == 2) {
                            System.out.println("====================datos de jugador tipo tirador=============");
                            System.out.println("ingrese tiro de 3(1-100):");
                            int TT = v.nextInt();
                            System.out.println("ingrese tiro de dos(1-100):");
                            int TD = v.nextInt();
                            System.out.println("ingrese habilidad de manejo de balon(1-100):");
                            int HB = v.nextInt();
                            //  jugadores1.add(new Tiradores());

                        }
                        if (jugadores2.size() != 5) {
                            resp11 = 's';
                        } else {
                            resp11 = 'm';
                        }
                        equipo2.add(new equiipos(nombreEquipo2, nombreDeEstadio2, pais2, nombreDeEntrenador, nombreDelDueño, nombreDeMascota, fechaCreacion, Color, jugadores2));

                    }//while de jugadores equipo2

                    break;
                }//case de agregar
                case 2: {

                    break;
                }//case de modificar
                case 3: {
                    break;
                }//case de eliminar
                case 4: {
                    int pases = 5;
                    System.out.println("jugador 1 ingrese la posicion del jugador que tendra el balon");
                    
                    for (int i = 0; i < equipo1.get(0).getJugadores().size(); i++) {
                        System.out.println(i+"-"+equipo1.get(0).getJugadores().get(i).getNombre());
                    }
                    int jugadorElegido = v.nextInt();
                    String j1;
                    if ( equipo1.get(0).getJugadores().size()>jugadorElegido) {
                        j1=equipo1.get(0).getJugadores().get(jugadorElegido).getNombre();
                    }else{
                        System.out.println("no jugador en esa posicion");
                    
                    }
                    System.out.println("indique que desea hacer\n1.Atacar\n2.pase");
                     int j1Accion =  v.nextInt();
                    if (j1Accion==1) {
                        if () {
                            
                        }
                    }else if (j1Accion==2) {
                        
                    }
                    break;
                }//case de salir
                case 5:{
                    System.out.println(equipo1);
                    System.out.println(equipo2);
                
                break;
                }
                case 6:{
                 System.out.println("Saliendo.....");
                    System.out.println("Salida exitosa, Adios");
                break;
                }

            }//switch de menu principal

        }//while de menu copiar hasta aca
    }//main

   
    

}//clase
