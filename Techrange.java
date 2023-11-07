class Techrange
{
	public static void main(String args[])
	{
		int range=1000,rem,digits=0;
		for(int i=1;i<=range;i++)
		{
			digits=0;
			for(int j=i;j>0;j/=10)
			{
				rem=j%10;
				digits++;
			}
			
			(int)Math.pow(10,digits);
		}
		
	}
}