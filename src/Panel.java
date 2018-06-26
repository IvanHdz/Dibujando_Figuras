import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel {
    private Dibujable figura;
    private int x1;
    private int ancho;
    private int y1;
    private int largo;
    private int opc;
    private final int OVALO = 1;
    private final int ARCO = 2;
    private final int LINEA = 3;
    private final int RECTANGULO = 4;
    
    public Panel(){
        x1 = 0;
        ancho = 0;
        y1 = 0;
        largo = 0;
        opc = 1;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.BLUE);
        
        switch(getOpc()){
            case OVALO: 
                        figura = new Ovalo(x1, y1, largo, ancho);
                        break;
            case ARCO: 
                        figura = new Arco(x1, y1, largo, ancho);
                        break;
            case LINEA: 
                        figura = new Linea(x1, y1, largo, ancho);
                        break;
            case RECTANGULO: 
                        figura = new RectanguloRedondeado(x1, y1, largo, ancho);
                        break;
        }
        
        figura.dibujar(g);
    }
    
    public void dibujar(){
        repaint();
    }
    
    
//*MÉTODOS set asginan Valores Y get Regresan Valores
      //Sirven para asignar nuevos valores cuando se dibujan varias veces.

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }
}

