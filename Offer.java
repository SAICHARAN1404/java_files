class   Offer     
{
	public static void main(String args[])
	{
	String Ac="LG";
	double p=50000;	
	System.out.println("IF THE PRICE IS MORE THAN 2000 39% DISCOUNT WILL BE DEDUCTED");
	System.out.println("IF THE PRICE IS MORE THAN 2000 19% DISCOUNT WILL BE DEDUCTED");
	if(p>2000)
	{
	double d=(39.0/100)*p;
	System.out.println(d);	
	}
	else 
	{
	double discuont=(19.0/100)*p;
	System.out.println(discount);
	}
	double finalp=(p-discount);
	double gst=(5/100)*finalp;
	double fittingcharges=999;
	double withaccessories=1999;
	double totalpayment=finalp+gst+fittingcharges+withaccessories;
	System.out.println(totalpayment);
	}
}