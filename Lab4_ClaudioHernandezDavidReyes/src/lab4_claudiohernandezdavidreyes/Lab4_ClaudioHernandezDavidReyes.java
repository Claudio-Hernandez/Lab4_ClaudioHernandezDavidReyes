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
        ArrayList<equiipos> equipos = new ArrayList();
        ArrayList arreglo3 = new ArrayList();

        int ejer = 0;
        while (ejer != 4) {
            ArrayList<Jugadores> jugadores1 = new ArrayList();
            ArrayList<Jugadores> jugadores2 = new ArrayList();

            System.out.println("=====================MENU=============\n"
                    + "1.Agregar \n"
                    + "2.Modificar\n"
                    + "3.Eliminar\n"
                    + "4.salir");

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
                    System.out.println("ingrese nombre");
                    System.out.println("ingrese estadio");
                    System.out.println("ingrese pais");
                    System.out.println("ingrese nombre de entrenador");
                    System.out.println("ingrese nombre del duenio");
                    System.out.println("ingrese nombre de la mascota");
                    System.out.println("ingrese fecha de creacion(dd/MM/yyyy)");
                    System.out.println("ingrese color principal");
                    char resp1 = 's';
                    while (resp1 == 's' || resp1 == 'S') {
                        System.out.println("ingrese nombre de jugador");
                        System.out.println("ingrese apodo del jugador");
                        System.out.println("ingrese equipo de fubtol favorito");
                        System.out.println("ingrese equipo de baloncesto favorito?");

                    }

                    break;
                }//case de agregar
                case 2: {

                    break;
                }//case de modificar
                case 3: {
                    break;
                }//case de eliminar
                case 4: {
                    System.out.println("Saliendo.....");
                    System.out.println("Salida exitosa, Adios");
                    break;
                }//case de salir

            }//switch de menu principal

        }//while de menu copiar hasta aca
    }//main

}//clase
