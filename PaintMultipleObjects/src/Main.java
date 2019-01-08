import javax.swing.JFrame;

public class Main {

	
	public static void main(String arg[])
	{
		JFrame frame = new JFrame();
		frame.setSize(200, 200);

		Shape shapes = new Shape();
		frame.add(shapes);
		

		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
	}
}
