public class Test163 {
    public static void main(String[] args) {

        myMethod(5);


    }

    public static void myMethod(int n){

        if(n == 0){
            return ;
        }

        myMethod(n-1);
        System.out.println(n);


    }

}
