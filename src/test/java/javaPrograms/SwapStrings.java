package javaPrograms;

public class SwapStrings {

	public static void main(String[] args) {

		String s1 = "appu";
		String s2 = "puni";

		// using temp variable

		/*
		 * String temp="";
		 * 
		 * System.out.println("Before swapping: "+s1+" "+s2);
		 * 
		 * temp=s1; s1=s2; s2=temp;
		 * 
		 * System.out.println("After swapping: "+s1+" "+s2);
		 */

		// without using temp var
		
		
		System.out.println("Before swapping: " + s1 + " " + s2);

		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());

		System.out.println("After swapping: " + s1 + " " + s2);

	}

}
