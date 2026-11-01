/*
Write a Java program to multiplication two matrices.
*/
import java.util.Scanner;
public class Example05{

	public static void MatricesA(int arr[][]){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter Matrices Element A:");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=scanner.nextInt();
		}
	}
	public static void MatricesB(int arr[][]){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter Matrices Element B:");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=scanner.nextInt();
		}
	}
	public static void Matricesresult(int a[][],int b[][],int res[][]){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				res[i][j]=a[i][j]*b[i][j];
			}
		}
	}
	public static void display(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[]args){
		Scanner scanner = new Scanner (System.in);

		System.out.println("Enter Rows:");
        int row = scanner.nextInt();

        System.out.println("Enter Columns:");
        int column = scanner.nextInt();

        int a[][] = new int[row][column];
        int b[][] = new int[row][column];
        int res[][] = new int[row][column];

        MatricesA(a);
        MatricesB(b);
        Matricesresult(a,b,res);
        System.out.println("Multiplication of two matrices:");
        display(res);
	}
}