package exemgui;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author carli
 */
public class Ventana2 extends JFrame {
    
    public Ventana2(){
        
        this.setTitle(" Ventana2 ");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //como chamar ao panel por jframe
        
        Container panel = this.getContentPane();
        
        
        
        this.setVisible(true);
        
    }
    
    
}
