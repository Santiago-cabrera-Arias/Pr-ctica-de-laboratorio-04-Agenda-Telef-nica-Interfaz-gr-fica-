/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.test;

import ec.ups.edu.modelo.Bienvenido;

/**
 *
 * @author santi
 */
public class Test {
    
    public static void main(String[] args) {
       
        Bienvenido bienvenido = new Bienvenido();
    
    bienvenido.setBounds(600,600,600,600);
    //para que la ventana sea visible
    bienvenido.setVisible(true);
    //para ver si nuestra ventana puede ser cambiado de tamano
    bienvenido.setResizable(false);
    //Colocamos la ventana en el centro
    bienvenido.setLocationRelativeTo(null);
    
    
    }
}
