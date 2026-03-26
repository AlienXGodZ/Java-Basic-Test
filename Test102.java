//Longest Palindromic Substring

public class Test102 {
    public static void main(String[] args) {

        String str = "babad";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {

                String sub = str.substring(i, j + 1);

                if (isPalindrome(sub)) {
                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }

        System.out.println("Longest Palindrome: " + longest);
    }

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}