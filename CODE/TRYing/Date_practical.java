//      Question 3 --->

import java.util.*;
class Date_practical
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int d,m,y;
    System.out.println("Enter today's date in dd-mm-yy format");
    d=sc.nextInt();
    m=sc.nextInt();
    y=sc.nextInt();
    int dd1,mm1,yy1,dd2,mm2,yy2;
    int days[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    if((y%400==0) && (y%100!=0 && y%4==0))
    days[2]=29;
    if((m>=1 && m<=12) && (d>=1 && d<=days[m]) && (y>0))
    {
      System.out.println("Valid Date");
      dd1=d-1;
      mm1=m;
      yy1=y;
      if(mm1==0)
      {
        mm1=12;
        yy1--;
      }
      dd1=days[m];
    }
    dd2=d+1;mm2=m;yy2=yy2=y;
    if(dd2>days[mm2])
    {
      mm2++;
      if(mm2==13)
      {
        mm2=1;
        yy2++;
      }
    dd2=1;
    }
    if(yy1>0)
    {
      System.out.println("Previous Date"+dd1+"-"+mm1+"-"+yy1);
    }
    else
  }
}
