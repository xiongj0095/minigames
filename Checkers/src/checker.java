import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.*;

public class checker
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(800,800);
		frame.setTitle("Checkers");
		
		CheckerBoard checkerboard = new CheckerBoard();
		CheckerPiece cp = new CheckerPiece();

		checkerboard.isBackgroundSet();
		frame.add(cp);

		//frame.add(checkerboard);

		frame.setVisible(true);
		
		
	}
	
	
}