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
        ArrayList arreglo = new ArrayList();
        ArrayList arreglo2 = new ArrayList();
        ArrayList arreglo3 = new ArrayList();

        int ejer = 0;
        while (ejer != 4) {
            System.out.println("=====================MENU=============\n"
                    + "1.Agregar \n"
                    + "2.Modificar\n"
                    + "3.Eliminar\n"
                    + "4.salir");
            ejer = v.nextInt();
            switch (ejer) {
                case 1: {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");


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
