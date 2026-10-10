/*Write a  program to enter the length and breadth of a rectangle and find its perimeter.*/

import java.util.Scanner;

class Example02
{
    static void Perimeter(int length, int breadth)
    {
        int rectangle = 2 * (length + breadth);
        System.out.println("Perimeter = " + rectangle);
    }

    public static void main(String[] args)
    {
        int length;
        int breadth;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length");
        length = scanner.nextInt();

        System.out.println("Enter breadth");
        breadth = scanner.nextInt();

        Perimeter(length, breadth);
    }
}
