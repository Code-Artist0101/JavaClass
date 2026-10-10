import java.util.Scanner;
class Example02{
	public static void main(String[]args){
	 	  int n;
	 	  Scanner scanner=new Scanner(System.in);
	 	  System.out.println("Enter N");
	 	  n = scanner.nextInt();
	 	  for(int i=1;i<=n;i++){
	 	  for(int j=n;j>i;j--){
	 		System.out.print(i);
	 			for(int k=i;k>=1;k--);
	 			System.out.print(j);
	     	}  
	 		System.out.println();
	 	}

	}

}


