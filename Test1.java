//revers a Number Program

public class Test1{
    public static void main(String[] args){

        int number = 1234;
        int store = 0;

        while(mumber > 0){
            int takelastdigit = number % 10;   //take last digit
            store = store * 10 + lastdigit;   //store digit
            number = number / 10;            //Remove last digit
        }

        System.out.println(store);
    }