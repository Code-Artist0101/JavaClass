/*
54321
5432
543
54
5
54
543
5432
54321
*/
import java.util.Scanner;
class Example19
{
	public static void main(String[]args)
	{
		int n;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter N");
		n=scanner.nextInt();
		for(int i=1;i<=2*n-1;i++)
		{
			if(i<=n)
			{
				for(int j=n;j>=i;j--)
					System.out.print(j);
			}
			else  //i=6  n=5  2*n=10
			{
				for(int j=n;j>=2*n-i;j--)
					System.out.print(j);
			}
			System.out.println();
		}
	}	
}