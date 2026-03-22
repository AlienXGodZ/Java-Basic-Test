//sum of even number only

public class Test39{
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int store = 0;

        for(int i = 0; i < numbers.length ; i++ ){
            if(numbers[i] % 2 == 0){
             store = store + numbers[i];
            }
        }
        System.out.println(store);
    }
}