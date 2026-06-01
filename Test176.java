public class Test176 {
    public static void main(String[] args){

        System.out.println(myMethod(1234321, 2));

    }
    public static int myMethod(int n , int a){

        if(n == 0){
            return 0;
        }


            if(n % 10 == a){
                return 1 + myMethod(n/10, a);
            }
              return  myMethod(n/10, a);

    }
}
