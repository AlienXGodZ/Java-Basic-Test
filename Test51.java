// this program check how many words but its failed if space was created

public class Test51{
    public static void main(String[] args){
        String letters = "Java is easy";

        int start = 0;
        char found = ' ';
        int store = 0;
        int count = 1;

        for(int i = 0; i < letters.length(); i++){
            if(letters.charAt(i) == found ){
                count = count + 1;

            }
        }
        System.out.println(count);
    }
}