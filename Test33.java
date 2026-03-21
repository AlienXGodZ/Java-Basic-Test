// finding duplicate string

public class Test33 {
    public static void main(String[] args){
        char[] numbers = { 'a' , 'b' , 'e' , 'a' , 'a' };

        for(char i = 0; i < numbers.length ; i++){
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count = count + 1;
                }
            }

                boolean condition = false;
                for(int k = 0; k < i; k++ ){
                    if(numbers[k] == numbers[i]);
                    condition = true;
                    break;
                }
                if(!condition && count > 1){
                    System.out.println(numbers[i] + " ---> " + count + " times");
            }
            }
        }
    }
