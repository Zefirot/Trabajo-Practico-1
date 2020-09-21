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
	public JPanelLogin() {
		setLayout(null);

		setBackground(Color.GRAY);
		
		
		//Texto para pedir nombres de jugadores
		JLabel lblNewLabel = new JLabel("Nombre del juagador 1:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(67, 30, 164, 44);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre del jugador 2:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(67, 79, 164, 49);
		add(lblNewLabel_1);

		//Nombre de jugadores
		JTextField textNombreJugador1 = new JTextField();
		textNombreJugador1.setBounds(258, 39, 114, 30);
		add(textNombreJugador1);
		textNombreJugador1.setColumns(10);

		JTextField textNombreJugador2 = new JTextField();
		textNombreJugador2.setBounds(258, 92, 114, 30);
		add(textNombreJugador2);
		textNombreJugador2.setColumns(10);


		JButton btnJugar = new JButton("Jugar!");

		btnJugar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

			}
		});
		btnJugar.setBounds(149, 199, 152, 63);
		add(btnJugar);


		
	}

}
