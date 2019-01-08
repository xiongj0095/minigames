/*
 * 5/31/16
 * User guess a Number from 1 to 100
 * 
 */
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		int desiredNumber = 10;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess My Number Between 1 To 100 ");
		int input = 0;
		
		do
		{
			input = scanner.nextInt();
			
			//userInput greater than desiredNumber
			if(input > desiredNumber)
			{
				System.out.println("Desired Number Is Higher");
			}
			//userInput less than desiredNumber
			if(input < desiredNumber)
			{
				System.out.println("Desired Number Is Lower");
			}
	
		}while(input != desiredNumber);
		
		System.out.println("YOU WIN");
	}

}
