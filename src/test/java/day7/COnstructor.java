package day7;

class P {
	/*
	 * P() { System.out.println("P const"); }
	 */

	P(int a) {
		// int a=88;
		System.out.println("value of a is : " + a);
	}
}

class C extends P {
	C() {
		super(0);
		System.out.println("C const");
	}
}

class G extends C {
	G() {
		System.out.println("G const");
	}
}

public class COnstructor {

	public static void main(String[] args) {

		G g = new G();

	}

}
