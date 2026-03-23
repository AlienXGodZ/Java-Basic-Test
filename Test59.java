// checking the program anagram or not.

public class Test59 {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silint";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    count++;
                     break;// 🔥 important
                }
            }
        }

        if (count == s1.length()) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}