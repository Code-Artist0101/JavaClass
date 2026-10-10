/*
A
bb
CCC
dddd
EEEEE
dddd
CCC
bb
A
*/
import java.util.Scanner;
class Example25
{
    public static void main(String[]args)
    {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        n = scanner.nextInt();

        for(int i=1; i<=2*n-1; i++)
        {
            if(i<=n)
            {
                for(int j=1; j<=i; j++)
                {
                    if(i%2!=0)
                    {
                        System.out.print((char)(i+64));
                    }
                    else
                    {
                        System.out.print((char)(i+96));
                    }
                }
            }
            else
            {
                for(int j=1; j<=2*n-i; j++)
                {
                    if((2*n-i)%2!=0)
                    {
                        System.out.print((char)((2*n-i)+64));
                    }
                    else
                    {
                        System.out.print((char)((2*n-i)+96));
                    }
                }
            }

            System.out.println();
        }
    }
}