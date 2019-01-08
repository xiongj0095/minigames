/*
 * 5/31/16
 * Rock-Paper-Scissor game
 */

import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		String rock = "rock";
		String paper = "paper";
		String scissor = "scissor";
		int userInput;
		String user = "";
		Random random = new Random(1,3);
		int chooseRock = 1;
		int choosePaper = 2;
		int chooseScissor = 3;
		
		System.out.println("LET'S PLAY ROCK-PAPER-SCISSOR!");
		do
		{
			System.out.print("Type rock, paper, or scissor: ");
			user = scanner2.nextLine();
			
			int randomNumber = (int) random.getValue();
				
			if( user.equals(rock) )
			{
				System.out.println("You choose rock");				
				if(randomNumber == chooseRock)
				{
					System.out.println("AI choose " + rock);
					System.out.println("IT'S A TIE!");
				}
				if(randomNumber == choosePaper)
				{
					System.out.println("AI choose " + paper);
					System.out.println("YOU LOSE, AI WINS");
				}
				if(randomNumber == chooseScissor)
				{
					System.out.println("AI choose " + scissor);
					System.out.println("YOU WIN, AI LOST");
				}					
			}
			else if( user.equals(paper) )
			{
				System.out.println("You choose paper");				
				if(randomNumber == chooseRock)
				{
					System.out.println("AI choose " + rock);
					System.out.println("YOU WIN, AI LOST");
				}
				if(randomNumber == choosePaper)
				{
					System.out.println("AI choose " + paper);
					System.out.println("IT'S A TIE!");
				}
				if(randomNumber == chooseScissor)
				{
					System.out.println("AI choose " + scissor);
					System.out.println("YOU LOST, AI WIN");
				}					
			}
			else if( user.equals(scissor) )
			{
				System.out.println("You choose scissor");
				if(randomNumber == chooseRock)
				{
					System.out.println("AI choose " + rock);
					System.out.println("YOU LOST, AI WINS!");
				}
				if(randomNumber == choosePaper)
				{
					System.out.println("AI choose " + paper);
					System.out.println("YOU WIN, AI LOST");
				}
				if(randomNumber == chooseScissor)
				{
					System.out.println("AI choose " + scissor);
					System.out.println("IT'S A TIE!");
				}					
			}
			
			System.out.print("Enter 0 to Exit or 1 to continue: ");
			userInput = scanner.nextInt();

			if( userInput == 0)
			{
				break;
			}
			
			
		}while(true);
		System.out.println("Exiting Game");
		
		
	}

}
