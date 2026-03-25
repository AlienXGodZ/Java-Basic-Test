//Find Longest Repeating Character Sequence

public class Test88 {
    public static void main(String[] args) {

        String str = "aaabbccccd";

        char max = str.charAt(0);
        int maxCount = 1;

        char current = str.charAt(0);
        int currentCount = 1;

        for(int i = 1; i < str.length(); i++) {

            if(str.charAt(i) == current) {
                currentCount++;
            } else {
                current = str.charAt(i);
                currentCount = 1;
            }

            if(currentCount > maxCount) {
                maxCount = currentCount;
                max = current;
            }
        }

        // print result
        for(int i = 0; i < maxCount; i++) {
            System.out.print(max);
        }
    }
}