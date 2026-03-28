//Count vowels, consonants
public class Test132 {
    public static void main(String[] args) {

        String str = "Java is fun";

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase(); // convert to lowercase

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // check consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}