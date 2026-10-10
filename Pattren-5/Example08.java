/*
1
21
321
4321
54321
4321
321
21
1*/
import java.util.Scanner;
class Example08
{
	public static void main(String[]args)
	{
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter N");
		n=scanner.nextInt();
		for(int i=1;i<=(2*n-1);i++)
		{
			if(i<=n)
			{
				for(int j=i;j>=1;j--)
					System.out.print(j);
			}
			else  //i=6  n=5  2*n=10
			{
				for(int j=2*n-i;j>=1;j--)
					System.out.print(j);
			}
			System.out.println();
			

		}
	}
}