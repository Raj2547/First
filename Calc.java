import java.util.*;
class Calc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt;
		System.out.println("Enter a number");
		int b= sc.nextInt;
		System.out.println("Select an option\n1.Addition\n2.Subtraction\n");
		int c = sc.nextInt;
		switch(c!=0){
			case value1: int d=a+b;
						 System.out.println("Answer is:"+d);
						 break;
			case value2: int d=a-b;
						 System.out.println("Answer is:"+d);
						 break;
			default:	 System.out.println("Please enter a valid option");
		}
		
	}
}