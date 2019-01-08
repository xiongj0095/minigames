import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
	
		DrawPacMan pacMan = new DrawPacMan();
		
		JFrame frame = new JFrame();
		
		frame.add(pacMan);
		
		frame.setSize(800,800);
		
		frame.setVisible(true);
		
	}

}
