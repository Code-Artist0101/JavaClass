import java.util.Scanner;
class Example13{
	public static void main(String[]args){
	 	int n;
	 	Scanner scanner=new Scanner(System.in);
	 	System.out.println("Enter N");
	 	n = scanner.nextInt();
	 	int cnt=1;
	 		for(int i=n;i>=1;i--){
	 			int c=cnt;
	 		for(int j=i;j>=1;j--){
	 			System.out.print((char)(64+c)+"\t");
	 			c++;

	 		}
	 		System.out.println();
	 		cnt=cnt+i;
	 	}

	 }

}