package MC_50_57;

import javax.swing.JFrame;

/**
 *
 * @author Alejandro
 */
public class SwingInterface53 {
    
    public void ventana(){
        JFrame ventana=new JFrame();
        ventana.setSize(300,300);
        ventana.setVisible(true);
    }
    
    public static void main(String... ventana){
        SwingInterface53 ven=new SwingInterface53();
        ven.ventana();
    }
    
}