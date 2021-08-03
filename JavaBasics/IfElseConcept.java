package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		int a = 10;
		int b= 3;
		if (b>a)
			{
				System.out.println("b is greater than a");
			}
		else
			{
				System.out.println("a is greater than b");
			}
		
			// different operator-- ==, !=, >=,<=, <>
		
		// write the logic to find the higest number
		int a1=1000;
		int b1=700;
		int c1=800;
		
		if(a1>b1 && a1> c1)
			{
				System.out.println("a1 is greatest");
			}
		else if(b1>c1 && b1>a1)
			{
				System.out.println("b1 is greatest");
			
			}
		else
		{
			System.out.println("c1 is greatest");
		}
			
			
		
		
		
	}

}
