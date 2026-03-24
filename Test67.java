// reverse the letters.

public class Test67{
    public static void main(String[] args){
        String letters = "Java is fun";
        String store = "";

        for( int i = letters.length() - 1; i >= 0  ; i--){
            store = store + letters.charAt(i);
        }
        System.out.println(store);
    }
}