package com.Forloop;

public class Sumofnumbers
{

	public static void main(String[] args)
	{
		int num,rem=0,digits=0,sum=0,mul=1;
		for(num=256;num!=0;num=num/10)
		{
			rem=num%10;
			sum=sum+rem;
			digits++;
			mul=mul*rem;
			System.out.println(rem+" =rem");
		}
		
		System.out.println(sum+" =sum");
		System.out.println(digits+" =digits");
		System.out.println(mul+" =mult");
	}

}
