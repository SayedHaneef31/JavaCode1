// Assignment 4: Q2
// Complete the code segment to print the current year. Your code should compile successfully.

// Note: In this program, you are not allowed to use any 
// import statement. Use should use predefined class Calendar 
// defined in java.util package.



public class w4_q2
{
    public static void main(String args[])
	{
		int year;
		java.util.Calander current;
		current=java.util.Calander.getInstance();
		year=current.get(java.util.Calander.YEAR);
		
		
		
		
		
		System.out.println("Current year="+year);
		
		
	}
}



//error aa rhi hai:-(
// w4_q2.java:15: error: cannot find symbol
                // java.util.Calander current;
                         // ^
  // symbol:   class Calander
  // location: package java.util
// w4_q2.java:16: error: cannot find symbol
                // current=java.util.Calander.getInstance();
                                 // ^
  // symbol:   class Calander
  // location: package java.util
// w4_q2.java:17: error: cannot find symbol
                // year=current.get(java.util.Calander.YEAR);
                                          // ^
  // symbol:   class Calander
  // location: package java.util
// 3 errors
