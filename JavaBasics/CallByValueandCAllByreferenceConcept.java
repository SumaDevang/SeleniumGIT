package JavaBasics;

public class CallByValueandCAllByreferenceConcept {
	

	int a = 10;
	int b= 30;
	
	public int test(int x , int y)
	
	{
		int c= x+y;
		return c;
	}
	
	public void swap(CallByValueandCAllByreferenceConcept t)
	{
		int temp;
		temp = t.a;
		t.a = t.b;
		t.b = temp;
		
	}

	public static void main(String[] args) {
		// call by value or pass by value is passing the value of the variable
		//call by reference is passing the variable itself
		
		CallByValueandCAllByreferenceConcept obj = new CallByValueandCAllByreferenceConcept();
		
		System.out.println(obj.test(10, 20));
		
		System.out.println("before Swap");
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		System.out.println("after Swap");
		
		obj.swap(obj);
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		
				

	}

}
