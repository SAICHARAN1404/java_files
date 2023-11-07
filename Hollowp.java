class Hollowp
{
	 public static void main(String args [])
	{
		int row=4,z,m;
		for(int x=1;x<=row;x++)
		{
			for(int y=row-1;y>=x;y--)
			{
				System.out.print(" ");
			}
			for(z=1;z<=x;z++)
			{	
				if(z==1 || x==z)
					System.out.print(x+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=row-1;i>=1;i--)
		{ 
			for(int j=row-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=row;k>=1;k--)
			{
				if(k==i)
					System.out.print(k+" ");
				else 
					System.out.print("");
			}
			
			System.out.println();
		}
	}
}