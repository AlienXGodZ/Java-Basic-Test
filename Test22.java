// swapping the all numbers using magic (trick) this trick works only two swap not three!!

public class Test22{
    public static void main(String[] args){
        int a = 10;
        int b = 21;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
    }
}