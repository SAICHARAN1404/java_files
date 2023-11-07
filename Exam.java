class Exam
{
	public static void main(String args[])
	{
		int row=4;
		for(int r=1;r<=row;r++)
		{
			for(int c=r;c>=1;c--)
			{
				System.out.print(c);
			}
		
		System.out.println();
		}
		for(int j=row;j>=1;j--)
		{		
			for(int k=j;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	
	}
}