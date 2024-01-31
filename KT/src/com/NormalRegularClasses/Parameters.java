package com.NormalRegularClasses;

public class Parameters 
{
	public static void main(String[] args) 
	{
		Outer1.Inner I=new Outer1().new Inner();
		I.m1("Sai");
	}
}
class Outer1
{
	class Inner
	{
		public void m1(String s)
		{
			System.out.println(s);
			System.out.println("Im inside Outer class inside Inner clas method");
		}
	}
}
