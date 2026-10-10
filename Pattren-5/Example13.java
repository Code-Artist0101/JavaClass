/*
55555
4444
333
22
1
22
333
4444
55555
*/
import java.util.Scanner;
class Example13{
	public static void main(String[]args){
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n = scanner.nextInt();
		for(int i=1;i<=2*n-1;i++){
			if(i<=n)
			{
				for(int j=n;j>=i;j--)
					System.out.print(n-i+1);
			}
			else  //i=6   n=5  2*n=10
			{
				for(int j=i;j>=n;j--)
					System.out.print(i-n+1);
			}
				System.out.println();

		}

	}

}

