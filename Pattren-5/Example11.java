/*
A
bb
CCC
dddd
EEEEE
dddd
CCC
bb
A
*/
import java.util.Scanner;
class Example11{
	public static void mian(String[]args){
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n = scanner.nextInt();
		for(int i=1;i<=2*n-1;i++){
			if(i<=n){
				for(int j=1;j<=i;j++)
					System.out.print(j%2!=0(char)(64+j)+(char)(96+j));
			}
			else //i=6   n=5   n*2=10
			{
				for(int j=i-n+1;j>=1;j--)
					System.out.print(j);
			}
			System.out.println();
		}
	}
}