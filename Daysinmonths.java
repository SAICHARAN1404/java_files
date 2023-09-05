class Daysinmonths
{
	public static void main(String args[])
	{
		int month=13;
		if (month==1 || month==3 || month==5 || month==7 || month==9 || month==11)
			System.out.println("THIS MONTH HAS 31 DAYS");
		else if (month ==2 )
			System.out.println("THIS MONTH HAS 28 DAYS");
		else if(month<=12)
			{
				System.out.println("THIS MONTH HAS 30 DAYS");
			}
			else
			{
				System.out.println("INVALID INPUT");
			}
	} 
}