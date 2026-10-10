import java.util.Scanner;
class Example02{
	public static void main(String[]args){
	 	int n;
	 	Scanner scanner=new Scanner(System.in);
	 	System.out.println("Enter N");
	 	n = scanner.nextInt();
	 	int cnt1=n*(n+1)/2;
	 	int cnt2=1;
	 		for(int i1=n,i2=1;i2<=n;i1--,i2++){
	 	int c1=cnt1;
	 	int c2=cnt2;
	 		for(int sp=1;sp<i1;sp++)
	 		System.out.print("\t");
	 		for(int j1=i1,j2=i2;j1<=n;j1++,j2--){
	 		System.out.print((char)(c1+64)+""+(char)(c2+64)+"\t");
	 		c1=c1+j1;
	 		c2=c2-1;
	 	   }
	 	   System.out.println();
	 	   cnt1=cnt1-i1;
	 	   cnt2=cnt2+i2+1;
	 	}

	 }

}

