package Car;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;

public class Moving{
	
	public static void main(String[] args){
	
	JFrame frame = new JFrame();
	frame.setSize(500, 300);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	CarComponent car = new CarComponent();
	CarComponent car2 = new CarComponent();
	//car2.getGraphics().setColor(Color.GREEN);
	car.setCoordinate(30,  80);
	frame.add(car);
	
	}
}
