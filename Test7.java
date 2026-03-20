//mention vowels + number of vowels

public class Test7 {
    public static void main(String[] args) {
        String letter = "education";
        boolean condition = false;
        int count = 0;
        String vowels = "";

        for (int i = 0; i < letter.length(); i++) {
            char ch = letter.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count = count + 1;
                vowels = vowels + ch;
                condition = true;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Number of vowels: " + count);

    }
}