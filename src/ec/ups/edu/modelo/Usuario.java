
package ec.ups.edu.modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author santiago Cabrera
 */

/**
 * Clase Usuario.
 * 
 * Esta clase nos permite ingresar a las diferentes clases.
 * 
 */
    
    public class Usuario extends JFrame implements ActionListener {

    private JLabel label1;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;

    public Usuario() {

        setLayout(null);
        setTitle("Usuario");
        getContentPane().setBackground(Color.blue.brighter());
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());

        label1 = new JLabel("  Datos ");
        label1.setBounds(50, 15, 180, 30);
        label1.setFont(new Font("Calibri", 3, 26));
        label1.setBackground(Color.white);
        add(label1);

        boton1 = new JButton("Agregar telefono");
        boton1.setBounds(60, 60, 120, 30);
        //para poder darle accino al boton
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Editar");
        boton2.setBounds(60, 100, 120, 30);
        boton2.addActionListener(this);
        add(boton2);

        boton3 = new JButton("Eliminar");
        boton3.setBounds(60, 140, 120, 30);
        boton3.addActionListener(this);
        add(boton3);

        boton4 = new JButton("Buscar");
        boton4.setBounds(60, 180, 120, 30);
        boton4.addActionListener(this);
        add(boton4);

        boton5 = new JButton("Atras");
        boton5.setBounds(60, 220, 120, 30);
        boton5.addActionListener(this);
        add(boton5);

    }

    //Funcionalidad de los botones
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    
        if (ae.getSource() == boton1) {

            AgregarTelefono agregarTelefono = new AgregarTelefono();
            agregarTelefono.setBounds(0, 0, 450, 550);
            agregarTelefono.setVisible(true);
            agregarTelefono.setResizable(false);
            agregarTelefono.setLocationRelativeTo(null);
            //Esto nos permite hacer invisible la ventana al pasar
            //a la siguiente o anterior ventaana
            this.setVisible(false);

        } else if (ae.getSource() == boton2) {

            Editar editarTelefono = new Editar();
            editarTelefono.setBounds(600, 600, 600, 600);
            editarTelefono.setVisible(true);
            editarTelefono.setResizable(false);
            editarTelefono.setLocationRelativeTo(null);
            this.setVisible(false);
            
        } else if (ae.getSource() == boton3) {

            Eliminar eliminar = new Eliminar();
            eliminar.setBounds(0, 0, 400, 250);
            eliminar.setVisible(true);
            eliminar.setResizable(false);
            eliminar.setLocationRelativeTo(null);
            this.setVisible(false);
            
        } else if (ae.getSource() == boton4) {

            Buscar buscar = new Buscar();
            buscar.setBounds(0, 0, 400, 400);
            buscar.setVisible(true);
            buscar.setResizable(false);
            buscar.setLocationRelativeTo(this);
            this.setVisible(false);
            
        } else if (ae.getSource() == boton5) {

            InicioSesion inicio = new InicioSesion();
            inicio.setBounds(400, 400, 400, 400);
            inicio.setVisible(true);
            inicio.setLocationRelativeTo(null);
            this.setVisible(false);
            
        }

    }
    
}
