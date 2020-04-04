package practise_java_programs;

import java.util.Arrays;

public class SearchArray {

	public static void main(String[] args) {

		// Search in an array
		// Using search function--Pre req: array to be sorted
		// return index , if not found return negative value

		int a[] = { 22, 11, 5, 2, 15 };

		// sort array
		Arrays.sort(a);

		// apply search on array

		int index = Arrays.binarySearch(a, 111);

		if (index > 0) {
			System.out.println("Element found ");
		} else {
			System.out.println("Element not found");
		}

		// System.out.println(Arrays.binarySearch(a,11));

		// method 2:

		System.out.println("---Method 2-----");

		int b[] = { 2, 3, 4, 5 };

		int key = 53;

		boolean flag = false;

		for (int x : b) {
			if (x == key) {
				System.out.println("Element found");
				flag = true;
				break;
			}

		}

		if (flag == false) {
			System.out.println("Element not found");
		}

	}

}
