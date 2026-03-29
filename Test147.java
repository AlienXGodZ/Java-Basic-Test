//Menu-driven program (loop + switch)

public class Test147 {
    public static void main(String[] args) {

        int choice = 1; // change this value to test

        if (choice == 1) {
            int a = 10;
            int b = 5;
            System.out.println("Sum = " + (a + b));
        }
        else if (choice == 2) {
            int a = 10;
            int b = 5;
            System.out.println("Difference = " + (a - b));
        }
        else if (choice == 3) {
            System.out.println("Exit");
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}