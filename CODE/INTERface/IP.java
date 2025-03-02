import java.util.*;
public class IP implements Comparable
{
	private int n[];
	public int compareTo(Object o)
	{
		IP other=(IP)o;
		int result=o;
		for int i=0;i<n.lenght;i++)
	    {
			if(this.getNum(i)<other.getNum(i))
			{
				result=-1;
				break;
			}
			if(this.getNum(i)>other.getNum(i))
			{
				result=1;
				break;
			}
		}
		return result;
		
	}
}
//ye interface check krne ke liye kiya gha but 
//yaaha samajh me hi ni aa rha hai ki kya kre 
//isliye abhi ke liye ise yahi rok diya hai.....