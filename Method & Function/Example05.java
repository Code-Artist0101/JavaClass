/*
Write a  program to enter two angles of a triangle and find the third angle.
*/
import java.util.Scanner;
class Example05
{
	static void Triangle(int angle1,int angle2)
	{

		int angle3 = 180 - (angle1 + angle2);
		System.out.println("ThirdAngle"+angle3);
	}

		public static void main(String[]args)
		{
			int angle1;
			int angle2;
			int angle3;

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter Angle 1");
			angle1=scanner.nextInt();

			System.out.println("Enter Angle 2");
			angle2=scanner.nextInt();

			Triangle(angle1,angle2);
		}
}