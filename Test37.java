public class Test37{
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        char c = '*';

        if(c == '+') {
            System.out.println("Result is: " + (a + b));
        }else if (c == '-') {
            System.out.println("Result is: " + (a - b));
        }else if ( c == '*') {
            System.out.println("Result is: " + (a * b));
        }else if ( c == '/'){
            if(b != 0) {
                System.out.println("Result is: " + (a / b));
            }else{
                System.out.println("not divided by zero");
            }
        }
        else{
            System.out.println("Invalid operator");
        }
    }
}