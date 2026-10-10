public class Test12 {

    public static void main(String[] args) {

        int x = 10, y = 5, z = 3;

        int output = ++x - y++ + z-- * --x + ++z + y * 2 - x-- + y++ - --z;

        System.out.println("Output: " + output);

    }

}