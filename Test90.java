public class Test90 {
    public static void main(String[] args) {
        int n = 10;
        String binary = "";

        while (n > 0) {
            int digit = n % 2;
            binary = digit + binary;
            n = n / 2;
        }

        System.out.println(binary);
    }
}