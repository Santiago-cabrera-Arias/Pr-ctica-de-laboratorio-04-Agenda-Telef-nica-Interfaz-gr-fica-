
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

/***
 * Clase Agregar telefono.
 * 
 * Esta clase permite agregar el telefono.
 * 
 */
    
    public class AgregarTelefono extends JFrame implements ActionListener {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton boton1;
    private JButton boton2;

    //Caracteristica de los botones.
    public AgregarTelefono() {

        setLayout(null);
        setTitle("Agregar telefono");
        getContentPane().setBackground(Color.cyan.darker());
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());

        label1 = new JLabel("Telefono");
        label1.setBounds(60, 40, 130, 30);
        label1.setFont(new Font("Andale Mono", 3, 25));
        label1.setBackground(Color.black);
        add(label1);

        label2 = new JLabel("Codigo");
        label2.setBounds(10, 90, 120, 30);
        label2.setFont(new Font("Andale Mono", 2, 16));
        label2.setBackground(Color.white);
        add(label2);

        label3 = new JLabel("Numero");
        label3.setBounds(10, 150, 120, 30);
        label3.setFont(new Font("Andale Mono", 2, 16));
        label3.setBackground(Color.white);
        add(label3);

        label4 = new JLabel("Tipo");
        label4.setBounds(10, 210, 120, 30);
        label4.setFont(new Font("Andale Mono", 2, 16));
        label4.setBackground(Color.white);
        add(label4);

        label5 = new JLabel("Operadora");
        label5.setBounds(10, 270, 120, 30);
        label5.setFont(new Font("Andale Mono", 2, 16));
        label5.setBackground(Color.white);
        add(label5);

        textField1 = new JTextField();
        textField1.setBounds(90, 90, 180, 30);
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(90, 150, 180, 30);
        add(textField2);

        textField3 = new JTextField();
        textField3.setBounds(90, 210, 180, 30);
        add(textField3);

        textField4 = new JTextField();
        textField4.setBounds(90, 270, 180, 30);
        add(textField4);

        boton1 = new JButton("Crear");
        boton1.setBounds(50, 350, 120, 30);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Atras");
        boton2.setBounds(200, 350, 120, 30);
        boton2.addActionListener(this);
        add(boton2);
    }

   //Damos funcionalidad  a los botones.
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
