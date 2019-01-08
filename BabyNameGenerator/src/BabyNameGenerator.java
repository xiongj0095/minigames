/*
 * Baby Name generator that reads the file 
 * and using Random File Access, 
 * that picks a random name
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BabyNameGenerator 
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("yob2013.txt");
		
		Scanner reader = new Scanner(file);
		
		reader.useDelimiter("[,\n]");
		
		String name, gender, number;
		
		ArrayList<String> names = new ArrayList<String>();
		
		while(reader.hasNext())
		{
			name = reader.next();
			gender = reader.next();
			number = reader.next();
			
			names.add(name);
		}
		
		reader.close();

		Random rand = new Random(0, names.size()-1);
		
		int randNumber = (int) rand.getValue();
		
		System.out.println(names.get(randNumber));
		
		
	}
}
