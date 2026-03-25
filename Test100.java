//Find Peak Element

public class Test100 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 4};

        for (int i = 0; i < arr.length; i++) {

            // first element
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("Peak: " + arr[i]);
                }
            }

            // last element
            else if (i == arr.length - 1) {
                if (arr[i] > arr[i - 1]) {
                    System.out.println("Peak: " + arr[i]);
                }
            }

            // middle elements
            else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    System.out.println("Peak: " + arr[i]);
                }
            }
        }
    }
}