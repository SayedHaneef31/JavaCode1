import java.util.ArrayList;
public class Understanding_ArrayList_1 
{
  public static void main(String[] args)
  {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
	System.out.println(myNumbers.size());
    for (int i : myNumbers) 
	{
      System.out.println(i);
    }
  }
}

