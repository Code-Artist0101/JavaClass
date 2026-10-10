/*
      1
     222
    33333
   4444444
  555555555
   4444444
    33333
     222
      1
 */
 import java.util.Scanner;
 class Example12
 {
 	public static void main(String[]args)
 	{
 		int n;
 		System.out.println("Enter N");
 		Scanner scanner=new Scanner(System.in);
 		n=scanner.nextInt();
 		for(int i=1;i<=n;i++)
 		{
 			for(int sp=n;sp>i;sp--)
 				System.out.print(" ");
 			for(int j=1;j<=i;j++)
 				System.out.print(i);
 			for(int k=i;k>=2;k--)
 				System.out.print(i);
 			System.out.println();
 		}
 		for(int i=n-1;i>=1;i--)
 		{
 			for(int sp=i;sp<=n-1;sp++)
 				System.out.print("*");
 			for(int j=i;j>=1;j--)
 				System.out.print(i);
 			for(int k=i-n;k<i-1;k++)
 				System.out.print(i);
 			System.out.println();
 		}
 	}
 }