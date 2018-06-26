/**
 *
 * @author ViRuZ
 */
import java.awt.Graphics;

public abstract class Figura implements Dibujable{
    private int x;
    private int y;
    private int largo;
    private int ancho;
    
    public Figura(int x, int y, int largo, int ancho){
        
        cambiarTamaño(largo, ancho);
        cambiarUbicacion(x, y);
    }
    
    public void cambiarUbicacion(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void cambiarTamaño(int largo, int ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    
    //método abstracto
    public abstract void dibujar(Graphics g);

    
    //METODOS get
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }
}