package practise_java_programs;


/*a=add all numbers given in array
b=add numbers from first digit to last digit
subtract b from a (b-a) , you will get missing number*/

public class MissingNumbersInArrayLIst {

	public static void main(String[] args) {
		
		int a[]= {3,4,5,7};  //missing nuumber is 4
		
		//add all numbers is array
		int sum1=0;
		int sum2=0;
		
		for(int i:a)
		{
			sum1=sum1+i;
			
		}
		//System.out.println(sum1);
		//to get first and last number
		
		//first number  to last number  3---7
		
		int len=(a.length)-1;
		for(int i=a[0];i<=a[len];i++)
		{
			sum2=sum2+i;
		}
		//System.out.println(sum2);
		System.out.println("Missing number is: "+(sum2-sum1));
		
	}

}
