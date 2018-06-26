/**
 *
 * @author ViRuZ
 */
import java.awt.Graphics;

public class Ovalo extends Figura{
    public Ovalo(int x, int y, int largo, int ancho){
        super(x, y, largo, ancho);
    }

    public void dibujar(Graphics g){
        g.drawOval(getX(), getY(), getLargo(), getAncho());
    }
}