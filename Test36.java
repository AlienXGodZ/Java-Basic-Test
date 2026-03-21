// this program check the number is palindrome

public class Test36 {
    public static void main(String[] args) {

        int num = 1221;

        while (num > 0) {

            int digit = 1;
            while (num / digit >= 10) {
                digit = digit * 10;
            }

            int first = num / digit;
            int last = num % 10;

            if (first != last) {
                System.out.println("Not Palindrome");
                return;
            }

            num = (num % digit) / 10;
        }
        System.out.println("Palindrome");
    }
}
