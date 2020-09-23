package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import codigoBusiness.Tablero;

public class JPanelTablero extends JPanel {
	
	private Tablero tablero;
	
	public JPanelTablero() {
		setLayout(null);
		
		//Se crea el tablero
		this.tablero=new Tablero();
		
		//Contador de turnos
		JLabel lblTurnos = new JLabel("Turnos: 0");
		lblTurnos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTurnos.setBounds(10, 11, 83, 20);
		add(lblTurnos);
		
		//Botones que componen el tablero
		JButton btnButton1 = new JButton("");
		btnButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				if(btnButton1.isEnabled()) { //Forma de controlar el boton para que solo se presione 1 vez.
					
					tablero.marcarTablero(1);

					lblTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno())); //Se actualiza el contador de turnos
					
					btnButton1.setEnabled(false);
					
					if(tablero.getTurno()%2==0) { //Dependiendo del turno se va a marcar con una "O" o "X"
						btnButton1.setText("O");
					}else {
						btnButton1.setText("X");
					}	
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

					lblTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));
					
					btnButton2.setEnabled(false);
					if(tablero.getTurno()%2==0) {
						btnButton2.setText("O");
					}else {
						btnButton2.setText("X");
					}
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
					
					lblTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));
					
					btnButton3.setEnabled(false);
					if(tablero.getTurno()%2==0) {
						btnButton3.setText("O");
					}else {
						btnButton3.setText("X");
					}

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

					lblTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));
					
					btnButton4.setEnabled(false);
					if(tablero.getTurno()%2==0) {
						btnButton4.setText("O");
					}else {
						btnButton4.setText("X");
					}
					
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
					
					lblTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));

					btnButton5.setEnabled(false);
					if(tablero.getTurno()%2==0) {
						btnButton5.setText("O");
					}else {
						btnButton5.setText("X");
					}
					
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
					
					lblTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));

					btnButton6.setEnabled(false);
					if(tablero.getTurno()%2==0) {
						btnButton6.setText("O");
					}else {
						btnButton6.setText("X");
					}
					
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
					
					lblTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));
					
					btnButton7.setEnabled(false);
					if(tablero.getTurno()%2==0) {
						btnButton7.setText("O");
					}else {
						btnButton7.setText("X");
					}	
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
					
					lblTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));
					
					btnButton8.setEnabled(false);
					if(tablero.getTurno()%2==0) {
						btnButton8.setText("O");
					}else {
						btnButton8.setText("X");
					}
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
					
					lblTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));
					
					btnButton9.setEnabled(false);
					if(tablero.getTurno()%2==0) {
						btnButton9.setText("O");
					}else {
						btnButton9.setText("X");
					}
					
					
				}
					
			}
		});
		btnButton9.setBounds(285, 203, 54, 39);
		add(btnButton9);
		
	}
	
	

}
