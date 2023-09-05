class  _Switchper
{
    public static void main(String args[])
    {
        int a=65,b=35;
        switch(1)
        {
            case 1 :if(a>=55 && b>=45 || (a<55 && a>=45) && b>=45)
                    {
                        System.out.println("pass");
                    }
                    
                    else if (b<45 && a>=65)
                    {
                        System.out.println("B is allowed to reappear to qualify");
                    }
                    else
                    {
                        System.out.println("Fail");
                    }
                                break;
        default : System.out.println("Error");
        }
    }
}