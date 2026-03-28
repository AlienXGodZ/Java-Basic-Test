//pyramid pattern program

public class Test98{
    public static void main(String[] args){
        int n = 3;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++) System.out.print(" "); // spaces
            for(int j = 1; j <= 2*i-1; j++) System.out.print("*"); // stars
            System.out.println();
        }
    }
}
