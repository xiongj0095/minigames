/*
 * Returns the first digit of an integer
 * For example, firstDigit(3572) should return 3.
 * It should work for negative numbers as well.
 * For example, firstDigit(-947) should return 9.
 */

public class FirstDigit {

	public static void main(String[] args) 
	{
		int number = 20;
		
		System.out.println(firstNumber(number));
		System.out.println(getFirstNumber(number));
	}
	
	public static int firstNumber(int number)
	{
		String convertDigit = Integer.toString(number);
		
		int result = 0;
		
		for(int i = 0; i < convertDigit.length(); i++)
		{
			if(convertDigit.charAt(i) == '-')
			{
				result = Integer.parseInt(Character.toString(convertDigit.charAt(i+1)));
				break;
			}
			else 
			{
				result = Integer.parseInt(Character.toString(convertDigit.charAt(i)));
				break;
			}
		}
		return result;
	}
	
	public static int getFirstNumber(int number)
	{
		// Times it by -1
		if(Integer.toString(number).charAt(0) == '-')
		{
			number = number * -1;
		}
		
		return Integer.parseInt(Character.toString(Integer.toString(number).charAt(0)));
		
	}
}
