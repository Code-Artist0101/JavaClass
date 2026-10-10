import java.util.Scanner;
class Example16
{
	public static void main(String[]args)
	{	
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter N");
		n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)

				if(i%2==0)
			{
				
					System.out.print((char)(64+j));
			}
			else
			{
				System.out.print((char)(i+96));
			}
			System.out.println();
			}


	}
}
