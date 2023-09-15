package com.Forloop;
public class OneTwo
{
	public static void main(String[] args) 
	{
	   int num=150190,rem,rem1,rev=0,count1=0,count2=0;
	   for (int i=num;i!=0;i/=10)
	   {
		   count1++;
	       rem=i%10;
	       rev=rev*10+rem;
	       
	   }
	   for(;rev!=0;rev/=10)
	       {
		   count2++;
	    	rem1=rev%10;   
	       if(rem1==1)
	            System.out.print("ONE ");
	       else if(rem1==2)
	            System.out.print("TWO ");
           else if(rem1==3)
	            System.out.print("THREE ");
	       else  if(rem1==4)
	            System.out.print("FOUR ");
	       else if(rem1==5)
	            System.out.print("FIVE ");
	       else if(rem1==6)
	            System.out.print("SIX ");
	       else if(rem1==7)
	            System.out.print("SEVEN ");
	       else if(rem1==8)
	            System.out.print("EIGHT ");
	       else if(rem1==9)
	            System.out.print("NINE ");
	       else if(rem1==0)
	    	   System.out.print("ZERO ");
	           
	       }
	   int count=count1-count2;//3
	   for(;count!=0;count--)
	   {
		   System.out.print("ZERO ");
	   }
	        
	}
}
