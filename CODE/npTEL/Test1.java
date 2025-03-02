// A class Shape is defined with two overloading constructors in it.
// ther class Test1 is partially defined which inherits the class
 // Shape. The class Test1 should include two overloading 
 // constructors as appropriate for some object instantiation shown in
 // main( ) method. You should define the constructors using the 
 // super class constructors. Also, override the method
 // calculate( ) in Test1 to calculate the volume of a Shape.
// Java Week 3: Q3

import java.util.*;
class Shape
{
	double length ,breadth;
	Shape(double l,double b)
	{
		length=l;
		breadth=b;
		
	}
	Shape(double len)
	{
		length=breadth=len;
	}
	double calculate()
	{
		return length*breadth;
	}
}
public class Test1 extends Shape
{
	double height;
	Test1(double l,double h)
	{
		super(l);
		this.l=l;
		this.h=h;
	}
	Test1(double l,double b,double h)
	{
		super(l,b);
		this.l=l;
		this.b=b;
		this.h=h;
	}
	double calculate()
	{
		return length*breadth*height;
	}

	

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter l,b,h");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		Test1 myshape1=new Test1(l,h);
        Test1 myshape2=new Test1(l,b,h);
        double volume1;
		double volume2;
		volume1=myshape1.calculate();
		volume2=myshape2.calculate();
		System.out.println(volume1);
		System.out.println(volume2);
	}
}



