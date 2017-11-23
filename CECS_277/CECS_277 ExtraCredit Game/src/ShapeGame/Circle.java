package ShapeGame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Circle {
	private int xLeft;
	private int yTop;
	
	public Circle(){
		this.xLeft = 0;
		this.yTop = 0;
	}
	public Circle(int x, int y){
		this.xLeft = x;
		this.yTop = y;
	}
	 public void draw(Graphics2D g2) {
	       Ellipse2D.Double body = new Ellipse2D.Double(xLeft,yTop, 20, 20);
	        g2.fillOval(xLeft, yTop, (int)body.getWidth(), (int)body.getHeight());
	        g2.setPaint(Color.green);
	        g2.draw(body);
	    }

}
