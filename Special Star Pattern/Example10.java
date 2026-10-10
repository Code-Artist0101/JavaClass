/*

*******
*  *  *
*  *  *
*******
*  *  *
*  *  *
*******

 */
import java.util.Scanner;
class Example10
{
	public static void main(String[]args)
	{
		int n;
		System.out.println("Enter n");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(int i=1;i<=n+2;i++)
		{
			for(int j=1;j<=n+2;j++)
			{
					if(i==1 || i==(n+2)/2+1 || i==n+2 || j==1 || j%3==1)
					
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
