public class Test14 {

    public static void main(String[] args) {

        int i = 3, j = 5, k = 2;

        int val = i++ + j-- - ++k * i-- + j++ + --i - k--;

        System.out.println("value:"+val);

    }

}