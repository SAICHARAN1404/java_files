package com.OOPS;

public class Extends {

	public static void main(String[] args) {
		A a=new B();
		a.method1();
		a.method2();
		a.method3();
		a.method6();
	}
}
class A
{
	public static void method1()
	{
		System.out.println("A-Method 1");
	}
	public static void method2()
	{
		System.out.println("A-Method 2");
	}
	public void method3()
	{
		System.out.println("A-Method 3");
	}
	public void method6()
	{
		System.out.println("A-Method 6");
	}
	
}
class B extends A
{
	public static void method1()
	{
		System.out.println("B-Method 1");
	}
	public static void method2()
	{
		System.out.println("B-Method 2");
	}
	public void method3()
	{
		System.out.println("B-Method 3");
	}
	public void method4()
	{
		System.out.println("B-Method 4");
	}
	public void method5()
	{
		System.out.println("B-Method 5");
	}
}