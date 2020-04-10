package javaPrograms;

class Swapping {
	static int a = 20, b = 30, temp;

	static {
		System.out.println("Before swapping: ");
		System.out.println("Value of a and b is: " + a + " " + b);
	}

	// temp var
	static void method1() {

		temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping: ");
		System.out.println("Value of a and b is: " + a + " " + b);
	}

	// + and - operator
	static void method2() {
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping: ");
		System.out.println("Value of a and b is: " + a + " " + b);
	}

	// * and / operator -- a and b value should not be zero
	static void method3() {
		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("After swapping: ");
		System.out.println("Value of a and b is: " + a + " " + b);
	}

	// XOR operator
	static void method4() {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After swapping: ");
		System.out.println("Value of a and b is: " + a + " " + b);
	}

	// single statement
	static void method5() {

		b = a + b - (a = b);

		System.out.println("After swapping: ");
		System.out.println("Value of a and b is: " + a + " " + b);
	}

}

public class Swapping2Numbers {

	public static void main(String[] args) {

		Swapping.method5();

	}

}
