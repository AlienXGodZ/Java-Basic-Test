public class Test86 {
    public static void main(String[] args) {

        String str = "JaVa";
        String result = "";

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // if uppercase
            if(ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            // if lowercase
            else if(ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result = result + ch;
        }

        System.out.println(result);
    }
}