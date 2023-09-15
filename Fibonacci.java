package com.Forloop;

public class Fibonacci 
{
	public static void main(String[] args)
	{
		int a=0,b=1,c,count=0;
		System.out.println(a);//0
		System.out.println(b);//1
		for(;count<=5;count++)//loop will be iterated for 5 times starting from 0
		{
			c=a+b;//c=0+1=1//c=1+1=2//c=1+2=3//c=2+3=5//c=3+5=8//c=8+5=13//
			a=b;//a=1//a=1//a=2//a=3//a=5//
			b=c;//b=1//b=2//b=3//b=5//b=8//
			System.out.println(c);//1//2//3//5//8//13
		}
	}

}
