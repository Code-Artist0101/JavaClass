/*
123454321
2345 5432
345   543
45     54
5       5
*/
import java.util.Scanner;

class Example19
{
	public static void main(String[]args)
	{
		int n;
		System.out.println("Enter N");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();

		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
				for(int j=1;j<=n;j++)
					System.out.print(j);

				for(int k=n-1;k>=1;k--)
					System.out.print(k);
			}
			else
			{
				for(int j=i;j<=n;j++)
					System.out.print(j);

				for(int sp=1;sp<=2*i-3;sp++)
					System.out.print(" ");

				for(int k=n;k>=i;k--)
					System.out.print(k);
			}

			System.out.println();
		}
	}
}