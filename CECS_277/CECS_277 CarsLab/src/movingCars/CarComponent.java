package movingCars;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class CarComponent extends JPanel {
	
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Car cr = new Car(0,0);
		cr.draw(g2);
	}

}
