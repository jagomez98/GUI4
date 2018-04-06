/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagui4;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author yo mero
 */
public class Ventana1 extends JFrame {
    private JTextField campo1,campo2,campo3;
    private JPasswordField pass;
    
    public Ventana1(){
        super("Prueba de JTextFiel y JPasswordField");
        this.setLayout(new FlowLayout());
        
        campo1=new JTextField(10);
        this.add(campo1);
        
        campo2=new JTextField("Escribe un texto");
        this.add(campo2);
        
        campo3=new JTextField("Campo de texto no editable",21);
        campo3.setEditable(false);        
        this.add(campo3);
        
        pass=new JPasswordField("Texto oculto");
        this.add(pass);
    }
}
