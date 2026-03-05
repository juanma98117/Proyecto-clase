import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {
private JButton boton;
private JPanel panel;

		JFrame ventana = new JFrame("Minijuegos");

    public VentanaPrincipal() {

        // Configuración básica de la ventana
        setTitle("MINIJUEGOS");
        
        //Ajustar el tamaño de la ventana
        setSize(1000, 800);
        
        //Cerrar todos los procesos
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Posicionarlo en mitad de la pantalla
        setLocationRelativeTo(null);

        // Panel con imagen de fondo
        ImagenVentanaPrincipal imagen = new ImagenVentanaPrincipal();
        
        //Prohibir el botón maximizar
        setResizable(false);

        
        imagen.setLayout(null);
        setContentPane(imagen);

        // BOTÓN 1
        boton = new JButton();
        boton.setBounds(347, 567, 291, 170);
        
        //Hago el boton invisible
        //Le quito el bordeado al botón
        boton.setBorderPainted(false);
        
        //Le quito el color de fondo al botón
        boton.setContentAreaFilled(false);
        
        getContentPane().add(boton);
        
        JPanel panel = new JPanel();
        panel.setBounds(509, 480, 9, 9);
        imagen.add(panel);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                System.out.println("¡Menú iniciado!");
                new SegundoPanel();
            }
        });

        
        // Música de fondo
        fondo = new MusicaFondo("/resource/CancionFondo.wav");
        fondo.playLoop();

        // Detener música al cerrar
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                fondo.stop();
            }
        });

        setVisible(true);
    }
}
