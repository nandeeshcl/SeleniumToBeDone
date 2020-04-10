package javaPrograms;

public class OccurenceOfEachCharacterInString {

	public static void main(String[] args) {

		String s = "Welcome";

		int m = s.length();

		String s1 = s.replaceAll("e", "");

		int n = s1.length();

		System.out.println(m - n);

	}

}
