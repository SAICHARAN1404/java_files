class  Descending
{
	public static void main(String args[])
	{
		int a=205,b=3009,c=10000;
		if(a<b)
		{
		        int d;
			d=a;
			a=b;
			b=d;
		} 
		if (a<c)
		{
			int d;
			d=a;
			a=c;
			c=d;
		}
		if(b<c)
		{
			int d;
			d=b;
			b=c;
			c=d;
		}
		System.out.println("final a value "+a);
		System.out.println("final b value  "+b);
		System.out.println("final c value  "+c);
	}				
}