// this program shows index + Digits + numbers of counts like a,e,i,o,u in strings

public class Test10 {
    public static void main(String[] args) {
        int numbers = 127891;
        int count = 0;
        int index = 0;

        while (numbers > 0) {
            int ch = numbers % 10;

            if (ch == 1 || ch == 2 || ch == 3 || ch == 4 || ch == 5) {
                count++;
                System.out.println("Digit: " + ch + " at index: " + index);
            }

            numbers = numbers / 10;
            index++;  // increase index each step
        }

        System.out.println("Count: " + count);
    }
}