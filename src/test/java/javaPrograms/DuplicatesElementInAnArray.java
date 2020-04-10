package javaPrograms;

import java.util.Set;
import java.util.TreeSet;

public class DuplicatesElementInAnArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 2 };

		Set<Integer> set = new TreeSet<Integer>();

		for (int i : a) {
			if (set.add(i)) {
				// System.out.println("");
			}

			else {
				System.out.println("Duplicate element found: " + i);
			}
		}

	}

}
