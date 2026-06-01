public class Test167 {
    public static void main(String[] args) {

        System.out.println(myMethod(5,3));


    }

    public static int myMethod(int n,int m){

        if(m == 0){
            return 1 ;
        }


        return n * myMethod(n,m-1);



    }

}
