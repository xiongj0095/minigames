import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

import javax.swing.JPanel;

public class City extends JPanel implements ActionListener, KeyListener{
	
	private Frog frog;
	private Car car;
	private Timer timer;
	private int originalY;
	private int originalHeight;
	
	public City(int width, int length)
	{
		//Shape of Frog
		int xCoordRect = width/2;
		int widthRect = 50;
		int heightRect = 50;
		int yCoordRect = length-widthRect*2;

		//Shape of Car
		int xCoordCar = width/2-100;
		int widthCar = 75;
		int heightCar = 35;
		int yCoordCar = length-widthRect*2-100;
				

		
		this.setSize(width, length);
		frog = new Frog(xCoordRect, yCoordRect, widthRect, heightRect);
		
		//starting point of Frog and Roads
		originalY = this.frog.y;
		originalHeight = this.frog.height;
		
		car = new Car(xCoordCar, yCoordCar, widthCar, heightCar);
	
		//Timer
		timer = new Timer(40, this);
		this.addKeyListener(this);
		this.setFocusable(true);
		this.setFocusTraversalKeysEnabled(false);
		
		timer.start();
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
//		g.drawRect(xCoordRect, yCoordRect, widthRect, heightRect);
//		g.fillRect(xCoordRect, yCoordRect, widthRect, heightRect);
		Graphics2D g2 = (Graphics2D) g;

		//rows of roads
		for(int i=0; i <= 10; i++)
		{
			g2.drawRect(0, originalY/10*i, this.getWidth(), originalHeight);
		}
				
		g2.setColor(Color.GREEN);
		g2.fill(this.frog);
		
		g2.setColor(Color.BLUE);
		g2.fill(this.car);
		
		g.dispose();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			frog.moveUp();
		}

		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			frog.moveDown();
		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			frog.moveLeft();
		}
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			frog.moveRight();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.repaint();
	}
	
}
