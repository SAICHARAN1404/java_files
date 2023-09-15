package com.Forloop;

public class Rverseincludingzero {

	public static void main(String[] args)
	{
		int num1=15000,num2,rem,rev=0,count1=0,count2=0;
		for(num2=num1;num2>0;num2/=10)
		{
			count1++;//5
			rem=num2%10;
			rev=rev*10+rem;//51
		}
		System.out.println(num1+"  "+count1);
		int temp=rev;
		for(;rev>0;rev/=10)
		{
			count2++;
		}
		int count=count1-count2;
		System.out.println(temp+"  "+count2);
		temp=temp*(int)Math.pow(10,count);
		System.out.println(temp);
	}
}
