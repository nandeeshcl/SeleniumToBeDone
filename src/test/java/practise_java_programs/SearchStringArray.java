package practise_java_programs;

public class SearchStringArray {

	public static void main(String[] args) {
		
		String s[]= {"appu","shivu","raghu"};
		
		String key = "shivus";

		boolean flag = false;

		for (String x : s) {
			if (x.equals(key)) {
				System.out.println("Element found");
				flag = true;
				break;
			}

		}

		if (flag == false) {
			System.out.println("Element not found");
		}

	}

}
