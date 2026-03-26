//finding String Permutations

public class Test103 {

    public static void main(String[] args) {
        String str = "abc";
        permute(str, "");
    }

    public static void permute(String str, String result) {

        // base case
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // remove selected character
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // recursive call
            permute(remaining, result + ch);
        }
    }
}