//finding a missing string this program only find missing string during continous string only

public class Test28{
    public static void main(String[] args){
        String letters = "abdg";

        char start = letters.charAt(0);
        char end = letters.charAt(letters.length() -1);

        for(char i = start; i < end; i++) {
            boolean condition = true;
            for (int j = 0; j < letters.length(); j++) {
                if (letters.charAt(j) == i) {
                    condition = false;
                    break;
                }
            }
            if(condition){
                System.out.println("Missing Letter: " + i );
            }
        }
    }
}