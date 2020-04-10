package javaPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		
		int key=8;
		
		boolean flag=false;
		for(int i:a)
		{
			if(i==key)
			{
				System.out.println("Element found..");
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not found");
		}
		

	}

}
