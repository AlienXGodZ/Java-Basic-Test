//Check if Number is Happy Number

public class Test101 {
    public static void main(String[] args) {

        int number = 19;

        while (number != 1 && number != 4) {

            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum = sum + (digit * digit);
                number = number / 10;
            }

            number = sum;
        }

        if (number == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not Happy Number");
        }
    }
}