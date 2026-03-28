//check strong number or not

public class Test126 {
    public static void main(String[] args) {

        int num = 145;
        int original = num;

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            // find factorial
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;

            num = num / 10;
        }

        if (sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}