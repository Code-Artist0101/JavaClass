class Example6{
	public static void main(String[]args){
	 int base=2;
	 int exp=1;
	 int i=0;

	 while(i<4){
	 exp=exp*base;
	 base=base+1;

	 System.out.println("exp="+exp);
	 System.out.println("base="+base);
	 i++;
	 }

	}
}