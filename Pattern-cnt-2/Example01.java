import java.util.Scanner;
class Example01{
	public static void main(String[]args){
	 	int n;
	 	Scanner scanner=new Scanner(System.in);
	 	System.out.println("Enter N");
	 	n = scanner.nextInt();
	 	int cnt1=n;
	 	int	cnt2=n*(n+1)/2;
	 		for (int i=n;i>=1;i--){
	 			for(int j=1;j<i;j++)
	 			System.out.print("\t");
	 			int c1=cnt1;
	 			int c2=cnt2;
	 		for(int k1=i,k2=i;k1<=n;k1++,k2++){
	 			System.out.print((char)(c1+64)+""+(char)(c2+64)+"\t");
	 				c1=c1-k1-1;
	 				c2=c2+k2;
	 		}
	 		System.out.println();
	 		cnt1=cnt1+i-1;
	 		cnt2=cnt2-i;
	 	}

	 }

}