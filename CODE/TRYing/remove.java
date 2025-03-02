import java.util.*;
class remove
{
  String sent;
  String rem;
  int size;
  remove()
  {
    sent="";
    rem="";
    size=0;
  }
   void readsentence()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a sentence");
    sent=sc.nextLine();
    // sent=sent.toLowwerCase();
  }
   void remfirstlast()
  {

    int i,j;
    String p="";
    sent=sent+" ";
    size=sent.length();
    for(i=0;i<size;i++)
    {
     
      char ch=sent.charAt(i);
      if(ch!=' ')
      {
      p=p+ch;
      }
      else
       {
        if(p.length()<3)
        rem=rem+" ";
        else
        {
          p=p.substring(1,p.length());
          rem=rem+p;
          rem=rem+" ";
        }
       }
	    p="";
     }
   }
   void display()
  {
    System.out.println(sent);
    System.out.println(rem);
  }
  public static void main(String args[])
  {
    remove obj=new remove();
    obj.readsentence();
    obj.remfirstlast();
    obj.display();
  }
}
