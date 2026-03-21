// finding the missing string. one important thing in this program we use char char is like a ascii values.

public class Test26{
    public static void main(String[] args){
        char[] letters = {'b', 'e', 'g', 'h'};

        char tempmax = letters[0];
        char tempmin = letters[0];

        for(int i = 0; i < letters.length; i++){
            if ( letters[i] > tempmax){
                tempmax = letters[i];
            }
            if ( letters[i] < tempmin){
                tempmin = letters[i];
            }
        }

        for(char i = tempmin; i <= tempmax; i++){
            boolean condition = true;
            for(int j = 0 ; j < letters.length;j++ ) {
                if (letters[j] == i) {
                    condition = false;
                    break;
                }
            }
            if(condition){
                System.out.println("Missing word :" + i);
            }
        }

    }
}