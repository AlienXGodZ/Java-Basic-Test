// finding the missing number without using array

public class Test58 {
    public static void main(String[] args) {

        String letters = "aabbdecdd";

        for (int i = 0; i < letters.length(); i++) {

            char ch = letters.charAt(i);
            int count = 0;

            // count how many times ch appears
            for (int j = 0; j < letters.length(); j++) {
                if (letters.charAt(j) == ch) {
                    count++;
                }
            }

            // print only if appears once
            if (count == 1) {
                System.out.println("Non-repeating: " + ch);
            }
        }
    }
}