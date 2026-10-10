/*
Write a program to enter two numbers and find their sum.
*/import java.util.Scanner;
class Example01
{
	static void Sum(int x,int y)
	{
		int res=x+y;
		System.out.println("Sum="+res);
	}
	public static void main(String[]args)
{
		int num1,num2;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Num1");
		num1=scanner.nextInt();

		System.out.println("Num2");
		num2=scanner.nextInt();
		System.out.println("---------");

		Sum(num1,num2);//method call //call by calue

}

}

