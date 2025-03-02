import java.util.*;
class Q1
{
	Scanner sc=new Scanner(System.in);
	int e1=sc.nextInt();
	int e2=sc.nextInt();
}
public class Q2
{
	
	 
	static void swap(Q1 q)
	{int temp;
	 temp=q.e1;
	 q.e1=q.e2;
     q.e2=temp;
    }  

	 public static void main(String args[])
	 {
		 Q1 t=new Q1();
		 swap(t);
		 System.out.println(t.e1+" "+t.e2);
	 }
 }