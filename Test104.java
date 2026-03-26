//Minimum Characters to Make Palindrome

public class Test104 {
    public static void main(String[] args) {

        String str = "abc";
        int count = 0;

        while (!isPalindrome(str)) {
            str = str.substring(0, str.length() - 1); // remove last char
            count++;
        }

        System.out.println("Minimum characters needed: " + count);
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