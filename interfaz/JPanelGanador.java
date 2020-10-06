package interfaz;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class JPanelGanador extends JPanel {

	
	private JLabel lblNombreGanador;
	private Image imagenGanador;
	private JLabel lblFotoGanador;
	
	public JPanelGanador() {
		setLayout(null);
			
		this.lblNombreGanador = new JLabel("Felicidades: ");
		lblNombreGanador.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombreGanador.setBounds(131, 213, 207, 38);
		add(lblNombreGanador);
		
		this.lblFotoGanador = new JLabel("");
		lblFotoGanador.setBounds(103, 34, 250, 151);
		add(lblFotoGanador);

		this.imagenGanador = new ImageIcon(getClass().getResource("../imagenes/imagen_JugadorX.jpg")).getImage();	
		imagenGanador = imagenGanador.getScaledInstance(lblFotoGanador.getWidth(), lblFotoGanador.getHeight(), java.awt.Image.SCALE_SMOOTH);
		
	}
	
	public void setNombreGanador(String ganador) {
		lblNombreGanador.setText(lblNombreGanador.getText()+ganador+" ganaste!");
	}
	public void setImagenGanador(Image imagen) {
		if(imagen==null) {
			lblFotoGanador.setIcon(new ImageIcon(imagenGanador));
		}else {
			imagenGanador = imagen.getScaledInstance(lblFotoGanador.getWidth(), lblFotoGanador.getHeight(), java.awt.Image.SCALE_SMOOTH);
			
			lblFotoGanador.setIcon(new ImageIcon(imagenGanador));
		}
		
	}
	
}
