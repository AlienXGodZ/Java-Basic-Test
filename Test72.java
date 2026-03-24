//Factorial using Recursion.

public class Test72{
    public static int mymethod(int a){
        if(a == 0 || a == 1) {
            return 1;
        }
            return a * mymethod(a - 1);
        }


    public static void main(String[] args){
        int result = mymethod(5);
        System.out.println(result);
    }
}
