/*
Write a  program to enter the length and breadth of a rectangle and find its area.
*/
import java.util.Scanner;
class Example03
{
	static void Area(int length ,int breadth)
	{
		int rectangle=(length*breadth);
		System.out.println("Area="+rectangle);
	}

	public static void main(String[]args)
	{
		int length;
		int breadth;

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Length");
		length=scanner.nextInt();

		System.out.println("Enter Breadth");
		breadth=scanner.nextInt();
		System.out.println("----------");

		Area(length,breadth);

	}
}