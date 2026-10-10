import java.util.Scanner;
class Example22
{
	public static void main(String[]args)
	{
		int n;
		System.out.println("Enter N");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int sp=1;sp<i;sp++)
				System.out.print(" ");
			for(int j=i;j<=n;j++)
				if(j%2==0)
				{
					System.out.print((char)(96+j));
				}
				else
				{
					System.out.print((char)(64+j));
				}
			for(int k=n-1;k>=i;k--)
				if(k%2==0)
				{
					System.out.print((char)(96+k));
				}
				else
				{
					System.out.print((char)(64+k));
				}
				
			System.out.println();
		}
		
	}	
}