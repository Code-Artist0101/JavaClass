class Example23{
	public static void main(String[]args){

	    int n=5;

	       for(int i=1;i<=n;i++){   //row

	              for(int j=i;j<=5;j++){  //colum

                     System.out.print((char)(96+j));
	              } 

	              System.out.println();
	       }
	}
}