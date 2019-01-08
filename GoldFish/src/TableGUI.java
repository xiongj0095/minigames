import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TableGUI extends JPanel implements MouseListener, ActionListener{



	private Deck deck;
	private JButton drawButton;
	private int count;
	public TableGUI()
	{
		//name of deck image files
		String fileName = "deckCards.txt";
		
		count = 1;
		
		deck = new Deck();
		deck.getCardData(fileName);
		
		JButton drawButton = new JButton("Draw Card");
		drawButton.setBounds(500, 400, 100, 150);
		add(drawButton);
		drawButton.setActionCommand("draw");
		drawButton.addActionListener(this);
		
		for(int i=1; i < deck.cards.size(); i++)
		{			
			deck.cards.get(i);
			add(deck.cards.get(i)).setVisible(false);;
			System.out.println(deck.cards.get(i));

		}
	}
	
	public void actionPerformed(ActionEvent e)
	{	
		if("draw".equals(e.getActionCommand()))
		{
			if(count == 1)
			{
				deck.cards.get(1).setVisible(true); 		
				deck.cards.get(2).setVisible(false); 
			}
			if(count == 2)
			{
				deck.cards.get(1).setVisible(false); 		
				deck.cards.get(2).setVisible(true); 
			}
			
			count++;
			
			if(count >= deck.cards.size())
			{
				count = 1;
			}
			
			System.out.println(count);

		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
