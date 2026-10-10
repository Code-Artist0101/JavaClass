/*
find LCM of two number
*/
import java.util.Scanner;
class Hcf
{
		public static void main(String[]args)
		{
				int num1,num2;
				int hcf=0;
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter first Number");
				num1=scanner.nextInt();
				System.out.println("Enter second Number");
				num2=scanner.nextInt();
				int end =(num1<num2)?num1:num2;
				for(int i=1;i<=end;i++){
					if(num1%i==0&&num2%i==0)hcf=i;
				}
			

				System.out.println(hcf);
		}
}
	

		
				

				