import java.util.Scanner;
import java.util.ArrayList;
public class Understanding_ArrayList_2 
 {
	public static void main(String[] args)
	  {
		  Scanner sc=new Scanner(System.in);
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		for(int j=0;j<4;j++)
			{
				System.out.println("Enter a no. to be stored");
				int k=sc.nextInt();
				myNumbers.add(k);
			}
		System.out.println(myNumbers.size());
		for (int i : myNumbers) 
		{
		  System.out.println(i);
		}
	  }
}

