public class Test181 {
    public static void main(String[] args){

        myMethod(13);


    }
    public static void myMethod(int n){

        if(n == 0){
            return ;
        }

        myMethod(n / 2);

        System.out.print(n % 2 + " ");

    }
}
