//All exception in  one single catch block.


class demo3
{
	public static int j;
	public static void main(String args[])
	{
		for(int i=0;i<4;i++)
		{
			try
			{
				switch(i)
				{
					case 0:
					     int zero=0;
						 j=999/zero;                   //Divided by zero
						 break;
				    case 1:
                         int b[]=null;                 // NullPointerException
                         j=b[0];
                          break;
					case 2:
						 int c[]=new int[2];           //ArrayIndexOutOfBoundsException
						 j=c[10];
						 break;
				    case 3:
                         char ch="java".charAt(9);
					     break;
						 
				}
			}
			catch(Exception e)
			{
				System.out.println("In test case="+i+" ");
				System.out.println(e.getMessage());
			}
		
	}
}
}