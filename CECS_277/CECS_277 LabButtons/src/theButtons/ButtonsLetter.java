package theButtons;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ButtonsLetter extends JFrame {

	private JPanel contentPane;
	private JTextField txtButtonXWas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonsLetter frame = new ButtonsLetter();
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
	public ButtonsLetter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtButtonXWas = new JTextField();
		txtButtonXWas.setEditable(false);
		txtButtonXWas.setHorizontalAlignment(SwingConstants.CENTER);
		txtButtonXWas.setText("Button x Was Clicked!!");
		txtButtonXWas.setBounds(129, 26, 169, 78);
		contentPane.add(txtButtonXWas);
		txtButtonXWas.setColumns(10);
		
		JButton btnNewButton = new JButton("A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtButtonXWas.setText("Button A Was Clicked!!");
			}
		});
		btnNewButton.setBounds(86, 138, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("B");
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				txtButtonXWas.setText("Button B Was Clicked!!");
			}
		});
		btnNewButton_1.setBounds(262, 138, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
