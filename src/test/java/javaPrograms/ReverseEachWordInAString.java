package javaPrograms;

import java.util.StringTokenizer;

public class ReverseEachWordInAString {

	public static void main(String[] args) {

		//Method 1:
		StringTokenizer s = new StringTokenizer("Welcom To Wipro");

		while (s.hasMoreTokens()) {
			StringBuffer sb = new StringBuffer(s.nextToken());
			System.out.println(sb.reverse());
		}

		
		String s1=new String("Welcom To Wipro");
		String st[]= s1.split(" ");
		
		for(String i:st)
		{
			StringBuffer sb = new StringBuffer(i);
			System.out.print(sb.reverse()+"  ");
			//System.out.print(i+"  ");
		}
	}

}
