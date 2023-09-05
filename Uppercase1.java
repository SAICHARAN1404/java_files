class Uppercase1
{
	public static void main(String args[])
	{
		char c='j';
		int t=(int)c,i=0;
		//System.out.println(i);
		if (t<=90)
		{
			if(t>=65)
			{
				i=t+32;
			}
		}
		else if (t>=97)
		{
			if (t<=122)
			{
				i=t-32;
			}
		}
		char m=(char)i;
		System.out.println(m);
		
	}

}