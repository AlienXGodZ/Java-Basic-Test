public class Test18 {
    public static void main (String[] args){
        int number = 9;
        boolean condition = true;

        for(int i = 2; i <= number;i++) {
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
