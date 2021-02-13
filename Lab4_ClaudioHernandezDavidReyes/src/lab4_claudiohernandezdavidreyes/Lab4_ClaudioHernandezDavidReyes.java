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
    static ArrayList<equiipos> equipos = new ArrayList();

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner v = new Scanner(System.in);

        int ejer = 0;
        while (ejer != 6) {
            ArrayList<Jugadores> jugadores1 = new ArrayList();
            ArrayList<Jugadores> jugadores2 = new ArrayList();

            System.out.println("=====================MENU=============\n"
                    + "1.Agregar \n"
                    + "2.Modificar\n"
                    + "3.Eliminar\n"
                    + "4.Simulacion\n"
                    + "5.reporte\n"
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
                    int acum1 = 0, acum2 = 0, acum3 = 0, acum4 = 0;
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
                        if (acum1 == 3) {
                            System.out.println("ya no puede ingresar mas pateadores");
                            respTipo = 2;
                        } else if (acum2 == 2) {
                            System.out.println("Ya no puede ingresar mas tiradores");
                            respTipo = 1;
                        } else if (acum1 == 3 && acum2 == 2) {
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
                            acum1 += 1;
                        } else if (respTipo == 2) {
                            System.out.println("====================datos de jugador tipo tirador=============");
                            System.out.println("ingrese tiro de 3(1-100):");
                            int TT = v.nextInt();
                            System.out.println("ingrese tiro de dos(1-100):");
                            int TD = v.nextInt();
                            System.out.println("ingrese habilidad de manejo de balon(1-100):");
                            int HB = v.nextInt();
                            //  jugadores1.add(new Tiradores());
                            acum2 += 1;
                        }
                        if (jugadores1.size() != 5) {
                            resp1 = 's';
                        } else {
                            resp1 = 'm';
                        }
                        equipos.add(new equiipos(nombreEquipo, nombreDeEstadio, pais, nombreDeEntrenador, nombreDelDueño, nombreDeMascota, fechaCreacion, Color, jugadores1));

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
                        equipos.add(new equiipos(nombreEquipo2, nombreDeEstadio2, pais2, nombreDeEntrenador, nombreDelDueño, nombreDeMascota, fechaCreacion, Color, jugadores2));

                    }//while de jugadores equipo2

                    break;
                }//case de agregar
                case 2: {

                    break;
                }//case de modificar
                case 3: {
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(i + equipos.get(i).getNombre());
                    }
                    System.out.println("ingrese la posicion del equipo que quiere eliminar:");
                    int resp = v.nextInt();
                    if (equipos.size() > resp) {
                        equipos.remove(resp);
                        System.out.println("equipo eliminado");
                    } else {
                        System.out.println("equipo no existente o su lista esta vacia");
                    }
                    break;
                }//case de eliminar
                case 4: {//case de simulacion
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(equipos.get(i).getNombre());
                    }
                    System.out.println("usuario 1 , ingresa la posicion del equipo que quiere");
                    int elec1 = v.nextInt();

                    if (equipos.size() > elec1) {
                        elec1 = elec1;
                    } else {

                        System.out.println("no equipos en ese lugar");
                    }
                    System.out.println("jugador 2 elija la pposicion del equipo que quieres");
                    int elec2 = v.nextInt();
                    if (equipos.size() > elec2) {
                        elec2 = elec2;
                    } else if (elec1 == 2) {
                        System.out.println("no hay en esa posicion");

                        int elec3 = elec2;
                        while (elec2 == elec3) {
                            System.out.println("ingrese posicion de nuevo");
                            elec2 = v.nextInt();

                        }
                    }
                    int pases1 = 5;
                    int puntos = 0;
                    int puntos2 = 0;
                    int pases2 = 5;
                    Object j1 = 0;
                    Object j2 = 0;
                    int jugador1Elegido;
                    int jugador2Elegido;
                    System.out.println("jugador 1 ingrese la posicion del jugador que tendra el balon");

                    for (int i = 0; i < equipos.get(elec1).getJugadores().size(); i++) {
                        System.out.println(i + "-" + equipos.get(elec1).getJugadores().get(i).getNombre());
                    }
                    jugador1Elegido = v.nextInt();
                    if (equipos.get(elec1).getJugadores().size() > jugador1Elegido) {
                        j1 = equipos.get(elec1).getJugadores().get(jugador1Elegido);
                    } else {
                        System.out.println("no jugador en esa posicion");

                    }
                    while (puntos != 11 && puntos2 != 11) {
                        while (pases1 != 6) {

                            System.out.println("indique que desea hacer\n1.Atacar\n2.pase");
                            int j1Accion = v.nextInt();
                            if (j1Accion == 1) {
                                if (j1 instanceof pateadores) {//if para saber que tipo de jugador es
                                    if (((pateadores) j1).probabilidad(0)) {
                                        System.out.println("Anoto");

                                        ((pateadores) j1).puntos++;
                                        puntos++;
                                    } else {
                                        System.out.println("no anoto");
                                        puntos = puntos;

                                    }
                                } else if (j1 instanceof Tiradores) {
                                    System.out.println("tiro de cuanto de 2 o de 3");
                                    int x = v.nextInt();
                                    if (((Tiradores) j1).probabilidad(x)) {
                                        System.out.println("anoto");
                                        ((Tiradores) j1).puntos++;
                                    }
                                }
                            } else if (j1Accion == 2) {
                                System.out.println("jugador 1 ingrese la posicion del jugador al cual  hacer pase");

                                for (int i = 0; i < equipos.get(elec1).getJugadores().size(); i++) {
                                    System.out.println(i + "-" + equipos.get(elec1).getJugadores().get(i).getNombre());
                                }
                                jugador1Elegido = v.nextInt();
                                if (equipos.get(elec1).getJugadores().size() > jugador1Elegido) {
                                    j1 = equipos.get(elec1).getJugadores().get(jugador1Elegido);

                                }

                            }//else de pase

                        }//pases del jugador 1

                        while (pases2 != 6) {//=========jugador 2

                            System.out.println("jugador 2 ingrese la posicion del jugador que tendra el balon");

                            for (int i = 0; i < equipos.get(elec2).getJugadores().size(); i++) {
                                System.out.println(i + "-" + equipos.get(0).getJugadores().get(i).getNombre());
                            }
                            jugador2Elegido = v.nextInt();
                            if (equipos.get(elec2).getJugadores().size() > jugador2Elegido) {
                                j1 = equipos.get(elec2).getJugadores().get(jugador2Elegido);
                            } else {
                                System.out.println("no jugador en esa posicion");

                            }
                            System.out.println("indique que desea hacer\n1.Atacar\n2.pase");
                            int j2Accion = v.nextInt();
                            if (j2Accion == 1) {
                                if (j2 instanceof pateadores) {//if para saber que tipo de jugador es
                                    if (((pateadores) j2).probabilidad(0)) {
                                        System.out.println("Anoto");
                                        ((pateadores) j2).puntos++;
                                        puntos++;
                                    } else {
                                        System.out.println("no anoto");
                                        puntos = puntos;

                                    }
                                } else if (j2 instanceof Tiradores) {
                                    System.out.println("tiro de cuanto de 2 o de 3");
                                    int x = v.nextInt();
                                    if (((Tiradores) j2).probabilidad(x)) {
                                        System.out.println("anoto");
                                        ((Tiradores) j2).puntos++;
                                    }

                                }
                            } else if (j2Accion == 2) {//else para pase
                                System.out.println("jugador 2 ingrese la posicion del jugador al cual  hacer pase");

                                for (int i = 0; i < equipos.get(elec2).getJugadores().size(); i++) {
                                    System.out.println(i + "-" + equipos.get(elec2).getJugadores().get(i).getNombre());
                                }
                                jugador1Elegido = v.nextInt();
                                if (equipos.get(elec2).getJugadores().size() > jugador2Elegido) {
                                    j2 = equipos.get(elec2).getJugadores().get(jugador2Elegido);

                                }

                            }//else de pase

                        }//pases del jugador 2

                    }//puntos
                    imprimir(elec1, elec2);

                    break;
                }//case de salir
                case 5: {
                                        System.out.println(equipos);

                    break;
                }
                case  6:{
                    System.out.println("Saliendo.....");
                    System.out.println("Salida exitosa, Adios");
                    break;
                }
                

            }//switch de menu principal

        }//while de menu copiar hasta aca
    }//main

    public static String imprimir(int j1, int j2) {
        int[] puntos = new int[equipos.get(j1).getJugadores().size()];
        int[] puntos2 = new int[equipos.get(j2).getJugadores().size()];
        int aux;
        for (int i = 0; i < puntos.length - 1; i++) {
            for (int j = 0; j < puntos.length - i - 1; j++) {
                if (puntos[j + 1] < puntos[j]) {
                    aux = puntos[j + 1];
                    puntos[j + 1] = puntos[j];
                    puntos[j] = aux;
                }
            }
        }
        int aux2;

        for (int i = 0; i < puntos2.length - 1; i++) {
            for (int j = 0; j < puntos2.length - i - 1; j++) {
                if (puntos2[j + 1] < puntos2[j]) {
                    aux2 = puntos2[j + 1];
                    puntos2[j + 1] = puntos2[j];
                    puntos2[j] = aux2;
                }
            }
        }
        String acum1 = "==========Equipo 1======\n ";
        for (int i = 0; i < equipos.get(j1).getJugadores().size(); i++) {
            if (equipos.get(j1).getJugadores().get(i).getPuntos() == puntos[i]) {
                if (equipos.get(j1).getJugadores().get(i) instanceof pateadores) {
                    acum1 += "Nombre:" + equipos.get(j1).getJugadores().get(i).nombre + "  Puntos: " + puntos[i] + "Tipo d jugador :" + "pateador" + "\n";

                } else {
                    acum1 += "Nombre:" + equipos.get(j1).getJugadores().get(i).nombre + "  Puntos: " + puntos[i] + "Tipo d jugador : " + "tirador" + "\n";

                }
            }

        }
        String acum2 = "==========equipo 2==========\n";
        for (int i = 0; i < equipos.get(j2).getJugadores().size(); i++) {
            if (equipos.get(j2).getJugadores().get(i).getPuntos() == puntos[i]) {
                if (equipos.get(j1).getJugadores().get(i) instanceof pateadores) {

                    acum2 += "Nombre:" + equipos.get(j2).getJugadores().get(i).nombre + "  Puntos: " + puntos[i] + "Tipo de jugador: " + "pateador" + "\n";

                } else {
                    acum2 += "Nombre:" + equipos.get(j2).getJugadores().get(i).nombre + "  Puntos: " + puntos[i] + "Tipo de jugador: " + " tirador " + "\n";

                }
            }

        }
        return acum1 + acum2;
    }

}//clase
