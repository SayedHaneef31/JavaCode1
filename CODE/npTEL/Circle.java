// Define a class Point with two fields x and y each of type double.
 // Also , define a method distance(Point p1, Point p2) to calculate
 // the distance between points p1 and p2 and return the value in
 // double. Complete the code segment given below.
 // Use Math.sqrt( ) to calculate the square root.
 
 //Java Week 3: Q2
import java.util.*;
class Point()
{
	double x;
	double y;
	public double Distance(Point p1,Point p2)
	{
		double result;
		result=Math.sqrt((Math.pow(p2.x-p1.x),2)+(Math.pow(p2.y-p1.y),2));
		return result;
	
	}

}
// yaha se vneeche tk diya hua gha 
public class Circle extends Point
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Point c=new Point();
		c.x=sc.nextDouble();
		c.y=sc.nextDouble();
		Point p =new Point();
	    p.x=sc.nextDouble();
		p.y=sc.nextDouble();
		Circle c1=new Circle();
		c1.distance(c,p);
		
	}
}
// yaha tk







// error aa rhi hua


// Circle.java:9: error: '{' expected
// class Point()
           // ^
// Circle.java:16: error: ')' expected
                // result=Math.sqrt((Math.pow(p2.x-p1.x),2)+(Math.pow(p2.y-p1.y),2));
                                                     // ^
// Circle.java:16: error: ')' expected
                // result=Math.sqrt((Math.pow(p2.x-p1.x),2)+(Math.pow(p2.y-p1.y),2));
                                                                             // ^
// Circle.java:16: error: not a statement
                // result=Math.sqrt((Math.pow(p2.x-p1.x),2)+(Math.pow(p2.y-p1.y),2));
                                                                              // ^
// Circle.java:16: error: ';' expected
                // result=Math.sqrt((Math.pow(p2.x-p1.x),2)+(Math.pow(p2.y-p1.y),2));
                                                                               // ^
// 5 errors