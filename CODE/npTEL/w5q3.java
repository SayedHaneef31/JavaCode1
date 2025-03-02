

import java.util.Scanner;
  
class w5w3 {
  public static void main(String[] args) { 
      int a, b;
      Scanner sc = new Scanner(System.in);
	  //System.out.println("Enter two values");
	  a=sc.nextInt();
	  b=sc.nextInt();
	 // int c;
	  try
	  {
		  int c;
		  c=a/b;
		  System.out.println(c);
		   
		  
	  }
	  catch (ArithmeticException e)
	  {
		  System.out.println("Exception caught: Division by zero.");
	  }
       
  }
}


// pta nahi qyu nahi chal rha hai???????????
