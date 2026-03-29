//finding cylinder

public class Test159 {
    public static void main(String[] args) {

        double r = 5;  // radius
        double h = 10; // height

        double pi = 3.14;

        double csa = 2 * pi * r * h;
        double tsa = 2 * pi * r * (r + h);

        System.out.println("Curved Surface Area = " + csa);
        System.out.println("Total Surface Area = " + tsa);
    }
}