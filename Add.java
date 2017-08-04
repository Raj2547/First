import java.util.*;
class Calc
{
	public static void main(String.args[])
	{
		Scanner sc=new Scanner(System.in);
		int  a,b,c
		System.out.println("Enter A:");
		a=sc.nextInt;
		System.out.println("Enter B:");
		b=sc.nextInt;
		c=add(a,b);
		System.out.println("Addition"+c);
	}
	public static int add(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
}
			

			
