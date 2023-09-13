class Automaticnumber
{
	public static void main (String args[])
	{
		int num=76,rem,count,rev=0,digits=0;
		double d=Math.pow(num,2);
		for(int j=num;j!=0;j/=10)
		{
			digits++;	
		}
		System.out.println(digits);
		for(int i=num;i!=0;i/=10)
		{	
			rem=i%10;
			rev=rev*10+rem;
		}
		if(rev%100==num)
		{
			System.out.println("Automatic");
		}
		else
		{
			System.out.println("not");
		}
	}
}