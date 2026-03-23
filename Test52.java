//  this program check how many words but it is not failed has test 51. it handles extra space.

public class Test52 {
    public static void main(String[] args) {

        String str = "Java is easy";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 && str.charAt(i) != ' ') || (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ')) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}