package javaPrograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumString {

	public static void main(String[] args) {
		
		//Using random class--can generate random number,float,double,boolean
		Random r=new Random();
		
		int num=r.nextInt();   //r.nextInt(range)
		System.out.println("Random number is: "+num);
		
		//to generate random decimal number using Math calss
		System.out.println(Math.random());
		
		//usimg apache commons api we can generate random string and number
		String s1=RandomStringUtils.randomNumeric(5);  //create 5 digit integere value
		System.out.println(s1);
		
		String s2=RandomStringUtils.randomAlphanumeric(9);  //create 9 digit alphanumeric value
		System.out.println(s2);
	}

}
