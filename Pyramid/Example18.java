/*
111111111
2222 2222
333   333
44     44
5       5
*/
import java.util.Scanner;

class Example18
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
				for(int j=1;j<2*n;j++)
					System.out.print(i);

			//	for(int k=1;k<=n-1;k++)
			//		System.out.print(i);
			}
			else
			{
				for(int j=i;j<=n;j++)
					System.out.print(i);

				for(int sp=1;sp<=2*i-3;sp++)
					System.out.print(" ");


				for(int k=i;k<=n;k++)
					System.out.print(i);
			}

			System.out.println();
		}
	}
}