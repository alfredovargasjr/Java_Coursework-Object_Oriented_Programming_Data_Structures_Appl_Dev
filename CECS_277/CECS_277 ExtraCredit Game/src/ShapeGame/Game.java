package ShapeGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

public class Game extends JFrame {
	public Game() {
		startMenu();
	}

	static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		startMenu();
		
	}	
	public static void startMenu(){
		frame = new JFrame();
		frame.getContentPane().setSize(new Dimension(400, 400));
		frame.getContentPane().setBounds(new Rectangle(0, 0, 400, 400));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setVisible(true);
		playGame();
//		JPanel start = new JPanel();
//		start.setBounds(0, 0, 400, 400);
//		start.setLayout(null);
//		start.setBackground(Color.CYAN);
//		
//		frame.getContentPane().add(start);
//		
//		JLabel gameTitle = new JLabel("Shape Game");
//		gameTitle.setBounds(139, 46, 107, 40);
//		start.add(gameTitle);
//		JButton btnStart = new JButton("Start");
//		btnStart.setBounds(137, 104, 89, 23);
//		start.add(btnStart);
//		rectangle r = new rectangle();
//		btnStart.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				start.setVisible(false);
//				playGame();
//			}
//			
//		});
//		
	}
	
	public static void playGame(){
		rectangle r = new rectangle();
		r.setSize(100, 100);
		rectangle r2 = new rectangle();
		r2.setLocation(90, 50);
		r2.setSize(50, 10);
		square s = new square();
		s.setLocation(20, 30);
		s.setSize(100, 100);
		triangle c = new triangle();
		c.setLocation(40, 20);
		c.setSize(99, 96);
		frame.getContentPane().add(c);
//		frame.getContentPane().add(r);
//		frame.getContentPane().add(s);
//		frame.getContentPane().add(r2);
	}
}
