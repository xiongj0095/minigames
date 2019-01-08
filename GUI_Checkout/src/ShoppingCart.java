import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Items> items;
	
	public ShoppingCart()
	{
		//create new list to hold items
		this.items = new ArrayList<Items>();
		
	}
	
	//Add items
	public void addItems(Items i)
	{
		this.items.add(i);
	}
	
	//Remove items
	public void removeItems(Items i)
	{
		this.items.remove(i);
	}
	
	//Calculate total cost 
	public double calculateTotalCost()
	{
		double total = 0.0;

		for(int index = 0; index < this.items.size(); index++)
		{
			total = total + items.get(index).getCost();
		}
		
		return total;
	}
}
