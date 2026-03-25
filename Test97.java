//Move Negative Numbers to One Side of Array

public class Test97 {
    public static void main(String[] args) {

        int[] arr = {1, -2, 3, -4, 5, -6};
        int j = 0; // position for negative numbers

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // print array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}