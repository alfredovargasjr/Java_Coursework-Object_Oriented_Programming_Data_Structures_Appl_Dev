package ShapeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class triangle extends JComponent{
	private int x, y;
	private int width, height;
	
	public triangle(){
		x = 0;
		y = 0;
		width = 50;
		height = 50;
	}
	public triangle(int a, int b){
		x = a;
		y = b;
	}
	public void setLocation(int a, int b){
		x = a;
		y = b;
	}
	public void paintComponent(Graphics g){
		Graphics2D triangle = (Graphics2D) g;
		triangle.setColor(Color.YELLOW);
		triangle.setPaint(Color.yellow);
		int[] xPoints = {0 + x,25 + x,50 + x};
		int[] yPoints = {50 + y,0 + y,50 + y};
		triangle.fillPolygon(xPoints, yPoints, 3);
	}
}
