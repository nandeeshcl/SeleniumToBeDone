package day4;

public class StringManipulationFunctions {

	public static void main(String[] args) {
		
		String s1=" Appu";
		String s2="Rajkumar ";
		
		System.out.println("First string is: "+s1);
		System.out.println("Second string is: "+s2);
		
        System.out.println("Length of first string is: "+s1.length());
        
        System.out.println("Concatenation of two string is: "+s1.concat(s2));
        
        System.out.println("Second index in first string is: "+s1.charAt(2) );
        
        System.out.println("To check second string contains kumar: "+s2.contains("kumar"));
        
        System.out.println("Are both strings equal: "+s1.equals(s2));
        
        System.out.println("Replace kumar with kumaranna: "+s2.replace("kumar","kumaranna"));
        
        System.out.println("Substring in second string: "+s2.substring(2));
        
        System.out.println("Uppercase of first string is: "+s1.toUpperCase());
        
        System.out.println("Remove space in first string and print its length:"+s1.trim());
        
        System.out.println("Length of first string is: "+s1.length());
        
        System.out.println("First string is: "+s1);
	}

}
