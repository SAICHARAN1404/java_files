class Payslip
{
	public static void main(String[] args)
        {
        	String employeename="BANDARU SAI CHARAN TEJA";
        	System.out.println("employeename ----------------"+employeename);
       		int employeeid=205;
        	System.out.println("employeeid       ----------------"+employeeid);
        	String Bank="HDFC";
        	System.out.println("Bank                   -----------------"+Bank);
        	String doj="april2023";
        	System.out.println("doj                     ------------------"+doj);
        	String location="HYDERABAD";
        	System.out.println("location            ------------------"+location);
        	char dep='a';
        	System.out.println("dep                   ------------------"+dep);
        	int basic=60200,ha=23576,pa=57300,sa=2200;
        	System.out.println("basic                ------------------"+basic);
        	int  grossearnings=basic+ha+pa+sa;
        	System.out.println("grossearnings -----------------"+grossearnings);
        	int pf=7224,professionaltax=200,it=17569;
        	int grossdeductions=pf+professionaltax+it;
        	System.out.println("grossdeductions-------------"+grossdeductions);
        	int Netpay=grossearnings-grossdeductions;
        	System.out.println("Netpay          -----------------"+Netpay);
                double totaltax=(10.0/100)*Netpay;
		System.out.println("totaltax      -----------------"+totaltax);
		if(Netpay==grossearnings)
		{
			System.out.println("WRONG CALCULATION");
		}
		else
		{
			System.out.println("PERFECT CALCULATION");
		}
	}
}