/*
 * 
 * 	HOW TO PLAY: 
 * 	Roll two dice of six sides, add them together. 
 * 	If odd or same number sides, win game.
 *  
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game
{
	public static void main(String[] args)
	{
		int dice1 = rollDice();
		int dice2 = rollDice();
		int sum = dice1 + dice2;
		int continueGame = 1;
		
		

		System.out.println("Dice1 Rolled: " + dice1);
		System.out.println("Dice2 Rolled: " + dice2);
		System.out.println( "Sum Of Two Dice: " + sum );
		
		toWinGame(dice1, dice2);
		
		System.out.println("Input 1 to Continue, 0 to End: ");
		
			do
			{
				Scanner stdin = new Scanner( System.in );
				
				continueGame = validateContinueGame(stdin);
				
				if(continueGame == 1) {
				
				dice1 = rollDice(); 
				dice2 = rollDice();
				sum = dice1 + dice2;
				
				System.out.println("Dice1 Rolled: " + dice1);
				System.out.println("Dice2 Rolled: " + dice2);
				System.out.println( "Sum Of Two Dice: " + sum );
				
				toWinGame(dice1, dice2);
				
				}
				
			} while(true);
		}
	public static int rollDice()
	{
		//rolling a random dice
		int roll = (int)(Math.random()*6)+1;
		
		return roll;

	}
	
	public static void toWinGame(int dice1, int dice2)
	{
		int sum = dice1 + dice2;
		int even = sum %2;
		
		//if dice same numbered sides, win game
		if(dice1 == dice2)
		{
			System.out.println("Dice Side Is The Same: YOU WIN!");			
		}
		else if( even != 0)			//else if sum is odd, win game
		{
			System.out.println("Dice Sum Is Odd: YOU WIN!");
		}
		else
		{
			System.out.println("Dice Sum Is Even: YOU LOSE!");
		}
	}
	
	public static int validateContinueGame(Scanner scanner)
	{
		int continueGame = 0;
		
		try 
		{
			continueGame = scanner.nextInt();
			
			if(continueGame == 0)
			{
				System.out.println("Exiting Dice Game");
				System.exit(0);
			}
			if(continueGame != 1)
			{
				System.out.println("Enter a 1 to countinue the game: ");
			}
		}
		catch (InputMismatchException ex)
		{
			System.out.println("Enter a 1 to countinue the game: ");
		}
		
		return continueGame;
	}
}