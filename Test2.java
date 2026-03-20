// Check Palindrome program using Strings

public class Test2 {
    public static void main(String[] args) {
        String letter = "allena";
        int length = letter.length() -1;
        int start = 0;
        boolean condition = true;

        while(start < length){
            if (letter.charAt(start) != letter.charAt(length)){
                condition = false;
                break;
            }
            start++;
            length--;

        }
        if(condition) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}