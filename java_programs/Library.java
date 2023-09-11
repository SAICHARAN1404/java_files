class Library
{
	public static void main(String args [])
	{
		int days =6;
		System.out.println(days+ "   days");
		if (days<=5)
		{
			System.out.println("Fine is 50 paisa");
		}	
		else if (days <=10)
		{
			System.out.println("Fine is One rupee");
		}
		else if(days<=30)
		{
			System.out.println("Fine is Five rupees");
		}		
		else
		{
			System.out.println("Membership is Cancelled");
		}
	}
}