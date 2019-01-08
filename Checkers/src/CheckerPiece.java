import java.applet.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;

public class CheckerPiece extends JPanel
{
	
	public void circle(Graphics g, int width, int height)
	{
		int x = 50;
		int y = 50;
		//int width = 500;
		//int height = 500;
		
		g.fillOval(x, y, width, height);
		g.setColor(Color.BLUE);
		g.drawOval(x, y, width, height);

	}
	
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        circle(g, 50, 50);
    }

	
}