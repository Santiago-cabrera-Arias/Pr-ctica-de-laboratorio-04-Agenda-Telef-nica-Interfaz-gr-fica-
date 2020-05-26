
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
 * Clase Registrarse.
 * 
 * Esta clase nos permite registrarse.
 * 
 */

    public class Registrarse extends JFrame implements ActionListener{
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton boton1;
    private JButton boton2;

    public Registrarse(){
        
        setLayout(null);
        setTitle("Registro");
        getContentPane().setBackground(Color.red.brighter());
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        
        
        label1 = new JLabel("Registrarse");
        label1.setBounds(20,30,180,30);
        label1.setFont(new Font("Andale Mono",3,25));
        label1.setBackground(Color.BLACK);
        add(label1);
        
        label2 = new JLabel("Cedula");
        label2.setBounds(10,100,120,30);
        label2.setFont(new Font("Andale Mono",3,16));
        add(label2);
        
        label3 = new JLabel("Nombre");
        label3.setBounds(10,150,120,30);
        label3.setFont(new Font("Andale Mono",3,16));
        add(label3);
        
        label4 = new JLabel("Apellido");
        label4.setBounds(10,200,120,30);
        
        label4.setFont(new Font("Andale Mono",3,16));
        add(label4);
        
        label5 = new JLabel("Correo");
        label5.setBounds(10,250,120,30);
        label5.setFont(new Font("Andale Mono",3,16));
        add(label5);
        
        label6 = new JLabel("Contraseña");
        label6.setBounds(10,300,120,30);
        label6.setFont(new Font("Andale Mono",3,16));
        add(label6);
        
        
        textField1 = new JTextField();
        label6.setBackground(Color.LIGHT_GRAY);
        textField1.setBounds(150,100,200,35);
        add(textField1);
        
        textField2 = new JTextField();
        label6.setBackground(Color.LIGHT_GRAY);
        textField2.setBounds(150,150,200,35);
        add(textField2);
        
        textField3 = new JTextField();
        label6.setBackground(Color.LIGHT_GRAY);
        textField3.setBounds(150,200,200,35);
        add(textField3);
        
        textField4 = new JTextField();
        label6.setBackground(Color.LIGHT_GRAY);
        textField4.setBounds(150,250,200,35);
        add(textField4);
        
        textField5 = new JTextField();
        label6.setBackground(Color.LIGHT_GRAY);
        textField5.setBounds(150,300,200,35);
        add(textField5);
    
        boton1 = new JButton("Registrarse");
        boton1.setBounds(150,400,200,40);
        boton1.setFont(new Font("Calibri",1,14));
        boton1.setBackground(Color.white);
        boton1.addActionListener(this);
        add(boton1);
        
        boton2 = new JButton("Atras");
        boton2.setBounds(150,450,200,40);
        boton2.setFont(new Font("Calibri",1,14));
        boton2.setBackground(Color.white);
        boton2.addActionListener(this);
        add(boton2);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == boton1){
         
            
            
        }else if(ae.getSource() == boton2){
            
        Bienvenido bienvenido = new Bienvenido();
        bienvenido.setBounds(600,600,600,600);
        bienvenido.setVisible(true);
        bienvenido.setResizable(false);
        bienvenido.setLocationRelativeTo(null);
        this.setVisible(false);
            
        }
        
    }
         
    
}


