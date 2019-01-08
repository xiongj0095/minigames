import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball {

	public final static int WIDTH = 20;
	public final static int HEIGHT = 20;
	private int xCoord;
	private int yCoord;
	private int xVelocity;
	private int yVelocity;
	
	public Ball(int xCoord, int yCoord)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.xVelocity = 1;
		this.yVelocity = 1;
	}
	
	public void paintComponent(Graphics g)
	{
		g.fillOval(xCoord, yCoord, WIDTH, HEIGHT);
	}
	
	public void movement()
	{
		this.xCoord = xCoord + xVelocity;
		this.yCoord = yCoord + yVelocity;
	}
	
	public void setXCoord(int xCoord)
	{
		this.xCoord = xCoord;
	}
	
	public void reverseXVelocity()
	{
		this.xVelocity = xVelocity * -1;
	}
	
	public void reverseYVelocity()
	{
		this.yVelocity = yVelocity * -1;
	}
	
	public void resetBall(int xCoord, int yCoord)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	public Rectangle getBounds()
	{
		return new Rectangle(xCoord, yCoord, WIDTH, HEIGHT);
	}
	
	public int getXCoord()
	{
		return this.xCoord;
	}
	
	public int getYCoord()
	{
		return this.yCoord;
	}
}
