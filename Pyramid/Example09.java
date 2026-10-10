/*
 555555555
  4444444
   33333
    222
     1

 */
 import java.util.Scanner;
 class Example09
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
 			for(int j=i;j>=1;j--)
 				System.out.print(i);
 			for(int k=i;k>=1+1;k--)
 				System.out.print(i);
 			System.out.println();
 		}
 	}
 }