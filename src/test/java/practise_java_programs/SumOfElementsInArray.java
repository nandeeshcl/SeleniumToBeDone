package practise_java_programs;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		int a[] = { 10, 22, 33, 44, 55 };

		int sum = 0;

		for (int i : a) {
			sum = sum + i;
		}

		System.out.println("Sum is: " + sum);

	}

}
