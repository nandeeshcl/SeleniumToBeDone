package day8;

class Test implements Interface2
{

	int c;
	
	//this method should be public
	public void add() {
		
		c=a+b;
		System.out.println("Sum is: "+c);
	}

	public void sub() {
		c=a-b;
		System.out.println("Sub is: "+c);
		
	}

	public void mul() {
		c=a*b;
		System.out.println("mul is: "+c);
		
	}
	
	
}
public class Interface {

	public static void main(String[] args) {
		/*Test t=new Test();
		
		t.add();
		t.mul();
		t.sub();*/
		
		System.out.println("Value of a is: "+Interface1.a);
		System.out.println("Value of b is: "+Interface2.b);
		
		
		Interface1 t=new Test();
		
		t.add();
		//t.mul();
		t.sub();
		

		

	}

}
