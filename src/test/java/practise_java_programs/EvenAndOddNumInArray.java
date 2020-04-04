package practise_java_programs;

//To print even numbers in one bloack and odd numbers in one block
public class EvenAndOddNumInArray {

	public static void main(String[] args) {

		int a[] = { 21, 31, 44, 55, 6 };

		int even[] = null;
		int odd[] = null;

		/*
		 * for(int i=0;i<a.length;i++) { if((a[i]%2)==0) {
		 * System.out.println("Even number: "+a[i]); } else {
		 * System.out.println("Odd number: "+a[i]); } }
		 */

		System.out.println("Even numbers:");

		for (int i = 0; i < a.length; i++) {

			if ((a[i] % 2) == 0) {
				System.out.println(a[i]);
			}

		}

		System.out.println("Odd numbers:");
		for (int i = 0; i < a.length; i++) {

			if ((a[i] % 2) != 0) {
				System.out.println(a[i]);
			}

		}

	}

}
