// sum of first n numbers;

public class Test45{
    public static void main(String[] args){
        int n = 5;
        int store = 0;
        for(int i = n ; i >= 1 ; i--){

            store = store + i;
        }
        System.out.println( " sum of " + n + " = " +  store);
    }
}