class internet{
public static void main(String[]args){
    double internet=10; //10gb
    double everydayuse=1; //1gb
     int total=0;
    while (internet > 0) {
    internet=internet-everydayuse;
    everydayuse=everydayuse+0.5;
    total++;


    System.out.print(total);

    
  }

 }

}



