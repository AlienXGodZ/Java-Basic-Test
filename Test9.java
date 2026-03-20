// this program shows the like a,e,i,o,u in string this program shows numbers example like 1,2,3,4,5.

public class Test9{
    public static void main(String[] args) {
        int numbers = 6123789;
        int count = 0;
        int store = 0;

        while ( numbers > 0){
            int ch = numbers % 10;
            if (ch == 1 || ch == 2 || ch == 3 || ch == 4 || ch == 5) {
                count = count + 1;
            }
            numbers = numbers / 10;
        }
        System.out.println(count);
    }

}