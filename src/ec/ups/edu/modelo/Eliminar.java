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
 * Clase Eliminar
 * 
 * Esta clase nos permite eliminar el telefono al ingresar un codigo.
 * 
 */
    
    public class Eliminar extends JFrame implements ActionListener {

    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JButton boton1;
    private JButton boton2;

    public Eliminar() {

        setLayout(null);
        setTitle("Eliminar telefono");
        getContentPane().setBackground(Color.red.darker());
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());

        label1 = new JLabel("Eliminar telefono");
        label1.setBounds(10, 30, 180, 30);
        label1.setFont(new Font("Calibri", 3, 21));
        add(label1);

        label2 = new JLabel("codigo");
        label2.setBounds(10, 80, 120, 30);
        label2.setFont(new Font("Calibri", 1, 18));
        add(label2);

        textField1 = new JTextField();
        textField1.setBounds(80, 80, 120, 30);
        add(textField1);

        boton1 = new JButton("Eliminar");
        boton1.setBounds(150, 120, 100, 30);
        boton1.setFont(new Font("Calibri", 1, 16));
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Atras");
        boton2.setBounds(30, 120, 100, 30);
        boton2.setFont(new Font("Calibri", 1, 16));
        boton2.addActionListener(this);
        add(boton2);

    }

    //Funcionalidad de los botones.
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == boton1) {

        } else if (ae.getSource() == boton2) {

            Usuario usuario = new Usuario();
            usuario.setBounds(400, 400, 400, 400);
            usuario.setVisible(true);
            usuario.setResizable(false);
            usuario.setLocationRelativeTo(null);
            this.setVisible(false);

        }

    }
    
}

