import java.util.Scanner;
class Example06{
	public static void main(String[]args){
	 	  int n;
	 	  Scanner scanner=new Scanner(System.in);
	 	  System.out.println("Enter N");
	 	  n = scanner.nextInt();
	 	  for(int i=1;i<=(2*n-1);i++){
	 	  	if(i<=n){
	 	  	for(int j=i;j>=1;j--){
	 	  		System.out.print(n-i+1);
	 	  	
	 	  }
	 	}

	 	 else{
	 	  	for(int j=i;j<=n*2-1;j++){
	 	  		System.out.print(i-n+1);
	 	  	}
	 	  }
	 	  	System.out.println();

	 	}

	 }

}