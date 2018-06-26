import java.awt.Graphics;

public class Arco extends Figura{
    public Arco(int x, int y, int largo, int ancho){
        super(x, y, largo, ancho);
    }

    public void dibujar(Graphics g){
        g.drawArc(getX(), getY(), getLargo(), getAncho(), 180, 180);
    }
}