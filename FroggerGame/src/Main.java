import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run()
			{
				int width = 900;
				int length = 600;
				City city = new City(width, length);
				
				JFrame frame = new JFrame();
				frame.setSize(width, length);
				frame.add(city);
				frame.setResizable(false);
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
				
			}
		});
	}

}
