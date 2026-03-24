//This program Remove the space.

public class Test71 {
    public static void main(String[] args) {
        String letters = " allen harvey ";
        String result = "";

        for (int i = 0; i < letters.length(); i++) {
            if (letters.charAt(i) != ' ') {
                result = result + letters.charAt(i);
            }
        }

        System.out.println(result);
    }
}