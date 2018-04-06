/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagui4;

import javax.swing.JFrame;

/**
 *
 * @author FAMGOMO
 */
public class PruebaGUI4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana1 miVentana=new Ventana1();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setSize(350,100);
        miVentana.setVisible(true);
    }
    
}
