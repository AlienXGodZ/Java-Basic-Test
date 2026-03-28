//merge like { 1,2,3,4}

public class Test124 {
    public static void main(String[] args) {

        int[] arr1 = {1, 3,4};
        int[] arr2 = {2};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // 🔹 Step 1: merge arrays
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // remaining elements
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        // 🔹 Step 2: find median
        int total = merged.length;

        if (total % 2 == 1) {
            System.out.println("Median: " + merged[total / 2]);
        } else {
            double median = (merged[total / 2] + merged[total / 2 - 1]) / 2.0;
            System.out.println("Median: " + median);
        }
    }
}