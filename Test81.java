//Find Pair with Given Sum

public class Test81 {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 3, 5, 7};
        int target = 7;

        boolean first = true;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {

                    if (!first) {
                        System.out.print(", ");
                    }

                    System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
                    first = false;
                }
            }
        }
    }
}