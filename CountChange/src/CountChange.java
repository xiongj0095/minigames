/*
 * Exercise 2.4:
 * Write a program that helps the user count his change. 
 * The program should ask how many quarters the user has, 
 * then how many dimes, then how many nickels, 
 * then how many pennies. Then the program should
 * tell the user how much money he has, expressed in dollars.
 * 
 */

import java.util.Scanner;

public class CountChange 
{
	public static void main(String[] args)
	{
		int userQuarters = 0;
		int userDimes = 0;
		int userNickels = 0;
		int userPennies = 0;
		double quartersEqual = 0.0;
		double dimesEqual = 0.0;
		double nickelsEqual = 0.0;
		double penniesEqual = 0.0;
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Output what program will do - count users change
		System.out.println("This program will help you count your change!");
		
		//Ask user to input how many quarters user has
		System.out.println("How many quarters to you have? ");
		
		//User input amount of quarters
		userQuarters = scanner.nextInt();
		
		//convert Quarters
		quartersEqual = convertQuarters(userQuarters);
		
		//Ask user to input how many dimes user has
		System.out.println("How many dimes to you have? ");
		
		//User input amount of dimes
		userDimes = scanner.nextInt();
		
		//convert Dimes
		dimesEqual = convertDimes(userDimes);
		
		//Ask user to input how many nickels user has
		System.out.println("How many nickels to you have? ");
		
		//User input amount of nickels
		userNickels = scanner.nextInt();
		
		//convert Nickels
		nickelsEqual = convertNickels(userNickels);
		
		//Ask user to input how many pennies user has
		System.out.println("How many pennies to you have? ");
		
		//User input amount of pennies
		userPennies = scanner.nextInt();
		
		//convert Pennies
		penniesEqual = convertPennies(userPennies);
		
		//Output money in dollars
		System.out.println("Your change is " + totalChange(quartersEqual, dimesEqual, nickelsEqual, penniesEqual));
	}
	
	public static double convertQuarters(int userQuarters)
	{
		double quarter = .25;
		double quarterTotal = 0.0;
		
		quarterTotal = userQuarters * quarter;
		return quarterTotal;
	}
	
	public static double convertDimes(int userDimes)
	{
		double dime = .10;
		double dimeTotal = 0.0;
		
		dimeTotal = userDimes * dime;
		return dimeTotal;
	}
	
	
	public static double convertNickels(int userNickels)
	{
		double nickels = .05;
		double nickelTotal = 0.0;
		
		nickelTotal = userNickels * nickels;
		return nickelTotal;
	}
	
	public static double convertPennies(int userPennies)
	{
		double pennies = .01;
		double penniesTotal = 0.0;
		
		penniesTotal = userPennies * pennies;
		return penniesTotal;
	}

	public static double totalChange(double quartersEqual, double dimesEqual, 
									double nickelsEqual, double pennnisEqual)
	{
		double total = 0.0;
				
		total = (quartersEqual + dimesEqual + nickelsEqual + pennnisEqual);
		
		return total;
	}
}
