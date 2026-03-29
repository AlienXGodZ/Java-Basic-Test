//finding compound interest

public class Test155 {
    public static void main(String[] args) {

        double P = 1000;
        double R = 5;
        int T = 2;

        double amount = P * Math.pow((1 + R/100), T);
        double CI = amount - P;

        System.out.println("Compound Interest = " + CI);
    }
}