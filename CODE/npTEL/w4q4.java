// Assignment 4: Q4

// Complete the code segment to call the default method in the //interface First and Second.




interface First
{
	default void show()
	{
		System.out.println("Default method implementattion of first interface");
		
	}
	
}
interface Second
{
	default void show()
	{
		System.out.println("Default method implementattion of second interface");
		
	}
}
class w4q4 implements First,Second
{
	public void show()
	{
		First.super.show();
		Second.super.show();
	}	
		
	  public static void main(String args[])
	  {
       w4q4 q = new w4q4(); 
        q.show(); 
      } 
}
