package javaPrograms;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=30;
		int c=2;
		
		int large=(a>b)?a:b;
		large=(c>large)?c:large;
		
		System.out.println("Largest is: "+large);

	}

}
