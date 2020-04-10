package javaPrograms;

import practise_java_programs.BaseClass;

class ReverseStringClass {

	// using concatenation operator
	/*
	 * public void reverseMethod1(String str) { String rev = "";
	 * 
	 * int len = str.length();
	 * 
	 * for (int i = len - 1; i >= 0; i--) { rev = rev + str.charAt(i); }
	 * 
	 * System.out.println("Reverse of string " + str + " is: " +rev);
	 * 
	 * }
	 */

	// using characyer array
	/*
	 * public void reverseMethod2(String str) {
	 * 
	 * char a[]=str.toCharArray();
	 * 
	 * String rev = "";
	 * 
	 * 
	 * int len = str.length();
	 * 
	 * for (int i = len - 1; i >= 0; i--) { rev = rev +a[i]; }
	 * 
	 * System.out.println("Reverse of string " + str + " is: " +rev);
	 * 
	 * }
	 */

	// Using STringBuffer class
	public void reverseMethod3(String str) {

		StringBuffer s = new StringBuffer(str);

		s.reverse();

		System.out.println("Reverse of string " + str + " is: " + s);

	}

}

public class ReverseString extends BaseClass {

	public static void main(String[] args) {

		String str = null;

		System.out.println("Enter the string:");
		str = sc.next();

		ReverseStringClass r = new ReverseStringClass();

		r.reverseMethod3(str);

	}

}
