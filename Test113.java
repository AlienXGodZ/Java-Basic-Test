//Merge Intervals

public class Test113 {
    public static void main(String[] args) {

        int[][] arr = {
                {1,3}, {2,6}, {8,10}, {15,18}
        };

        // 🔹 Step 1: Sort manually (simple bubble sort)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i][0] > arr[j][0]) {
                    // swap intervals
                    int temp1 = arr[i][0];
                    int temp2 = arr[i][1];

                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];

                    arr[j][0] = temp1;
                    arr[j][1] = temp2;
                }
            }
        }

        // 🔹 Step 2: Merge intervals
        int start = arr[0][0];
        int end = arr[0][1];

        System.out.print("{ ");

        for (int i = 1; i < arr.length; i++) {

            if (arr[i][0] <= end) {
                // overlap
                if (arr[i][1] > end) {
                    end = arr[i][1];
                }
            } else {
                // print previous interval
                System.out.print("[" + start + "," + end + "] ");

                start = arr[i][0];
                end = arr[i][1];
            }
        }

        // 🔹 print last interval
        System.out.print("[" + start + "," + end + "] }");
    }
}