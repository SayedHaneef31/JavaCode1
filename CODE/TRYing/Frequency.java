import java.util.*;
class Frequency
{
  int a[];
  int n;
  Frequency(int n)
  {
    this.n=n;

  }
  void getArray()
  {
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<n;i++)
    {

      System.out.println("Enter a no ");              //Yaha jhaam ho sqta hai
      a[i]=sc.nextInt();
       System.out.println("Value of n is  "+n);
    }
  }
  int freq(int x)
  {
    int c=0;
    for(int i=0;i<n;i++)
    {
      if (x==a[i])
      c++;
    }
    return(c);
  }
  void display()
  {

    System.out.println("Frequency of "+j+": "+c1);
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
      System.out.println("Jhaatu bande size btaao");
      int n1=sc.nextInt();
      Frequency obj=new Frequency(n1);
      obj.getArray();
      int j=0;
      int c1=0;
    String s="";
    for (int i=0;i<n1;i++ )
    {
       j=a[i];
      String p=Integer.toString(a[i]);
      if (s.indexOf(p)==-1)
      {
        s=s+p;
        c1=this.freq(j);
        break;
      }
    }
  }
}
