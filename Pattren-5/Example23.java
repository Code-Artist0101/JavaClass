/*
     1
    12
   123
  1234
 12345
  1234
   123
    12
     1

*/
import java.util.Scanner;
class Example23{
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
				for(int j=n-i+1;j>=1;j--)
					System.out.print(" ");
				for(int k=1;k<=i;k++)
					System.out.print(k);
			}
			else  //i=6  n=5  2*n=10
			{
				for(int j=i-n+1;j>=1;j--)
					System.out.print(" ");
				for(int k=1;k<=2*n-i;k++)
					System.out.print(k);
			}
			System.out.println();
		}
	}
}