
public class Random 
{
	private int max;
	private int min;
	
	public Random(int min, int max)
	{
		this.max = max;
		this.min = min;
	}
	
	public double getValue()
	{
		double time = System.nanoTime();
		
		if((time % this.max)+1 >= this.min)
		{
			return (time % this.max)+1;
		}
		else
		{
			return this.min;
		}
	}
	
}
