package interfaz;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class UIMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
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
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 458, 279);
		frame.getContentPane().add(layeredPane);
		
		JPanelLogin login = new JPanelLogin();
		login.setBounds(0, 0, 458, 279);
		
		JPanelTablero tablero = new JPanelTablero();
		tablero.setBounds(0, 0, 458, 279);
		tablero.setVisible(false);
		
		layeredPane.add(login);
		layeredPane.add(tablero);
		
		
		login.sePresiono().addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				login.setVisible(false);
				tablero.setVisible(true);
				
			}
			
		});
		
		
		
		
	}
}
