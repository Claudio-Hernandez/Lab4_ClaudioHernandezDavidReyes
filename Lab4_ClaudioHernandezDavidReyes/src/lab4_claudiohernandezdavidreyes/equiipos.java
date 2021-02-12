/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_claudiohernandezdavidreyes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Claudio Hernandez
 */
public class equiipos {
    /*
    osequipos contaran con un Nombre, Estadio, 
    País, Nombre de Entrenador, Nombre de Dueño, Nombre de Mascota, Fecha de Creación y su Color principal. 
    También contarán con 5 Jugadores;
    3 Pateadores y 2 Tiradores. Todos serán guardados en arraylists.
    
    
    */
    private String nombre;
    private String estadio;
    private String pais;
    private String nombreEntrenador;
    private String nombreDueño;
    private String nombreMacota;
    private String fechaDeCreacion;
    private String color;
    private ArrayList jugadores ;

    public equiipos() {
    }

    public equiipos(String nombre, String estadio, String pais, String nombreEntrenador, String nombreDueño, String nombreMacota, String fechaDeCreacion, String color, ArrayList jugadores) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.pais = pais;
        this.nombreEntrenador = nombreEntrenador;
        this.nombreDueño = nombreDueño;
        this.nombreMacota = nombreMacota;
        this.fechaDeCreacion = fechaDeCreacion;
        this.color = color;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getNombreMacota() {
        return nombreMacota;
    }

    public void setNombreMacota(String nombreMacota) {
        this.nombreMacota = nombreMacota;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "equiipos{" + "nombre=" + nombre + ", estadio=" + estadio + ", pais=" + pais + ", nombreEntrenador=" + nombreEntrenador + ", nombreDue\u00f1o=" + nombreDueño + ", nombreMacota=" + nombreMacota + ", fechaDeCreacion=" + fechaDeCreacion + ", color=" + color + ", jugadores=" + jugadores + '}';
    }
    
    
    
}
