class Frequency {
    public static void main(String[] args) {
        int num = 1223432;
        int original = num;
        int digit = 0;
        int temp = 0;
        int count = 0;
        int check = 0;

        while (original > 0) {
            digit = original % 10;
            original = original / 10;

            int copy = num;
            count = 0;

            while (copy > 0) {
                temp = copy % 10;

                if (temp == digit) {
                    count++;
                }

                copy = copy / 10;
            }

            int duplicate = 0;
            int remaining = num / (int)Math.pow(10, check);
            check++;

            System.out.println(digit + " = " + count);
        }
    }
}