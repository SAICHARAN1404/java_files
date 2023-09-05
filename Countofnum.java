class Countofnum
{
	public static void main(String args[])
	{
		int start=-10,end=10,temp1=0,temp2=0,temp3=0;
		while(start<=end)
		{
			if (start>0)
			{
				System.out.println("POSITIVE = "+start);	
				temp1++;
			}
			else if (start<0)
			{
				System.out.println("NEGATIVE = "+start);
				temp2++;

			}
			else
			{
				System.out.println("ZERO =   " + start);	
				temp3++;
			}
		start++;
		}
		System.out.println( "Positive no.s = "+temp1);
		System.out.println( "Negative no.s = "+temp2);
		System.out.println( "zeros = "+temp3);
	}
}