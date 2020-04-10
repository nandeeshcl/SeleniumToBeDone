package javaPrograms;

public class RemovingJunKFromString {

	public static void main(String[] args) {
		
		String s1="+/ad2q3bnmzcas-=--/*-+";
		
		String s2=s1.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println("Old string is: "+s1);
		System.out.println("New string is: "+s2);

		//To remove whitespaces
		String s3="  appu is good      actor  ";
		System.out.println(s3);
		//String s4=s3.replaceAll("\\s","");
		String s4=s3.trim();  //trim start and end whitespaces
		System.out.println(s4);
	}

}
