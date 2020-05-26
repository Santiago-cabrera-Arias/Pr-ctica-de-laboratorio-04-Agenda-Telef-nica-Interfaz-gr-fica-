
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
 * clase Editar
 * 
 * Esta clase permite editar el telefono 
 * 
 */
    
    public class Editar extends JFrame implements ActionListener {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;

    public Editar() {

        setLayout(null);
        setTitle("Editar");
        getContentPane().setBackground(Color.red.darker());
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());

        label1 = new JLabel("Ingrese el codigo a actualizar");
        label1.setBounds(10, 30, 300, 30);
        label1.setFont(new Font("Calibri", 3, 21));
        add(label1);

        label2 = new JLabel("Codigo");
        label2.setBounds(10, 80, 120, 30);
        label2.setFont(new Font("Arial", 2, 16));
        add(label2);

        label3 = new JLabel("Nuevos Datos");
        label3.setBounds(10, 120, 120, 30);
        label3.setFont(new Font("Arial", 2, 18));
        add(label3);

        label4 = new JLabel("Nombre");
        label4.setBounds(10, 160, 120, 30);
        label4.setFont(new Font("Arial", 2, 16));
        add(label4);

        label5 = new JLabel("Tipo");
        label5.setBounds(10, 200, 120, 30);
        label5.setFont(new Font("Arial", 2, 16));
        add(label5);

        label6 = new JLabel("Operadora");
        label6.setBounds(10, 240, 120, 30);
        label6.setFont(new Font("Arial", 2, 16));
        add(label6);

        textField1 = new JTextField();
        textField1.setBounds(90, 80, 120, 30);
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(90, 160, 120, 30);
        add(textField2);

        textField3 = new JTextField();
        textField3.setBounds(90, 200, 120, 30);
        add(textField3);

        textField4 = new JTextField();
        textField4.setBounds(90, 240, 120, 30);
        add(textField4);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(220, 80, 120, 30);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Agregar");
        boton2.setBounds(30, 300, 120, 30);
        boton2.addActionListener(this);
        add(boton2);

        boton3 = new JButton("Atras");
        boton3.setBounds(160, 300, 120, 30);
        boton3.addActionListener(this);
        add(boton3);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == boton1) {

        } else if (ae.getSource() == boton2) {

        } else if (ae.getSource() == boton3) {

            Usuario usuario = new Usuario();
            usuario.setBounds(400, 400, 400, 400);
            usuario.setVisible(true);
            usuario.setResizable(false);
            usuario.setLocationRelativeTo(null);
            this.setVisible(false);
            
        }

    }
    
}
