public class Test174 {
    public static void main(String[] args) {

        myMethod(10);



    }

    public static void myMethod(int n){

        if(n == 0) return ;

        myMethod(n-1);

        if(n % 2 == 0) System.out.print(n + " ");

    }
}
