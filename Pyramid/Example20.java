/*
543212345
4321 1234
321   123
21     12
1       1
*/
import java.util.Scanner;

class Example20
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
				for(int j=n;j>=1;j--)
					System.out.print(j);

				for(int k=1+1;k<=n;k++)
					System.out.print(k);
			}
			else
			{
				for(int j=i;j>=1;j--)
					System.out.print(j);

				for(int sp=1;sp<2*(n-i);sp++)
					System.out.print(" ");

				for(int k=1;k<=i;k++)
					System.out.print(k);
			}

			System.out.println();
		}
	}
}