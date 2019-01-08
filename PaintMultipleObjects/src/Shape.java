import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Shape extends JComponent{
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Rectangle rectangle = new Rectangle();
		rectangle.paintComponent(g);
		
		Circle circle = new Circle();
		circle.paintComponent(g);
	}

}
