//checking the prime number

public class Test69{
    public static void main(String[] args){
        int n = 51;
        boolean condition = false;

          for(int i = 2 ; i < n ; i++){
              if( n % i == 0){
                 condition = true;
                 break;
              }
          }
          if( n <= 1){
              System.out.println("Not PrimeNumber");
          }else if( !condition) {
              System.out.println("prime number");
          }else{
              System.out.println("Not PrimeNumber");
          }
    }
}