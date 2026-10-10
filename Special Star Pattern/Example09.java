/*

*   *
*  **
* * *
**  *
*   *

 */
import java.util.Scanner;
class Example09
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
					if( j==n || i+j==n+1||j==1)
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
