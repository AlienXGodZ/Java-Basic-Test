//Frequency of numbers in array

public class Test134 {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,1,4};
        int[] count = new int[100];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(i + " = " + count[i]);
            }
        }
    }
}