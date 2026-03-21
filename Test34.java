//finding duplicate numbers without using array.

public class Test34{
    public static void main(String[] args){
        int number = 123451;

        int[] count = new int [10];

        while(number > 0){
            int lastdigit = number % 10;
            count[lastdigit] = count[lastdigit] + 1;
            number = number / 10;
        }
        System.out.print("Unique digits: ");
        for(int i = 0; i <= 9 ;i++ ){
            if(count[i] > 0){
                System.out.print( i + " ");
            }
        }
        System.out.println();
         for(int i = 0; i <= 9; i++){
             if(count[i] > 1){
                 System.out.println(" digit " + i + " appears " + count[i] + " times");
             }
         }
    }
}