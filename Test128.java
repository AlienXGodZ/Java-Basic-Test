//finding lcm

public class Test128 {
    public static void main(String[] args) {

        int a = 4;
        int b = 6;

        int x = a;
        int y = b;

        // 🔹 find GCD (Euclidean method)
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;

        // 🔹 find LCM
        int lcm = (a * b) / gcd;

        System.out.println("LCM: " + lcm);
    }
}