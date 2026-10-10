import java.util.Scanner;
class Example09{
	public static void main(String[]args){
	 	int n;
	 	Scanner scanner=new Scanner(System.in);
	 	System.out.println("Enter N");
	 	n = scanner.nextInt();
	 		int cnt=n;
	 			for(int i=n;i>=1;i--){
	 				int c=cnt;
	 			for(int j=i;j<=n;j++){
	 				System.out.print(c+"\t");
	 				c=c-j-1;
	 			}
	 			cnt=cnt+i-1;
	 				System.out.println();
	 	}

	 }

}