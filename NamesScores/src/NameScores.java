/*
 * 6/3/16
 * https://projecteuler.net/problem=22
 * 
 * Using names.txt (right click and 'Save Link/Target As...'), 
 * a 46K text file containing over five-thousand first names, 
 * begin by sorting it into alphabetical order. 
 * Then working out the alphabetical value for each name, 
 * multiply this value by its alphabetical position 
 * in the list to obtain a name score.
 * 
 * For example, when the list is sorted into alphabetical order, 
 * COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, 
 * is the 938th name in the list. 
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class NameScores {

	public static void main(String[] args) throws IOException
	{
		File file = new File("p022_names.txt");
		Scanner scanner = new Scanner(file);
		
		String name;
		
		ArrayList<String> nameArray = new ArrayList<String>();
		
		scanner.useDelimiter("\"");	//don't read "" in file
		
		while(scanner.hasNext())
		{
			name = scanner.next();
			if(!name.equals(","))	//don't read ',' in file
			{
				nameArray.add(name);				
			}
		}
		
		scanner.close();
		
		//sort arrayList to alphabetical order
		Collections.sort(nameArray);
		
		//read file
/*		for(int i=0; i < nameArray.size(); i++)
		{
			System.out.println(nameArray.get(i));
		}
*/
		
		//output answer
		System.out.println(calculateNameScore(nameArray));
	}
	
	//assign letter to value
	public static int alphabeticalValue(char letter)
	{
		int count = 1;
		
		for( char a = 'A'; a <= 'Z'; a++)
		{
			
			if(a == letter)
			{
				return count;
			}
			count++;
		}

		return 0;
	}
	
	public static int wordValue(String word)
	{
		int value = 0;
		for(int i = 0; i < word.length(); i++)
		{
			value = value + alphabeticalValue(word.charAt(i));
		}
		return value;
	}
	
	public static int calculateNameScore(ArrayList<String> nameArray)
	{
		int total = 0;
		
		for(int i = 0; i < nameArray.size(); i++)
		{
			total = total + wordValue(nameArray.get(i)) * (i + 1);
		}
		
		return total;
	}
}
