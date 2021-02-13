package lab4_claudiohernandezdavidreyes;
import java.util.Random;
public class Tiradores extends Jugadores{
    int tt;
    int td;
    int manejo;

    public Tiradores(int tt, int td, int manejo, String nombre, String apodo, int ncamisa, String efut, String ebf, String jf, double stars) {
        super(nombre, apodo, ncamisa, efut, ebf, jf, stars);
        this.tt = tt;
        this.td = td;
        this.manejo = manejo;
    }

    public Tiradores(int tt, int td, int manejo) {
        this.tt = tt;
        this.td = td;
        this.manejo = manejo;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        if(1<tt&&100>tt){
        this.tt = tt;}
    }

    public int getTd() {
        return td;
    }

    public void setTd(int td) {
        if(1<td&&100>td){
        this.td = td;}
    }

    public int getManejo() {
        return manejo;
    }

    public void setManejo(int manejo) {
        if(1<manejo&&100>manejo){
        this.manejo = manejo;}
    }
    public boolean probabilidad(){
        boolean resp =true;
        Random r = new Random();
        int r2 = 1+r.nextInt(100);
        double prob=(tt+manejo)*0.90*stars/10;
        double probt=(td+manejo)*0.90*stars/10;
        if (probt>r2||prob>r2) {
            resp=false;
        }else{
            resp=true;
        }
        return resp;
    }
}
