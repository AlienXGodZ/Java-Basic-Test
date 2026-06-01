public class Test168 {
    public static void main(String[] args) {

        System.out.println(myMethod(12345));


    }


    public static int myMethod(int n){
        if(n == 0){
            return 0;
        }


         return 1 + myMethod(n/10);








    }

}
