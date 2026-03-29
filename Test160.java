//finding cone

public class Test160 {
    public static void main(String[] args) {

        double r = 3;  // radius
        double h = 4;  // height
        double pi = 3.14;

        // slant height
        double l = Math.sqrt(r * r + h * h);

        double csa = pi * r * l;
        double tsa = pi * r * (r + l);
        double volume = (pi * r * r * h) / 3;

        System.out.println("Slant Height = " + l);
        System.out.println("Curved Surface Area = " + csa);
        System.out.println("Total Surface Area = " + tsa);
        System.out.println("Volume = " + volume);
    }
}