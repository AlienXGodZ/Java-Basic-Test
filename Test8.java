// this program shows the index + vowels + number of vowels

public class Test8 {
    public static void main(String[] args) {
        String letter = "AllenHarvey";
        int count = 0;

        for (int i = 0; i < letter.length(); i++) {
            char ch = letter.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count = count + 1;
                System.out.println("vowel:" + ch + " at index: " + i);
            }
        }
        System.out.println("Number of Vowels: " + count);

    }
}