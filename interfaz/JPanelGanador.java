package interfaz;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class JPanelGanador extends JPanel {

	
	private JLabel lblNombreGanador;
	
	public JPanelGanador() {
		setLayout(null);
		
		this.lblNombreGanador = new JLabel("Felicidades: ");
		lblNombreGanador.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombreGanador.setBounds(151, 211, 207, 38);
		add(lblNombreGanador);

		
	}
	
	public void setNombreGanador(String ganador) {
		lblNombreGanador.setText(lblNombreGanador.getText()+ganador+" ganaste!");
	}
	
}
