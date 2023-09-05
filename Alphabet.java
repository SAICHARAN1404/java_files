class Alphabet
{
	public static void main(String arg [])
	{
		char temp='B';
		int i =(int)temp,temp1=0;
		if (i>=65 && i<=90)
		{
			if(i==97 || i==101 || i==105 || i==111||i==117)
			{
			System.out.println("	CAPITAL");
			System.out.println("	VOWEL");
			}
			else
			{
				System.out.println("	small");
			        System.out.println("	vowel");
			}	
		} 
		else 
		{
			if(i>=65 && i<=90)
			{
				System.out.println("	CAPITAL");
			        System.out.println("	CONSONANT");
			}
			else
			{
			    System.out.println("	small");
			    System.out.println("CONSONANT");	
			}
		}
	}
}