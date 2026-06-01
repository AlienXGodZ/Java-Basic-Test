public class Test171 {
    public static void main(String[] args) {

        int num = 6;
        for(int i = 0 ; i <= num ; i++){
        System.out.print(myMethod(i) + " ");
}
    }

    public static int myMethod(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        return myMethod(n - 1) + myMethod(n - 2);


    }
}

