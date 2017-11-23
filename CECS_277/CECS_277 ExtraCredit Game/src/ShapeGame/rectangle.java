package ShapeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class rectangle extends JComponent{
	private int x;
	private int y;
	private int w, h;
	
	public rectangle(){
		x = 0;
		y = 0;
		w = 50;
		h = 20;
	}
	
	public void setLocation(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void paintComponent(Graphics g){
		Graphics2D gg = (Graphics2D) g;
		gg.setColor(Color.red);
		gg.fillRect(x, y, w, h);
	}

}
