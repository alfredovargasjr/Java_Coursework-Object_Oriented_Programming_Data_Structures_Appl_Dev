package ShapeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class ShapeComponent extends JComponent {
private int x, y;
	
	public ShapeComponent(int x, int y){
		this.x = x;
		this.y = y;
	}
	public ShapeComponent(){
		x = 0;
		y = 0;
	}
	
	public void setCoordinate(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void paintComponent(Graphics g){
		Graphics2D gg = (Graphics2D) g;
		gg.setColor(Color.red);
		gg.fillRect(50, 50, 50, 20);
	}

}
