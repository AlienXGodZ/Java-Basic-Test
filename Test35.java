// this program count the duplicate numbers

public class Test35{
    public static void main(String[] args){

        String str = "abcdeab";

        int[] count = new int [26];

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            count [ch - 'a'] = count [ch - 'a'] + 1;
        }

        System.out.print("Unique letters :");
        for(int i = 0; i < 26 ; i++){
            if(count[i] > 0 ){
                char ch  = (char)( i + 'a');
                System.out.print(ch + " ");

            }
        }
        System.out.println();
        for(int i = 0; i < 26 ; i++){
            if(count[i] > 1){
                char ch = (char)(i + 'a');
                System.out.println(ch + " appears " + count[i] + " times ");
            }
        }

    }
}