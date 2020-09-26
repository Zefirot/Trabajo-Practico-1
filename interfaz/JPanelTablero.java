package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import codigoBusiness.Tablero;

public class JPanelTablero extends JPanel {
	
	private Tablero tablero;
	private String nombreJugador1;
	private String nombreJugador2;
	private JLabel lblTurnoNombre;
	
	public JPanelTablero() {
		setLayout(null);
		
		//Se crea el tablero
		this.tablero=new Tablero();
		
		//Contador de turnos
		JLabel lblNumeroTurnos = new JLabel("Turnos: 0");
		lblNumeroTurnos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumeroTurnos.setBounds(357, 11, 83, 20);
		add(lblNumeroTurnos);
		
		//Indicador de turno
		lblTurnoNombre = new JLabel("Turno de: ");
		lblTurnoNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTurnoNombre.setBounds(10, 11, 184, 20);
		add(lblTurnoNombre);
		
		//Botones que componen el tablero
		JButton btnButton1 = new JButton("");
		btnButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				if(btnButton1.isEnabled()) { //Forma de controlar el boton para que solo se presione 1 vez.
					
					tablero.marcarTablero(1);

					lblNumeroTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno())); //Se actualiza el contador de turnos
					
					btnButton1.setEnabled(false);
					
					if(tablero.getTurno()%2==0) { //Dependiendo del turno se va a marcar con una "O" o "X"
						btnButton1.setText("O");
						lblTurnoNombre.setText("Turno de: "+nombreJugador1);
					}else {
						btnButton1.setText("X");
						lblTurnoNombre.setText("Turno de: "+nombreJugador2);
					}
					
					
					UIMain.detectarGanador();
				}

			}
		});
		
		btnButton1.setBounds(103, 71, 54, 39);
		add(btnButton1);

		JButton btnButton2 = new JButton("");
		btnButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if(btnButton2.isEnabled()) {
					tablero.marcarTablero(2);

					lblNumeroTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));
					
					btnButton2.setEnabled(false);
					if(tablero.getTurno()%2==0) { 
						btnButton2.setText("O");
						lblTurnoNombre.setText("Turno de: "+nombreJugador1);
					}else {
						btnButton2.setText("X");
						lblTurnoNombre.setText("Turno de: "+nombreJugador2);
					}
					
					
					UIMain.detectarGanador();
				}

			}
		});
		btnButton2.setBounds(193, 71, 54, 39);
		add(btnButton2);

		JButton btnButton3 = new JButton("");
		btnButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if(btnButton3.isEnabled()) {
					tablero.marcarTablero(3);
					
					lblNumeroTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));
					
					btnButton3.setEnabled(false);
					if(tablero.getTurno()%2==0) { 
						btnButton3.setText("O");
						lblTurnoNombre.setText("Turno de: "+nombreJugador1);
					}else {
						btnButton3.setText("X");
						lblTurnoNombre.setText("Turno de: "+nombreJugador2);
					}
					
					
					UIMain.detectarGanador();

				}

			}
		});
		btnButton3.setBounds(285, 71, 54, 39);
		add(btnButton3);

		JButton btnButton4 = new JButton("");
		btnButton4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if(btnButton4.isEnabled()) {
					
					tablero.marcarTablero(4);

					lblNumeroTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));
					
					btnButton4.setEnabled(false);
					if(tablero.getTurno()%2==0) { 
						btnButton4.setText("O");
						lblTurnoNombre.setText("Turno de: "+nombreJugador1);
					}else {
						btnButton4.setText("X");
						lblTurnoNombre.setText("Turno de: "+nombreJugador2);
					}
					
					
					UIMain.detectarGanador();
					
				}
	
			}
		});
		btnButton4.setBounds(103, 138, 54, 39);
		add(btnButton4);

		JButton btnButton5 = new JButton("");
		btnButton5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				
				if(btnButton5.isEnabled()) {
					
					tablero.marcarTablero(5);
					
					lblNumeroTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));

					btnButton5.setEnabled(false);
					if(tablero.getTurno()%2==0) { 
						btnButton5.setText("O");
						lblTurnoNombre.setText("Turno de: "+nombreJugador1);
					}else {
						btnButton5.setText("X");
						lblTurnoNombre.setText("Turno de: "+nombreJugador2);
					}
					
					UIMain.detectarGanador();
					
				}
				
			}
		});
		btnButton5.setBounds(193, 138, 54, 39);
		add(btnButton5);

		JButton btnButton6 = new JButton("");
		btnButton6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				
				if(btnButton6.isEnabled()) {
					
					tablero.marcarTablero(6);
					
					lblNumeroTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));

					btnButton6.setEnabled(false);
					if(tablero.getTurno()%2==0) { 
						btnButton6.setText("O");
						lblTurnoNombre.setText("Turno de: "+nombreJugador1);
					}else {
						btnButton6.setText("X");
						lblTurnoNombre.setText("Turno de: "+nombreJugador2);
					}
					
					
					UIMain.detectarGanador();
					
				}

			}
		});
		btnButton6.setBounds(285, 138, 54, 39);
		add(btnButton6);

		JButton btnButton7 = new JButton("");
		btnButton7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(btnButton7.isEnabled()) {
					
					tablero.marcarTablero(7);
					
					lblNumeroTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));
					
					btnButton7.setEnabled(false);
					if(tablero.getTurno()%2==0) { 
						btnButton7.setText("O");
						lblTurnoNombre.setText("Turno de: "+nombreJugador1);
					}else {
						btnButton7.setText("X");
						lblTurnoNombre.setText("Turno de: "+nombreJugador2);
					}
					
					UIMain.detectarGanador();
					
				}
			}
		});
		btnButton7.setBounds(103, 203, 54, 39);
		add(btnButton7);

		JButton btnButton8 = new JButton("");
		btnButton8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(btnButton8.isEnabled()) {
					tablero.marcarTablero(8);
					
					lblNumeroTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));
					
					btnButton8.setEnabled(false);
					if(tablero.getTurno()%2==0) { 
						btnButton8.setText("O");
						lblTurnoNombre.setText("Turno de: "+nombreJugador1);
					}else {
						btnButton8.setText("X");
						lblTurnoNombre.setText("Turno de: "+nombreJugador2);
					}
					
					UIMain.detectarGanador();
					
				}
				
			}
		});
		btnButton8.setBounds(193, 203, 54, 39);
		add(btnButton8);

		JButton btnButton9 = new JButton("");
		btnButton9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(btnButton9.isEnabled()) {
					
					tablero.marcarTablero(9);
					
					lblNumeroTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));
					
					btnButton9.setEnabled(false);
					if(tablero.getTurno()%2==0) { 
						btnButton9.setText("O");
						lblTurnoNombre.setText("Turno de: "+nombreJugador1);
					}else {
						btnButton9.setText("X");
						lblTurnoNombre.setText("Turno de: "+nombreJugador2);
					}
					
					
					UIMain.detectarGanador();
				}
					
			}
		});
		btnButton9.setBounds(285, 203, 54, 39);
		add(btnButton9);
		
		
	}
	
	public void setNombreDeJugadores(String nombre_1, String nombre_2) {
		lblTurnoNombre.setText("Turno de: "+nombre_1);
	
		this.nombreJugador1 = nombre_1;
		this.nombreJugador2 = nombre_2;
	}
	
	public int getGanador() {
		return tablero.ganador();
	}
}
