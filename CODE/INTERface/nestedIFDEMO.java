import java.util.*;
class A
{
	public interface NestedIF
	{
		boolean isNotNegative(int x);
	}
}
class B implements A.NestedIF
{
	public boolean isNotNegative(int x)
	{
		return x<0?false:true;
	}
}
class nestedIFDEMO
{
	public static void main(String args[])
    {
		A.nestedIFDEMO nif=new B();
		if(nif.isNotNegative(10))
			System.out.println("10 is not negative");
		if(nif.isNotNegative(-515))
			System.out.println("This won't be displayed");
		
	}	
}
// nested interface ka example h.....
//output->

// nestedIFDEMO.java:20: error: cannot find symbol
                // A.nestedIFDEMO nif=new B();
                 // ^
  // symbol:   class nestedIFDEMO
  // location: class A
// 1 error
