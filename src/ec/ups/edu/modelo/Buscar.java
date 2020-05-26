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
 * 
 */
    
    public class Buscar extends JFrame implements ActionListener {

    private JLabel label1;
    private JLabel label2;
    private JButton boton1;
    private JButton boton2;
    private JTextField textField1;

    public Buscar() {

        setLayout(null);
        setTitle("Buscar");
        getContentPane().setBackground(Color.green);
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());

        label1 = new JLabel("Buscar Telefono");
        label1.setBounds(10, 50, 200, 30);
        label1.setFont(new Font("Arial", 3, 16));
        add(label1);

        label2 = new JLabel("Codigo");
        label2.setBounds(10, 120, 120, 30);
        label2.setFont(new Font("Arial", 3, 16));
        add(label2);

        textField1 = new JTextField();
        textField1.setBounds(100, 120, 120, 30);
        add(textField1);

        boton1 = new JButton("Buscar");
        boton1.setBounds(30, 200, 120, 30);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Atras");
        boton2.setBounds(180, 200, 120, 30);
        boton2.addActionListener(this);
        add(boton2);

    }

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
