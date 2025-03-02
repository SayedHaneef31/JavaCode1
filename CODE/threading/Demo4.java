//Setting priority in thread

class TaA extends Thread
{
	public void run()
	{
		System.out.println("Start from threadA");
		for(int i=1;i<=5;i++)
		{
			// if(i==1)
			// yield();
		    System.out.println("From threadA :i="+i);
		}
		System.out.println("....Exit ThreadA");
	}
	
}
class TbB extends Thread
{
	public void run()
	{
		System.out.println("Start from threadB");
		for(int j=1;j<=5;j++)
		{
			System.out.println("From threadB :j="+j);
			// if(j==2)
			// stop();
		    
		}
		System.out.println("....Exit ThreadB");
	}
	
}
class TcC extends Thread
{
	public void run()
	{
		System.out.println("Start from threadC");
		for(int k=1;k<=5;k++)
		{
			System.out.println("From threadC :k="+k);
			// if(k==3)
			// {
				// try
				// {
					// sleep(10000);
				// }
				// catch(Exception e)
				// {}				
			// }			
		}
		System.out.println("....Exit ThreadC");
	}	
}
class Demo4
{
	public static void main(String args[])
	{
		TaA t1=new TaA();
		TbB t2=new TbB();
		TcC t3=new TcC();
		t3.setPriority(Thread.MAX_PRIORITY);
    	t2.setPriority(t2.getPriority()+1);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t2.start();
		t3.start();
		t1.start();
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
 
 // Start from threadC
// From threadC :k=1
// From threadC :k=2
// From threadC :k=3
// From threadC :k=4
// From threadC :k=5
// ....Exit ThreadC
// Start from threadB
// .............Program khatam...............
// From threadB :j=1
// From threadB :j=2
// From threadB :j=3
// From threadB :j=4
// From threadB :j=5
// ....Exit ThreadB
// Start from threadA
// From threadA :i=1
// From threadA :i=2
// From threadA :i=3
// From threadA :i=4
// From threadA :i=5
// ....Exit ThreadA