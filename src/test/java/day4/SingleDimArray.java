package day4;

import practise_java_programs.BaseClass;

public class SingleDimArray extends BaseClass {

	public static void main(String[] args) {

		//Type 1:
		/*int a[] = new int[5];

		
		 * System.out.println("Enter the value of n...");
		 * 
		 * int n=sc.nextInt();
		 

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		System.out.println("Size of an array is: " + a.length);

		System.out.println("Array elements are: ");
		for (int x : a) {
			System.out.println(x);
		}*/
		
		//Type 2: reading from user
		

		System.out.println("Enter the value of n...");
		int n=sc.nextInt();
		
		int a[] = new int[5];
		
		System.out.println("Enter "+n+ " values of an array...");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Size of an array is: " + a.length);
		
		
		System.out.println("Array elements are: ");
		for (int x : a) {
			System.out.println(x);
		}
		
		
		
	}

}
