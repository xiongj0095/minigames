/*
 * 5/21/16
 * Exercise 3.4:
 * 
 * Write a program that reads one line of input text 
 * and breaks it up into words. 
 * The words should be output one per line. 
 * A word is defined to be a sequence of letters. 
 * Any characters in the input that are not letters should be discarded. 
 * For example, if the user inputs the line
 * 		He said, "That's not a good idea."
 *		then the output of the program should be
 *	He
 *	said
 *	That
 *	s
 *	not
 *	a
 *	good
 *	idea
 *	
 * An improved version of the program would list "that's" as a single word. 
 * An apostrophe can be considered to be part of a word 
 * if there is a letter on each side of the apostrophe.
 * 
 * To test whether a character is a letter, 
 * you might use (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'). 
 * However, this only works in English and similar languages. 
 * A better choice is to call the standard function Character.isLetter(ch), 
 * which returns a boolean value of true if ch is a letter 
 * and false if it is not. This works for any Unicode character.
 *  
 */

import java.util.Scanner;

public class ReadWord {

	public static void main(String[] args) 
	{
		boolean nextLine = false;
		String output;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type one line of text"
				+ " and the program will break it up into words!");
		output = scanner.nextLine();
		
		for(int i=0; i < output.length(); i++)
		{
			if(Character.isLetter(output.charAt(i)) || output.charAt(i) == 39)
			{
				System.out.print(output.charAt(i)); 
				
				nextLine = false;	//assign nextLine to false
			}
			else if(nextLine == false)
			{
				System.out.println();
				nextLine = true;
			}
			
		}
		
	}
}
