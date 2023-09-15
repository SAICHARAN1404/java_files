package com.Forloop;

public class Patterns {

	public static void main(String[] args)
	{
		int rows=6,col=6;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=col;y++)
			{
				if(x==1 || y==1 || x==rows || y==col || x==y )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
