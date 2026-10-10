class Example22{
	public static void main(String[]args){
	  int n=5;

	    for(int i=5;i>=1;i--){  //row  //outerloop

	        for(int j=1;j<=i;j++){   //colum //innerloop
                System.out.print((char)(64+j));
	          }
	        System.out.println();
	    }
	}
}