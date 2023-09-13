class Aliennumber
{
	public static void main(String args[])
	{	
		int num=14,rem,rev=0,rem1,rev1=0;
		double d2;
		double d1=(int)Math.pow(num,2);
		for (int i = num;i!=0;i/=10)
		{
			rem=i%10;
			rev=rev*10+rem;
		}
		d2=(int)Math.pow(rev,2);
		for(int j=(int)d1;j!=0;j/=10)
		{
			rem1=j%10;
			rev1=rev1*10+rem1;
		}
		System.out.println(rev1==d2?"Alien number":"Not");
	}
}	