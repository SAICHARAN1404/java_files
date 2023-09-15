package com.Forloop;

public class Palindromeprime {

	public static void main(String[] args)
	{
		 int num=22,rem,reverse=0,count=0;
	     int i=num;
	     for(;num!=0;num/=10)
	     {
	    	 rem=num%10;
	         reverse=reverse*10+rem;  
	     }
	     
	     
	     for (int start=2;i/2>=start;start++)
         {
        	 if (i%start==0)
        	 {
        		 count++; 
        		 break;
        	 }	         
         }
	     if(count==0 && i==reverse)
	     {
	    	 System.out.println("palindrome prime");
	    	 
	     }
	     else
	    	 System.out.println("not a palindrome prime");
	}
	     
	     

}
