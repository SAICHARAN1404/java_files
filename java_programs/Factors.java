class Factors
{
	public static void main(String args[])
	{
		int n1=20,n2=15,x=1;
		while(x<20)
		{
			if (n1%x==0 && n2%x==0)
			{
				System.out.println(x);
			}
			x++;
		}
	}
}