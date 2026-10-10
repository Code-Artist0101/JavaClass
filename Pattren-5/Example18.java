/* 
12345
1234
123
12
1
12
123
1234
12345
*/
import java.util.Scanner;
class Example18
{
	public static void main(String[]args)
	{
		int n;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter N");
		n = scanner.nextInt();
		for(int i=1;i<=2*n-1;i++){
			if(i<=n)
			{

				for(int j=1;j<=n-i+1;j++)
					System.out.print(j);
			}
			else   // n=5  i=6  2*n=10
			{
				for(int j=1;j<=i-n+1;j++)
					System.out.print(j);
			}
			System.out.println();
		}

	}

}