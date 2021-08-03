package JavaBasics;

public class StringConcatenation {

	public static String takeScreenshots(String FileName)
	{
		String s = FileName;
		String DestinationFile="C:\\Users\\suma7\\eclipse-workspace\\JAVA_SUMASHEKAR\\TestScreenshots\\"+s;
		return DestinationFile;
		
	}
	public static void main(String[] args) {
		/*
		int a=100,b=200;
		double x=12.33, y=16.89;
		// left to right execution
		// + is a concatenation operator
		String s= "hello";
		String s2= "world";
		System.out.println(a+b);
		System.out.println(s+" "+s2);
		//number is added to string values
		System.out.println(a+b+s+s2);
		//string values is added to numbers so it would be taken as it is
		System.out.println(s+s2+a+b);
		
		System.out.println(s+s2+(a+b));
		
		System.out.println(a+b+s+s2+a+b);
		
		/*-----------------------*/
		/*
		System.out.println(x+y);
		System.out.println(x+y+a+b);

		System.out.println(x+y+s+s2);
		int sum= a+b;
		System.out.println(" the sum of two numbers is:"+sum);
		System.out.println(" the sum of two numbers is:"+(a+b));
		
		//ln= new line, used to print on the console or output with a new line, print is just used to print
		System.out.print("hello world");
		System.out.println("i am testing");
		
		*/
		
		
		System.out.println(takeScreenshots("Home.png"));
	
	}
}
