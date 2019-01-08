import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Practice {

	String fileName = "user.dat";
	String newFile = "fileUser.csv";
	
	public Practice()
	{
	
		String line;
		int l;
		char k;
		String secondLine;
		String[] tokens = null;
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffReader = new BufferedReader(fileReader);
			
			line = null;
			
			//Read till the end of the file
//			while( (line = buffReader.readLine()) != null )
//			{
//				System.out.print(line);
//			}
		
			
			while( (secondLine = buffReader.readLine()) != null)
			{
				
				if(secondLine.startsWith("City"))
				{
					secondLine.substring(4);
					
					tokens = secondLine.split("[,:]");
					//System.out.println( );

				}
				
				if(secondLine.startsWith("Name"))
				{
					System.out.println(secondLine);

				}
				
			}
			
			//Read up to a character
			//while( (k = (char) buffReader.read()) != '/n' )	//Read up to line break
//			while( (k = (char) buffReader.read()) != 'C' )
//			{								
//				System.out.print(k);
//			}
			
			
			PrintStream ps = new PrintStream( newFile );
			
			ps.println("Test data will be written when flush is called");
			
			ps.flush();
			
			for(int i=0; i < tokens.length; i++)
			{
				ps.println(tokens[i]);
			}
			
			
			ps.close();
			
		}
		catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
		} 
		catch (IOException e) 
		{			
			e.printStackTrace();
		}
		
		for(int i=0; i < tokens.length; i++)
		{
			System.out.println(i + " " + tokens[i]);
		}
		
		countWordsInFile("fileName");
	}
	
	public void countWordsInFile(String fileName)
	{
		
		System.out.println( "HI");
	}
}
