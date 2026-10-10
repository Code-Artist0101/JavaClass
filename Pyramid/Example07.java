/*
     5
    545
   54345
  5432345
 543212345

 */
 import java.util.Scanner;
 class Example07
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
 			for(int j=n;j>=i;j--)
 				System.out.print(j);
 			for(int k=i+1;k<=n;k++)
 				System.out.print(k);
 			System.out.println();
 		}
 	}
 }