public class Test188{
    public static void main(String[] args){

        String str = "madai";

        if(isPalindrome(str,0,str.length()-1)){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT PALINDROME");
        }

    }
    public static boolean isPalindrome(String str, int start , int end){

        if(start >= end){
            return true;
        }

        if(str.charAt(start) != str.charAt(end)){
            return false;
        }

        return isPalindrome(str, start + 1, end-1);


    }
}