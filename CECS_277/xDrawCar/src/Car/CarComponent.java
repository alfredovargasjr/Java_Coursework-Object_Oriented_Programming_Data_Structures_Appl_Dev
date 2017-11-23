package Car;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class CarComponent extends JComponent {
	
	private int x, y;
	
	public CarComponent(int x, int y){
		this.x = x;
		this.y = y;
	}
	public CarComponent(){
		x = 0;
		y = 0;
	}
	
	public void setCoordinate(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void paintComponent(Graphics g){
		System.out.println("in here");
		Graphics2D g2 = (Graphics2D) g;
		Car cr = new Car(x,y);
		cr.draw(g2);
	}

}
