// check the number if prime and not prime number. using Math.sqrt() to optimize the loop if number is big.

public class Test19 {
    public static void main (String[] args){
        int number = 9;
        boolean condition = true;

        for(int i = 2; i <= Math.sqrt(number);i++) {
            if (number % i == 0) {
                condition = false;
            }
        }
        if( number <= 1){
            System.out.println("Not Prime Number");
        }
        else if(condition) {
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}
