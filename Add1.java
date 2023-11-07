class Add1
{
	public static void main(String args[])
	{
		try{
			String s=new String("saicharan");
			System.out.println(s.charAt(10));
		}
		catch(StringIndexOutOfBoundsException x){
			System.out.println("ERROR OCCURED");
		}
	}
}