class First
{
	public static void main(String args[])
	{
	String productname="APPLE  IPHONE 14  (blue,128GB)";
	String discount="EXTRA 11901 off";
	int originalprice=79900;
	double offerprice=(14.0/100)*originalprice;
	double totalprice=originalprice-offerprice;
	double Bankoffer=totalprice-4000;
	double price=Bankoffer-7000;
	double cashback=(5.0/100)*price;
	System.out.println("cashback==>"+cashback);

	double supercoins=(price)/50;

	
        System.out.println("productname ==>"+productname);
	System.out.println("discount  ==>"+discount);
	System.out.println("originalprice ==>"+originalprice);
	System.out.println("total price ==>"+totalprice);
	System.out.println("HDFCBankoffer==>"+Bankoffer);
	System.out.println(supercoins);
	System.out.println("offerprice ==>"+offerprice);
	System.out.println("price ==>"+price);
	System.out.println("supercoins ==>"+supercoins);

	}

}