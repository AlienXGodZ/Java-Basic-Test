//finding a missing strings

public class Test29 {
    public static void main(String[] args) {
        String letters = "allena";

        char min = letters.charAt(0);
        char max = letters.charAt(0);

        // find min and max
        for (int i = 0; i < letters.length(); i++) {
            if (letters.charAt(i) < min) {
                min = letters.charAt(i);
            }
            if (letters.charAt(i) > max) {
                max = letters.charAt(i);
            }
        }

        // find missing letters
        for (char ch = min; ch <= max; ch++) {
            boolean found = false;

            for (int j = 0; j < letters.length(); j++) {
                if (letters.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Missing Letter: " + ch);
            }
        }
    }
}