package practise_java_programs;

public class ReverseString {

	public static void main(String[] args) {

		// Method 1:
		/*
		 * String s = "MadaM";
		 * 
		 * char c[] = s.toCharArray();
		 * 
		 * String sRev = "";
		 * 
		 * int len = c.length;
		 * 
		 * for (int i = (len - 1); i >= 0; i--) { sRev = sRev + c[i]; }
		 * 
		 * System.out.println("Reverse string is: " + sRev);
		 */

		// method 2:
		String s = "MadaM";

		String sRev = "";

		int len = s.length();

		for (int i = len - 1; i >= 0; i--) {
			sRev = sRev + s.charAt(i);
		}

		System.out.println("Reverse string is: " + sRev);

	}

}
