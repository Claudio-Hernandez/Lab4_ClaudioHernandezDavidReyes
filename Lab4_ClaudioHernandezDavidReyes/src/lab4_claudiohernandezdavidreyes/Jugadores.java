package lab4_claudiohernandezdavidreyes;

public class Jugadores {
protected String nombre;
protected String apodo;
protected int ncamisa;
protected String efut;
protected String ebf;
protected int puntos;
protected String jf;
double stars;

    protected Jugadores(String nombre, String apodo, int ncamisa, String efut, String ebf, String jf, double stars) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.ncamisa = ncamisa;
        this.efut = efut;
        this.ebf = ebf;
        this.jf = jf;
        this.stars = stars;
    }

    protected Jugadores() {
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getApodo() {
        return apodo;
    }

    protected void setApodo(String apodo) {
        this.apodo = apodo;
    }

    protected int getNcamisa() {
        return ncamisa;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    

    protected void setNcamisa(int ncamisa) {
        this.ncamisa = ncamisa;
    }

    protected String getEfut() {
        return efut;
    }

    protected void setEfut(String efut) {
        this.efut = efut;
    }

    protected String getEbf() {
        return ebf;
    }

    protected void setEbf(String ebf) {
        this.ebf = ebf;
    }

    protected String getJf() {
        return jf;
    }

    protected void setJf(String jf) {
        this.jf = jf;
    }

    protected double getStars() {
        return stars;
    }

    protected void setStars(double stars) {
        this.stars = stars;
    }
    public boolean probabilidad(){
    
    return false;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", apodo=" + apodo + ", ncamisa=" + ncamisa + ", efut=" + efut + ", ebf=" + ebf + ", jf=" + jf + ", stars=" + stars + '}';
    }

}
