class Profitorloss
{
	public static void main(String args[])
	{
		int costprice=10000;
		int  sellingprice=9999;
		if(costprice<sellingprice)
		{
		int profit=sellingprice-costprice;
		System.out.println("Seller made profit");
		System.out.println(profit);
		}
		else
		{
		int loss=costprice-sellingprice;
		System.out.println("Seller incurred loss");
		System.out.println(loss);
		}

		
	}
}