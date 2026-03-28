//split string manually
public class Test137 {
    public static void main(String[] args) {

        String str = "Java is fun";
        String word = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                System.out.println(word);
                word = "";
            }
        }

        System.out.println(word); // last word
    }
}