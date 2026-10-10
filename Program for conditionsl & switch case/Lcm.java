/*
find LCM of two number
*/
import java.util.Scanner;
class Lcm
{
		public static void main(String[]args)
		{
				int num1,num2,num3,i,lcm;
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter first Number");
				num1=scanner.nextInt();
				System.out.println("Enter second Number");
				num2=scanner.nextInt();
				System.out.println("Enter third Number");
				num3=scanner.nextInt();

				i=1;
				lcm=1;

			
				while(i<=num1 * num2 * num3)
				{			    
				    if(i%num1==0 && i%num2 == 0 && i%num3 == 0)
				    {
				    	lcm=i;
				    	break;
				    }
				    i++;
	 
				}
				System.out.print("LCM = "+lcm);
				
			
				
		}
		
}
		
