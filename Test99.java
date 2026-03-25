//this program print the pattern

public class Test99 {
    public static void main(String[] args) {

        int n = 4; // number of rows

        for(int i = 0; i < n; i++){ // rows
            for(int j = 0; j <= i; j++){ // columns
                if((i + j) % 2 == 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println(); // new line after each row
        }
    }
}