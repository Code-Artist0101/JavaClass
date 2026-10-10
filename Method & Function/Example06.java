  /*
 Write a  program to enter the base and height of a triangle and find its area.
 */
 import java.util.Scanner;
 class Example06
 {
 	static void Triangle(int height ,int base)
 	{
 		double area = (0.5 * base * height);
 		System.out.println("Area ="+area);
 	}

 		public static void main(String[]args)
 	{
 		int height;
 		int base;
 		double area;

 		Scanner scanner = new Scanner(System.in);

 		System.out.println("Enter base");
 		base=scanner.nextInt();

 		System.out.println("Enter height");
 		height=scanner.nextInt();

 		Triangle(height,base);
 	}	

}