package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanelLogin extends JPanel {

	/**
	 * Create the panel.
	 */
	private JButton btnJugar;
	
	private JTextField textNombreJugador1;
	private JTextField textNombreJugador2;
	
	public JPanelLogin() {
		setLayout(null);

		setBackground(Color.GRAY);
		
		
		//Labels para pedir los nombres de los jugadores
		JLabel lblNombreJugador1 = new JLabel("Nombre del juagador 1:");
		lblNombreJugador1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreJugador1.setBounds(67, 30, 164, 44);
		add(lblNombreJugador1);

		JLabel lblNombreJugador2 = new JLabel("Nombre del jugador 2:");
		lblNombreJugador2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreJugador2.setBounds(67, 79, 164, 49);
		add(lblNombreJugador2);

		//Nombre de jugadores 
		this.textNombreJugador1 = new JTextField();
		textNombreJugador1.setBounds(258, 39, 114, 30);
		add(textNombreJugador1);
		textNombreJugador1.setColumns(10);

		this.textNombreJugador2 = new JTextField();
		textNombreJugador2.setBounds(258, 92, 114, 30);
		add(textNombreJugador2);
		textNombreJugador2.setColumns(10);

		//Boton que acciona el cambio de panel
		this.btnJugar = new JButton("Jugar!");
		btnJugar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnJugar.setBounds(149, 199, 152, 63);
		add(btnJugar);


		
	}
	
	public JButton getBoton() {
		return btnJugar;
	}
	
	public String getNombreJugador1() {
		return textNombreJugador1.getText();
	}
	public String getNombreJugador2() {
		return textNombreJugador2.getText();
	}
	
}
