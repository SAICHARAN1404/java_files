class Alph
{
	public static void main(String args [])
	{
		char temp='9';
		if (temp>=65 && temp<=90)
		{
			if(temp=='A' || temp=='E' || temp=='I' || temp=='O' || temp=='U')
			{
				System.out.println("CAPITAL VOWEL");
			}	
			else
			{
				System.out.println("CAPITAL CONSONANT");
			}
			
		}
		else if (temp>=97 && temp<=122)
		{
			if (temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u')
			{
				System.out.println("small vowel");
			}
			else
			{
				System.out.println("small consonant");
			}
		}
		else if(temp>=0 || temp<=9)
		{
			System.out.println("IT IS A NUMBER");
		}
		else
		{
			System.out.println("IT IS A SYMBOL");
		}
	}
}