/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author santiago Cabrera
 */
    
/**
 * Clase Iniciar Sesion.
 * 
 * Esta clase  nos permite inciar sesion.
 * 
 */
    public class InicioSesion extends JFrame implements ActionListener {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField1;
    private JTextField textField2;
    private JButton boton1;
    private JButton boton2;

    public InicioSesion() {

        setLayout(null);
        setTitle("Inicio Sesion");
        getContentPane().setBackground(Color.RED.darker());
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());

        label1 = new JLabel("Iniciar Sesion");
        label1.setBounds(10, 10, 180, 30);
        label1.setBackground(Color.WHITE);
        label1.setFont(new Font("Andale Mono", 3, 22));
        add(label1);

        label2 = new JLabel("Correo");
        label2.setBounds(10, 100, 120, 30);
        label2.setFont(new Font("Andale Mono", 3, 16));
        label2.setBackground(Color.BLACK);
        add(label2);

        label3 = new JLabel("Contraseña");
        label3.setBounds(10, 150, 110, 30);
        label3.setFont(new Font("Andale Mono", 3, 16));
        label3.setBackground(Color.BLACK);
        add(label3);

        textField1 = new JTextField();
        textField1.setBounds(110, 100, 120, 30);
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(110, 150, 120, 30);
        add(textField2);

        boton1 = new JButton("Inciciar Sesion");
        boton1.setBounds(40, 200, 130, 30);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Atras");
        boton2.setBounds(200, 200, 120, 30);
        boton2.addActionListener(this);
        add(boton2);

    }

    //Accion de los  botones
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == boton1) {

            Usuario usuario = new Usuario();
            usuario.setBounds(400, 400, 400, 400);
            usuario.setVisible(true);
            usuario.setResizable(false);
            usuario.setLocationRelativeTo(null);
            this.setVisible(false);

        } else if (ae.getSource() == boton2) {

            Bienvenido bienvenido = new Bienvenido();

            bienvenido.setBounds(600, 600, 600, 600);
            //para que la ventana sea visible
            bienvenido.setVisible(true);
            //para ver si nuestra ventana puede ser cambiado de tamano
            bienvenido.setResizable(false);
            //Colocamos la ventana en el centro
            bienvenido.setLocationRelativeTo(null);
            this.setVisible(false);

        }

    }
    
}
