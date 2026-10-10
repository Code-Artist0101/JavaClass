/*
     5
    444
   33333
  2222222
 111111111

 */
 import java.util.Scanner;
 class Example05
 {
 	public static void main(String[]args)
 	{
 		int n;
 		System.out.println("Enter N");
 		Scanner scanner=new Scanner(System.in);
 		n=scanner.nextInt();
 		for(int i=n;i>=1;i--)
 		{
 			for(int sp=i;sp>1;sp--)
 				System.out.print(" ");
 			for(int j=i;j<=n;j++)
 				System.out.print(i);
 			for(int k=n-i+1;k>1;k--)
 				System.out.print(i);
 			System.out.println();
 		}
 	}
 }