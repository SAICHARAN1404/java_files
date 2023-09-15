package com.Forloop;

public class Rangeofreverse {

	public static void main(String[] args)
	{
		int x,y,rem,rev=0,count1=0,count2=0;
		for(x=1;x<=100;x++)
		{
			rev=0;
			count1=0;
			for(y=x;y>0;y/=10)
			{
				count1++;
				rem=y%10;
				rev=rev*10+rem;
			}
			count2=0;
			int temp=rev;
			for (;rev>0;rev/=10)
			{
				count2++;
			}
			int count=count1-count2;
			temp=temp*(int)Math.pow(10,count);
			System.out.println(temp);
		}
		
	}

}
