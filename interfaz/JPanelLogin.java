package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;

public class JPanelLogin extends JPanel {

	/**
	 * Create the panel.
	 */
	private JButton btnJugar;
	 
	private JTextField textNombreJugador1;
	private JTextField textNombreJugador2;
	
	private Image imagenJugador_1;
	private Image imagenJugador_2;
	
	public JPanelLogin() {
		setLayout(null);
		
		//Labels para pedir los nombres de los jugadores
		JLabel lblNombreJugador1 = new JLabel("Nombre del jugador 1:");
		lblNombreJugador1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreJugador1.setBounds(10, 29, 164, 44);
		add(lblNombreJugador1);

		JLabel lblNombreJugador2 = new JLabel("Nombre del jugador 2:");
		lblNombreJugador2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreJugador2.setBounds(10, 78, 164, 49);
		add(lblNombreJugador2);

		//Nombre de jugadores 
		this.textNombreJugador1 = new JTextField();
		textNombreJugador1.setBounds(173, 38, 114, 30);
		add(textNombreJugador1);
		textNombreJugador1.setColumns(10);

		this.textNombreJugador2 = new JTextField();
		textNombreJugador2.setBounds(173, 89, 114, 30);
		add(textNombreJugador2);
		textNombreJugador2.setColumns(10);

		//Boton que acciona el cambio de panel
		this.btnJugar = new JButton("Jugar!");
		btnJugar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnJugar.setBounds(149, 198, 152, 63);
		
		btnJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//Si los nombres estan vacios se le va a pedir que ingrese los nombres
				if(textNombreJugador1.getText().equals(" ")||textNombreJugador2.getText().equals("")) { 
					JOptionPane.showMessageDialog(null, "Se debe ingresar los nombres de los jugadores"); 
				}else {
					UIMain.cambiarATablero();
				}
			}
		});
		
		add(btnJugar);
		
		//CheckBox que verifican cuando esta subida la imagen de los jugadores
		JCheckBox checkBox_Foto1 = new JCheckBox("");
		checkBox_Foto1.setBounds(429, 40, 21, 23);
		checkBox_Foto1.setEnabled(false);
		add(checkBox_Foto1);
		
		JCheckBox checkBox_Foto2 = new JCheckBox("");
		checkBox_Foto2.setBounds(429, 91, 21, 23);
		checkBox_Foto2.setEnabled(false);
		add(checkBox_Foto2);
		
		//Botones que accionan la funcion para subir las imagenes al programa
		JButton btnFotoJugador_1 = new JButton("Foto Jugador 1");
		btnFotoJugador_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				imagenJugador_1=capturarImagen(btnFotoJugador_1,checkBox_Foto1);
				
			}
		});
		btnFotoJugador_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnFotoJugador_1.setBounds(310, 38, 114, 30);
		add(btnFotoJugador_1);
		
		JButton btnFotoJugador_2 = new JButton("Foto Jugador 2");
		btnFotoJugador_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				imagenJugador_2=capturarImagen(btnFotoJugador_2,checkBox_Foto2);
				
			}
		});
		btnFotoJugador_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnFotoJugador_2.setBounds(310, 89, 114, 30);
		add(btnFotoJugador_2);
		
		
	}
	
	//En la funcion capturarImagen se le pasa un checkbox para poder marcarlo y un boton para que el file chooser pueda mostrar el cuadro de dialogo
	private Image capturarImagen(JButton boton, JCheckBox checkBox) {
		Image imagenCapturada=null;
		JFileChooser fc = new JFileChooser();
		fc.setDialogTitle("Seleccionar foto");
	
		if(fc.showOpenDialog(boton) == JFileChooser.APPROVE_OPTION) {
			
			File archivo = new File(fc.getSelectedFile().toString());
			
			imagenCapturada = new ImageIcon(archivo.getPath()).getImage();
			
			checkBox.setSelected(true);
			
		}
		return imagenCapturada;
		
	}
	
	
	//Gets
	public Image getImagenJugador1() {
		return imagenJugador_1;
	}
	public Image getImagenJugador2() {
		return imagenJugador_2;
	}
	
	public String getNombreJugador1() {
		return textNombreJugador1.getText();
	}
	public String getNombreJugador2() {
		return textNombreJugador2.getText();
	}
}
