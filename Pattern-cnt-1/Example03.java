import java.util.Scanner;

class Example03 {
    public static void main(String[] args) {

        int n;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        n = scanner.nextInt();

            
			   int cnt=1;
				for(int i=1;i<=n;i++){
					int c=cnt;
				for(int j=1;j<=i;j++){
				System.out.print(c +"\t");
				c--;
			}
			System.out.println();
			cnt=cnt+i+1;
		}
	 }
 }