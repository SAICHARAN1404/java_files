package com.ExceptionHandling;

import java.util.Scanner;

public class CatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//System.out.println(10/0);
			Z z=new Z();
			z=null;
			System.out.println(z.x);
		}
		catch(ArithmeticException ae) {
			System.out.println("Im arithmetic exception");
		}
		catch(Exception e)
		{
			System.out.println("IM EXCEPTION");
		}
		/*This order is not valid:
//		catch(ArithmeticException ae) {
//			System.out.println("Im in arithmetic expression");
//		}*/
	}
}
class Z
{
	int x;
}
