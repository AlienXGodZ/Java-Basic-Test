// check palindrome using numbers
public class Test16{
    public static void main(String[] args){
        int number = 121;
        int original = number;
        int store = 0;
        while(number > 0){
            int lastnumber = number % 10 ;
            store = store * 10 + lastnumber;
            number =  number / 10;
        }
        if(original == store) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
            }
        }

    }