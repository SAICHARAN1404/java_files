package com.Forloop;

public class Armstrong_ {

	public static void main(String[] args)
	{
		int num=153,digits=0,rem=0;
		double sum=0;
		for(int i=num;i!=0;i/=10)
		{
			
			
			digits++;
			System.out.println(rem);
		}
		for(int j=num;j!=0;j/=10)
		{
			rem=j%10;
			sum=sum+(Math.pow(rem,digits));
			
		}
		if(sum==num)
			System.out.println("Armstrong");
		else
			System.out.println("not armstrong");
	}
}
