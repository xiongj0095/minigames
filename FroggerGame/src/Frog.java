import java.awt.Rectangle;

public class Frog extends Rectangle{

	private int width;
	
	
	public Frog(int xPosition, int yPosition, int width, int height)
	{
		this.width = width;
		this.setBounds(xPosition, yPosition, width, height);
	}
	
	public void moveUp()
	{
		this.y = this.y - width ;
	}
	
	public void moveDown()
	{
		this.y = this.y  + width;
	}
	
	public void moveLeft()
	{
		this.x = this.x - width;
	}
	
	public void moveRight()
	{
		this.x = this.x + width;
	}
	

}
