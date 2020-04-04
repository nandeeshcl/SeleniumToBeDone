package day4;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String a[][]=new String [2][2];
		
		a[0][0]="Appu@gmail.com";
		a[0][1]="Appu123";
		
		a[1][0]="Shivu@gmail.com";
		a[1][1]="Shivu123";

		System.out.println("Row size is: "+a.length);
		System.out.println("Column size is: "+a[0].length);
		
		System.out.println("Credentials are: ");
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			
			System.out.println();
		}*/
		
		for(String r[]:a)
		{
			for(String i:r)
			{
				System.out.print(i+"   ");
			}
			System.out.println();
		}
	}

}
