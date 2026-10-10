import java.util.Scanner;
class Example16{
	public static void main(String[]args){
	 	int n;
	 	Scanner scanner=new Scanner(System.in);
	 	System.out.println("Enter N");
	 	n = scanner.nextInt();
	 		int cnt=1;
	 	for(int i=1;i<=n;i++){
	 		int c=cnt;
	 	for(int j=n;j>=i;j--){
	 	System.out.print((char)(64+c)+"\t");
	 	c=c+j;
		}
	   	 System.out.println();
	    cnt++;

		}

  	}

}
