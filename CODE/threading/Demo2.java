//use of yield(),stop{},sleep()

class TA extends Thread
{
	public void run()
	{
		System.out.println("Start from threadA");
		for(int i=1;i<=5;i++)
		{
			if(i==1)
			yield();
		    System.out.println("From threadA :i="+i);
		}
		System.out.println("....Exit ThreadA");
	}
	
}
class TB extends Thread
{
	public void run()
	{
		System.out.println("Start from threadB");
		for(int j=1;j<=5;j++)
		{
			System.out.println("From threadB :j="+j);
			if(j==2)
			stop();
		    
		}
		System.out.println("....Exit ThreadB");
	}
	
}
class TC extends Thread
{
	public void run()
	{
		System.out.println("Start from threadC");
		for(int k=1;k<=5;k++)
		{
			System.out.println("From threadC :k="+k);
			if(k==3)
			{
				try
				{
					sleep(10000);
				}
				catch(Exception e)
				{}				
			}			
		}
		System.out.println("....Exit ThreadC");
	}	
}
class Demo2
{
	public static void main(String args[])
	{
		TA t1=new TA();
		TB t2=new TB();
		TC t3=new TC();
		t1.start();
		t2.start();
		t3.start();
		System.out.println(".............Program khatam...............");
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

// OUTPUT
// .............Program khatam...............
// Start from threadB
// Start from threadC
// Start from threadA
// From threadC :k=1
// From threadB :j=1
// From threadC :k=2
// From threadA :i=1
// From threadC :k=3
// From threadB :j=2
// From threadA :i=2
// From threadA :i=3
// From threadA :i=4
// From threadA :i=5
// ....Exit ThreadA
// From threadC :k=4
// From threadC :k=5
// ....Exit ThreadC