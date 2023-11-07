class Thread
{
	public static void main(String args[])
	{
		Demo demo=new Demo();
		demo.start();
	}
}
class Demo extends Thread
{
	public void run()
	{
		Thread.sleep(100);
	}
}