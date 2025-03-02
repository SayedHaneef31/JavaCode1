//try with multiple catch block
public class demo2
{
	public static void main (String args[])
	 {    //int j=args.length;
	     // System.out.println(j);
	
		try
		{
			int i=args.length;
			System.out.println(i);
			// String s[]=new String[i];       //ab agr i=0 ho to null pointer exception hogi
			if(args[0].equals("Java"))                  //#1
			{
				System.out.println("First word is java");
				
			}
			System.out.println("Number of arguments= "+i);
			int x=12/i;                                     //#2
			int y[]={55,99};
			y[i]=x;                         //if i>1.............#3         [ArrayIndexOutOfBoundsException]
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by 0= "+e);
		}
		catch(NullPointerException e)
		{
			System.out.println(" A Null Pointer Exception"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index OOB  "+e);
		}
	}
}




//isme 1 dikkat hai ki divided by zero waali error ni aa rhi h


// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion>javac demo2.java

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2
// Array index OOBjava.lang.ArrayIndexOutOfBoundsException: 0

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion>javac demo2.java

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion>java demo2 80 56
 // A Null Pointer Exceptionjava.lang.NullPointerException

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion>javac demo2.java

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2 60 10
// Number of arguments= 2
// Array index OOBjava.lang.ArrayIndexOutOfBoundsException: 2

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2 60 10
// Number of arguments= 2
// Array index OOBjava.lang.ArrayIndexOutOfBoundsException: 2

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion>javac demo2.java

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2 60 10
// Number of arguments= 2
// Array index OOB  java.lang.ArrayIndexOutOfBoundsException: 2

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2 Java
// First word is java
// Number of arguments= 1

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2 Java haneef the great
// First word is java
// Number of arguments= 4
// Array index OOB  java.lang.ArrayIndexOutOfBoundsException: 4

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2
// Array index OOB  java.lang.ArrayIndexOutOfBoundsException: 0

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion>javac demo2.java

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2
// 0
// Array index OOB  java.lang.ArrayIndexOutOfBoundsException: 0

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2 haneef the great
// 3
// Number of arguments= 3
// Array index OOB  java.lang.ArrayIndexOutOfBoundsException: 3

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2
// 0
// Array index OOB  java.lang.ArrayIndexOutOfBoundsException: 0

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2 haneef is the king of the world
// 7
// Number of arguments= 7
// Array index OOB  java.lang.ArrayIndexOutOfBoundsException: 7

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2 Java
// 1
// First word is java
// Number of arguments= 1

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2
// 0
// Array index OOB  java.lang.ArrayIndexOutOfBoundsException: 0

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2
// 0
// Array index OOB  java.lang.ArrayIndexOutOfBoundsException: 0

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2  haneef the great
// 3
// Number of arguments= 3
// Array index OOB  java.lang.ArrayIndexOutOfBoundsException: 3

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2  haneef the great
// 3
// Number of arguments= 3
// Array index OOB  java.lang.ArrayIndexOutOfBoundsException: 3

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2  Java is great
// 3
// First word is java
// Number of arguments= 3
// Array index OOB  java.lang.ArrayIndexOutOfBoundsException: 3

// C:\Users\Sayed Haneef\Desktop\CODE\EXCEPtion> java demo2
// 0
// Array index OOB  java.lang.ArrayIndexOutOfBoundsException: 0