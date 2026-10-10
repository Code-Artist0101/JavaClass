import java.util.Scanner;
class Example11{
	public static void main(String[]args){
	 	int n;
	 	Scanner scanner=new Scanner(System.in);
	 	System.out.println("Enter N");
	 	n = scanner.nextInt();
	 		int cnt=n*(n+1)/2;
	 			for(int i=n;i>=1;i--){
	 				int c=cnt;
	 			for(int j=i;j<=n;j++){
	 				System.out.print(c+"\t");
	 			    c=c+j;
	 			}
	 			cnt=cnt-i;
	 			
	 				System.out.println();
	 	}

	 }

}