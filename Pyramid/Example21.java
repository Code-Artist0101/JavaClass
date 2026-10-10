/*
1        1
22      22
333    333
4444  4444  
5555555555
*/
import java.util.Scanner;

class Example21
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
					System.out.print(i);

				for(int k=1;k<=n-1;k++)
					System.out.print(i);
			}
			else
			{
				for(int j=1;j>i;j--)
					System.out.print(i);

				//for(int sp=1;sp<2*(n-i);sp++)
				//	System.out.print(" ");

				for(int k=1;k>i;k--)
					System.out.print(i);
			}

			System.out.println();
		}
	}
}