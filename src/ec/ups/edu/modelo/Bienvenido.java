
package ec.ups.edu.modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

/**
 *
 * @author santiago Cabrera
 */
   
/**
 * Clase Bienvenido.
 * 
 * Esta clase es la que pemite ingresar a registrarse y iniciar Sesion.
 * 
 */

    public class Bienvenido extends JFrame implements ActionListener {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;

    public Bienvenido() {

        setLayout(null);
        //NO se ejecuta en segundo plano al cerrar el programa
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(Color.blue);
        //permite poner el logo en la parte superior
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());

        label1 = new JLabel("AGENDA TELEFONICA...");
        label1.setBounds(25, 20, 400, 150);
        label1.setFont(new Font("Arial", 3, 33));
        label1.setBackground(Color.WHITE);
        add(label1);

        label2 = new JLabel("Directorio UPS");
        label2.setBounds(35, 115, 300, 30);
        //el tres para que se vea en negita y cursiva.
        //tamano de la letra en pixels
        label2.setFont(new Font("Andale Mono", 3, 18));
        //ponemos el color del texto
        label2.setForeground(Color.white);
        add(label2);

        label3 = new JLabel("+_+ 2020 Cabrera's Company >_+");
        label3.setBounds(190, 500, 270, 30);
        label3.setFont(new Font("Andale Mono", 3, 16));
        label3.setBackground(Color.white);
        add(label3);

        ImageIcon imagen = new ImageIcon(getClass().getResource("/images/fondo.png"));
        label4 = new JLabel(imagen);
        label4.setBounds(0, 0, 600, 700);
        
        add(label4);

        boton1 = new JButton("Registrarse");
        boton1.setBounds(125, 250, 150, 50);
        boton1.setBackground(Color.white);
        boton1.setFont(new Font("Arial", 1, 14));
        //para que tenga funcionalidad
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Iniciar Sesion");
        boton2.setBounds(125, 320, 150, 50);
        boton2.setBackground(Color.white);
        boton2.setFont(new Font("Arial", 1, 14));
        //para que tenga funcionalidad
        boton2.addActionListener(this);
        add(boton2);

        boton3 = new JButton("Salir");
        boton3.setBounds(125, 390, 150, 50);
        boton3.setBackground(Color.white);
        boton3.setFont(new Font("Arial", 1, 14));
        boton3.addActionListener(this);
        add(boton3);

        
        
    }
    
    //Damos funcionalidad a los botones.
    @Override
    public void actionPerformed(ActionEvent ae) {
        //getSource para que cuando el usuario pulse el boton se cumpla la accion
        if (ae.getSource() == boton1) {

            Registrarse registrar = new Registrarse();
            registrar.setBounds(600, 600, 600, 600);
            registrar.setVisible(true);
            registrar.setResizable(false);
            registrar.setLocationRelativeTo(null);
            this.setVisible(false);

        } else if (ae.getSource() == boton2) {

            InicioSesion inicio = new InicioSesion();
            inicio.setBounds(400, 400, 400, 400);
            inicio.setVisible(true);
            inicio.setLocationRelativeTo(null);
            this.setVisible(false);
            
        } else if (ae.getSource() == boton3) {

            System.exit(0);
            
        }

    }
    
}
