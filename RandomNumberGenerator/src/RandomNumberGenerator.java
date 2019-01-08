
public class RandomNumberGenerator {

	public static void main(String[] args) 
	{
		//Make a six-sided dice
		Random dice1 = new Random(1,6);
		System.out.println(dice1.getValue());
	}

}
