import java.util.*;
class Special
{
  int n;
  Special()
  {
    n=0;
  }
  Special(int a)
  {
    n=a;
  }
  void sum()
  {
    int c=0;
    int i;
    for(i=n;i>0;i/=10)
    {
      int k=i%10;
      c++;
    }
    int x,y;
    c=c-1;
    x=n/(int)(Math.pow(10,c));
    y=n%10;
    System.out.println(x+y);
  }
  void isSpecial()
  {
    int sum=0;
    int i,j;
    for(i=n;i>0;i/=10)
    {
      int fac=1;
      int z=i%10;
      for(j=1;j<=z;j++)
      {
        fac=fac*j;
      }
      sum=sum+fac;
    }
    if(sum==n)
    System.out.println("It is a special no.");
    else
    System.out.println("Sorry bro!!!Not a Special no");
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a no.");
    int a1=sc.nextInt();
    Special obj=new Special(a1);
    obj.sum();
    obj.isSpecial();
  }

}
