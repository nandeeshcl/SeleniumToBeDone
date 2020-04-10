package day9;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Program started...");

		try
		{
			System.out.println("Division result is: "+(100/0));
		}
		
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		finally
		{
			System.out.println("Finally block executed");
		}

		System.out.println("Program ended...");
		
	}

}
