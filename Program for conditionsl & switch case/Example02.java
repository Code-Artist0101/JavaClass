import java.util.Scanner;
class Example02
{
	public static void main(String[]args)
	{
		int num;
		System.out.println("Enter Number");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		if(num>0)
		{
			System.out.print("postive num");
		} 
		else
		{
			System.out.print("negative num");
		}
	}
}