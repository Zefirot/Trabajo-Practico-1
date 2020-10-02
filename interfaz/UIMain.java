package interfaz;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class UIMain {

	private JFrame frame;

	private static JPanelTablero tablero;
	private static JPanelLogin login;
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

	/**
	 * Create the application.
	 */
	public UIMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("TATETORO");
		frame.setBounds(100, 100, 474, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 458, 279);
		frame.getContentPane().add(layeredPane);
		
		//Se crean los paneles necesarios para mostrar todo
		login = new JPanelLogin();
		login.setBounds(0, 0, 458, 279);
		
		tablero = new JPanelTablero();
		tablero.setBounds(0, 0, 458, 279);
		tablero.setVisible(false); //Como este es el segundo panel entonces se crea y se oculta.
		
		panelGanador = new JPanelGanador(); 
		panelGanador.setBounds(0,0,458,279);
		panelGanador.setVisible(false);
		
		
		layeredPane.add(login);
		layeredPane.add(tablero);
		layeredPane.add(panelGanador);

		
	}

	public static void cambiarATablero() {
		login.setVisible(false);
		tablero.setNombreDeJugadores(login.getNombreJugador1(), login.getNombreJugador2());
		tablero.setVisible(true);
		
	}
	
	public static void detectarGanador() {
		if(tablero.getGanador()==1) {
			panelGanador.setNombreGanador(login.getNombreJugador1());
			panelGanador.setImagenGanador(login.getImagenJugador1());
			tablero.setVisible(false);
			panelGanador.setVisible(true);
		}
		else if(tablero.getGanador()==2) {
			panelGanador.setNombreGanador(login.getNombreJugador2());
			panelGanador.setImagenGanador(login.getImagenJugador2());
			tablero.setVisible(false);
			panelGanador.setVisible(true);
		}
	}
	
}
