package theButtons;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ButtonsClicks extends JFrame {

	private JPanel contentPane;
	private JTextField txtThisHasBeen;
	private JTextField txtThisHasBeen_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonsClicks frame = new ButtonsClicks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ButtonsClicks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtThisHasBeen = new JTextField();
		txtThisHasBeen.setHorizontalAlignment(SwingConstants.CENTER);
		txtThisHasBeen.setText("Button Clicked 0 Times!!");
		txtThisHasBeen.setBounds(28, 33, 176, 56);
		contentPane.add(txtThisHasBeen);
		txtThisHasBeen.setColumns(10);
		
		txtThisHasBeen_1 = new JTextField();
		txtThisHasBeen_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtThisHasBeen_1.setText("Button Clicked 0 Times!!");
		txtThisHasBeen_1.setBounds(226, 33, 176, 56);
		contentPane.add(txtThisHasBeen_1);
		txtThisHasBeen_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Button 1");
		btnNewButton.setBounds(66, 128, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			private int clicks = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				clicks++;
				txtThisHasBeen.setText("Button Clicked " + clicks + " Times!!");
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Button 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			private int clicks = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				clicks++;
				txtThisHasBeen_1.setText("Button Clicked " + clicks + " Times!!");
			}	
		}
		);
		btnNewButton_1.setBounds(276, 128, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
