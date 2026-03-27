//Check if String is Rotation WITHOUT using contains()

public class Test122 {
    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "cdeab";

        if (s1.length() != s2.length()) {
            System.out.println("FALSE");
            return;
        }

        String combined = s1 + s1;

        boolean found = false;

        // manual substring check
        for (int i = 0; i <= combined.length() - s2.length(); i++) {

            int j;

            for (j = 0; j < s2.length(); j++) {

                if (combined.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }

            if (j == s2.length()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}