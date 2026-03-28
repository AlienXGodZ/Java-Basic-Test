//Reverse String (Recursion)

public class Test142 {
    public static String reverse(String str) {

        if (str.length() == 0) {
            return ""; // base case
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("java"));
    }
}