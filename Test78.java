// perfect number or not

public class Test78{
    public static void main(String[] args) {
        int n = 6;
        int store = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                store = store + i;
            }
        }

            if(store == n){
                System.out.println("Perfect Number");
            }else{
                System.out.println("Not Perfect Number");
            }

        }
    }
