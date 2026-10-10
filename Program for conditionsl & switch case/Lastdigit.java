/*
find Second Last Digit
*/
import java.util.Scanner;

class SecondLastdigit {
    public static void main(String args[]) {
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number");
        n = scanner.nextInt();

        n = n / 10;

        System.out.println("Second Last Digit = " + n % 10);
    }
}
	




 
