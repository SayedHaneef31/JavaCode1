//demonstration of method: getID()
//using runnable interface


class ThreadID implements Runnable
{
	public void run()
	{
		try
		{
			System.out.println("Thread="+Thread.currentThread().getId()+" is running");          //yaha pe current thread jo hai vo //btaaega ki konsa thread execution mai hai aur getId uki Id btaaega ....
		}
		catch(Exception e)
		{
			System.out.println("Exception is occured");
			
		}
	}
}
public class Demo
{
	public static void main(String args[])
	{
		int n=0;
		for(int i=0;i<5;i++)
		{
			ThreadID a=new ThreadID();
			Thread obj=new Thread(a);
			obj.start();
		}
	}
}