class First
{
	public static void main(String args[])
	{
		int dob=2003;
		int currentyear=2023;
		int currentage=currentyear-dob; 
		int days=currentage*365;
		int hours=days*24;
		int minutes=hours*60;
		int months=currentage*12;

		
		System.out.println("currentage ==>"+currentage);
		System.out.println("days ==>"+days);
		System.out.println("hours ==>"+hours);
		System.out.println("minutes ==>"+minutes);
		System.out.println("months ==>"+months);
	}

}