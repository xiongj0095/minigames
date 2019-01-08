import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Deck extends JPanel implements MouseListener
{

	private BufferedImage img; 
	private ArrayList<BufferedImage> imgList;
	private ArrayList<String> cardList;
	private JLabel imgLabel;
	private ArrayList<JLabel> imgLabelList;
	private ArrayList<JLabel> unflippedImgList;
	private ArrayList<JLabel> flippedImgList;
	private Boolean cardVisible;
	private Boolean cardFlip;
	private Card card;
	public ArrayList<Card> cards;
	
	public Deck()
	{
//		ImageReader imageReader = new ImageReader();
		
		String cardDirectoryName = "CardImages/";
  		String cardImageFile = "CardImages/card0.jpg";

		File cardDirectory = new File(cardDirectoryName);
		
		imgList = new ArrayList<BufferedImage>();
		imgLabelList = new ArrayList<JLabel>();
				
		//Open images and have mouseListener
//		displayCardImages(cardDirectory);
		addMouseListener(this);

		//name of deck image files
		String fileName = "deckCards.txt";
		

//		hideCardImage(imgLabelList);
//
//		//create arrayList for deck of cards
//		cardList = new ArrayList<String>();
//		
//		addCardTextIntoArrayList(fileName);
//		
//		for(int i=0; i < cardList.size(); i++)
//		{
//			System.out.println("THE CARD LIST: " + cardList.get(i));
//			System.out.println(cardList.size());	
//		}
		
				
		getCardData(fileName);
		
		for(int i=1; i < cards.size(); i++)
		{			
			cards.get(i);
			
		//	setBorder()
		//	add(cards.get(i));
//			System.out.println("CARD ADDED TO PANEL");
			
//			cards.get(i).displayCardImage();
//			card.displayCardImage(cardImageFile);
//			System.out.println(cards.get(i).getImageFile());
			
		}
		
		//Create border around Deck panel
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	//Read deck text file to add card into cards ArrayList
	public void getCardData(String deckCardFile)
	{
		String[] data;
		String number;
		String suit;
		String color;
		String imageFile;
		String line = null;
		
		cards = new ArrayList<Card>();

		try {
			FileReader fileReader = new FileReader(deckCardFile);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while( (line = bufferedReader.readLine()) != null)
			{
				data = line.split(",");
				number = data[0];
				suit = data[1];
				color = data[2];
				imageFile = data[3];
				
				card = new Card(100, 100, 150, 200, number, suit, color, imageFile);
				cards.add(card);

			}
			bufferedReader.close();
			
		}
		catch(IOException ex){
				ex.printStackTrace();
		}
	}
	
	//UNUSED - ANOTHER WAY TO OPEN DIRECTORY AND OUTPUT FILE LOCATION
	public void openAndPrintDirectory()
	{
 		try(Stream<Path> paths = Files.walk(Paths.get("CardImages")))
		{
			paths
			
				.filter(Files::isRegularFile)
				.forEach(System.out::println);
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//UNUSED - To Read One Image File and Output Image File to a JPanel
	public void displayImage(String imageFile)
	{
		img = null;		

  		try {
			img = ImageIO.read(new File(imageFile));
			Image imgResized = img.getScaledInstance(150, 200, Image.SCALE_SMOOTH );
			imgLabel = new JLabel(new ImageIcon(imgResized));
		
			add(imgLabel);
			
			
		}
		catch(IOException ex)
		{
			System.out.println("Cannot open image file '" + imageFile + "'");
			ex.printStackTrace(); //NOTE: useful method to diagnose an issue in try clause
		}
	}
	
	//UNUSED - Open images in directory and output image from arrayList
	public void displayCardImages(File cardDirectory)
	{
		File[] cardFiles = cardDirectory.listFiles();
		ArrayList<Image> imgResizedList = new ArrayList<Image>();
		unflippedImgList = new ArrayList<JLabel>();
		flippedImgList = new ArrayList<JLabel>();
		
		try 
		{
			for(int i = 0; i < cardFiles.length; i++)
			{
				
				

				//Read card image files and add to imgList
				imgList.add(ImageIO.read(cardFiles[i]));
			//	imgList.add(ImageIO.read(card.getImageFile(cardFiles[i])));

				//Resize the card image files and add to imgResizedList
				imgResizedList.add(imgList.get(i).getScaledInstance(150, 200, Image.SCALE_SMOOTH));
				
				//Put image list into JLabel list
				imgLabelList.add(new JLabel(new ImageIcon(imgResizedList.get(i))));
				
				//populate with flipped images
				flippedImgList.add(new JLabel(new ImageIcon(imgResizedList.get(i))));
				
				//populate temp array with unflipped images
				unflippedImgList.add(new JLabel(new ImageIcon(imgResizedList.get(0))));
				
				
				
				//Add imgLabelList to JPanel
				add(imgLabelList.get(i));
				add(flippedImgList.get(i));
				add(unflippedImgList.get(i));

				imgLabelList.get(0).setVisible(false);			
				flippedImgList.get(i).setVisible(false);
				unflippedImgList.get(i).setVisible(false);

				imgLabelList.get(i).addMouseListener(this);
				flippedImgList.get(i).addMouseListener(this);
				unflippedImgList.get(i).addMouseListener(this);

				if(i == 0)
				{
					cardFlip = false;
					cardVisible = false;
				}
				else {
					cardFlip = true;
					cardVisible = true;
				}
				
				imgLabelList.get(i).setBorder(BorderFactory.createLineBorder(Color.black));
				
			}
		}
		catch(IOException ex)
		{
			System.out.println("Cannot open image directory '" + cardDirectory + "'");
			ex.printStackTrace();
		}
	}
	
	//UNUSED - Read card text file and put into arrayList
	public void addCardTextIntoArrayList(String fileName)
	{

		//reference line
		String line = null;
		
		try {
			FileReader fileReader = new FileReader(fileName);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while( (line = bufferedReader.readLine()) != null)
			{
				cardList.add(line);
				
			//	System.out.println(line);
			}
			
			bufferedReader.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("File Not Found '" + fileName + "'");
		}
		catch(IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
	}
	
/*	public Dimension getPreferredSize()
	{
		int height = 50;
		img.
		return new Dimension(1,1);
	}*/
	
	 
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

/*		
  		//Another way to Resize the Image
  		int xCoordImg = 10;
		int yCoordImg = 10;
		int widthImg = 100;
		int heightImg = 170;
		
		int border = 5;
		int xCoordImgBorder = xCoordImg - border;
		int yCoordImgBorder = yCoordImg - border;
		int widthImgBorder = widthImg + border * 2;
		int heightImgBorder = heightImg + border * 2;		
		
		g2.setColor(Color.BLACK);
		g2.fillRect(xCoordImgBorder, yCoordImgBorder, widthImgBorder, heightImgBorder);
		g2.drawImage(img, xCoordImg, yCoordImg, widthImg, heightImg, this);
*/

	}

	//UNUSED - (add to mouselistener) to flip cards in arrayList 
	public void clickToFlipCardArrayList(MouseEvent e)
	{
		for(int i=1; i<imgLabelList.size(); i++)
		{
			if(e.getComponent() == imgLabelList.get(i) )
			{
				if(imgLabelList.get(i) == flippedImgList.get(i))
				{					
					cardFlip = false;
					
					//hide current image
					imgLabelList.get(i).setVisible(false);

					//change image with unflipped image
					imgLabelList.set(i, unflippedImgList.get(i));
					
					//show new image
					imgLabelList.get(i).setVisible(true);
					
					System.out.println("unflip");
				}
				else //if(cardFlip == false)
				{
					cardFlip = true;
					
					//hide current image
					imgLabelList.get(i).setVisible(false);

					//change image with flipped image
					imgLabelList.set(i, flippedImgList.get(i));
					
					//show new image
					imgLabelList.get(i).setVisible(true);

					System.out.println("flip");
				}
				
			//	System.out.println("IMG is " + cardFlip);
			}
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
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
	
/*	public void actionPerformed(ActionEvent args)
	{
		this.repaint();
	}
*/
	

	
	//draw card graphics
	//import image
	
	//shuffle method
	
	
	//pick a card method
	
	
}
