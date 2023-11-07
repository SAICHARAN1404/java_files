class Diamond
{
	public static void main(String args[])
	{
		int row=5,r,c;
		for( r=1;r<=row;r++)
		{
			for( c=r;c>=1;c--)
			{
				System.out.print(" "+"  ");
			}
			for(int i=1;i<=r;i++)
			{
				if(r==c || c==1)
					System.out.print(r+"  ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}		