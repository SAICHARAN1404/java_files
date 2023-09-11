class Factorial
{
	public static void main(String args[])
	{
		int start =5,end=1,fact=1;
		while(start>=end)//start=5>1
		{
			fact*=start;//fact=fact*start=1*5=5//
			System.out.println(fact);
			start--;
		}
	
	}
}