public class Test177 {
    public static void main (String[] args){

        System.out.println(myMethod(12,18));


    }
    public static int myMethod(int a,int b){

        if(b == 0 ){
            return a;
        }

        return myMethod(b , a % b);







    }
}
