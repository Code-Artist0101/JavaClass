/*
    5
   54
  543
 5432
54321
 5432
  543
   54
    5

 */
 import java.util.Scanner;
class Example26{
	public static void main(String[]args)
	{ 
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter N");
		n=scanner.nextInt();
		for (int i=1;i<=2*n-1;i++)
		{
			if(i<=n)
			{
				for(int k=n-i+1;k>=1;k--)
					System.out.print(" ");
				for(int j=n;j>=n-i+1;j--)
					System.out.print(j);
			}
			else
			{
				for(int k=i-n+1;k>=1;k--)
					System.out.print(" ");
				for(int j=n;j>=i-n+1;j--)
					System.out.print(j);
			}
			System.out.println();
		}

	}

}