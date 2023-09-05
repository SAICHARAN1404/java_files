class Perfectsquare
{
	public static void main(String args[])
	{
	int a=25;
	double d=Math.sqrt(a);
	System.out.println(d);
	if (a%d==0)
	{
		System.out.println("perfect square");
	}
	else
	{
		System.out.println("Not a perfect square");
	}
	}
}