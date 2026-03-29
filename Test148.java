//student Marks System
public class Test148 {
    public static void main(String[] args) {

        int m1 = 80;
        int m2 = 70;
        int m3 = 90;

        int total = m1 + m2 + m3;
        int avg = total / 3;

        System.out.println("Average = " + avg);

        if (avg >= 90) {
            System.out.println("Grade A");
        }
        else if (avg >= 75) {
            System.out.println("Grade B");
        }
        else if (avg >= 50) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }
    }
}