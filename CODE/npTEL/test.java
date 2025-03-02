 // This program to exercise the call of static and non-static methods.
 // A partial code is given defining two methods, namely sum( ) 
 // and multiply ( ). You have to call these methods to find the sum
 // and product of two numbers. Complete the code segment as 
 // instructed.  
 // Java Week 3: Q4
 import java.util.*;
 class Ques
 {
	 int sum(int a,int b)
	 {
		 return a+b;
	 }
	 static int multiply(int a,int b)
	 {
		 return a*b;
	 }
	 
 }
 public class test
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 int n1=sc.nextInt();
	     int n2=sc.nextInt();
		 Ques obj=new Ques();
		 System.out.println(obj.sum(n1,n2));
		 System.out.println(obj.multiply(n1,n2));
		// int mul=obj.multiply(n1,n2);
	 }
	 
 }
 
 
 
 //static keyword jo hai usme object bnaane ki zaroorat nahi hoti
// h lekin ....lekin jb same class me ho 



// aur jb do class ho (jaise ki upar waala program h) aur
// phli class me kuch static declare kiya ho toh aur hme doosri class me use aacess krna 
// ho to
// .
// .
// .
// hme doosri classs me uska object bnaana parega ......
// DONE
