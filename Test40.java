//convert the string into upperletter and lowerletter

public class Test40{
    public static void main(String[] args){
        String letters = "allen";

        String upperletter = letters.toUpperCase();
        String lowerletter = letters.toLowerCase();

        System.out.print("\"");
        System.out.print(upperletter);
        System.out.print("\"");
        System.out.println();
        System.out.print("\"");
        System.out.print(lowerletter);
        System.out.print("\"");
    }
}