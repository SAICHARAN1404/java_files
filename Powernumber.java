class Powernumber
{
	public static void main (String args[])
	{
		int i=217,rem,sum=0,mul=1;
		for(int j=i;j!=0;j/=10)
		{
			rem=j%10;
			sum=sum+rem;
			mul=mul*rem;
		}
		System.out.println(sum==mul?"Power Number":"Not a Power  number");
	}
}