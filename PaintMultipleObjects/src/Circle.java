import javax.swing.JComponent;
import java.awt.*;

public class Circle extends JComponent{
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawOval(10, 10, 100, 100);
		g.setColor(Color.blue);
	}

}
