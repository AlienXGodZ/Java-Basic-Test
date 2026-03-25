//convert the letter into ascii values

public class Test85{
    public static void main(String[] args){
        String letters = "ABC";

        for(int i = 0 ; i < letters.length(); i++){
            char ch = letters.charAt(i);
             int ascii = ch;

             System.out.println(ch+ " = " +ascii );
        }
    }
}