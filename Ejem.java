package trabajo;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejem extends JPanel {

	/**
	 * Create the panel.
	 */
	public Ejem() {
		setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 11, 430, 278);
		add(layeredPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 430, 278);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hola");
		lblNewLabel.setBounds(137, 51, 46, 14);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 430, 278);
		layeredPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel1 = new JLabel("Adios");
		lblNewLabel.setBounds(137, 51, 46, 14);
		panel_1.add(lblNewLabel1);
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				
			}
		});
		btnNewButton.setBounds(0, 0, 89, 23);
		panel.add(btnNewButton);
		
		
		
	}
}
