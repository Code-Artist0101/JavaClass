/*
 111111111
  2222222
   33333
    444
     5

 */
 import java.util.Scanner;
 class Example08
 {
 	public static void main(String[]args)
 	{
 		int n;
 		System.out.println("Enter N");
 		Scanner scanner=new Scanner(System.in);
 		n=scanner.nextInt();
 		for(int i=1;i<=n;i++)
 		{
 			for(int sp=i;sp>1;sp--)
 				System.out.print(" ");
 			for(int j=n;j>=i;j--)
 				System.out.print(i);
 			for(int k=i;k<=n-1;k++)
 				System.out.print(i);
 			System.out.println();
 		}
 	}
 }