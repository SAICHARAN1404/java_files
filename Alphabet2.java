class Alphabet2
{
	public static void main(String arg [])
	{
		char temp='z';
		System.out.println(temp);
		if (temp=='A' || temp=='E' || temp=='I' || temp=='O' || temp=='U')
		{
			if(temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u')
			{
				System.out.println("	small");
			        System.out.println("	vowel");
			}
			else
			{
				System.out.println("	CAPITAL");
				System.out.println("	VOWEL");
			}
		}			 
		else if  (temp>=65 && temp<=90)
		{	
			System.out.println("	CAPITAL");
		        System.out.println("	CONSONANT");
		}
		else
		{
			    System.out.println("small");
			    System.out.println("consonant");	
		}
		
	}
}