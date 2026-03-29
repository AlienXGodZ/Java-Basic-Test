//finding simple interest

public class Test154 {
    public static void main(String[] args) {

        int P = 1000; // principal
        int R = 5;    // rate
        int T = 2;    // time

        int SI = (P * R * T) / 100;


        System.out.println("original Money(Inital) :" + P);
        System.out.println("Simple Interest(Extra money) = " + SI);
        System.out.println("Total money :" + (P + SI));
    }
}