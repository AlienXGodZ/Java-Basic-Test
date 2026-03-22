// this program find both smallest and greatest numbers.

public class Test43{
    public static void main(String[] args){
        int[] numbers = {50,20,10,30,40};
        int templargest = numbers[0];
        int tempsmallest = numbers[0];

        for(int i = 0 ; i < numbers.length; i++){
            if(numbers[i] > templargest ){
                templargest = numbers[i];
            }
        }
        for(int i = 0; i < numbers.length ; i++){
            if(numbers[i] < tempsmallest){
                tempsmallest = numbers[i];
            }
        }
        System.out.println("Smallest number is: " + tempsmallest);
        System.out.println("Largest number is: " + templargest);
    }
}