// program for checking the basic calculator using switch operator

public class Test38 {
    public static void main(String[] args){

        int a = 12;
        int b = 10;
        char operator = '/';

        switch(operator){
            case '+':
            System.out.println("Result is " + (a + b));
            break;
            case '-' :
            System.out.println("Result is " + (a - b));
            break;
            case '*' :
                System.out.println("Result is " + (a * b));
                break;
            case '/' :
                if(b != 0) {
                    System.out.println("Result is  " + (a / b));
                }else{
                    System.out.println("Not Divide by Zero");
            }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}