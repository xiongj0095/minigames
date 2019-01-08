/*
 * 5/31/16
 * 
 * AI Try to guess user's number
 */

import java.util.Scanner;

public class GuessingGame 
{
	public static void main(String[] args)
	{
		int userDesiredNumber = 0;
		int userInput = 0;
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Enter A Number - From 1 To 100 - And I Will Try To Guess It!");
		System.out.print("The User's Input ");
		userDesiredNumber = scanner.nextInt();
		
		
		Random guess = new Random(1, 100);
		int firstGuess = (int) guess.getValue();
		System.out.println("Is it the number " + firstGuess + "?");
		
		do
		{
			System.out.println("Enter 1 if Higher, 2 if Lower");
			userInput = scanner.nextInt();
			if(userInput == 1)
			{
				//NEEDS FIXING
				Random guess2 = new Random( firstGuess, 100);
				System.out.println("Is it the number " + guess2.getValue() + "?");
			}
			if(userInput == 2)
			{
				//NEEDS FIXING
				Random guess3 = new Random(1, firstGuess);
				System.out.println("Is it the number " + guess3.getValue() + "?");
			}
		}while(userInput != 0 || userDesiredNumber == guess.getValue());
		
		System.out.println("I WIN! YOU LOSE!");
	}
}
