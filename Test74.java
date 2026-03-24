//this program arrange biggest to smallest numbers in the array.

public class Test74 {
    public static void main(String[] args) {

        int[] letters = {5, 2, 9, 1, 3};

        for (int i = 0; i < letters.length; i++) {
            for (int j = i + 1; j < letters.length; j++) {

                if (letters[i] < letters[j]) {

                    // swap
                    int temp = letters[i];
                    letters[i] = letters[j];
                    letters[j] = temp;
                }
            }
        }

        // print
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
    }
}