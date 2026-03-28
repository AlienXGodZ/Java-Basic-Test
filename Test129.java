//checking lcm

public class Test129 {
    public static void main(String[] args) {
        int a = 13;
        int b = 12;

        int max = (a > b) ? a : b;

        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM: " + max);
                break;
            }
            max++;
        }
    }
}