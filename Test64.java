//finding the largest words in the string.

public class Test64 {
    public static void main(String[] args) {

        String str = "Java is powerful language";

        String word = "";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i); // build word
            } else {
                // check length
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = ""; // reset
            }
        }

        // check last word (important)
        if (word.length() > longest.length()) {
            longest = word;
        }

        System.out.println("Longest word: " + longest);
    }
}