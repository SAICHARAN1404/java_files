package com.OOPS;
public class Final
{
	public static void main(String[] args) {
		 A2 a=new A2();
		 a.method1();
	}
}
class A1
{
	final int c=10;
	public void  method1()
	{
		System.out.println("Im in method1");
	}
}
final class A2 extends A1
{
	public void method1()
	{
		System.out.println("Im im A2 MEthod 2");
	}
}
