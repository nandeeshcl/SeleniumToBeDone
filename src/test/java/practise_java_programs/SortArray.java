package practise_java_programs;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		// method 1: using sort function--SORTING
		int a[] = { 22, 11, 5, 2, 15 };

		System.out.println("Before sorting...");

		for (int i : a) {
			System.out.print(i + "  ");
		}

		System.out.println();
		
		Arrays.sort(a);

		System.out.println("After sorting...");

		for (int i : a) {
			System.out.print(i + "  ");
		}
		
		
		
		
		
	}

}
