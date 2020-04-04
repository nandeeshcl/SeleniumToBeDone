package day5;

class Student {
	String sid, sname;
	int s1, s2, s3, total;

	void getData(String sid, String sname) {
		this.sid = sid;
		this.sname = sname;

	}

	void getMarks(int s1, int s2, int s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	void calculate() {
		total = s1 + s2 + s3;
	}

	void marks() {
		System.out.println("Total marks is: " + total);
	}
}

public class Assingement1 {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.getData("a1", "appu");
		s1.getMarks(22, 33, 44);
		s1.calculate();
		s1.marks();

	}

}
