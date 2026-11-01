//Write a Java program to find the sum of main diagonal elements of a matrix.
import java.util.Scanner;
class Example06{
	public static void input_array(int arr[][]){
	Scanner scanner = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			System.out.println("Enter:");
			 arr[i][j]=scanner.nextInt();
			}
		}
	}
	public static int diagonal(int arr[][]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++)
			if(i==j){
				sum= sum + arr[i][j];
			}
		}
		 return sum;// System.out.println("Sum of Main Diagonal: " + sum);
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
		Scanner scanner = new Scanner(System.in);
		System.out.println("row:");
		int row=scanner.nextInt();
		System.out.println("col:");
		int col=scanner.nextInt();
		int arr[][]=new int [row][col];
		input_array(arr);
		//int result = diagonal(arr);
		//System.out.println("Sum of Main Diagonal: " + result);
		//diagonal(arr);
		System.out.println("---------");
		display(arr);
		int result = diagonal(arr);
		System.out.println("Sum of Main Diagonal: " + result);
	}
}