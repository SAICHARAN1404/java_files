package com.Forloop;

public class Rangepalindrome {

	public static void main(String[] args)
	{
		int x,y,rem=0,rev;
		for(x=1000;x<=3000;x++)
		{
			rev=0;
			for(y=x;y!=0;y/=10)
			{
				rem=y%10;
				rev=rev*10+rem;
			}
			
			if(rev==x)
				System.out.println(x);
			
		}

	}

}
