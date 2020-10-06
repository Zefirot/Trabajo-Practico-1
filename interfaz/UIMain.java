package interfaz;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Toolkit;

public class UIMain {

	private JFrame frame;
	
	private static JPanelLogin panelLogin;
	private static JPanelTablero panelTablero;
	private static JPanelGanador panelGanador;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() { 
				try {
					UIMain window = new UIMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UIMain() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(UIMain.class.getResource("/imagenes/icono_Teteti.png")));
		frame.setTitle("TATETORO");
		frame.setBounds(100, 100, 474, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		//Se crea el contenedor de los paneles
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 458, 279);
		frame.getContentPane().add(layeredPane);
		
		//Se crean los paneles necesarios para mostrar todo
		panelLogin = new JPanelLogin();
		panelLogin.setBounds(0, 0, 458, 279);
		
		panelTablero = new JPanelTablero();
		panelTablero.setBounds(0, 0, 458, 279);
		panelTablero.setVisible(false); //Como este es el segundo panel entonces se crea y se oculta.
		
		panelGanador = new JPanelGanador(); 
		panelGanador.setBounds(0,0,458,279);
		panelGanador.setVisible(false);
		
		
		layeredPane.add(panelLogin);
		layeredPane.add(panelTablero);
		layeredPane.add(panelGanador);

		
	}

	//Esta funcion hace la transicion del panel login al panel tablero, la cual es donde se ejecuta el juego como tal.
	public static void cambiarATablero() {
		panelLogin.setVisible(false);
		panelTablero.setNombreDeJugadores(panelLogin.getNombreJugador1(), panelLogin.getNombreJugador2());
		panelTablero.setVisible(true);
	}
	
	
	public static void detectarGanador() {
		if(panelTablero.getGanador()==1) {
			panelGanador.setNombreGanador(panelLogin.getNombreJugador1()); //Al panel ganador se le pasa el nombre del jugador 1
 			panelGanador.setImagenGanador(panelLogin.getImagenJugador1()); //Al panel ganador se le pasa la foto del jugador 1
			panelTablero.setVisible(false); //Se hace la transicion del tablero hacia el panel que anuncia el ganador
			panelGanador.setVisible(true);
		}
		else if(panelTablero.getGanador()==2) {
			panelGanador.setNombreGanador(panelLogin.getNombreJugador2());
			panelGanador.setImagenGanador(panelLogin.getImagenJugador2());
			panelTablero.setVisible(false);
			panelGanador.setVisible(true);
		}
	}
	
}
