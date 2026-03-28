// print binary numbers

public class Test145 {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {

            int num = i % 2; // start with 1 or 0

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num = 1 - num; // toggle 0 ↔ 1
            }

            System.out.println();
        }
    }
}