package practise_java_programs;

public class ReverseNumber extends BaseClass {

	public static void main(String[] args) {
		
	
    
	System.out.println("Eneter the number...");
	int number = sc.nextInt();
	
	int temp=number;
	
	int reverse = 0;
	 
    while(number != 0)
    {
        reverse = reverse * 10;
        reverse = reverse + number%10;
        number = number/10;
    }

    System.out.println("Reverse of the number "+temp+ " is " + reverse);

	}

}
