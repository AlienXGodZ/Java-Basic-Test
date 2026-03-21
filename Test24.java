// this program check the missing number using formula this forumula only work continues number like 1,2,3,4,5

public class Test24{
    public static void main(String[] args){
        int[] numbers = { 1, 2, 3, 5, 6};
        int temp = numbers.length +1;
        int total = temp * ( temp + 1) / 2;
        int store = 0;

        for(int i = 0; i < numbers.length; i++){
                store = store + numbers[i];
            }

           int result = total - store;
        System.out.println(result);

    }
}