/*
 * 5/19/2016
 * Exercise 2.6:
 * 
 * This exercise asks you to write a program that tests 
 * some of the built-in subroutines for working with Strings. 
 * The program should ask the user to enter their first name and 
 * their last name, separated by a space. Read the user's response 
 * using TextIO.getln(). Break the input string up into two strings,
 * one containing the first name and one containing the last name. 
 * You can do that by using the indexOf() subroutine to find the 
 * position of the space, and then using substring() to extract 
 * each of the two names. Also output the number of characters in each name, 
 * and output the user's initials. (The initials are the first letter of the 
 * first name together with the first letter of the last name.) 
 * A sample run of the program should look something like this:
 * 
 * 	Please enter your first name and last name, 
 * 	separated by a space.
 * 	Mary Smith
 * 	Your first name is Mary, which has 4 characters
 * 	Your last name is Smith, which has 5 characters
 * 	Your initials are MS
 * 
 * ***Or use Scanner from java.util for input***
 *
 */

import java.util.Scanner;

public class ReadingName {

	public static void main(String[] args) 
	{
		char space = ' ';
		char firstNameInitial;
		char secondNameInitial;
		int firstNameEnd;
		int firstNameCharacters;
		int secondNameCharacters;
		String firstName;
		String secondName;
		String fullName;
		Scanner scanner = new Scanner(System.in);
		
		//Prompt user to input first name and last name
		System.out.println("Please enter your first name and last name,"
				+ " separated by a space.");
		
		//User input name
		fullName = scanner.nextLine();
		
		//Find the position of the space
		firstNameEnd = fullName.indexOf(space);
		
		//Get the first name and second name
		firstName = fullName.substring(0, firstNameEnd);		
		secondName = fullName.substring(firstNameEnd+1);

		//Get the length of name
		firstNameCharacters = firstName.length();
		secondNameCharacters = secondName.length();
		
		//Get initials of name
		firstNameInitial = firstName.charAt(0);
		secondNameInitial = secondName.charAt(0);
		
		System.out.println("Your first name is " + firstName + ", which has " 
						+ firstNameCharacters + " characters");
		System.out.println("Your last name is " + secondName + ", which has "
						+ secondNameCharacters + " characters");
		System.out.println("Your initials are " + firstNameInitial + secondNameInitial);
	}

}
