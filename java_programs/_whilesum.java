class _whilesum
{
	public static void main(String args[])
	{
		int x=1,n=50;
		double sum=0,mul=1;
		while(x<=n)
		{
			if (x%2==0)
			{
			sum=sum+x;
			System.out.println(sum);
			}
			else
			{
			mul=mul*x;
			System.out.println(mul);
			}
			x++;
		}
	
	}
}