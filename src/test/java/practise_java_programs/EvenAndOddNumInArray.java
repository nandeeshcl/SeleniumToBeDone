package practise_java_programs;

//To print even numbers in one bloack and odd numbers in one block
public class EvenAndOddNumInArray {

	public static void main(String[] args) {

		int a[] = { 21, 31, 44, 55, 6 };
		int evenCount=0;
		int oddCount=0;

		/*
		 * for(int i=0;i<a.length;i++) { if((a[i]%2)==0) {
		 * System.out.println("Even number: "+a[i]); } else {
		 * System.out.println("Odd number: "+a[i]); } }
		 */

		System.out.println("Even numbers:");

		for (int i = 0; i < a.length; i++) {

			if ((a[i] % 2) == 0) {
				System.out.println(a[i]);
				evenCount++;
			}

		}
		System.out.println("Total even numbers are: "+evenCount);

		System.out.println("Odd numbers:");
		for (int i = 0; i < a.length; i++) {

			if ((a[i] % 2) != 0) {
				System.out.println(a[i]);
				oddCount++;
			}

		}
		System.out.println("Total odd numbers are: "+oddCount);

	}

}
