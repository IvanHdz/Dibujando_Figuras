import java.awt.Graphics;

public class RectanguloRedondeado extends Figura{
    public RectanguloRedondeado(int x, int y, int largo, int ancho){
        super(x, y, largo, ancho);
    }

    public void dibujar(Graphics g){
        g.drawRoundRect(getX(), getY(), getLargo(), getAncho(), 5, 5);
    }
}