//trapping rain water

public class Test111 {
    public static void main(String[] args) {

        int[] arr = {3, 0, 2, 0, 4};
        int totalWater = 0;

        for (int i = 0; i < arr.length; i++) {

            int leftMax = arr[i];
            for (int j = 0; j <= i; j++) {
                if (arr[j] > leftMax) {
                    leftMax = arr[j];
                }
            }

            int rightMax = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > rightMax) {
                    rightMax = arr[j];
                }
            }

            int water = Math.min(leftMax, rightMax) - arr[i];
            totalWater += water;
        }

        System.out.println("Total Water: " + totalWater);
    }
}