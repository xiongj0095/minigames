/**
 * 5/19/2016
 * Exercise 2.5:
 * 
 * If you have N eggs, then you have N/12 dozen eggs, 
 * with N%12 eggs left over. 
 * (This is essentially the definition of the / and % 
 * operators for integers.) Write a program that asks 
 * the user how many eggs she has and then tells the user 
 * how many dozen eggs she has and how many extra eggs 
 * are left over.
 * 
 * A gross of eggs is equal to 144 eggs. 
 * Extend your program so that it will tell the user 
 * how many gross, how many dozen, and how many left over 
 * eggs she has. For example, if the user says that she 
 * has 1342 eggs, then your program would respond with
 * 		Your number of eggs is 9 gross, 3 dozen, and 10
 * since 1342 is equal to 9*144 + 3*12 + 10. 
 * 
 */

import java.util.Scanner;

public class countEggs {

	public static void main(String[] args) 
	{
		int userEggsTotal = 0;

		Scanner scanner = new Scanner(System.in);
		
		//Ask how many eggs user has
		System.out.println("How many eggs do you have?");
		
		//user input egg total
		userEggsTotal = scanner.nextInt();
		
		System.out.println("Your number of eggs is " + grossEggs(userEggsTotal) + " gross " + 
		dozenEggs(userEggsTotal) + " dozen " + leftOverEggs(userEggsTotal) + " eggs.");
	}
	
	public static int grossEggs(int userEggsTotal)
	{
		int gross = userEggsTotal/144;
		
		return gross;
	}
	
	public static int dozenEggs(int userEggsTotal)
	{
		int dozen = (userEggsTotal - (grossEggs(userEggsTotal)*144) ) / 12;
		
		return dozen;
	}
	
	public static int leftOverEggs(int userEggsTotal)
	{
		int leftOver = userEggsTotal % 12;
		
		return leftOver;
	}
	
	

}
