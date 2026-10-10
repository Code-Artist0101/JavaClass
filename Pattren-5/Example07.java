/*
1
22
333
444
55555
4444
333
22
1*/
import java.util.Scanner;
class Example07
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
				for(int j=1;j<=i;j++)
					System.out.print(i);
			}
			else  //i=6  n=5  2*n=10
			{
				for(int j=1;j<=n*2-i;j++)
					System.out.print(n*2-i);
			}
			System.out.println();
			

		}
	}
}