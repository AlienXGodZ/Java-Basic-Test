//Replace characters in string

public class Test136 {
    public static void main(String[] args) {

        String str = "hello";
        char oldChar = 'l';
        char newChar = 'x';

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == oldChar) {
                result = result + newChar;
            } else {
                result = result + str.charAt(i);
            }
        }

        System.out.println(result);
    }
}