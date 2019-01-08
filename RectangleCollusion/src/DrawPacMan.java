import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import javax.swing.Timer;

public class DrawPacMan extends JComponent implements ActionListener, KeyListener {

	private Timer t = new Timer(5,this);
	
	//pacMan coord
	private double x;
	private double y;
			
	private double velocityXDirection;
	private double velocityYDirection;
	
	private double heightOfPacMan;
	private double widthOfPacMan;
	
	private int xCoordOfRect;
	private int yCoordOfRect;

	private int heightOfRect;
	private int widthOfRect;

	private Ellipse2D.Double pacMan;
	private Rectangle rectangle;
	
	public DrawPacMan()
	{
		this.x = 0;
		this.y = 0;
		
		this.heightOfPacMan = 40;
		this.widthOfPacMan = 40;
		
		this.velocityXDirection = 0;
		this.velocityYDirection = 0;
		
		this.xCoordOfRect = 100;
		this.yCoordOfRect = 100;

		this.widthOfRect = 100;
		this.heightOfRect = 100;

		this.t.start();
		
		this.addKeyListener(this);
		
		this.setFocusable(true);
		
		this.setFocusTraversalKeysEnabled(false);
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D ga = (Graphics2D)g;
		
		ga.setColor(Color.yellow);
		
		this.pacMan = new Ellipse2D.Double(this.x, this.y,this.widthOfPacMan,this.heightOfPacMan);
		
		ga.fill(this.pacMan);
		
		this.rectangle = new Rectangle(this.xCoordOfRect, this.yCoordOfRect, this.widthOfRect, this.heightOfRect);
		
		ga.setColor(Color.blue);
		
		ga.draw(this.rectangle);
		
		collision();

	}

	public void keyPressed(KeyEvent e) {
		
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_UP) {
			up();
		}
		if(code == KeyEvent.VK_DOWN) {
			down();
		}
		if(code == KeyEvent.VK_RIGHT) {
			right();
		}
		if(code == KeyEvent.VK_LEFT) {
			left();
		}
	}

	public void keyReleased(KeyEvent arg0) {
	}

	
	public void keyTyped(KeyEvent arg0) {
	}

	public void actionPerformed(ActionEvent arg0) {
		
		repaint();
		
		x+= velocityXDirection;	
		y+= velocityYDirection;
	}
	
	public void collision()
	{
		if(this.pacMan.intersects(this.rectangle))
		{
			System.out.println("PACMAN PENTRATED RECTANGLE");
		}
	}
	public void up() {
		velocityYDirection = -1.5;
		
		velocityXDirection = 0;
	}
	
	public void down() {
		velocityYDirection = 1.5;
		
		velocityXDirection = 0;
	}
	
	public void left() {
		velocityXDirection = -1.5;
		
		velocityYDirection = 0;
	}
	
	public void right() {
		velocityXDirection = 1.5;
		
		velocityYDirection = 0;
	}
	
	
}
