package day9;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int x=0;
		System.out.println("Program started...");

		try
		{
			//System.out.println(100/10);
			x=10/4;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("You cannot divide number by 0..");
		}
		
		try 
		{
			String s=null;
			
			System.out.println(s.length());
		}
		
		catch(Exception e)
		{
			//System.out.println("Refrence variable has null value");
			e.printStackTrace();
		}
		
		System.out.println("Result is: "+x);
		
		System.out.println("Program ended...");
	}

}
