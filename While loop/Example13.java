class Example13{
  public static void main(String[]args){
  int a = 12;
  int b = 18;
  int i = 0;


while (i < 2) {

    a = b - a;

    b = b - a;


    System.out.println(i);

    System.out.println(a);

    System.out.println(b);


    i++;

}


System.out.println(a);

System.out.println(b);

}

}