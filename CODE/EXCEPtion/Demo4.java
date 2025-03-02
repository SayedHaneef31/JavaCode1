// finally in try catch block

import java.util.*;
class Demo4
{
	public static void main(String args[])
	{
		int i=0;
		String s[]={"hello java","hello world","hello twinkle"};
		while(i<4)
		{
			try
			{
				System.out.println(s[i]);
				i++;
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
				
			}
			finally
			{
                System.out.println("HI!");
				if(i<3);
				else {System.out.println("YOU should quit");}
			}
		}
	}
}

//endless loop hai!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!