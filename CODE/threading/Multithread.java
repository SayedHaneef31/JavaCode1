//making Thread from thread class

import java.util.*;
class ThreadA extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println("From threadA with i="+-1*i);
		}
		System.out.println("Exiting from ThreadA");
	}
}
class ThreadB extends Thread
{
	public void run()
	{
		for (int j=1;j<=5;j++)
		{
			System.out.println("From threadB with j="+-1*j);
		}
		System.out.println("Exiting from ThreadB");
	}
}
class Multithread
{
	public static void main(String args[])
	{
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
		a.start();
		b.start();
		
		System.out.println("Multithreading is over 1");
		System.out.println("Multithreading is over 2");
		System.out.println("Multithreading is over 3");
		System.out.println("Multithreading is over 4");
		System.out.println("Multithreading is over 5");
		System.out.println("Multithreading is over 6");
	}
}