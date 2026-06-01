public class Test169 {
    public static void main(String[] args) {

        System.out.println(myMethod(12345));


    }


    public static int myMethod(int n){
        if(n == 0){
            return 0;
        }


        return n%10 + myMethod(n/10);








    }

}
