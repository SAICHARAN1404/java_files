class Products3
{
	public static void main(String args[])
	{
	int p1=1000,p2=2000,p3=999;
	int total=p1+p2+p3;
	double d=0;
	System.out.println("total  "+ total);
	        if (total>4000);
		{	
		if(p1>400)
		  {
			discount=(10/100)*total;
			System.out.println(discount);
		  }
		else
		  {
			discount=(5/100)*total;
			System.out.println(discount);
		  }
	        }
	       else if(total<4000)
	       {
			if(p2>400)
			{
				discount=(16/100)*total;
				System.out.println(discount);
			}
			else
			{
				discount=(12/100)*total;
				System.out.println(discount);
			}
		
	

	     } 
	}
}