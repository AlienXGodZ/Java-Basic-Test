// counting the not repeative numbers.

public class Test57{
    public static void main(String[] args){
        String letters= "aabbdecdd";

             char [] store = new char [26];


             for(int i = 0 ; i < letters.length(); i++){
                 char ch = letters.charAt(i);
                 store [ch - 'a'] = (char) (store [ ch - 'a'] + 1);
             }

             for(int i = 0 ; i < letters.length() ; i++){
                 char ch = letters.charAt(i);

                 if( store[ch - 'a']== 1){
                     System.out.println("non repeative: " + ch);
                 }
             }
        }

        }
