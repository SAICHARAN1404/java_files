package com.Forloop;

public class Armstrongrange {

	public static void main(String[] args)
	{
		int x,y,rem,count=0,sum=0;
		for (x=1;x<=10000;x++)
		{
			count=0;
			for(y=x;y>0;y/=10)
			{
				count++;//1
			}
			sum=0;
			for(y=x;y>0;y/=10)
			{
				rem=y%10;
				sum=sum+(int)Math.pow(rem, count);
			}
			if(sum==x)
				System.out.println(sum);
		}
	}

}
