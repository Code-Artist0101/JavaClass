/*
     1
    222
   33333
  4444444
 555555555

 */
 import java.util.Scanner;
 class Example04
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
 			for(int k=i;k>1;k--)
 				System.out.print(i);
 			System.out.println();
 		}
 	}
 }