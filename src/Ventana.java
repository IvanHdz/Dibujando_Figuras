/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ViRuZ
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame{
    private Container c;
    private JLabel etiqueta;
    private int area;
    private JPanel panelOpcion;
    private JRadioButton Ovalo;
    private JRadioButton Arco;
    private JRadioButton Linea;
    private JRadioButton Rectangulo;
    private ButtonGroup grupoRadio;
    private Panel miPanel;
    
    public Ventana(){
        super("Viruz Blog: Dibujo de Figuras");
        c = getContentPane();
        setSize(500, 500);
        setVisible(true);
        addComponentes();
        addEventos();
        setLocationRelativeTo(null);
    }
        
      public void addComponentes(){
        Ovalo = new JRadioButton("Óvalo", true);
        Arco = new JRadioButton("Arco");
        Linea = new JRadioButton("Línea");
        Rectangulo = new JRadioButton("Rectángulo Redondeado");
        grupoRadio = new ButtonGroup();
        panelOpcion = new JPanel();
        etiqueta = new JLabel(": : Coordenadas : :");
        miPanel = new Panel();
        
        miPanel.setBackground(Color.WHITE);
        //agrupando Checks
        grupoRadio.add(Ovalo);
        grupoRadio.add(Arco);
        grupoRadio.add(Linea);
        grupoRadio.add(Rectangulo);
        
        //agregando JRadioButton al panel de opciones
        panelOpcion.add(Ovalo);
        panelOpcion.add(Arco);
        panelOpcion.add(Linea);
        panelOpcion.add(Rectangulo);
        
        //agregando componentes al Container
        c.add(etiqueta, BorderLayout.SOUTH);
        c.add(miPanel, BorderLayout.CENTER);
        c.add(panelOpcion, BorderLayout.NORTH);
        
        //adicionando Oyentes a los JRadioButton
        Ovalo.addItemListener(new ManejadorRadioBoton(1));
        Arco.addItemListener(new ManejadorRadioBoton(2));
        Linea.addItemListener(new ManejadorRadioBoton(3));
        Rectangulo.addItemListener(new ManejadorRadioBoton(4));
        }
      
      public void addEventos(){
       addMouseListener(new MouseAdapter(){
          public void mousePressed(MouseEvent evento){
              miPanel.setX1(evento.getX() - 8);
              miPanel.setY1(evento.getY() - 88);
              
               if(miPanel.getOpc() == 3){
            miPanel.setLargo(miPanel.getX1());
            miPanel.setAncho(miPanel.getY1());
        }else{
            miPanel.setAncho(0);
            miPanel.setLargo(0);
        }
        
        etiqueta.setText("Punto inicial [" + miPanel.getX1() + ", " + miPanel.getY1() + "]     " +
                "Punto final [" + (evento.getX() - 8) + ", " + (evento.getY() - 88) + "]");
        miPanel.dibujar();
          }
      });
      
      addMouseMotionListener(new MouseMotionAdapter(){
        public void mouseDragged(MouseEvent evento){
            if(miPanel.getOpc() == 3){
                miPanel.setLargo(evento.getX() - 8);
                miPanel.setAncho(evento.getY() - 88);
            }else{
                miPanel.setLargo(evento.getX() - miPanel.getX1() - 8);
                miPanel.setAncho(evento.getY() - miPanel.getY1() - 88);
            }

            etiqueta.setText("Punto inicial [" + miPanel.getX1() + ", " + miPanel.getY1() + "]     " +
                "Punto final [" + (evento.getX() - 8) + ", " + (evento.getY() - 88) + "]");
            
            miPanel.dibujar();
        }
      });
    }
      class ManejadorRadioBoton implements ItemListener{
        private int opc;
        
        public ManejadorRadioBoton(int x){
            opc = x;
        }
       public void itemStateChanged(ItemEvent evento){
            miPanel.setOpc(opc);
        }
    }
}
