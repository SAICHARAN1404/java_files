package com.MethodLocalClasses;

public class Outer 
{
	public void m1()
	{
		class Inner
		{
			public void sum(int a,int b)
			{
				System.out.println(a+b);
			}
		}
		Inner I=new Inner();
		I.sum(10,20);
	}
	public static void main(String args[])
	{
		Outer o=new Outer();
		o.m1();
	}
}
