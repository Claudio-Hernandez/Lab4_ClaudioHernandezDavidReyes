/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_claudiohernandezdavidreyes;

import java.security.SecureRandom;

/**
 *
 * @author Claudio Hernandez
 */
public class pateadores extends Jugadores {

    /*
    
    pateadores contaran con Habilidad Pateadora (1-100),
    Fuerza (1-100) y Habilidad Regateadora (1-100).  
    
    Podrán atacar pateando a portería y así anotar goles.
    También podrán pasar la pelota a las manos de un tirador. 
    
    
     */
    private int habilidadPateadora;
    private int fuerza;
    private int habilidadRegateadora;

    public pateadores() {
        super();
    }

    public pateadores(int habilidadPateadora, int fuerza, int habilidadRegateadora, String nombre, String apodo, int ncamisa, String efut, String ebf, String jf, double stars) {
        super(nombre, apodo, ncamisa, efut, ebf, jf, stars);
        this.habilidadPateadora = habilidadPateadora;
        this.fuerza = fuerza;
        this.habilidadRegateadora = habilidadRegateadora;
    }

    public int getHabilidadPateadora() {
        return habilidadPateadora;
    }

    public void setHabilidadPateadora(int habilidadPateadora) {
        if (habilidadPateadora > 0 && habilidadPateadora <= 100) {
            this.habilidadPateadora = habilidadPateadora;

        }
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        if (fuerza > 0 && fuerza <= 100) {
            this.fuerza = fuerza;

        }
    }

    public int getHabilidadRegateadora() {
        return habilidadRegateadora;
    }

    public void setHabilidadRegateadora(int habilidadRegateadora) {
        if (habilidadRegateadora > 0 && habilidadRegateadora <= 100) {
            this.habilidadRegateadora = habilidadRegateadora;

        }
    }

    @Override
    public boolean probabilidad(int x) {
        double probabilidad = (habilidadPateadora + fuerza + habilidadRegateadora) * 0.65 * (stars / 10);
        boolean anoto = false;
        SecureRandom c = new SecureRandom();
        int c2 = 1 + c.nextInt(100);
        if (c2 > 0 && c2 <= probabilidad) {
            anoto = true;
        } else if (c2 > probabilidad && c2 <= 100) {
            anoto = false;

        }
        return anoto;

    }

    @Override
    public String toString() {
        return "pateadores{" +super.toString()+ "habilidadPateadora=" + habilidadPateadora + ", fuerza=" + fuerza + ", habilidadRegateadora=" + habilidadRegateadora + '}';
    }

}
