import java.util.Scanner;
class Example12{
	public static void main(String[]args){
	 	int n;
	 	Scanner scanner=new Scanner(System.in);
	 	System.out.println("Enter N");
	 	n = scanner.nextInt();
	 		int cnt=n;
	 			for(int i=n;i>=1;i--){
	 				int c=cnt;
	 			for(int j=n;j>=i;j--){
	 				System.out.print(c+"\t");
	 			    c=c+j;
	 			}
	 			cnt--;
	 			
	 				System.out.println();
	 	}

	 }

}