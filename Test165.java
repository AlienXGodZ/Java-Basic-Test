public class Test165 {
    public static void main(String[] args) {

        System.out.println(myMethod(5));


    }

    public static int myMethod(int n){

        if(n == 0){
            return 0 ;
        }


        return n + myMethod(n-1);



    }

}
