//Find Maximum Occurring Character

public class Test84 {
    public static void main(String[] args) {

        String str = "banana";
        char maxChar = ' ';
        int maxCount = 0;

        for(int i = 0; i < str.length(); i++) {

            int count = 1;

            for(int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if(count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Max occurring character: " + maxChar);
    }
}