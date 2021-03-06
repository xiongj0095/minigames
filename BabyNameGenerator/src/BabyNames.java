/*
 * Baby Name that reads the file 
 */

import java.io.*;

public class BabyNames
{
	public static void main(String[] args)
	{
		//Name of file to open
		String fileName = "yob2013.txt";
		
		//Reference one line at a time
		String line = null;
		
		try{
			//FileReader reads text files in the default encoding
			FileReader fileReader = new FileReader(fileName);
			
			//Always wrap FileReader in BufferedReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
				
			}
			
			//Always close files
			bufferedReader.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Unable to open file '" +
						fileName + "'");
		}
		catch(IOException ex)
		{
			System.out.println("Error reading file '" +
						fileName + "'");
		}
		
	}
}
