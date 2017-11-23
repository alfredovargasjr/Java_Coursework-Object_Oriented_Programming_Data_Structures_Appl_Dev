package ShapeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class square extends JComponent {
	private int x;
	private int y;
	private int w, h;
	
	public square(){
		x = 0;
		y = 0;
		w = 50;
		h = 50;
	}
	
	public void setLocation(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void paintComponent(Graphics g){
		Graphics2D square = (Graphics2D) g;
		square.setColor(Color.blue);
		square.fillRect(x, y, w, h);
	}

}
