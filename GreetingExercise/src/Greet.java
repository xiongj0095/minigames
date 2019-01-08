/*
 * Exercise 2.3:
 * 
 * Write a program that asks the user's name, 
 * and then greets the user by name. 
 * Before outputting the user's name, 
 * convert it to upper case letters. 
 * For example, if the user's name is Fred, 
 * then the program should respond 
 * "Hello, FRED, nice to meet you!".
 * 
 */

import java.util.Scanner;

public class Greet {

	public static void main(String[] args) 
	{		
		//Ask the user's name by using Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? ");
		String userName = scanner.nextLine();
		
				
		//Greets the user by name with name in uppercase letters
		String upperCaseName = userName.toUpperCase();
		System.out.println("Hello, " + upperCaseName + ", nice to meet you!");
		
	}

	
}
