package com.Forloop;

public class Reverse {

	public static void main(String[] args) 
	{
		 int num=123456,rem,rev=0;
		 int reverse=0,rem2;
	     for(;num!=0;num/=10)
	     {
	    	 rem=num%10;
	    	 System.out.println((rem%2==0)?rem--:rem++);
	         rev=rev*10+rem;
	     }
	    for(;rev!=0;rev/=10)
	    {
	    	rem2=rev%10;
	    	reverse=reverse*10+rem2;
	    }
	    System.out.println(reverse);
	}
	

}
