package javaPrograms;

import java.util.Arrays;

public class CHeckArrayAreEqual {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3 };

		System.out.println(Arrays.equals(a, b));

		int m = a.length;
		int n = b.length;

		boolean status = true;
		if (m == n) {
			for (int i = 0; i < m; i++) {
				if (a[i] != b[i]) {
					status = false;
					break;
				}
			}
		}

		else {
			status = false;
		}

		if (status) {
			System.out.println("Both arrays are same");
		}

		else {
			System.out.println("Both arrays are not equal");
		}

	}

}
