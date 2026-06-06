public class Test193 {

    public static void main(String[] args) {

        String str = "JAVA";

        myMethod(str, 0, 1);
    }

    public static void myMethod(String str, int start, int end) {

        if (start == str.length()) {
            return;
        }

        if (end > str.length()) {

            System.out.println();

            myMethod(str, start + 1, start + 2);
            return;
        }

        System.out.println(str.substring(start, end));

        myMethod(str, start, end + 1);
    }
}