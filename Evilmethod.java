class Evilmethod
{
	public static void main(String args[])
	{
		Add add=new Add();
		add.i=9;
		add.forLoop();add.compRes();
		
	}	
}
class Add
{
	int i, square, rem,sum;
	void forLoop()
	{
		for(square =i*i;square>0;square/=10)
		{
			rem=square%10;
			sum=sum+rem;
			
		}
	}
	void compRes()
	{
		
		System.out.println(sum);
		System.out.println(i);
		if(sum==i)
			System.out.println("Evil");
		else
			System.out.println("Not an Evil");
	}
}