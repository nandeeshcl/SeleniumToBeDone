package javaPrograms;

public class Sum_of_Count_in_Number {

	public static void main(String[] args) {
		
		int n=1234;
		int temp=n;
		int sum=0;
		
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		
		System.out.println("Sum of digit "+temp+" is "+sum);
	}

}
