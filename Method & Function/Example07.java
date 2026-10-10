//area = (Math.sqrt(3) / 4) * side * side;              
/*
Write a  program to calculate the area of an equilateral triangle.
*/
import java.util.Scanner;
class Example07
{
	static void Equilateral(double side)
	{
	double area = (Math.sqrt(3) / 4) * side * side;
	System.out.println("Area ="+area);
	}
	public static void main(String[]args)
	{
		double side;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter side");
		side=scanner.nextInt();

		

		Equilateral(side);
	}

}