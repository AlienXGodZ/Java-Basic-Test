// count the single word program

public class Test5{
    public static void main (String[] args){
        int number = 45764832;
        int store = 0;

        while(number > 0){
            store = store +1;
            number = number / 10;


        }

        System.out.println(store);
    }
}