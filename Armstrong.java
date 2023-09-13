class Armstrong
{
	public static void main(String args[])
	{
		int num=153,rem,digits=0;
		double sum=0;
		for(int i=num;i!=0;i/=10)
		{
			digits++;
		}
		for(int i=num;i!=0;i/=10)
		{
			rem=i%10;
			sum=sum+Math.pow(rem,digits);
		}
		System.out.println(sum==num?"Armstrong":"Not an armstrong");
	}
	
}