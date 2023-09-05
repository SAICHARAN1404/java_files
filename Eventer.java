class Eventer
{
	public static void main(String args [])
	{
		int a=8, b=8;
		if (a%2==0 && b%2==0 )
		{	
			System.out.println("A & b ARE EVEN");
		}
		else if (a%2==0 && b%2!=0)
		{
			System.out.println("A IS EVEN , B IS ODD");
		}
		
		else if (a%2!=0 && b%2==0)
		{
			System.out.println("A IS ODD ,	B IS EVEN");
		}	
		else
		{
			System.out.println("BOTH ARE ODD");
		}
	}
}