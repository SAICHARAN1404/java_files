package com.Forloop;

public class PatternX {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int row=8,col=8;
		for(int r=1;r<=row;r++)//r=1<=4
		{
			for(int c=1;c<=col;c++)
			{
				int i=r+c;//
				if(r==c )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
