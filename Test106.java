public class Test106 {
    public static void main(String[] args) {

        String str = "ADOBECODEBANC";
        String pattern = "ABC";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int[] count = new int[256];
            int needed = pattern.length();

            // store pattern count
            for (int k = 0; k < pattern.length(); k++) {
                count[pattern.charAt(k)]++;
            }

            for (int j = i; j < str.length(); j++) {

                char ch = str.charAt(j);

                if (count[ch] > 0) {
                    needed--;
                }

                count[ch]--;

                if (needed == 0) {

                    String sub = str.substring(i, j + 1);

                    if (result.equals("") || sub.length() < result.length()) {
                        result = sub;
                    }
                    break;
                }
            }
        }

        System.out.println("Smallest Window: " + result);
    }
}