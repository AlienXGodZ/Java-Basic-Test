// finding both largest and smallest number

public class Test12{
    public static void main (String[] args){
        int a = 5;
        int b = 20;
        int c = 10;

        int largest =0;

        if(a > b && b > c) {
            System.out.println("largest is :" + (largest+a));
        }else if ( b > c && b > a) {
            System.out.println("largest is : "+ (largest+b));
        }else{
            System.out.println("largest is : "+ (largest+c));
            }

        int smallest = 0;
        if(a < b && b < c) {
            System.out.println("secondest is :" + (smallest+a));
        }else if ( b < c && b < a) {
            System.out.println("secondest is :" + (smallest+b));
        }else{
            System.out.println("secondest is :" + (smallest+c));
        }
        }
    }
