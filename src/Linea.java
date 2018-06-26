/**
 *
 * @author ViRuZ
 */
import java.awt.Graphics;

public class Linea implements Dibujable{
    private int x;
    private int y;
    private int largo;
    private int ancho;  
    
    public Linea(int x, int y, int largo, int ancho){
        this.x = x;
        this.y = y;
        this.largo = largo;
        this.ancho = ancho;
    }

    public void dibujar(Graphics g){
        g.drawLine(x, y, largo, ancho);
    }
}