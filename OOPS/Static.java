package com.OOPS;

public class Static {

	static int i=10;
	public static void main(String[] args) {
		int a=4;
		System.out.println(a+i);
		Meth1();
	}
	static
	{
		int a=9;
		System.out.println("Hello");
	}
	public static void Meth1()
	{
		System.out.println("Everyone");
	}
}
