/*
Print all factors of a given number
*/
import java.util.Scanner;
class Factorsall
{
		public static void main(String[]args)
		{
				int num,i;
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter Number");
				num=scanner.nextInt();
				i=1;

			
				while(i<=num)
				{			    
				    if(num%i==0)
				    	System.out.print(i+" ");
				       i++;
				    
				    
				}
			
				
		}
		
}
		
