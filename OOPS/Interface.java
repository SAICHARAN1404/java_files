package com.OOPS;

public class Interface {

	public static void main(String[] args) {
		S2 s=new S2();
		s.method1();
		s.method2();
		s.method3();
		s.method4();
	}
}
interface S1
{
	public abstract void method1();
	public abstract void method2();
	public abstract void method3();
	public abstract void method4();
	
}
class S2 implements S1
{
	@Override
	public void method1()
	{
		System.out.println("Im method 1");
	}
	public void method2()
	{
		System.out.println("Im method 2");
	}
	public void method3()
	{
		System.out.println("Im method 3");
	}
	public void method4()
	{
		System.out.println("Im method 4");
	}
}