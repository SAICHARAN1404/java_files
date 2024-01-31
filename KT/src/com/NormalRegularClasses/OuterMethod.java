package com.NormalRegularClasses;

public class OuterMethod 
{
	public static void main(String[] args) 
	{
		OuterMethod o=new OuterMethod();
		o.m1();
	}
	public void m1()
	{
		Inner i=new Inner ();
		i.m2();
	}
	class Inner
	{
		public void m2()
		{
			System.out.println("Inner class method");
		}
	}
}
