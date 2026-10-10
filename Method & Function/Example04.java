/*
Write a  program to enter length in centimetres and convert it into meter and kilometer.
*/
import java.util.Scanner;
class Example04
{
	static void Centimeter(double cm)
	{
		double meter = (cm / 100);
		double kilometer = (cm / 100000);
	System.out.println( " cm = "+ cm); 
	System.out.println("meter = " +  meter); 
	System.out.println(" km = "+ kilometer);
		
	}
		public static void main(String[]args)
		{
			double meter;
			double kilometer;
			double cm;

			Scanner scanner=new Scanner(System.in);

			System.out.println("Enter length in centimetres");
			cm = scanner.nextDouble();

			Centimeter(cm);


		}
}