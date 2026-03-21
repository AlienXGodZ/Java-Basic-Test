//Finding missing number without arrays

public class Test27{
    public static void main (String[] args){
        int numbers = 1345;

        boolean[] condition = new boolean [10];

        while(numbers > 0) {
            int lastdigit = numbers % 10;
            condition[lastdigit] = true;
            numbers = numbers / 10;
        }
        for(int i = 0; i <= 9 ; i++){
            if(!condition[i]){
                System.out.println("Missing Number: " + i );
            }
        }


    }
}