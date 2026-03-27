//Next Greater Element

public class Test114{
    public static void main(String[] args){
        int[] numbers = {4,5,2,25};
        int length = numbers.length;
        System.out.print("{");
        for(int i = 0; i < numbers.length ; i++){
            for(int j = i + 1 ; j < numbers.length ; j++){
                if(numbers[i] != numbers[j] && numbers[i] < numbers[j]) {
                    System.out.print(numbers[j] + ",");
                    break;
                }

            }
        }
        System.out.print(-1);
        System.out.print("}");
    }
}
