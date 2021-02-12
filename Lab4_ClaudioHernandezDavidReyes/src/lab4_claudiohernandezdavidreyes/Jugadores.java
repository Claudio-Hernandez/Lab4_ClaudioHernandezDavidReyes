package lab4_claudiohernandezdavidreyes;

public class Jugadores {
String nombre;
String apodo;
int ncamisa;
String efut;
String ebf;
String jf;
double stars;

    public Jugadores(String nombre, String apodo, int ncamisa, String efut, String ebf, String jf, double stars) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.ncamisa = ncamisa;
        this.efut = efut;
        this.ebf = ebf;
        this.jf = jf;
        this.stars = stars;
    }

    public Jugadores() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getNcamisa() {
        return ncamisa;
    }

    public void setNcamisa(int ncamisa) {
        this.ncamisa = ncamisa;
    }

    public String getEfut() {
        return efut;
    }

    public void setEfut(String efut) {
        this.efut = efut;
    }

    public String getEbf() {
        return ebf;
    }

    public void setEbf(String ebf) {
        this.ebf = ebf;
    }

    public String getJf() {
        return jf;
    }

    public void setJf(String jf) {
        this.jf = jf;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", apodo=" + apodo + ", ncamisa=" + ncamisa + ", efut=" + efut + ", ebf=" + ebf + ", jf=" + jf + ", stars=" + stars + '}';
    }

}
