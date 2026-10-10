class Exam7{
public static void main(String[]args){
int p = 9;

int q = 4;

int r = p++ + q++ + --p - --q + p;

System.out.println(r);
}
}