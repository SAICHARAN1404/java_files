package com.ExceptionHandling;
import java.util.Scanner;
public class Throw {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A VALUE");
		int total=sc.nextInt();
		int deduced=sc.nextInt();
		if(deduced<=total)
		{
			total=total-deduced;
			System.out.println(total);
		}
		else
		{
			try {
				throw new ArithmeticException("Insufficient Balance");
			}
			catch(ArithmeticException ae) {
				System.out.println("Please Withdrawl less than "+total);
			}
		}
	}
}
