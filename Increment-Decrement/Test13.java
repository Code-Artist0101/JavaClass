public class Test13 {

    public static void main(String[] args) {

        int p = 6, q = 4, r = 2;

        int result = ++p * q-- + r++ - --q + p-- - r + ++q;

        System.out.println("Result: " + result);

    }

}