package com.OOPS;
public class Default {
	public static void main(String[] args) 
	 {
		Parent1 p=new Child1();
		p.A();
	}
}
class Parent1
{
	
	public static  void A()
	{
		System.out.println("HELLO");
	}
}
class Child1 extends Parent1
{
	public static void A()
	{
		System.out.println("Hello");
	}
}