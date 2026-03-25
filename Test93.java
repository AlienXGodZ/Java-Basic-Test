//Split String into Characters using built in methods.

public class Test93 {
    public static void main(String[] args) {

        String str = "java";

        // convert string to char array
        char[] chars = str.toCharArray();

        // print array
        for(int i = 0; i < chars.length; i++){
            System.out.print(chars[i] + " ");
        }
    }
}