//count the substring using formula

public class Test95 {
    public static void main(String[] args) {

        String str = "abc";
        int n = str.length();

        int totalSubstrings = n * (n + 1) / 2;

        System.out.println("Number of substrings: " + totalSubstrings);
    }
}