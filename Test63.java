// Move All Zeros to End

public class Test63{
    public static void main(String[] args){
        int[] numbers = {0,1,0,3,12};
        int index = 0;


        for(int i = 0 ; i < numbers.length ; i++) {
            if (numbers[i] != 0) {
                numbers[index] = numbers[i];
                index = index + 1;
            }
        }
         while(index < numbers.length){
             numbers[index] = 0;
             index = index + 1;

            }
        for(int number : numbers){
          System.out.print(number + " ");
         }
        }

    }
