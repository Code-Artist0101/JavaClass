import java.util.Scanner;
class Example15{
	public static void main(String[]args){
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n = scanner.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=1;j<=n;j++)
			if(i%2!=0)
			{
				
					System.out.print((char)(64+j));
			}
			else
			{
				System.out.print((char)(64+i));
			}
			System.out.println();
		}

	}

}