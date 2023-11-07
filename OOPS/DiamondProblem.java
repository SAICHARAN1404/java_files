package com.OOPS;
public class DiamondProblem {
	public static void main(String[] args) {
		Impl impl=new Impl();
		impl.method1();impl.method2();impl.method3();impl.method4();impl.method5();impl.method6();
	}
}
interface i1
{
	public void method1();
	public void method2();
}
interface i2
{
	public void method3();
	public void method4();
}
interface i3
{
	public void method5();
	public void method6();
}
class Impl implements i1,i2,i3
{

	@Override
	public void method5() {
		System.out.println("method5");
	}

	@Override
	public void method6() {
		System.out.println("method6");
	}

	@Override
	public void method3() {
		System.out.println("method3");
	}

	@Override
	public void method4() {
		System.out.println("method4");
	}

	@Override
	public void method1() {
		System.out.println("method1");
	}

	@Override
	public void method2() {
		System.out.println("method2");
	}
}

