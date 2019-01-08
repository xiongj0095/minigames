
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.*;

public class GUI_Checkout  
{	
	//buttons
	private static JButton exitButton;
	private static JButton purchaseButton;
	private static JButton addItemButton;
	private static JButton removeItemButton;
	
	//comboBoxes
	private static JList<String> itemList;
	private static JList cartList;
	
	private static ShoppingCart cart;
	private static ArrayList<Items> itemsArrayList;

	public static void main(String[] args)
	{		
		exitButton = new JButton("EXIT");
		purchaseButton = new JButton("BUY");
		addItemButton = new JButton("Add Item");
		removeItemButton = new JButton("Remove Item");
		
		itemList = new JList<String>();
		cartList = new JList();
		
		JFrame window = new JFrame();
		
		window.setLayout(new FlowLayout());
		window.add(exitButton);
		window.add(purchaseButton);
		window.add(addItemButton);
		window.add(removeItemButton);
		
		
		window.add(itemList);
		window.add(cartList);
		
		window.setSize(450, 450);
		window.setTitle("Checkout");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		cart = new ShoppingCart();
		Items item1  = new Items("Pen", 5);
		Items item2  = new Items("Pencil", 1);

		itemsArrayList = new ArrayList<Items>();
		itemsArrayList.add(item1);
		itemsArrayList.add(item2);
//TODO: FIXXXXXXXX
		for(int i=0; i< itemsArrayList.size(); i++)
		{
			itemList.setSelectionMode(i);
		}
		
	}		
	

	
	
}
