class Table
{
	public static void main(String args[])
	{
		int a=7,start=30,end=1;
		while(start>=end)//10 is > 1//enters the scope//
		{
			if(start%13==0)
			{
			    System.out.println(a +"   x   " +start+"  = "+a*start);
			}
			
			start--;	
		}
	}
}
