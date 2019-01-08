
public class Items {

	private String name;
	private double cost;
	private double weight;
	
	//constructor
	public Items(String name, double cost)
	{
		this.name = name;
		this.cost = cost;
	}

	public String getName()
	{
		return this.name;
	}
	
	public double getCost()
	{
		return this.cost;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
}
