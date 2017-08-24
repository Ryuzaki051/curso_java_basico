package MC_50_57;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alejandro
 */
public class JButtonEventListener {
        public static void main(String... botones){
         final JFrame ventana=new JFrame("Ventana de botones");
        ventana.setSize(500,200);
        ventana.setVisible(true);
        
        JPanel panel=new JPanel();
        
        JButton boton=new JButton("Saludar");
        panel.add(boton);
        
        JButton botonSalir=new JButton("Salir");
        panel.add(botonSalir);
        
        ventana.add(panel);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String captura=JOptionPane.showInputDialog(null,"Ingrese nombre:");
                JOptionPane.showMessageDialog(null, captura);
                
                //JOptionPane.showMessageDialog(null, "Hola Alejandro");
            }
            
        });
        
        botonSalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispatchEvent(new WindowEvent(ventana,WindowEvent.WINDOW_CLOSING));
            }
            
        });
        
    }
}