
public class Security {

	public static void main(String[] args) 
	{
		char[] decryptAlphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] encryptAlphabet = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
		
		String name = "huexiong";
		encrypt(name, decryptAlphabet, encryptAlphabet);
		
		String name2 = "sfvcrlmt";
		decrypt(name2, decryptAlphabet, encryptAlphabet);
	}

	public static void encrypt(String s, char[] decryptAlphabet, char[] encryptAlphabet)
	{
		for (int i=0; i < s.length(); i++)
		{
			for(int j=0; j < decryptAlphabet.length; j++)
			{
				char c = s.charAt(i);
				
				if(c == decryptAlphabet[j])
				{
					System.out.print(encryptAlphabet[j]);
				}
			}
		}
	}
	
	public static void decrypt(String s, char[] decryptAlphabet, char[] encryptAlphabet)
	{
		for (int i=0; i < s.length(); i++)
		{
			for(int j=0; j < encryptAlphabet.length; j++)
			{
				char c = s.charAt(i);
				
				if(c == encryptAlphabet[j])
				{
					System.out.print(decryptAlphabet[j]);
				}
			}
		}		
	}
}
