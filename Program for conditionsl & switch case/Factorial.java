/*
Calculate the factorial of a number
*/
import java.util.Scanner;
class Factorial
{
		public static void main(String[]args)
		{
				int num,i,fact;
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter Number");
				num=scanner.nextInt();
				i=1;
				fact=1;

			
				while(i<=num)
				{			    
				    fact=fact*i;
				    	System.out.print(fact+" ");
				       i++;
				       System.out.println();
	 
				}
				System.out.println();
			
				
		}
		
}
		
