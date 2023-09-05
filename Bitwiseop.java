class Bitwiseop
{
	public static void main(String args[])
	{
		int a=16,b=19;
		System.out.println("Before swapping"+a+"    "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping  "+a+"    "+b);
	}
}