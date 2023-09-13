class Evilnumber
{
	public static void main (String args[])
	{
		int num=9,rem,sum=0;
		int  i=(int)Math.pow(num,2);
		for(int j=i;j!=0;j/=10)
		{
			rem=j%10;
			sum=sum+rem;
		}
		System.out.println(sum==num?"Evil number":"Not an evil number");
	}
}