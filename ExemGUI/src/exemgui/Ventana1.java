package exemgui;

import javax.swing.JFrame;

/**
 *
 * @author carli
 */
public class Ventana1 {
    
    JFrame marco;
    
    public Ventana1(){
        
    marco = new JFrame (" Ventana1 ");
    
    marco.setBounds(0,0,800,600);
    
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    marco.setVisible(true);
    }
            
}
