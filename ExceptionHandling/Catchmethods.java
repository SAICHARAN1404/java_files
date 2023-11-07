package com.ExceptionHandling;

import java.util.Scanner;

public class Catchmethods {

	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter amy number");
			int x=sc.nextInt();
			int[]a=new int[x];
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]/x);
		}
		catch(ArithmeticException ae) {
			System.out.println("Im arithmeticEx");
		}
		catch(NegativeArraySizeException ne)
		{
			System.out.println("NASE");
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("IM AIOOBE");
		}
	}
}

