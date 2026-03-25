//Longest Substring Without Repeating Characters.(i did not understand this )

public class Test80 {
    public static void main(String[] args) {

        String str = "bcaabcabcxyzxyzxyzxyzbb";

        String largest = "";

        for (int i = 0; i < str.length(); i++) {
            String store = "";
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (store.indexOf(ch) != -1) {
                    break;
                }
                store = store + ch;
                if (store.length() > largest.length()) {
                    largest = store;
                }
            }
        }
            System.out.println(largest);
        }
    }
