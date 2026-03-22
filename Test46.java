//Check if Character is Capital letter, Small letter, Digit, or Special Character

public class Test46{
    public static void main(String[] args){

        char ch = '/';

        if( ch >= 'a' && ch <= 'b' ){
            System.out.println("Small Letter");
        }else if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital Letter");
        }else if( ch >= '0' && ch <= '9' ) {
            System.out.println("Digit");
        }else{
                System.out.println("Special Character");
            }
        }
    }
