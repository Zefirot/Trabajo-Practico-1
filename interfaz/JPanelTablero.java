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
	private JLabel lblNumeroTurnos;
	 
	public JPanelTablero() {
		setLayout(null);
		
		//Se crea el tablero
		this.tablero=new Tablero();
		
		//Contador de turnos
		lblNumeroTurnos = new JLabel("Turnos: 0");
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
					
					marcarTablero(btnButton1, 1);
					
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
					
					marcarTablero(btnButton2, 2);
					
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
						
					marcarTablero(btnButton3, 3);

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
					
					marcarTablero(btnButton4, 4);
					
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
					
					marcarTablero(btnButton5, 5);
					
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
					
					marcarTablero(btnButton6, 6);
					
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
					
					
					marcarTablero(btnButton7, 7);
					
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
					
					marcarTablero(btnButton8, 8);
					
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
					
					marcarTablero(btnButton9, 9);
					
				}
					
			}
		});
		btnButton9.setBounds(285, 203, 54, 39);
		add(btnButton9);
		
		
	}
	
	/*La funcion marcarTablero realiza casi todo el funcionamiento del juego como tal, marca el tablero, muestra de quien es el turno,
	 * coloca el boton que se presiono en false, refresca el numero de turnos y pide que UIMain realizar el cambio de panel cuando hay un ganador.
	*/
	private void marcarTablero(JButton boton, int posicion) {
		
		tablero.marcarTablero(posicion);
		
		lblNumeroTurnos.setText("Turnos: "+String.valueOf(tablero.getTurno()));
		
		boton.setEnabled(false);
		
		if(tablero.getTurno()%2==0) { 
			boton.setText("O");
			lblTurnoNombre.setText("Turno de: "+nombreJugador1);
		}else {
			boton.setText("X");
			lblTurnoNombre.setText("Turno de: "+nombreJugador2);
		}
		
		UIMain.detectarGanador();
		
	}
	
	//Esta funcion obtiene los nombres de los jugadores para poder mostrarlos en pantalla
	public void setNombreDeJugadores(String nombre_1, String nombre_2) {
		lblTurnoNombre.setText("Turno de: "+nombre_1);
	
		this.nombreJugador1 = nombre_1;
		this.nombreJugador2 = nombre_2;
	}
	
	/*La funcion tablero.ganador() simplemente retorna si hay un ganador o no, mediante numeros que van del 0(No hay ganador),
	 * 1(Ganador jugador 1) y 2(Ganador jugador 2).
	*/
	public int getGanador() {
		return tablero.ganador();
	}
}
