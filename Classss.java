class Classss
{
	public static void main(String args [])
	{
	int x=10,y=15;
	int z;
	System.out.println("BEFORE SWAPPING   " + x    + "   " +y);
	z=y;//15
	y=x;//y=10
	x=z;//x=15
	System.out.println("AFTER SWAPPING     "+  x    +"    "+y);
	x=x+y;//25
	y=x-y;//15
	x=x-y;//10
	System.out.println(x+"  "+y);

	
	}
}