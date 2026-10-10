import java.util.Scanner;
class Example23
{
	public static void main(String[]args)
	{
		int n;
		System.out.println("Enter N");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int sp=1;sp<=i;sp++)
				System.out.print(" ");
			for(int j=i;j<=n;j++)
				System.out.print(j);
			for(int k=n-1;k>=i;k--)
				System.out.print(k);
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int sp=1;sp<=i;sp++)
				System.out.print(" ");
			for(int j=i;j<=n;j++)
				System.out.print(j);
			for(int k=n-1;k>=i;k--)
				System.out.print(k);
			System.out.println();
		}
	}
}