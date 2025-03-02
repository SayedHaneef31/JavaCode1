// Java Week 5: Q1
// An interface Number is defined in the following program.  You have to declare a  class A, which will implement the interface Number. Note that the method findSqr(n) will return the square of the number n.

import java.util.Scanner;
interface Number {
    int findSqr(int i);  // Returns the square of n
}

class A implements Number
{
	int sqr;
	public int findSqr(int k)                                  // is function ko public hona bahut zaroori haio........
	{
		sqr=k*k;
		return sqr;
	}
   	
}
public class w5q1{ 
        public static void main (String[] args){ 
	      A a = new A();   //Create an object of class A
           // Read a number from the keyboard
           Scanner sc = new Scanner(System.in);  
           int i = sc.nextInt();
           System.out.print(a.findSqr(i)); 
    } 
}


//ho nahi rha hai........