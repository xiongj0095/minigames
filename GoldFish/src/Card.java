import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Card extends JPanel implements MouseListener
{

	private int xCoord;
	private int yCoord;
	private String number;
	private String suit;
	private String color;
	private String imageFile;
	private JLabel imageLabel;
	private BufferedImage img;
	public boolean cardRevealed = false;
	private String storeCard[];
	private String unflippedCardFile = "CardImages/card0.jpg";
	
	public Card(int xCoord, int yCoord, int width, int height, String number, String suit, String color, String imageFile)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.number = number;
		this.suit = suit;
		this.color = color;
		this.imageFile = imageFile;
		
		//indicate card has two side: back and front
		storeCard = new String[2];
		
		
		//Open image 
		displayCardImage();
		
		//Show reverse/unflip card side first
//		cardRevealed = false;
		
		flipCard();
		
		//mouse listener to card panel
		addMouseListener(this);	
	}
	
	//Read and display image into a JPanel
	public void displayCardImage()
	{
		img = null;

		try {
			//Read card image files
			img = ImageIO.read(new File(imageFile));
			
			//Resize the card image files
			Image imgResized = img.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
				
			//Put resized image into JLabel
			imageLabel = new JLabel(new ImageIcon(imgResized));
			
			//Put image label into a panel
			add(imageLabel);
			
			//Add mouse listener
			imageLabel.addMouseListener(this);
						
			//indicate card is flipped/revealed
			cardRevealed = true;
			
			//set the unflipped/back card
			storeCard[0] = unflippedCardFile;
			
			//give card a flipped or unflipped side
			setSidesOfCard();
				
			setBorder(BorderFactory.createLineBorder(Color.black));
			
//			System.out.println("CARD IMAGE ADDED: " + imageFile);
//			System.out.println("CARD IMAGE storeCard[0] : " + storeCard[0]);
//			System.out.println("CARD IMAGE storeCard[1] : " + storeCard[1]);

			
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	//set the sides of a card: revealed or faced down
	public void setSidesOfCard()
	{
		//check if card is reversed
		if(imageFile.equals(unflippedCardFile))
		{
			//set card to unflipped file
			storeCard[0] = imageFile;
			
			//indicate card is unflipped
			cardRevealed = false;
		}
		else
		{
			//set card to flipped/revealed file
			storeCard[1] = imageFile;
			
			//indicate card is flipped
			cardRevealed = true;

		}
	}
	
	//get card side images from its corresponding array index
	public String getCardImageFile()
	{
		//set reverse side of card
		storeCard[0] = unflippedCardFile;
		
		//check if card current state of card: reverse or flipped up
		if(cardRevealed == false)
		{
			//set the file name to reverse side
			imageFile = storeCard[0];
//			System.out.println("REVERSE NOT SHOWN/UNFLIPPED " + imageFile);

		}
		else 	//cardRevealed == true;
		{
			//set the file name to flipped side	
			imageFile = storeCard[1];
//			System.out.println("REVERSE SHOWN/FLIPPED " + imageFile);
		}
		
		return imageFile;
	}
	
	//Flip Card
	public void flipCard()
	{
		if(cardRevealed == false)
		{
			//hide current image
			imageLabel.setVisible(false);
			
			//get reverse/unflip card image file
			getCardImageFile();
			
			//read and output image to panel 
			displayCardImage();
			
			//show card image
			imageLabel.setVisible(true);
			
			//change cardRevealed for next click 
			cardRevealed = true;
			
		}
		else {
			
			//hide current image
			imageLabel.setVisible(false);
			
			//get revealed/flip card image
			getCardImageFile();
			
			//read and output image to panel 			
			displayCardImage();
			
			//change cardRevealed for next click 
			imageLabel.setVisible(true);
			
			//change cardRevealed for next click 
			cardRevealed = false;				
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getComponent() == imageLabel)
		{
			flipCard();
		}

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

	
	public void setNumber(String number)
	{
		this.number = number;
	}

	public void setSuit(String suit)
	{
		this.suit = suit;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setImageFile(String imageFile)
	{
		this.imageFile = imageFile;
	}
	
	public String getNumber()
	{
		return this.number;
	}
	
	public String getSuit()
	{
		return this.suit;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public String getImageFile()
	{
		return this.imageFile;
	}
	
	public File getImageFile(File imageFile)
	{
		return imageFile;
	}
	

}
