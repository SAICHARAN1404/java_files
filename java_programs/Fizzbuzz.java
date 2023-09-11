class Fizzbuzz
{
	public static void main(String args[])
	{
		int a=15;
		int b=10,c=5;
		if(a%b==0)
		{
			
			if(a%c==0)
			{
				System.out.println("Fizz Buzz");
			}
			else
			{
				System.out.println("Fizz");
			}
		}
		else if(a%c==0)
		{
			System.out.println("Buzz");
		}
		else
		{
			System.out.println(a);
		}

		
	}
}	