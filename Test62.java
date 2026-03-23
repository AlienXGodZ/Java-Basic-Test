// this program count this same add like this a3b2c1

public class Test62 {
    public static void main(String[] args) {

        String str = "aaabbc";
        String store = "";

        int count = 1;

        for(int i = 0 ; i < str.length();i++){
            if(i < str.length() - 1  && str.charAt(i) == str.charAt(i+1)){
                count = count + 1;
            }else{
                store = store + str.charAt(i) + count;
                count = 1;
            }
        }
        System.out.println(store);
    }
}