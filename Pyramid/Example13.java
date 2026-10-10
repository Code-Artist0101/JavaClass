/*
 555555555
  4444444
   33333
    222
     1
    222
   33333
  4444444
 555555555
 */
 import java.util.Scanner;
 class Example13
 {
 	public static void main(String[]args)
 	{
 		int n;
 		System.out.println("Enter N");
 		Scanner scanner=new Scanner(System.in);
 		n=scanner.nextInt();
 		for(int i=n;i>=1;i--)
 		{
 			for(int sp=i;sp<n;sp++)
 				System.out.print(" ");
 			for(int j=1;j<=2*i-1;j++)
 				System.out.print(i);
 			System.out.println();
 		}
 		for(int i=2;i<=n;i++)
 		{
 			for(int sp=n-1;sp>=i;sp--)
 				System.out.print(" ");
 			for(int j=1;j<=(2*i-1);j++)
 				System.out.print(i);
 			System.out.println();
 		}
 	}
 }