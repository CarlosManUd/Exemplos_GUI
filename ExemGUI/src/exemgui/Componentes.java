package exemgui;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author carli
 */
public class Componentes {
    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel etiqueta;
    JTextField texto;
    
    public Componentes(){
        
        marco = new JFrame(" compoñentes ");
        panel = new JPanel();
        boton = new JButton(" boton ");
        etiqueta = new JLabel();
        texto = new JTextField();
        // damoslle caracteristicas a los componentes
        
        marco.setBounds(0,0,600,400);
        panel.setSize(600,400);
        panel.setBackground(Color.RED);
        etiqueta.setText(" etiqueta ");
        texto.setSize(100,50);
        texto.setText("dame nome");
        
        panel.add(boton);
        panel.add(etiqueta);
        panel.add(texto);
        marco.add(panel);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
        marco.setVisible(true);
        
    }
    
    
}
