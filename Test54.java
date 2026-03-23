// finding any digit like 3 or 4 etc finding Armstrong numbers.

public class Test54{
    public static void main(String[] args) {
        int numbers = 153;
        int temp = numbers;
        int count = 0;
        int sum = 0;


        while (temp > 0) {
            temp = temp / 10;
            count = count + 1;
        }
        temp = numbers;

        while (temp > 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }
            sum = sum + power;
            temp = temp / 10;
        }
        if (sum == numbers) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }
    }
