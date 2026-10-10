/*
Month Name
Accept a number from 1 to 12 and print the month name.
*/
import java.util.Scanner;
class month
{
	public static void main(String[]args)
	{
		int month;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter month");
		month=scanner.nextInt();
		if(month>0){
			System.out.println("Invalid Input");
			System.exit(1);
		}
		switch(month){
			case 1:{
				System.out.println("january");break;
			}
			case 2:
				System.out.println("February");break;
				case 3:
				System.out.println("March");break;
				case 4:
				System.out.println("April");break;
				case 5:
				System.out.println("May");break;
				case 6:
				System.out.println("June");break;
				case 7:
				System.out.println("Jully");break;
				case 8:
				System.out.println("August");break;
				case 9:
				System.out.println("September");break;
				case 10:
				System.out.println("October");break;
				case 11:
				System.out.println("november");break;
				case 12:
				System.out.println("December");break;
			
				
		}

	}
}
