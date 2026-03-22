// Print ASCII Values of String


public class Test47{
    public static void main(String[] args){
        String letters = "ABC";

        for(int i = 0; i < letters.length(); i++){
             char ch = letters.charAt(i);

             int numbers = ch;

             System.out.print(numbers + " ");
        }
    }
}