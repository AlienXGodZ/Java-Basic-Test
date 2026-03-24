//convert all letter into capital letter without using the predefine function.
public class Test66 {
    public static void main(String[] args) {
        String letters = "allen";
        String store = "";

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            store = store + ch;
        }
        System.out.println(store);
    }
}