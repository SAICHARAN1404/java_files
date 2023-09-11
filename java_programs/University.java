class University
{
	public static void main(String args[])
	{
		int A=65,B=35;
		if(A>=55 && B>=45)
		{
			System.out.println("ALLOWED");
		}
		else if(A<=55 )
		{
			if(A>=45 && B>=55)
			{
				System.out.println("PASSED");
			}
			else
			{
				System.out.println("FAILED");
			}
		}
		else if (A>=65 && B<=45)
		{
			System.out.println("ALLOWED IN B TO TO QUALIFY");
		}
		else 
		{
			System.out.println("FAILED");	
		}
		
			
	}
}