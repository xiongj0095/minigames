import java.awt.Graphics;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class PongGameLogic extends JPanel implements ActionListener, KeyListener
{

	private Racket player1;
	private Racket player2;
	private Ball ball;
	private Timer timer;
	private boolean playerOneUpPress;
	private boolean playerOneDownPress;
	private boolean playerTwoUpPress;
	private boolean playerTwoDownPress;

	public PongGameLogic(int width, int height)
	{
		player1 = new Racket(10,(height/2-Racket.HEIGHT));
		player2 = new Racket(width-35,(height/2-Racket.HEIGHT));
		ball = new Ball(width/2, height/2-Ball.HEIGHT);
		timer = new Timer(1000/120, this);
		addKeyListener(this);
		setFocusable(true);
		timer.start();
		ballMovement();

	}
	
	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			playerOneUpPress = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			playerOneDownPress = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_W)
		{
			playerTwoUpPress = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_S)
		{
			playerTwoDownPress = true;
		}
	}
	
	public void playerOneMovement()
	{
		if(playerOneUpPress == true)
		{
			player1.up();
			if(player1.getYCoord() <= 0)
			{
				player1.down();
			}
		}
		if(playerOneDownPress == true)
		{
			player1.down();
			if(player1.getYCoord() + Racket.HEIGHT >= getHeight())
			{
				player1.up();
			}
		}
		
	}
	
	public void playerTwoMovement()
	{
		if(playerTwoUpPress == true)
		{
			player2.up();
			if(player2.getYCoord() <= 0)
			{
				player2.down();
			}
		} 
		if( playerTwoDownPress == true)
		{
			player2.down();
			if(player2.getYCoord() + player2.HEIGHT >= getHeight())
			{
				player2.up();
			}
		}
	}
	
	public void ballMovement()
	{
		ball.movement(); 
	}

	public void bounceBallBackFromEdge()
	{
		if(ball.getYCoord() + ball.HEIGHT == this.getHeight())
		{
			ball.reverseYVelocity(); 
		}
		
		if(ball.getYCoord() == 0)
		{
			ball.reverseYVelocity(); 
		}
	}
	
	public void bounceBallBackFromRacket()
	{
		if(player1.getBounds().intersects(ball.getBounds()))
		{
			ball.setXCoord(player1.getBounds().x + ball.WIDTH); 
			ball.reverseXVelocity();
		}
		
		if(player2.getBounds().intersects(ball.getBounds()))
		{
			ball.setXCoord(player2.getBounds().x - ball.WIDTH ); 			
			ball.reverseXVelocity();
		}
	}
	
	public void ballOutOfBounds()
	{
		if(ball.getBounds().x > this.getWidth())
		{
			ball.resetBall(this.getWidth()/2, this.getHeight()/2-Ball.HEIGHT);
		}
		
		if(ball.getBounds().x < 0)
		{
			ball.resetBall(this.getWidth()/2, this.getHeight()/2-Ball.HEIGHT);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			playerOneUpPress = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			playerOneDownPress = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_W)
		{
			playerTwoUpPress = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_S)
		{
			playerTwoDownPress = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		playerOneMovement();
		playerTwoMovement();
		ballMovement();
		bounceBallBackFromEdge();
		bounceBallBackFromRacket();
		ballOutOfBounds();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		player1.paintComponent(g);
		player2.paintComponent(g);
		ball.paintComponent(g);
	}

}
