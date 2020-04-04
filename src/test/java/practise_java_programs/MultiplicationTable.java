package practise_java_programs;

public class MultiplicationTable extends BaseClass {

	public static void main(String[] args) {

		System.out.println("Eneter the number...");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}

	}

}
