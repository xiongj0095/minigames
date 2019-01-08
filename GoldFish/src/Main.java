import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				Deck deck = new Deck();
				TableGUI ui = new TableGUI();
				
				//Card card = new Card(100, 100, 150, 200, "1", "heart", "red", "CardImages/card2.png");
				JFrame frame = new JFrame();
				frame.setTitle("GOLDFISH CARD GAME!");
				frame.setSize(800,500);
				frame.setLocation(200, 200);
				frame.setVisible(true);
				
//				GridLayout gLayout = new GridLayout();
//				gLayout.setColumns(3);
//				gLayout.setRows(3);
//				
//				deck.setLayout(gLayout);
//
//				frame.add(deck, BorderLayout.CENTER);
//				
				//gLayout.addLayoutComponent("deckLayout", frame.add(deck));
				
//				frame.add(deck);
				frame.add(ui);
				//frame.setLayout(manager);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setResizable(false);
			}
			
		});

	}

}
