/*
12345
2345
345
45
5
45
345
2345
12345
*/
import java.util.Scanner;
class Example20
{
	public static void main(String[]args)
	{
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter N");
		n=scanner.nextInt();
		for(int i=1;i<=2*n-1;i++)
		{
			if(i<=n)
			{
				for(int j=i;j<=n;j++)
					System.out.print(j);
			}
			else  //i=6  n=5 2*n=10
			{
				for(int j=2*n-i;j<=n;j++)
					System.out.print(j);
			}
			System.out.println();
		}
	}
}