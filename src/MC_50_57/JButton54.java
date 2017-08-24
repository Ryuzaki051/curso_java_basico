package MC_50_57;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButton54 {
    
    public static void main(String... botones){
        JFrame ventana=new JFrame("Ventana de botones");
        ventana.setSize(300,300);
        ventana.setVisible(true);
        
        JPanel panel=new JPanel();
        
        JButton boton=new JButton("Saludar");
        panel.add(boton);
        
        JButton botonSalir=new JButton("Salir");
        panel.add(botonSalir);
        
        ventana.add(panel);
    }
}