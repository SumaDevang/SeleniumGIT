package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayConcept {

	//private static Object 'a';

	public static void main(String[] args) {
		
		/*
		// duplicates are not allowed and latest value will be taken
		int i = 20;
		i = 10;
		System.out.println(i);
		
		/* array: to store similar data types in a array variable
		one- dimensional array
		integer array, character array, boolean array, string array
		j[0], j[1], j[2], j[3], j[4]
		lowest bound/ index = 0
		highest bound / index= n-1, where n is size of array
		 */
		/*
		int j[] = new int[5];
		j[0] = 10;
		j[1] = 20;
		j[2] = 30;
		j[3] = 40;
		j[4] = 50;
		System.out.println(j[3]);
		
		// array index out of bound exception, when it does not exist, interview quest
		//System.out.println(j[5]);
		
		// to print the size of array
		System.out.println(j.length);
		
		//to print all the values of array
		
		for( int k=0; k<j.length; k++)
		{
			System.out.print(j[k]+" ");
		} 
		
		System.out.println();
		int k = 0;
		
		while(k<j.length)
		{
			System.out.print(j[k]);
			k++;
		}
		
		System.out.println();
		//double array
		
		double d[] = new double[3];
		d[0] = 10.22;
		d[1] = 15.66;
		d[2] = 86.45;
		System.out.println(d[2]);
		
		System.out.println();
		
		//character array
		
		char c[] = new char[2];
		c[0]= 'c';
		c[1] = '$';
		
		System.out.println(c[1]);
		
		System.out.println();
		//boolean
		boolean b[] = new boolean[2];
		b[1]=false;
		
		System.out.println(b[1]);
		
		System.out.println();
		
		// string array
		
		String s[]= new String[2];
		s[0]= "suma";
		s[1]= "shekar";
		
		System.out.println(s[0]+s[1]);
		System.out.println(s[0].length());
		
		/*
		 advantages-
		 i can stores multiple variable in a single defined variable
		 
		 dis-advantages-
		 
		 size of an array is fixed or static array- to overcome this----we use collections, arraylist , hashtable
		 hold similar data type in a single variable- to overcome this----we use object array
		 */
		
		//object array----is the super class of all the java class
		/*
		Object ob[] =  new Object[5];
		ob[0]= "Suma";
		ob[1]=27;
		ob[3]=10.23;
		ob[4]="10/10/2021";
		
		System.out.println(ob.length);
		
		*/
		
		System.out.println("**********************************************");
		
		//Dynamic arrays---ArrayList
		//1.size is not a constraint
		//2.it allows me to add duplicate values /elements
		//3.Insertion order is maintained
		//4. synchronization
		//5. index----get(i)
		//6. values from an array----for loop/Iterator
		//7.Interger ArrayList, String ArrayLsit, user defined class object
		
		
		ArrayList ar = new ArrayList();
		//to add values in an array
		ar.add(100);
		ar.add("suma");
		ar.add(300);
		
		//to get the size of an array
		System.out.println("array size:"+ar.size());
		
		//to get te values of an array
		System.out.println("first array element:"+ar.get(0));
		
		//to print all the values of an array
		System.out.println("values in an array");
		for(int a=0; a<ar.size(); a++)
		{
			
			System.out.print(ar.get(a)+" ");
		}
		System.out.println(" ");
		System.out.println("*****************************");
		
		System.out.println("integer array list");
		
		ArrayList<Integer> ar2 = new ArrayList<Integer> ();
		ar2.add(100);
		ar2.add(400);
		ArrayList<Integer> ar5 = new ArrayList<Integer> ();
		ar5.add(500);
		ar5.add(500);
		ar2.addAll(ar5);
		//ar2.removeAll(ar5);
		ar2.retainAll(ar5);
		
		for(int u=0; u<ar2.size();u++)
		{
			System.out.println(ar2.get(u));
		}
		System.out.println("index:"+ar2.size());
		System.out.println("second element"+ar2.get(1));
		
		
		System.out.println("*****************************");
		System.out.println("string array list");
		
		
		ArrayList<String> ar3 = new ArrayList<String> ();
		ar3.add("suma");
		ar3.add("shekar");
		//ar3.add(100);
		
		System.out.println("index:"+ar3.size());
		System.out.println("second element"+ar3.get(1));
		
		System.out.println("*****************************");
		System.out.println("user defined class object");
		
		//create an object
		ArrayListConcept a1= new ArrayListConcept("suma", 27, "dept");
		ArrayListConcept a2= new ArrayListConcept("anu", 28, "dept");
		ArrayListConcept a3= new ArrayListConcept("shreya", 25, "dept");
		
		//add value to array list
		ArrayList<ArrayListConcept> al= new ArrayList<ArrayListConcept>();
		
		al.add(a1);
		al.add(a2);
		al.add(a3);
		
		
		
		Iterator<ArrayListConcept> val =al.iterator();
		
		while(val.hasNext())
		{
			ArrayListConcept emp = val.next();
			System.out.println(emp.name);
		}
		
		System.out.println("*********vowels********************");
		
		String str = "sumahsenaeiuoiou";
		
		int size=str.length();
			
		for(int s=0;s<size-1;s++)
		{
			 if(str.charAt(s) == 'a'|| str.charAt(s) == 'e'|| str.charAt(s) == 'i' ||str.charAt(s) == 'o'||str.charAt(s) == 'u') {
				 System.out.println("Given string contains"+ "  "+str.charAt(s)+" "+ "at the index "+s );
			 }
	     }
		
		System.out.println("*********duplicates********************");
		
		String sValue = "great gresposssnsibility";
		int strSize=sValue.length();
		
		char[] ch3 = sValue.toCharArray();
		
		
		for(int m=0;m<strSize;m++)
		{
			int count =1;
			for(int n=m+1;n<strSize;n++)
			{
				if(ch3[m]==ch3[n]&& ch3[m]!= ' ')
				{
					
					count++;
					ch3[n]='0';
				}	
				
				
			}
			if(count>1&& ch3[m]!='0')
			{
				System.out.println(ch3[m]+ " "+count);
			}
									
		}
		
		System.out.println("*************************");
		System.out.println("sorting elements in an array");
		
		String b[]= {"suma","suma","shekar"};
		
		List<String>  l= Arrays.asList(b[0]);
		List<String>  l2= Arrays.asList(b[1]);
		List<String>  l3= Arrays.asList(b[2]);
		/*
		//List<String>   s= new ArrayList<String>(l,l2,l3);
		
		System.out.println(s.retainAll(s));
		
		//System.out.println(((TreeSet<Integer>) s).pollLast();
				
		System.out.println("*************************");
		for(String var: s)
		{
			System.out.println(var);
		} 
		
		*/
	 }
		 
}
		
		
		
	


