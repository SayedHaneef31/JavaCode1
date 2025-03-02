import java.util.*;
public class Demo5
{
	public static void main(String args[]) throws Exception
	{
		int a[]=new int[3];
		try
		{
			for(int i=0;i<4;i++)
			{
				a[i]=i;
			}
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("fill in Stack trace="+e.fillInStackTrace());
     	    System.out.println("get cause="+e.getCause());
			System.out.println("get localized message="+e.getLocalizedMessage());
     	    System.out.println("get message="+e.getMessage());
			System.out.println("get stack trace="+e.getStackTrace());
			
     	    System.out.println();
     	    System.out.println();
     	    System.out.println("trace=  ");e.fillInStackTrace();
			System.out.println();
			System.out.println("string=  ");e.toString();
			System.out.println();
			System.out.println();
			throw (Exception) new Exception().initCause(e);
			
		}
		finally
		{
			System.out.println(a);
		}
	}
}






// fill in Stack trace=java.lang.ArrayIndexOutOfBoundsException: 3
// get cause=null
// get localized message=3
// get message=3
// get stack trace=[Ljava.lang.StackTraceElement;@15db9742


// trace=

// string=


// [I@6d06d69c
// Exception in thread "main" java.lang.Exception
        // at Demo5.main(Demo5.java:30)
// Caused by: java.lang.ArrayIndexOutOfBoundsException: 3
        // at Demo5.main(Demo5.java:25)