package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		//for loop----initialization, conditional and incremental part
		//i++ or i+1 ---use the value and then increment
		//++i----increment the value and then use it
		for(int i=10;i>=1;i--) 
		{
			System.out.println(i);
		}
		System.out.println("*********************");
		//while loop
		//if we miss the incremental/ decremental part it will go to infinite loop
		int i=1;
		while(i>=10)
		{
			System.out.print(i+" ");
			i=i+1;
		}

	}

}
