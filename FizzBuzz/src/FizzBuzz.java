/*
 * 7/20/15
 * "Write a program that prints the numbers from 1 to 15. 
 * But for multiples of three print “Fizz” instead of the number 
 * and for the multiples of five print “Buzz”. 
 * For numbers which are multiples of both three and five print “FizzBuzz”."
 * 
 */

public class FizzBuzz {

	public static void main(String[] args) 
	{
		for(int i=1; i <= 15; i++ )
		{
			//multiples of both three and five print “FizzBuzz”
			if(i%3 ==0 && i%5 ==0)
			{
				System.out.println("FizzBuzz");
			}
			//multiples of three print “Fizz”
			else if(i%3 == 0)
			{
				System.out.println("Fizz");
			}
			//multiples of five print “Buzz”
			else if(i%5 == 0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
		
	}

}
