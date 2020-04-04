package day5;

class User
{
	//direct
	/*String email="appu@gmail.com";
	String password="appu1";*/
	
	
	String email;
	String password;
	
	//using methods
	/*public void setValue(String email,String password)
	{
		this.email=email;
		this.password=password;
	}*/

	
	//using constructor
	public User(String email,String password)
	{
		this.email=email;
		this.password=password;
	}
	
	
	public void display()
	{
		System.out.println("User credentials are: ");
		System.out.println("email is: "+email);
		System.out.println("password is: "+password);
	}
	
}
public class AssigningValuesToVar {

	public static void main(String[] args) {
		 
		User u1=new User("appu@gmail.com","appu1");
		
		//u1.setValue("appu@gmail.com","appu1");  using method
		
		//u1.email="appu@gmaul.com";   using refrence var
		//u1.password="appu123";
		
		
		u1.display();

		
	}

}
