public class Test94 {
    public static void main(String[] args) {

        String str = "java";

        char[] chars = new char[str.length()];

        for(int i = 0; i < str.length(); i++){
            chars[i] = str.charAt(i);
        }

        // print array
        for(int i = 0; i < chars.length; i++){
            System.out.print(chars[i] + " ");
        }
    }
}