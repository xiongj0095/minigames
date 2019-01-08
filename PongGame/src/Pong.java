import javax.swing.JFrame;

public class Pong
{
	private static final int WIDTH = 700;
	private static final int HEIGHT = 450;
	public static void main(String[] args) 
	{
		JFrame window = new JFrame();
		
		window.setSize(WIDTH,HEIGHT);
		window.setTitle("PONG");
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PongGameLogic game = new PongGameLogic(WIDTH,HEIGHT);
		window.add(game);
		window.setVisible(true);

		
		
		
	}

}
