public class Test164 {
    public static void main(String[] args) {

        myMethod(5);


    }

    public static void myMethod(int n){

        if(n == 0){
            return ;
        }


        System.out.println(n);

        myMethod(n-1);


    }

}
