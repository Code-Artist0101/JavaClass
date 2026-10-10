/*

* * *
 * *
* * *
 * *
* * *

 */
import java.util.Scanner;
class Example07
{
	public static void main(String[]args)
	{
		int n;
		System.out.println("Enter n");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
					if(i+j==n+1||i+j==n+3||i+j==n-1||i+j==n-3||i+j==n+n)
					{
						System.out.print("*");
					}
			
					else
					{
					System.out.print(" ");
					}
			}
			System.out.println();
		}
  	}
}
