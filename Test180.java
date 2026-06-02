public class Test180 {
    public static void main(String[] args) {

        String numbers = "1011";

        int power = 0;
        int decimal = 0;


        for(int i = numbers.length() - 1; i >= 0; i--){

            int digit = numbers.charAt(i) - '0';

            decimal += digit * Math.pow(2,power);

            power++;



        }
        System.out.println(decimal);

    }
}