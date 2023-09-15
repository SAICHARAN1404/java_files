package com.Forloop;

public class Evilnumberrange {

	public static void main(String[] args)
	{
		int x,y,rem,sum=0;
		for(x=1;x<=1000000;x++)
		{
			y=x;
			sum=0;
			y=(int)Math.pow(y,2);
			
			for(;y>0;y/=10)
			{
				rem=y%10;
				sum=sum+rem;
			}
			
			if(sum==x)
				System.out.println(sum);
		}
	}
}
