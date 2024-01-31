package com.LambdaExpressions;

public class Interface 
{
	public static void main(String[] args) 
	{
		New obj=(int a) ->{System.out.println("Hello");
			System.out.println(a);
		};
		obj.Meth(100);		
	}
}
interface New
{
	public void Meth(int a);
}
