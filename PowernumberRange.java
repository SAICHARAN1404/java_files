package com.Forloop;

public class PowernumberRange {

	public static void main(String[] args) 
	{
		int x,y,rem,sum=0,mul=1;
		for(x=8;x<=1000;x++)
		{
			y=x;
			sum=0;
			mul=1;
			for(;y>0;y/=10)
			{
				rem=y%10;
				sum=sum+rem;
				mul=mul*rem;
			}
			if(sum==mul)
				System.out.println(x);
		}
	}
}
