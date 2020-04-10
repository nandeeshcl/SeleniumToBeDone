package javaPrograms;

import practise_java_programs.BaseClass;

class ReverseNumber
{
	static int temp;

	static int method1(int num) {
		
		temp = num;

		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse of the number " + temp + " is " + rev);
		
		return rev;

	}
}
public class Palindrome extends BaseClass{

	public static void main(String[] args) {
		
		System.out.println("Enter the numberr:");
		
		int num=sc.nextInt();
		
		int rev=ReverseNumber.method1(num);
		
		if(rev==num)
		{
			System.out.println("Given number "+num+" is Palindrome");
		}
		else
		{
			System.out.println("Given number "+num+" is not a Palindrome");
		}

	}

}
