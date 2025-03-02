import java.util.*;
class Practical11
{
 public static void main(String args[])
   {
     Scanner sc =new Scanner(System.in);
	 String s = new String();
	 System.out.println("Enter a sentence");
	 s=sc.nextLine();
	 int l=s.length();
	 int i,j,k;
	 char lastchar=s.charAt(l-1);
	 if(lastchar != '?' && lastchar != '.')
	 {
		 System.out.println("Invalid sentence");
		 System.exit(0);
	 }
	 else
	 {
		 String p="";
		 s=s+" ";
	    for(i=0;i<l;i++)
		{
		  char ch=s.charAt(i);			
		  if(ch!=' ')
		   p=p+ch;
		  else
		   {
	        int len=p.le(p.charAt(0););
			System.out.println(p);
			
			
			
			
			
			
			
			
			
			
			
			
			
						
		   }
		p="";
     
     }
}
