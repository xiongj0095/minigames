import java.awt.Graphics;
import java.awt.Rectangle;

public class Racket 
{

	private static final int WIDTH = 20;
	public static final int HEIGHT = 40;
	
	private int xCoord;
	private int yCoord;
	private int yVelocity;
	
	public Racket(int xCoord, int yCoord)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.yVelocity = 3;
	}
	
	public void paintComponent(Graphics g)
	{
		g.fillRect(xCoord, yCoord, WIDTH, HEIGHT);
		
	}
	
	public Rectangle getBounds()
	{
		return new Rectangle(xCoord, yCoord, WIDTH, HEIGHT);
	}
	
	public void up()
	{
		this.yCoord = yCoord - yVelocity;
	}
	
	public void down()
	{
		this.yCoord = yCoord + yVelocity;
	}
	
	public int getYCoord()
	{
		return this.yCoord;
	}
}
