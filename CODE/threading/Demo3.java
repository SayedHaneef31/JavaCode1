//use of suspend() and resume()

class TheA extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("First thread start running");
			sleep(5000);
			System.out.println("First thread finishes running");
		}
		catch(Exception e){}
	}	
}
class TheB extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Second thread starts running");
			System.out.println("Second thread is going to suspenditself");
			suspend();
			System.out.println("Second thread again started running");
		}
		catch(Exception e){}
	}
	
}
class Demo3
{
	public static void main(String args[])
	{
		try
		{
			TheA t1=new TheA();
		    TheB t2=new TheB();
			t1.start();
		    t2.start();
			System.out.println("............reviving the second thread ...............");
			//t2.resume();
		}
        catch(Exception e){}
		
		// int i,j;
		// for(i=1;i<=5;i++)
		// {
			// for(j=1;j<=5;j++)
			// {
				// System.out.print("*");
			// }
			// System.out.println();
		
	 }
 }

