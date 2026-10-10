/*
123454321
1234 4321
123   321
12     21
1       1
*/
import java.util.Scanner;

class Example16
{
	public static void main(String[]args)
	{
		int n;
		System.out.println("Enter N");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();

		for(int i=n;i>=1;i--)
		{
			if(i==n)
			{
				for(int j=1;j<=n;j++)
					System.out.print(j);

				for(int k=n-1;k>=1;k--)
					System.out.print(k);
			}
			else
			{
				for(int j=1;j<=i;j++)
					System.out.print(j);

				for(int sp=1;sp<2*(n-i);sp++)
					System.out.print(" ");

				for(int k=i;k>=1;k--)
					System.out.print(k);
			}

			System.out.println();
		}
	}
}