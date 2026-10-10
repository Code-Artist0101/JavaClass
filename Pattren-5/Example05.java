import java.util.Scanner;
class Example05{
	public static void main(String[]args){
	 	  int n;
	 	  Scanner scanner=new Scanner(System.in);
	 	  System.out.println("Enter N");
	 	  n = scanner.nextInt();
	 	  for(int i=1;i<2*n;i++){
	 	  	{
	 	  	if(i<=n){
	 	  	/*for(int j=1;j<=i;j++){*/
	 	  		System.out.print((char)(64+i));
	 	  	}
	 	  System.out.println();
	 	  }		
	 	 else{
	 	 	for(int j=1;j<=(2*n-i);j++){
	 	 		System.out.print(2*n-i);
	 	 
	 	 		System.out.print((char)(96+i));
	 	 	}
	 	 		System.out.println();
	 	 }
	 }

	}

}
	 
  
     //for(int j=1;j<=(2*n-i);j++){

