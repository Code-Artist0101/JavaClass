import java.util.Scanner;
class Example24
{
	public static void main(String[]args)
	{
		int n;
		System.out.println("Enter N");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		int cnt=n*(n+1)/2;
		for(int i=1;i<=n;i++)
		{
			int c=cnt;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c +"\t");
				c--;
			}
			System.out.println();
		cnt=cnt-i;
				
				
		}
		
	}
}