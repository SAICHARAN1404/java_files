package com.Forloop;

public class AliennumberRange {

	public static void main(String[] args)
	{
		int i,j,rem,rem2,rev2=0,rev=0;
		int square1,square2;
		for(i=1;i<=10;i++)
		{
			j=i;
			rev=0;
			square1=(int)Math.pow(j,2);
			for(;square1!=0;square1/=10)
			{
				rem=square1%10;
				rev=rev*10+rem;//12==21
			}
			rev2=0;
			square2=(int)Math.pow(rev,2);
			for(;square2>0;square2/=10)
			{
				rem2=square2%10;
				rev2=rev2*10+rem2;
			}
			if(rev==rev2)
				System.out.println(rev);
		}
	}

}
