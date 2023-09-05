class Primenumber
{
	public static void main(String args[])
	{
	int num=3,count=0;//4
     	int end=num;
	while(end>=1)
	{
		if(num%end==0)
		{
		
			count++;
		}
	end--;
	}
	System.out.println("Count ="+count);
	if(count==2)
	{
		System.out.println(num+"  Prime number");
	}
	else
	{
		System.out.println(num+"  Not a Prime number");
	}
	}
}