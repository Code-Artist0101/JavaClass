/*
shift last digit to first
*/
import java.util.Scanner;

class Example12 {
    public static void main(String args[]) {

        int num;
        int mul = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number");
        num = scanner.nextInt();

        int temp = num;

        // Find multiplier
        while (temp > 9) {
            mul = mul * 10;
            temp = temp / 10;
        }

        // Get last digit
        int last = num % 10;

        // Remove last digit
        int remaining = num / 10;

        // Shift last digit to first
        int res = last * mul + remaining;

        System.out.println(res);
    }
}