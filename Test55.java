// this program check the arsmstrong if only 3 digits only not 4 , 5 etc;

public class Test55 {
    public static void main(String[] args) {

        int number = 153;
        int temp = number;

        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;

            sum = sum + (digit * digit * digit);

            temp = temp / 10;
        }

        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}