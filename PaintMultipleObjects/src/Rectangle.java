import java.awt.*;
import javax.swing.JComponent;

public class Rectangle extends JComponent{

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		g.drawRect(10, 10, 100, 100);
	}
	
	
}
