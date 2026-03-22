//this program convert the string small letter into large letters without using predefined rule.

public class Test42{
    public static void main(String[] args){

        String letters = "allen";
        String result = "";

        for(int i = 0; i < letters.length() ; i++){
            char ch = letters.charAt(i);


            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
            }
            result = result + ch;
        }
        System.out.println("UpperCase: " + result);
    }
}