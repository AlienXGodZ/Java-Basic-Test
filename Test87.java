//Replace Character in String (without replace method)

public class Test87 {
    public static void main(String[] args) {

        String str = "banana";
        char oldChar = 'a';
        char newChar = 'x';

        String result = "";

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch == oldChar) {
                result = result + newChar;
            } else {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}