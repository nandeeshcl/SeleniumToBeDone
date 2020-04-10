package javaPrograms;

import practise_java_programs.BaseClass;

class ReverseStringClass1 {

	public String reverseMethod3(String str) {

		String rev = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println("Reverse of string " + str + " is: " + rev);

		return rev;

	}

}

public class PalindromeString extends BaseClass {

	public static void main(String[] args) {

		String str;
		String rev;

		System.out.println("Enter the string:");

		str = sc.next();

		ReverseStringClass1 r = new ReverseStringClass1();

		rev = r.reverseMethod3(str);

		if (rev.equals(str))

		{
			System.out.println("Given string " + str + " is Palindrome");
		} else {
			System.out.println("Given string " + str + " is not a Palindrome");
		}

	}

}
