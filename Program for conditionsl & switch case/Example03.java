/*
write a java program to check whether a number is divisible by 5 and 11 or not
*/
import java.util.Scanner;
class Example03
{
	public static void main(String[]args)
	{
		int num;
		System.out.println("Enter Number");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		if(num%5==0 && num%11==0)
		{
			System.out.print(num+"is divisible by 5 and 11");
		}
		else
		{
			System.out.print(num+"is not divisible by 5 and 11");
		}
		
	}
}