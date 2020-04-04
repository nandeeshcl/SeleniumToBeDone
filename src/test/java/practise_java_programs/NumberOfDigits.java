package practise_java_programs;

public class NumberOfDigits extends BaseClass {

	public static void main(String[] args) {

		int count = 0;

		System.out.println("Eneter the number...");
		int num = sc.nextInt();

		int temp = num;

		while (num != 0) {
			num = num / 10; // 345 34 3
			++count;
		}

		System.out.println("Number of digits in " + temp + " is " + count);

	}

}
