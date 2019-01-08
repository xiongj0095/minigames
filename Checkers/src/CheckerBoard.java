import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class CheckerBoard extends Applet 
{	
	public static int rows = 8;
	public static int columns = 8;
	public static Color col1 = Color.BLACK;
	public static Color col2 = Color.RED;
	
	public CheckerBoard()
	{
		init();
	}
	
	public void init()
	{
		setLayout(new GridLayout(rows, columns));
		Color temp;
		
		for(int i =0; i < rows; i++)
		{
			if(i %2 ==0)
			{
				temp = col1;
			}
			else
			{
				temp = col2;
			}
			for(int j=0; j<columns; j++)
			{
				JPanel panel = new JPanel();
				panel.setBackground(temp);
				if(temp.equals(col1))
				{
					temp = col2;
				}
				else
				{
					temp = col1;
				}
				add(panel);
			}
		}
		
	}
	
}