package com.Forloop;

public class Prime1to10 {

	public static void main(String[] args)
	{
		int i,j,count=0;
		for(i=2;i<=10;i++)
		{
			count=0;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(i);
		}
	}

}
