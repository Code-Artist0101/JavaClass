import java.util.Scanner;
class Example04{
	public static void main(String[]args){
	 	  int n;
	 	  Scanner scanner=new Scanner(System.in);
	 	  System.out.println("Enter N");
	 	  n = scanner.nextInt();
	 	  for(int i=n;i>=1;i--){
	 	  	for(int j=i;j<=n;j++){
	 	  		System.out.print(j);
	 	  	}
	 	  System.out.println();
	 	  		
	 	 }
	 	 for(int i=1+1;i<=n;i++){
	 	 	for(int j=i;j<=n;j++){
	 	 		System.out.print(j);
	 	 	}
	 	 		System.out.println();
	 	 }
	 }
	 	  
}
