//finding the duplicate or same number this program tell the duplicate numbers and tell how many times.

public class Test32 {
    public static void main(String[] args) {
        int[] numbers = {1 , 2 , 3 , 2 , 4 ,3,5, 3};

        for(int i = 0; i < numbers.length; i++){
            int count = 0;
            for(int j = 0; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    count = count + 1;
                }
            }
            boolean condition = false;
            for(int k = 0; k < i ; k++){
                if(numbers[k] == numbers[i]){
                    condition = true;
                    break;
                }
            }
             if(!condition && count > 1){
                 System.out.println(numbers[i] + " -->" + count + " times");
             }
            }
            }

    }
