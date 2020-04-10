package rough;

public class MatrixAddition {

	public static void main(String[] args) {
		
		
		int a[][]= {  {10,20}  ,{30,40}  };
		int b[][]= {   {20,33}  ,{22,44}  };
		
		int m=a.length;
		int n=a[0].length;
		
		int c[][]=new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
			
		}

	}

}
