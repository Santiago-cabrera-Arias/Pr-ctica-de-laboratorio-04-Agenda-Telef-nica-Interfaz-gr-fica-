# Pr-ctica-de-laboratorio-04-Agenda-Telef-nica-Interfaz-gr-fica-

RESULTADO(S) OBTENIDO(S):
•	Clase Bienvenido

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
        getContentPane().setBackground(Color.red.darker());
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

•	Clase Iniciar Sesion


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

•	Clase Registrar


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


•	Clase Usuario


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
            agregarTelefono.setBounds(600, 600, 600, 600);
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

•	Clase Buscar


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
    
    /***
     * 
     * Clase Buscar 
     * 
     * esta clase es la que pemite buscar al telefono
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
        getContentPane().setBackground(Color.red.darker());
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

    //Funcionalidad a los botones
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == boton1) {

        } else if (ae.getSource() == boton2) {

            Usuario usuario = new Usuario();
            usuario.setBounds(400, 400, 400, 400);
            usuario.setVisible(true);
            usuario.setResizable(false);
            usuario.setLocationRelativeTo(null);
            //para cuando de a atras la pagina desaparezca
            this.setVisible(false);

        }

    }

    
}

•	Clase Editar


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

•	Clase Eliminar


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


 
CONCLUSIONES:
Para realizar interfaces graficas damos funcionalidad a los distintos , para nosotros poder hacer que tengan funcionalidad los botones debemos crearnos un método, “public void actionPerformed (actionEvent e)”  dentro de este metodo daríamos la funcialidad a los botones al igual si queremos agregar un cuadro de texto tendríamos que usar el JTextField, o si queremos ingresar una etiqueta utilizamos el JLabel.
RECOMENDACIONES:
Utilizar los setBounds correctamente para que no sobre un espacio muy amplio en nuestra ventana, utilizar el setVisible(this.false) para que cuando pulsemos a siguiente o anterior la pantalla anterior desaparezca.
