package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 5; 
		String s[][]= new String[a][b];
		s[0][1]="suma";
		s[2][2]="shekar";
		
		//System.out.println(s[a][b]);
		
		//total number of rows
		System.out.println(s.length);
		//total number of columns
		System.out.println(s[2].length);
		
		//print all the values of 2D array
		
		for(int i=0; i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				System.out.print(s[i][j]);
				
			}
			
			System.out.println();
		}

	}

}
