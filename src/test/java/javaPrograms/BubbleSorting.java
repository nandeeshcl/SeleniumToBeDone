package javaPrograms;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int a[]= {5,4,2,7,1};
		
		int n=a.length;
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<n-1;i++)  //for passes : n elememtn n-1 pass  ----for one row 
			for(int j=0;j<n-1;j++)  //for iterations                ---all elements will be compared with its adjacent element 
			{
				if(a[j]>a[j+1])                      //if adjacent element is greater then swap it
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		
		System.out.println(Arrays.toString(a));

	}

}
