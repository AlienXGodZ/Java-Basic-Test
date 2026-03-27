//Implement strStr() (Substring search manually

public class Test120 {
    public static void main(String[] args) {

        String str = "hello";
        String sub = "ll";

        int index = -1;

        for (int i = 0; i <= str.length() - sub.length(); i++) {

            int j;

            for (j = 0; j < sub.length(); j++) {

                if (str.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }

            // if full match found
            if (j == sub.length()) {
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
    }
}