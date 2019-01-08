
public class Practice08 {

	public Practice08() {

		fizzBuzz();
	}
	
	/*
	 * "Write a program that prints the numbers from 1 to 100. 
	 * But for multiples of three print “Fizz” instead of the number 
	 * and for the multiples of five print “Buzz”. 
	 * For numbers which are multiples of both three and five print “FizzBuzz”."
	 */
	private void fizzBuzz() {
		int count = 1;
		while(count <= 100)
		{
			//System.out.println(count);

			if(0 == (count % 3) && 0 == (count % 5))
			{
				System.out.println("FizzBuzz " + count);

			}
			else if(0 == (count % 3))
			{
				System.out.println("Fizz " + count);
			}
			else if(0 == (count % 5))
			{
				System.out.println("Buzz " + count);
			}
			else {
				System.out.println(count);
			}
			count++;

		}
	}
}
