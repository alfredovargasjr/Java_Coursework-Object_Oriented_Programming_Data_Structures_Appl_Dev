package movingCars;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Rectangle;

public class movingCars extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movingCars frame = new movingCars();
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
	public movingCars() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 400);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//contentPane.setOpaque(true);
		contentPane.setVisible(true);
		contentPane.setBackground(Color.green);
		contentPane.setLayout(null);
		
		JLabel road = new JLabel();
		road.setBounds(0, 30, 600, 300);
		road.setBorder(new LineBorder(new Color(0, 0, 0)));
		road.setEnabled(false);
		road.setOpaque(true);
		road.setBackground(Color.DARK_GRAY);
		JLabel stripes = new JLabel();
		stripes.setBounds(0, 130, 600, 30);
		stripes.setOpaque(true);
		stripes.setBackground(Color.yellow);
		road.add(stripes);
		
		//car 1
		JLabel car = new JLabel();
		car.setBounds(0, 5, 120, 50);
		car.setOpaque(true);
		car.setBackground(Color.decode("#00ffff"));
		road.add(car);
		
		//car 2
		JLabel car2 = new JLabel();
		car2.setBounds(0, 250, 120, 50);
		car2.setOpaque(true);
		car2.setBackground(Color.decode("#0948b48"));
		road.add(car2);
		
		contentPane.add(road);
		
		/**
		 * run thread for the first car
		 * keeps moving if within the range of the bounds of the road
		 */
		new Thread(new Runnable() {
			@Override
			public void run() {
				int direction = 1;
				while(car.getX() <= road.getWidth() - car.getWidth() && car.getX() >= 0){
					if(car.getX() == road.getWidth() - car.getWidth()){
						direction = -1;
						car.setBounds(car.getX(), 165, car.getWidth(), car.getHeight());
					}
					if(car.getX() == 0){
						direction = 1;
						car.setBounds(car.getX(), 5, car.getWidth(), car.getHeight());
					}
					car.setBounds(car.getX() + (1 * direction), car.getY(), car.getWidth(), car.getHeight());
					try {
						Thread.currentThread().sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		/**
		 * run thread for car 2
		 * car 2 starts off next to car one
		 * keeps monving until hits a bound then returns
		 */
		new Thread(new Runnable() {
			@Override
			public void run() {
				int direction = 1;
				while(car2.getX() <= road.getWidth() - car2.getWidth() && car2.getX() >= 0){
					if(car2.getX() == road.getWidth() - car2.getWidth()){
						direction = -1;
						car2.setBounds(car2.getX(), 230, car2.getWidth(), car2.getHeight());
					}
					if(car2.getX() == 0){
						direction = 1;
						car2.setBounds(car2.getX(), 70, car2.getWidth(), car2.getHeight());
					}
					car2.setBounds(car2.getX() + (1 * direction), car2.getY(), car2.getWidth(), car2.getHeight());
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
