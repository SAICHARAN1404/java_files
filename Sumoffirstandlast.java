class Sumoffirstandlast
{
	public static void main(String args [])
	{
		int a=1234,firstdigit,lastdigit;
	
		System.out.println("Last digit  ="+a%10 );
		while(a>9)
		{
			
			a/=10;
		}
			System.out.println("First digit =" + a%10);
		System.out.println(firstdigit+lastdigit);
	}
}