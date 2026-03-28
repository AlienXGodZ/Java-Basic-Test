//finding power with predefined formula

public class Test131 {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        int result = 1;

        for (int i = 1; i <= b; i++) {
            result = result * a;
        }

        System.out.println("Power: " + result);
    }
}