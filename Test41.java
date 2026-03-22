//this program convert the string capital letter into small letters without using predefined rule.

public class Test41{
    public static void main(String[] args){

        String letters = "ALLEN";
        String result = "";

         for(int i = 0; i < letters.length() ; i++){
             char ch = letters.charAt(i);


             if(ch >= 'A' && ch <= 'Z'){
                 ch = (char)(ch + 32);
             }
             result = result + ch;
         }
         System.out.println("LowerCase: " + result);
    }
}