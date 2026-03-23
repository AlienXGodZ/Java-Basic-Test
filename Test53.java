//finding second largest in array

public class Test53{
    public static void main(String[] args){
        int[] numbers = {3, 5, 1, 9, 7};

        int templargest = numbers[0];
        int tempsecondlargest = numbers[0];

        for(int i = 0; i < numbers.length ; i++){
            if(numbers[i] > templargest){
                tempsecondlargest = templargest;
                templargest = numbers[i];
            }
        }
        System.out.println(templargest);
        for(int i = 0; i < numbers.length ; i++){
            if(numbers[i] > tempsecondlargest && numbers[i] != templargest){
                tempsecondlargest = numbers[i];
            }
        }
        System.out.println(tempsecondlargest);
    }
}