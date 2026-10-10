import java.util.Scanner;
class Example12{
	public static void main(String[]args){

	    int n=5;
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter n");
	    n=scanner.nextInt();

	         for(int i=n;i>=1;i--){   //row
	            for(int j=i;j>=1;j--){    //column
	            System.out.print((char)(96+i));
	             
	      }
	       System.out.println();            
	    }
    }
}