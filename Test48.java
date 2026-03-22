// count without using length() using convert letter into array like char[] arr = letters.toCharArray();

public class Test48{
    public static void main(String[] args){
        String letters = "abseecd";


        char[] arr = letters.toCharArray();

        int count = 0;

        for(int array : arr){
            count = count + 1;
        }
        System.out.println(count);
    }
}