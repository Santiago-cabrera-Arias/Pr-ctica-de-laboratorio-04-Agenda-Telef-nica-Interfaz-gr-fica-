
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
        private JLabel label3;
        private JButton boton1;
        private JButton boton2;
        private JTextField textField1;
        private JTextField textField2;
        
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
            
            label3 = new JLabel("Cedula");
            label3.setBounds(10, 170, 120, 30);
            label3.setFont(new Font("Arial", 3, 16));
            add(label3);

            textField1 = new JTextField();
            textField1.setBounds(100, 120, 120, 30);
            add(textField1);

            textField2 = new JTextField();
            textField2.setBounds(100, 170, 120, 30);
            add(textField2);
            
            boton1 = new JButton("Buscar");
            boton1.setBounds(30, 230, 120, 30);
            boton1.addActionListener(this);
            add(boton1);

            boton2 = new JButton("Atras");
            boton2.setBounds(180, 230, 120, 30);
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
