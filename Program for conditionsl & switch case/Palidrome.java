/*
Check whether a number is palindrome or not
*/
import java.util.Scanner;
class palidrome
{
		public static void main(String[]args)
		{
				int num,original,reverse=0,digit;
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter Number");
				num=scanner.nextInt();
				original=num;

				int sum=1;
				while(num>0)
				{
				    digit=num%10;
				    reverse=reverse*10+digit;
				    num=num/10;
				}
					if(original==reverse)
					{
						System.out.print("polidrome");
					}
					else
					{
							System.out.print("not polidrome");
					}

				}
		}			
