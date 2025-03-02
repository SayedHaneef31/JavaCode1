import java.util.*;
public class han
{
	boolean prime(int a)       //Normal prime checking program
	{
		int cp=0;
		for(int e=1;e<=a;e++)
		{
			if(a%e==0)
				cp++;
		}
		if(cp==2)
			return true;
		else
			return false;
	}
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	han obj=new han();
	int n,i,j;
	int c=0,max=0;
	ArrayList<Integer> item = new ArrayList<Integer>();
	ArrayList<Integer> max_item = new ArrayList<Integer>();
	System.out.println("Enter a no.");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		boolean b=obj.prime(i);
		if(b==true)
		{
			if(c>max)
			{
				max=c;
				
				int size=item.size();
				for(j=1;j<=size;j++)
				{
					int jj =item.get(j);
					max_item.add(jj);
				}
				
			}
				
			c=0;
			item.clear();
		}
		else
		{
			item.add(i);
			c++;
		}	
	}
	int size_2=max_item.size();
	System.out.println(max_item.get(1)+"-"+max_item.get(size_2));
  }
}