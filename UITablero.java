package trabajo;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UITablero {
	private Tablero tablero;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UITablero window = new UITablero();
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
	public UITablero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Creo el tablero
		this.tablero=new Tablero();
		
		JButton btnButton1 = new JButton("");
		btnButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				btnButton1.setEnabled(false);
				if(tablero.getTurno()%2!=0) {
					btnButton1.setText("O");
				}else {
					btnButton1.setText("X");
				}
				
				tablero.marcarTablero(1);
				
			}
		});
		btnButton1.setBounds(229, 138, 54, 39);
		frame.getContentPane().add(btnButton1);
		
		JButton btnButton2 = new JButton("");
		btnButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnButton2.setBounds(319, 138, 54, 39);
		frame.getContentPane().add(btnButton2);
		
		JButton btnButton3 = new JButton("");
		btnButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnButton3.setBounds(411, 138, 54, 39);
		frame.getContentPane().add(btnButton3);
		
		JButton btnButton4 = new JButton("");
		btnButton4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnButton4.setBounds(229, 205, 54, 39);
		frame.getContentPane().add(btnButton4);
		
		JButton btnButton5 = new JButton("");
		btnButton5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnButton5.setBounds(319, 205, 54, 39);
		frame.getContentPane().add(btnButton5);
		
		JButton btnButton6 = new JButton("");
		btnButton6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnButton6.setBounds(411, 205, 54, 39);
		frame.getContentPane().add(btnButton6);
		
		JButton btnButton7 = new JButton("");
		btnButton7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnButton7.setBounds(229, 270, 54, 39);
		frame.getContentPane().add(btnButton7);
		
		JButton btnButton8 = new JButton("");
		btnButton8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnButton8.setBounds(319, 270, 54, 39);
		frame.getContentPane().add(btnButton8);
		
		JButton btnButton9 = new JButton("");
		btnButton9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnButton9.setBounds(411, 270, 54, 39);
		frame.getContentPane().add(btnButton9);
	}

}
