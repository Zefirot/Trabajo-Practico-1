package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Interfaz {

	private JFrame frame;
	private JTextField textNombreJugador1;
	private JTextField textNombreJugador2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
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
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.GRAY);
		
		//Texto para pedir nombres de jugadores
		JLabel lblNewLabel = new JLabel("Nombre del juagador 1:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(157, 88, 164, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del jugador 2:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(157, 137, 164, 49);
		frame.getContentPane().add(lblNewLabel_1);
		
		//Nombre de jugadores
		textNombreJugador1 = new JTextField();
		textNombreJugador1.setBounds(348, 97, 114, 30);
		frame.getContentPane().add(textNombreJugador1);
		textNombreJugador1.setColumns(10);
		
		textNombreJugador2 = new JTextField();
		textNombreJugador2.setBounds(348, 150, 114, 30);
		frame.getContentPane().add(textNombreJugador2);
		textNombreJugador2.setColumns(10);
		
		
		JButton btnJugar = new JButton("Jugar!");
		
			btnJugar.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnJugar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					
					
					
					
					
					
				}
			});
			btnJugar.setBounds(248, 284, 152, 63);
			frame.getContentPane().add(btnJugar);
		
		
		
		
		
	}
	
	
	private void nuevoPanel(JPanel panel) {
		frame.removeAll();
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
	}
}
