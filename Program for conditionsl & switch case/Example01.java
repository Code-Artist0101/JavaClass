import java.util.Scanner;
class Example01
{
	public static void main(String[]args){
	int a,b,c;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter three number");
	a=scanner.nextInt();
	b=scanner.nextInt();
	c=scanner.nextInt();

	if(a>b)
	{
		if(a>c)
		{
			System.out.print(a+"maximum");
		}
		else 
		{
			System.out.print(c+"maximum");
		}
	}
	else
	{
		if(b>c)
		{
			System.out.print(b+"maximum");
		}
		else
		{
			System.out.print(c+"maximum");
		}
	System.out.println();
	} 
  }
}