// checking the program anagram or not using array.

public class Test60 {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        // Step 1: check length
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] count = new int[26]; // for a-z

        // Step 2: count characters of s1
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }

        // Step 3: subtract using s2
        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i) - 'a']--;
        }

        // Step 4: check all values are 0
        boolean isAnagram = true;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        // Step 5: result
        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}