package com.CONSTRUCTORS;

public class Inheritance {

	public static void main(String[] args) 
	{	
		Child c=new Child();
		c.method1();c.method2();
	}
}
class Parent
{
	int a,b;
	Parent()
	{
		System.out.println("Im in method 1");
	}
	public void method1()
	{
		System.out.println("Im in method 2");
	}
}
class Child extends Parent
{
	int c,d;
	Child()
	{
		//super();
		System.out.println("Im in method 3");
	}
	public void method2()
	{
		System.out.println("Im in method 4");
	}
}
class Grand extends Child
{
	Grand()
	{
		System.out.println("I am Grand son");
	}
	public void m3()
	{
		System.out.println("i am m3");
	}
}