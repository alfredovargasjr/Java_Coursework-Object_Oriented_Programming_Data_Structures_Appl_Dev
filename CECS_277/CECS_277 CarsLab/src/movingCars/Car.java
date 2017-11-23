package movingCars;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JFrame;
 
public class Car {
    private int xLeft, yTop;
     
    /**
     * Constructs a car with a given top left corner 
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     */
    public Car(int x, int y) {
        xLeft = x;
        yTop = y;
    }
     
    /**
     * Draws the car
     * @param g2 the graphics component 
     */
    public void draw(Graphics2D g2) {
    	g2.drawRect(xLeft, yTop, 50, 30);
    	g2.setColor(Color.ORANGE);
    	g2.fillRect(xLeft, yTop, 50, 30);
    	g2.setColor(Color.ORANGE);
    }
}
