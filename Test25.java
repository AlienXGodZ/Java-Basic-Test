// finding the missing number using not formula

public class Test25{
    public static void main(String[] args){
        int[] numbers = {2,4,6,8};

        int tempmin = numbers[0];
        int tempmax = numbers[0];


        for(int i = 0; i < numbers.length; i++ ){
            if (numbers[i]>tempmax){
                tempmax = numbers[i];
            }
        }
        int max = tempmax;

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] < tempmin) {
                tempmin = numbers[i];
            }
        }
        int min = tempmin;

        for(int i = min; i <= max; i++) {
            boolean condition = true;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    condition = false;
                    break;
                }
            }
            if(condition) {
                System.out.println("missing Number: " + i);
            }
            }

            }
            }
