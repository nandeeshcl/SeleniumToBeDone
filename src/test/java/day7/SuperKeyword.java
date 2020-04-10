package day7;

class Parent {
	int a = 20;

	Parent() {
		System.out.println("Parent constructor");
	}

	void display() {
		System.out.println("Parent method");
		System.out.println("values of as is: " + a);
	}
}

class Child extends Parent {
	int a = 30;

	Child() {
		System.out.println("Child constructor");
	}

	void display() // method overriding
	{
		System.out.println("Child method");
		System.out.println("Value of a is: " + a);
		System.out.println("Value of parent a is: " + super.a); // call parent class a variable

		super.display(); // parent class method will be called
	}
}

class GChild extends Child {
	GChild() {
		System.out.println("GChild constructor");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {

		/*
		 * Child c=new Child();
		 * 
		 * Parent p=new Parent(); p.display();
		 * 
		 * c.display();
		 */

		GChild g = new GChild();

	}

}
