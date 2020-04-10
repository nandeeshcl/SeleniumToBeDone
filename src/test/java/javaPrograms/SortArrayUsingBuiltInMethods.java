package javaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayUsingBuiltInMethods {

	public static void main(String[] args) {
		
		//Method1: ParallerSort
		int a[]= {1,3,2,0};
		
		System.out.println(Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		
		//Using Sort method and do assending sort
        int a1[]= {1,3,2,0};
		
		System.out.println(Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		
		//Using sort decending order
        Integer a2[]= {1,3,2,0};
		
		System.out.println(Arrays.toString(a2));
		Arrays.sort(a2,Collections.reverseOrder());
		System.out.println(Arrays.toString(a2));
		

	}

}
