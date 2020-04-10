package javaPrograms;

import practise_java_programs.BaseClass;

class Reverse {

	static int temp;

	static void method1(int num) {
		temp = num;

		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse of the number " + temp + " is " + rev);

	}

	// using Stringbuffer class
	static void method2(int num) {
		temp = num;

		StringBuffer sb = new StringBuffer(Integer.toString(num));
		StringBuffer rev = sb.reverse();

		System.out.println("Reverse of the number " + temp + " is " + rev);
	}

	// Using StringBuilder class
	static void method3(int num) {
		temp = num;

		StringBuilder sb = new StringBuilder();
		StringBuilder rev = sb.append(num).reverse();

		System.out.println("Reverse of the number " + temp + " is " + rev);
	}

}

public class ReverseNumberIn3Ways extends BaseClass {

	public static void main(String[] args) {

		System.out.println("Eneter the number...");
		int num = sc.nextInt();

		Reverse.method3(num);

	}

}
