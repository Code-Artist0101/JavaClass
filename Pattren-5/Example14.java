import java.util.Scanner;
class Example14{
	public static void main(String[]args){
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n = scanner.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j>=1; j--)
				if(i%2==0)
					System.out.print((char)(i+96));
				else
					System.out.print((char)(i+64));
			System.out.println();
		}
 	}
 }