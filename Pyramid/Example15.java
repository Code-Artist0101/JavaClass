/*
555555555
4444 4444
333   333
22     22
1       1
*/
import java.util.Scanner;
class Example15
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
				for(int sp=1;sp<2*n;sp++)
					System.out.print(i);
			}
		else
		{
			for(int j=i;j>=1;j--)
				System.out.print(i);
			for(int sp=1;sp<2*(n-i);sp++)
				System.out.print(" ");
			for(int j=i;j>=1;j--)
				System.out.print(i);
		}
		System.out.println();
	  }

	}
	
}