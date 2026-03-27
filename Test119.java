//Rearrange Array Alternately (+ve, -ve)

public class Test119 {
    public static void main(String[] args) {

        int[] arr = {1, -2, 3, -4, -1, 4};

        int n = arr.length;

        int[] pos = new int[n];
        int[] neg = new int[n];

        int p = 0;
        int ne = 0;

        // 🔹 Step 1: separate
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos[p] = arr[i];
                p++;
            } else {
                neg[ne] = arr[i];
                ne++;
            }
        }

        // 🔹 Step 2: merge alternately
        int i = 0, j = 0, k = 0;

        while (i < p && j < ne) {
            arr[k++] = pos[i++];  // positive
            arr[k++] = neg[j++];  // negative
        }

        // 🔹 Step 3: remaining elements
        while (i < p) {
            arr[k++] = pos[i++];
        }

        while (j < ne) {
            arr[k++] = neg[j++];
        }

        // 🔹 print
        for (int x = 0; x < n; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}