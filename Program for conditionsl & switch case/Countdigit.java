/*
count the number of nay digit
*/
import java.util.Scanner;

class Countdigit {
    public static void main(String args[]) {

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        num = scanner.nextInt();

        int temp = num;

        int cnt=0;
        while(num>0)
        {
            num=num/10;
            cnt++;

        }
        System.out.println(cnt);
        System.out.printf("num:%d digit:%d",temp,cnt);
    }
}