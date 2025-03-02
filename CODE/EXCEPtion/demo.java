class demo
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a/b;
		System.out.println("Value of c="+c);
		
	}
}

// agr is program me (4.5 aur 5) pass krde toh [NumberFormatException] exception aaega
// Exception in thread "main" java.lang.NumberFormatException: For input string: "4.5"
        // at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        // at java.lang.Integer.parseInt(Integer.java:580)
        // at java.lang.Integer.parseInt(Integer.java:615)
        // at demo.main(demo.java:5)