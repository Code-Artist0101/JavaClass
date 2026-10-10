/*
Given an integer, return its last digit.
Input:
1234
Output:
4
*/
import java.util.Scanner;

class Example11 {
    public static void main(String args[]) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        num = scanner.nextInt();
        int temp =num;

        while(temp>9)
        {
        	int res=num%10;
        	System.out.println(res);
        	break;
        }
    }
}
	




 
