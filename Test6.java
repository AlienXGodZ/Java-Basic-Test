public class Test6 {
    public static void main(String[] args) {
        String letter = "education";
        boolean condition = false;
        int count = 0;

        for (int i = 0; i < letter.length(); i++) {
            int ch = letter.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count = count + 1;
                condition = true;
            }
        }
        if(condition) {
            System.out.println(count);
        }else{
            System.out.println("Vowels not found");
        }
    }
}