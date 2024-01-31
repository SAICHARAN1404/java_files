package com.MethodLocalClasses;

public class Out 
{
	public static void main(String[] args) 
	{
		Outer o=new Outer();

	}
	int a=10;
	static int b=199;
	public  void m1()
	{
		class Inner
		{
			public void m2()
			{
				System.out.println(a);
				System.out.println(b);
			}
		}
		Inner i=new Inner();
		i.m2();
	}
}
