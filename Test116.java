//Rotate Matrix 90° (2D array)

public class Test116 {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n = arr.length;

        // 🔹 Step 1: Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // 🔹 Step 2: Reverse each row
        for (int i = 0; i < n; i++) {

            int start = 0;
            int end = n - 1;

            while (start < end) {

                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                start++;
                end--;
            }
        }

        // 🔹 Print result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}