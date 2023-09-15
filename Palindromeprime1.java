package com.Forloop;

public class Palindromeprime1 
{
	public static void main(String[] args)
	{
		int i,num=121,rem,rev=0,count=0;
		for(i=num;i!=0;i/=10)
		{
			rem=i%10;
			rev=rev*10+rem;
		}
		if(num==rev)
		{
			for(int start=2;num/2>start;start++)
			{
				if(start%2==0)
					count++;
			}
			if(count==2)
				System.out.println("palindrome prime");
			else
				System.out.println("palindrome not a prime");
		}
		else 
			System.out.println("Not a palindrome");
	}

}
